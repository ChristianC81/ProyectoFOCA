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
public class DonacionJpaController implements Serializable {

    public DonacionJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Donacion donacion) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Producto producto = donacion.getProducto();
            if (producto != null) {
                producto = em.getReference(producto.getClass(), producto.getIdprod());
                donacion.setProducto(producto);
            }
            Persona idpersona = donacion.getIdpersona();
            if (idpersona != null) {
                idpersona = em.getReference(idpersona.getClass(), idpersona.getIdper());
                donacion.setIdpersona(idpersona);
            }
            em.persist(donacion);
            if (producto != null) {
                Donacion oldDonacionOfProducto = producto.getDonacion();
                if (oldDonacionOfProducto != null) {
                    oldDonacionOfProducto.setProducto(null);
                    oldDonacionOfProducto = em.merge(oldDonacionOfProducto);
                }
                producto.setDonacion(donacion);
                producto = em.merge(producto);
            }
            if (idpersona != null) {
                idpersona.getDonacionList().add(donacion);
                idpersona = em.merge(idpersona);
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

    public void edit(Donacion donacion) throws IllegalOrphanException, NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Donacion persistentDonacion = em.find(Donacion.class, donacion.getIddona());
            Producto productoOld = persistentDonacion.getProducto();
            Producto productoNew = donacion.getProducto();
            Persona idpersonaOld = persistentDonacion.getIdpersona();
            Persona idpersonaNew = donacion.getIdpersona();
            List<String> illegalOrphanMessages = null;
            if (productoOld != null && !productoOld.equals(productoNew)) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("You must retain Producto " + productoOld + " since its donacion field is not nullable.");
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            if (productoNew != null) {
                productoNew = em.getReference(productoNew.getClass(), productoNew.getIdprod());
                donacion.setProducto(productoNew);
            }
            if (idpersonaNew != null) {
                idpersonaNew = em.getReference(idpersonaNew.getClass(), idpersonaNew.getIdper());
                donacion.setIdpersona(idpersonaNew);
            }
            donacion = em.merge(donacion);
            if (productoNew != null && !productoNew.equals(productoOld)) {
                Donacion oldDonacionOfProducto = productoNew.getDonacion();
                if (oldDonacionOfProducto != null) {
                    oldDonacionOfProducto.setProducto(null);
                    oldDonacionOfProducto = em.merge(oldDonacionOfProducto);
                }
                productoNew.setDonacion(donacion);
                productoNew = em.merge(productoNew);
            }
            if (idpersonaOld != null && !idpersonaOld.equals(idpersonaNew)) {
                idpersonaOld.getDonacionList().remove(donacion);
                idpersonaOld = em.merge(idpersonaOld);
            }
            if (idpersonaNew != null && !idpersonaNew.equals(idpersonaOld)) {
                idpersonaNew.getDonacionList().add(donacion);
                idpersonaNew = em.merge(idpersonaNew);
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

    public void destroy(BigDecimal id) throws IllegalOrphanException, NonexistentEntityException {
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
            List<String> illegalOrphanMessages = null;
            Producto productoOrphanCheck = donacion.getProducto();
            if (productoOrphanCheck != null) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This Donacion (" + donacion + ") cannot be destroyed since the Producto " + productoOrphanCheck + " in its producto field has a non-nullable donacion field.");
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            Persona idpersona = donacion.getIdpersona();
            if (idpersona != null) {
                idpersona.getDonacionList().remove(donacion);
                idpersona = em.merge(idpersona);
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
    
}
