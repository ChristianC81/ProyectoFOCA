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
import java.util.Iterator;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;
import javax.swing.JComboBox;
import modelo.exceptions.NonexistentEntityException;
import modelo.exceptions.PreexistingEntityException;

/**
 *
 * @author chris
 */
public class ProyectoJpaController implements Serializable {

    public ProyectoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Proyecto proyecto) throws PreexistingEntityException, Exception {
        if (proyecto.getProductoList() == null) {
            proyecto.setProductoList(new ArrayList<Producto>());
        }
        if (proyecto.getInscripcionList() == null) {
            proyecto.setInscripcionList(new ArrayList<Inscripcion>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Persona idpersona = proyecto.getIdpersona();
            if (idpersona != null) {
                idpersona = em.getReference(idpersona.getClass(), idpersona.getIdper());
                proyecto.setIdpersona(idpersona);
            }
            List<Producto> attachedProductoList = new ArrayList<Producto>();
            for (Producto productoListProductoToAttach : proyecto.getProductoList()) {
                productoListProductoToAttach = em.getReference(productoListProductoToAttach.getClass(), productoListProductoToAttach.getIdprod());
                attachedProductoList.add(productoListProductoToAttach);
            }
            proyecto.setProductoList(attachedProductoList);
            List<Inscripcion> attachedInscripcionList = new ArrayList<Inscripcion>();
            for (Inscripcion inscripcionListInscripcionToAttach : proyecto.getInscripcionList()) {
                inscripcionListInscripcionToAttach = em.getReference(inscripcionListInscripcionToAttach.getClass(), inscripcionListInscripcionToAttach.getIdins());
                attachedInscripcionList.add(inscripcionListInscripcionToAttach);
            }
            proyecto.setInscripcionList(attachedInscripcionList);
            em.persist(proyecto);
            if (idpersona != null) {
                idpersona.getProyectoList().add(proyecto);
                idpersona = em.merge(idpersona);
            }
            for (Producto productoListProducto : proyecto.getProductoList()) {
                Proyecto oldIdproyprodOfProductoListProducto = productoListProducto.getIdproyprod();
                productoListProducto.setIdproyprod(proyecto);
                productoListProducto = em.merge(productoListProducto);
                if (oldIdproyprodOfProductoListProducto != null) {
                    oldIdproyprodOfProductoListProducto.getProductoList().remove(productoListProducto);
                    oldIdproyprodOfProductoListProducto = em.merge(oldIdproyprodOfProductoListProducto);
                }
            }
            for (Inscripcion inscripcionListInscripcion : proyecto.getInscripcionList()) {
                Proyecto oldIdproyinsOfInscripcionListInscripcion = inscripcionListInscripcion.getIdproyins();
                inscripcionListInscripcion.setIdproyins(proyecto);
                inscripcionListInscripcion = em.merge(inscripcionListInscripcion);
                if (oldIdproyinsOfInscripcionListInscripcion != null) {
                    oldIdproyinsOfInscripcionListInscripcion.getInscripcionList().remove(inscripcionListInscripcion);
                    oldIdproyinsOfInscripcionListInscripcion = em.merge(oldIdproyinsOfInscripcionListInscripcion);
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findProyecto(proyecto.getIdproy()) != null) {
                throw new PreexistingEntityException("Proyecto " + proyecto + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Proyecto proyecto) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Proyecto persistentProyecto = em.find(Proyecto.class, proyecto.getIdproy());
            Persona idpersonaOld = persistentProyecto.getIdpersona();
            Persona idpersonaNew = proyecto.getIdpersona();
            List<Producto> productoListOld = persistentProyecto.getProductoList();
            List<Producto> productoListNew = proyecto.getProductoList();
            List<Inscripcion> inscripcionListOld = persistentProyecto.getInscripcionList();
            List<Inscripcion> inscripcionListNew = proyecto.getInscripcionList();
            if (idpersonaNew != null) {
                idpersonaNew = em.getReference(idpersonaNew.getClass(), idpersonaNew.getIdper());
                proyecto.setIdpersona(idpersonaNew);
            }
            List<Producto> attachedProductoListNew = new ArrayList<Producto>();
            for (Producto productoListNewProductoToAttach : productoListNew) {
                productoListNewProductoToAttach = em.getReference(productoListNewProductoToAttach.getClass(), productoListNewProductoToAttach.getIdprod());
                attachedProductoListNew.add(productoListNewProductoToAttach);
            }
            productoListNew = attachedProductoListNew;
            proyecto.setProductoList(productoListNew);
            List<Inscripcion> attachedInscripcionListNew = new ArrayList<Inscripcion>();
            for (Inscripcion inscripcionListNewInscripcionToAttach : inscripcionListNew) {
                inscripcionListNewInscripcionToAttach = em.getReference(inscripcionListNewInscripcionToAttach.getClass(), inscripcionListNewInscripcionToAttach.getIdins());
                attachedInscripcionListNew.add(inscripcionListNewInscripcionToAttach);
            }
            inscripcionListNew = attachedInscripcionListNew;
            proyecto.setInscripcionList(inscripcionListNew);
            proyecto = em.merge(proyecto);
            if (idpersonaOld != null && !idpersonaOld.equals(idpersonaNew)) {
                idpersonaOld.getProyectoList().remove(proyecto);
                idpersonaOld = em.merge(idpersonaOld);
            }
            if (idpersonaNew != null && !idpersonaNew.equals(idpersonaOld)) {
                idpersonaNew.getProyectoList().add(proyecto);
                idpersonaNew = em.merge(idpersonaNew);
            }
            for (Producto productoListOldProducto : productoListOld) {
                if (!productoListNew.contains(productoListOldProducto)) {
                    productoListOldProducto.setIdproyprod(null);
                    productoListOldProducto = em.merge(productoListOldProducto);
                }
            }
            for (Producto productoListNewProducto : productoListNew) {
                if (!productoListOld.contains(productoListNewProducto)) {
                    Proyecto oldIdproyprodOfProductoListNewProducto = productoListNewProducto.getIdproyprod();
                    productoListNewProducto.setIdproyprod(proyecto);
                    productoListNewProducto = em.merge(productoListNewProducto);
                    if (oldIdproyprodOfProductoListNewProducto != null && !oldIdproyprodOfProductoListNewProducto.equals(proyecto)) {
                        oldIdproyprodOfProductoListNewProducto.getProductoList().remove(productoListNewProducto);
                        oldIdproyprodOfProductoListNewProducto = em.merge(oldIdproyprodOfProductoListNewProducto);
                    }
                }
            }
            for (Inscripcion inscripcionListOldInscripcion : inscripcionListOld) {
                if (!inscripcionListNew.contains(inscripcionListOldInscripcion)) {
                    inscripcionListOldInscripcion.setIdproyins(null);
                    inscripcionListOldInscripcion = em.merge(inscripcionListOldInscripcion);
                }
            }
            for (Inscripcion inscripcionListNewInscripcion : inscripcionListNew) {
                if (!inscripcionListOld.contains(inscripcionListNewInscripcion)) {
                    Proyecto oldIdproyinsOfInscripcionListNewInscripcion = inscripcionListNewInscripcion.getIdproyins();
                    inscripcionListNewInscripcion.setIdproyins(proyecto);
                    inscripcionListNewInscripcion = em.merge(inscripcionListNewInscripcion);
                    if (oldIdproyinsOfInscripcionListNewInscripcion != null && !oldIdproyinsOfInscripcionListNewInscripcion.equals(proyecto)) {
                        oldIdproyinsOfInscripcionListNewInscripcion.getInscripcionList().remove(inscripcionListNewInscripcion);
                        oldIdproyinsOfInscripcionListNewInscripcion = em.merge(oldIdproyinsOfInscripcionListNewInscripcion);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                BigDecimal id = proyecto.getIdproy();
                if (findProyecto(id) == null) {
                    throw new NonexistentEntityException("The proyecto with id " + id + " no longer exists.");
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
            Proyecto proyecto;
            try {
                proyecto = em.getReference(Proyecto.class, id);
                proyecto.getIdproy();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The proyecto with id " + id + " no longer exists.", enfe);
            }
            Persona idpersona = proyecto.getIdpersona();
            if (idpersona != null) {
                idpersona.getProyectoList().remove(proyecto);
                idpersona = em.merge(idpersona);
            }
            List<Producto> productoList = proyecto.getProductoList();
            for (Producto productoListProducto : productoList) {
                productoListProducto.setIdproyprod(null);
                productoListProducto = em.merge(productoListProducto);
            }
            List<Inscripcion> inscripcionList = proyecto.getInscripcionList();
            for (Inscripcion inscripcionListInscripcion : inscripcionList) {
                inscripcionListInscripcion.setIdproyins(null);
                inscripcionListInscripcion = em.merge(inscripcionListInscripcion);
            }
            em.remove(proyecto);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Proyecto> findProyectoEntities() {
        return findProyectoEntities(true, -1, -1);
    }

    public List<Proyecto> findProyectoEntities(int maxResults, int firstResult) {
        return findProyectoEntities(false, maxResults, firstResult);
    }

    private List<Proyecto> findProyectoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Proyecto.class));
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

    public Proyecto findProyecto(BigDecimal id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Proyecto.class, id);
        } finally {
            em.close();
        }
    }

    public int getProyectoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Proyecto> rt = cq.from(Proyecto.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

    public List<Proyecto> buscarProyecto(String nombreproye) {
        EntityManager em = getEntityManager();
        try {
            TypedQuery<Proyecto> query = em.createNamedQuery("Proyecto.findByNombreproy", Proyecto.class);
            query.setParameter("nombreproy", nombreproye);
            List<Proyecto> list = query.getResultList();
            return list;
        } finally {
            em.close();
        }
    }

}
