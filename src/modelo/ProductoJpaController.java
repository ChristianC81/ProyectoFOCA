/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import modelo.exceptions.IllegalOrphanException;
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

    public void create(Producto producto) throws IllegalOrphanException, PreexistingEntityException, Exception {
        List<String> illegalOrphanMessages = null;
        Donacion donacionOrphanCheck = producto.getDonacion();
        if (donacionOrphanCheck != null) {
            Producto oldProductoOfDonacion = donacionOrphanCheck.getProducto();
            if (oldProductoOfDonacion != null) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("The Donacion " + donacionOrphanCheck + " already has an item of type Producto whose donacion column cannot be null. Please make another selection for the donacion field.");
            }
        }
        if (illegalOrphanMessages != null) {
            throw new IllegalOrphanException(illegalOrphanMessages);
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Donacion donacion = producto.getDonacion();
            if (donacion != null) {
                donacion = em.getReference(donacion.getClass(), donacion.getIddona());
                producto.setDonacion(donacion);
            }
            Proyecto idproyprod = producto.getIdproyprod();
            if (idproyprod != null) {
                idproyprod = em.getReference(idproyprod.getClass(), idproyprod.getIdproy());
                producto.setIdproyprod(idproyprod);
            }
            em.persist(producto);
            if (donacion != null) {
                donacion.setProducto(producto);
                donacion = em.merge(donacion);
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

    public void edit(Producto producto) throws IllegalOrphanException, NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Producto persistentProducto = em.find(Producto.class, producto.getIdprod());
            Donacion donacionOld = persistentProducto.getDonacion();
            Donacion donacionNew = producto.getDonacion();
            Proyecto idproyprodOld = persistentProducto.getIdproyprod();
            Proyecto idproyprodNew = producto.getIdproyprod();
            List<String> illegalOrphanMessages = null;
            if (donacionNew != null && !donacionNew.equals(donacionOld)) {
                Producto oldProductoOfDonacion = donacionNew.getProducto();
                if (oldProductoOfDonacion != null) {
                    if (illegalOrphanMessages == null) {
                        illegalOrphanMessages = new ArrayList<String>();
                    }
                    illegalOrphanMessages.add("The Donacion " + donacionNew + " already has an item of type Producto whose donacion column cannot be null. Please make another selection for the donacion field.");
                }
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            if (donacionNew != null) {
                donacionNew = em.getReference(donacionNew.getClass(), donacionNew.getIddona());
                producto.setDonacion(donacionNew);
            }
            if (idproyprodNew != null) {
                idproyprodNew = em.getReference(idproyprodNew.getClass(), idproyprodNew.getIdproy());
                producto.setIdproyprod(idproyprodNew);
            }
            producto = em.merge(producto);
            if (donacionOld != null && !donacionOld.equals(donacionNew)) {
                donacionOld.setProducto(null);
                donacionOld = em.merge(donacionOld);
            }
            if (donacionNew != null && !donacionNew.equals(donacionOld)) {
                donacionNew.setProducto(producto);
                donacionNew = em.merge(donacionNew);
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
            Donacion donacion = producto.getDonacion();
            if (donacion != null) {
                donacion.setProducto(null);
                donacion = em.merge(donacion);
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
    
}
