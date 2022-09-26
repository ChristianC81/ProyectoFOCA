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
public class InscripcionJpaController implements Serializable {

    public InscripcionJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Inscripcion inscripcion) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Persona idpersona = inscripcion.getIdpersona();
            if (idpersona != null) {
                idpersona = em.getReference(idpersona.getClass(), idpersona.getIdper());
                inscripcion.setIdpersona(idpersona);
            }
            Proyecto idproyins = inscripcion.getIdproyins();
            if (idproyins != null) {
                idproyins = em.getReference(idproyins.getClass(), idproyins.getIdproy());
                inscripcion.setIdproyins(idproyins);
            }
            em.persist(inscripcion);
            if (idpersona != null) {
                idpersona.getInscripcionList().add(inscripcion);
                idpersona = em.merge(idpersona);
            }
            if (idproyins != null) {
                idproyins.getInscripcionList().add(inscripcion);
                idproyins = em.merge(idproyins);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findInscripcion(inscripcion.getIdins()) != null) {
                throw new PreexistingEntityException("Inscripcion " + inscripcion + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Inscripcion inscripcion) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Inscripcion persistentInscripcion = em.find(Inscripcion.class, inscripcion.getIdins());
            Persona idpersonaOld = persistentInscripcion.getIdpersona();
            Persona idpersonaNew = inscripcion.getIdpersona();
            Proyecto idproyinsOld = persistentInscripcion.getIdproyins();
            Proyecto idproyinsNew = inscripcion.getIdproyins();
            if (idpersonaNew != null) {
                idpersonaNew = em.getReference(idpersonaNew.getClass(), idpersonaNew.getIdper());
                inscripcion.setIdpersona(idpersonaNew);
            }
            if (idproyinsNew != null) {
                idproyinsNew = em.getReference(idproyinsNew.getClass(), idproyinsNew.getIdproy());
                inscripcion.setIdproyins(idproyinsNew);
            }
            inscripcion = em.merge(inscripcion);
            if (idpersonaOld != null && !idpersonaOld.equals(idpersonaNew)) {
                idpersonaOld.getInscripcionList().remove(inscripcion);
                idpersonaOld = em.merge(idpersonaOld);
            }
            if (idpersonaNew != null && !idpersonaNew.equals(idpersonaOld)) {
                idpersonaNew.getInscripcionList().add(inscripcion);
                idpersonaNew = em.merge(idpersonaNew);
            }
            if (idproyinsOld != null && !idproyinsOld.equals(idproyinsNew)) {
                idproyinsOld.getInscripcionList().remove(inscripcion);
                idproyinsOld = em.merge(idproyinsOld);
            }
            if (idproyinsNew != null && !idproyinsNew.equals(idproyinsOld)) {
                idproyinsNew.getInscripcionList().add(inscripcion);
                idproyinsNew = em.merge(idproyinsNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                BigDecimal id = inscripcion.getIdins();
                if (findInscripcion(id) == null) {
                    throw new NonexistentEntityException("The inscripcion with id " + id + " no longer exists.");
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
            Inscripcion inscripcion;
            try {
                inscripcion = em.getReference(Inscripcion.class, id);
                inscripcion.getIdins();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The inscripcion with id " + id + " no longer exists.", enfe);
            }
            Persona idpersona = inscripcion.getIdpersona();
            if (idpersona != null) {
                idpersona.getInscripcionList().remove(inscripcion);
                idpersona = em.merge(idpersona);
            }
            Proyecto idproyins = inscripcion.getIdproyins();
            if (idproyins != null) {
                idproyins.getInscripcionList().remove(inscripcion);
                idproyins = em.merge(idproyins);
            }
            em.remove(inscripcion);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Inscripcion> findInscripcionEntities() {
        return findInscripcionEntities(true, -1, -1);
    }

    public List<Inscripcion> findInscripcionEntities(int maxResults, int firstResult) {
        return findInscripcionEntities(false, maxResults, firstResult);
    }

    private List<Inscripcion> findInscripcionEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Inscripcion.class));
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

    public Inscripcion findInscripcion(BigDecimal id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Inscripcion.class, id);
        } finally {
            em.close();
        }
    }

    public int getInscripcionCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Inscripcion> rt = cq.from(Inscripcion.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
    public List<Inscripcion> buscarInscripcion(Number id) {
        System.out.println(id);
        EntityManager em = getEntityManager();
        try {
            //Para realizar consultas 
            TypedQuery<Inscripcion> query = em.createNamedQuery("Inscripcion.findByIdins", Inscripcion.class);
            query.setParameter("idins", id);
            List<Inscripcion> list = query.getResultList();
            return list;
        } finally {
            em.close();
}
    }

    public List<Persona> buscarPersonavolu() {
        EntityManager em = getEntityManager();
        String per = "Voluntario";
        try {
            TypedQuery<Persona> query = em.createNamedQuery("Persona.findByTipoper", Persona.class);
            query.setParameter("tipoper", per);
            List<Persona> list = query.getResultList();
            return list;
        } finally {
            em.close();
        }
    }
}
