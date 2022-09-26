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
import javax.persistence.TypedQuery;
import modelo.exceptions.NonexistentEntityException;
import modelo.exceptions.PreexistingEntityException;

/**
 *
 * @author chris
 */
public class DonacionJpaController implements Serializable {

    public DonacionJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Donacion donacion) throws PreexistingEntityException, Exception {
        if (donacion.getProductoList() == null) {
            donacion.setProductoList(new ArrayList<Producto>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Persona idpersona = donacion.getIdpersona();
            if (idpersona != null) {
                idpersona = em.getReference(idpersona.getClass(), idpersona.getIdper());
                donacion.setIdpersona(idpersona);
            }
            List<Producto> attachedProductoList = new ArrayList<Producto>();
            for (Producto productoListProductoToAttach : donacion.getProductoList()) {
                productoListProductoToAttach = em.getReference(productoListProductoToAttach.getClass(), productoListProductoToAttach.getIdprod());
                attachedProductoList.add(productoListProductoToAttach);
            }
            donacion.setProductoList(attachedProductoList);
            em.persist(donacion);
            if (idpersona != null) {
                idpersona.getDonacionList().add(donacion);
                idpersona = em.merge(idpersona);
            }
            for (Producto productoListProducto : donacion.getProductoList()) {
                Donacion oldIddonaprodOfProductoListProducto = productoListProducto.getIddonaprod();
                productoListProducto.setIddonaprod(donacion);
                productoListProducto = em.merge(productoListProducto);
                if (oldIddonaprodOfProductoListProducto != null) {
                    oldIddonaprodOfProductoListProducto.getProductoList().remove(productoListProducto);
                    oldIddonaprodOfProductoListProducto = em.merge(oldIddonaprodOfProductoListProducto);
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findDonacion(donacion.getIddona()) != null) {
                throw new PreexistingEntityException("Donacion " + donacion + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Donacion donacion) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Donacion persistentDonacion = em.find(Donacion.class, donacion.getIddona());
            Persona idpersonaOld = persistentDonacion.getIdpersona();
            Persona idpersonaNew = donacion.getIdpersona();
            List<Producto> productoListOld = persistentDonacion.getProductoList();
            List<Producto> productoListNew = donacion.getProductoList();
            if (idpersonaNew != null) {
                idpersonaNew = em.getReference(idpersonaNew.getClass(), idpersonaNew.getIdper());
                donacion.setIdpersona(idpersonaNew);
            }
            List<Producto> attachedProductoListNew = new ArrayList<Producto>();
            for (Producto productoListNewProductoToAttach : productoListNew) {
                productoListNewProductoToAttach = em.getReference(productoListNewProductoToAttach.getClass(), productoListNewProductoToAttach.getIdprod());
                attachedProductoListNew.add(productoListNewProductoToAttach);
            }
            productoListNew = attachedProductoListNew;
            donacion.setProductoList(productoListNew);
            donacion = em.merge(donacion);
            if (idpersonaOld != null && !idpersonaOld.equals(idpersonaNew)) {
                idpersonaOld.getDonacionList().remove(donacion);
                idpersonaOld = em.merge(idpersonaOld);
            }
            if (idpersonaNew != null && !idpersonaNew.equals(idpersonaOld)) {
                idpersonaNew.getDonacionList().add(donacion);
                idpersonaNew = em.merge(idpersonaNew);
            }
            for (Producto productoListOldProducto : productoListOld) {
                if (!productoListNew.contains(productoListOldProducto)) {
                    productoListOldProducto.setIddonaprod(null);
                    productoListOldProducto = em.merge(productoListOldProducto);
                }
            }
            for (Producto productoListNewProducto : productoListNew) {
                if (!productoListOld.contains(productoListNewProducto)) {
                    Donacion oldIddonaprodOfProductoListNewProducto = productoListNewProducto.getIddonaprod();
                    productoListNewProducto.setIddonaprod(donacion);
                    productoListNewProducto = em.merge(productoListNewProducto);
                    if (oldIddonaprodOfProductoListNewProducto != null && !oldIddonaprodOfProductoListNewProducto.equals(donacion)) {
                        oldIddonaprodOfProductoListNewProducto.getProductoList().remove(productoListNewProducto);
                        oldIddonaprodOfProductoListNewProducto = em.merge(oldIddonaprodOfProductoListNewProducto);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                BigDecimal id = donacion.getIddona();
                if (findDonacion(id) == null) {
                    throw new NonexistentEntityException("The donacion with id " + id + " no longer exists.");
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
            Donacion donacion;
            try {
                donacion = em.getReference(Donacion.class, id);
                donacion.getIddona();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The donacion with id " + id + " no longer exists.", enfe);
            }
            Persona idpersona = donacion.getIdpersona();
            if (idpersona != null) {
                idpersona.getDonacionList().remove(donacion);
                idpersona = em.merge(idpersona);
            }
            List<Producto> productoList = donacion.getProductoList();
            for (Producto productoListProducto : productoList) {
                productoListProducto.setIddonaprod(null);
                productoListProducto = em.merge(productoListProducto);
            }
            em.remove(donacion);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Donacion> findDonacionEntities() {
        return findDonacionEntities(true, -1, -1);
    }

    public List<Donacion> findDonacionEntities(int maxResults, int firstResult) {
        return findDonacionEntities(false, maxResults, firstResult);
    }

    private List<Donacion> findDonacionEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Donacion.class));
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

    public Donacion findDonacion(BigDecimal id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Donacion.class, id);
        } finally {
            em.close();
        }
    }

    public int getDonacionCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Donacion> rt = cq.from(Donacion.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    public List<Donacion> buscarDonacion(String nombre) {
        System.out.println(nombre);
        EntityManager em = getEntityManager();
        try {
            //Para realizar consultas 
            TypedQuery<Donacion> query = em.createNamedQuery("Donacion.findByDetalleproductodona", Donacion.class);
            query.setParameter("detalleproductodona", nombre);
            List<Donacion> list = query.getResultList();
            return list;
        } finally {
            em.close();
}
    }
}
