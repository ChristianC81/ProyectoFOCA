/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import modelo.exceptions.NonexistentEntityException;
import modelo.exceptions.PreexistingEntityException;

/**
 *
 * @author chris
 */
public class ProductoJpaController implements Serializable {

    public ProductoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Producto producto) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Donacion iddonaprod = producto.getIddonaprod();
            if (iddonaprod != null) {
                iddonaprod = em.getReference(iddonaprod.getClass(), iddonaprod.getIddona());
                producto.setIddonaprod(iddonaprod);
            }
            Proyecto idproyprod = producto.getIdproyprod();
            if (idproyprod != null) {
                idproyprod = em.getReference(idproyprod.getClass(), idproyprod.getIdproy());
                producto.setIdproyprod(idproyprod);
            }
            em.persist(producto);
            if (iddonaprod != null) {
                iddonaprod.getProductoList().add(producto);
                iddonaprod = em.merge(iddonaprod);
            }
            if (idproyprod != null) {
                idproyprod.getProductoList().add(producto);
                idproyprod = em.merge(idproyprod);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findProducto(producto.getIdprod()) != null) {
                throw new PreexistingEntityException("Producto " + producto + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Producto producto) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Producto persistentProducto = em.find(Producto.class, producto.getIdprod());
            Donacion iddonaprodOld = persistentProducto.getIddonaprod();
            Donacion iddonaprodNew = producto.getIddonaprod();
            Proyecto idproyprodOld = persistentProducto.getIdproyprod();
            Proyecto idproyprodNew = producto.getIdproyprod();
            if (iddonaprodNew != null) {
                iddonaprodNew = em.getReference(iddonaprodNew.getClass(), iddonaprodNew.getIddona());
                producto.setIddonaprod(iddonaprodNew);
            }
            if (idproyprodNew != null) {
                idproyprodNew = em.getReference(idproyprodNew.getClass(), idproyprodNew.getIdproy());
                producto.setIdproyprod(idproyprodNew);
            }
            producto = em.merge(producto);
            if (iddonaprodOld != null && !iddonaprodOld.equals(iddonaprodNew)) {
                iddonaprodOld.getProductoList().remove(producto);
                iddonaprodOld = em.merge(iddonaprodOld);
            }
            if (iddonaprodNew != null && !iddonaprodNew.equals(iddonaprodOld)) {
                iddonaprodNew.getProductoList().add(producto);
                iddonaprodNew = em.merge(iddonaprodNew);
            }
            if (idproyprodOld != null && !idproyprodOld.equals(idproyprodNew)) {
                idproyprodOld.getProductoList().remove(producto);
                idproyprodOld = em.merge(idproyprodOld);
            }
            if (idproyprodNew != null && !idproyprodNew.equals(idproyprodOld)) {
                idproyprodNew.getProductoList().add(producto);
                idproyprodNew = em.merge(idproyprodNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                BigDecimal id = producto.getIdprod();
                if (findProducto(id) == null) {
                    throw new NonexistentEntityException("The producto with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(BigDecimal id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Producto producto;
            try {
                producto = em.getReference(Producto.class, id);
                producto.getIdprod();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The producto with id " + id + " no longer exists.", enfe);
            }
            Donacion iddonaprod = producto.getIddonaprod();
            if (iddonaprod != null) {
                iddonaprod.getProductoList().remove(producto);
                iddonaprod = em.merge(iddonaprod);
            }
            Proyecto idproyprod = producto.getIdproyprod();
            if (idproyprod != null) {
                idproyprod.getProductoList().remove(producto);
                idproyprod = em.merge(idproyprod);
            }
            em.remove(producto);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Producto> findProductoEntities() {
        return findProductoEntities(true, -1, -1);
    }

    public List<Producto> findProductoEntities(int maxResults, int firstResult) {
        return findProductoEntities(false, maxResults, firstResult);
    }

    private List<Producto> findProductoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Producto.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Producto findProducto(BigDecimal id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Producto.class, id);
        } finally {
            em.close();
        }
    }

    public int getProductoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Producto> rt = cq.from(Producto.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
        public List<Producto> buscarProducto(String nombre) {
        System.out.println(nombre);
        EntityManager em = getEntityManager();
        try {
            //Para realizar consultas 
            TypedQuery<Producto> query = em.createNamedQuery("Producto.findByTipoprod", Producto.class);
            query.setParameter("tipoprod", nombre);
            List<Producto> list = query.getResultList();
            return list;
        } finally {
            em.close();
}
    }
    
}
