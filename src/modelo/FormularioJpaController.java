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
public class FormularioJpaController implements Serializable {

    public FormularioJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Formulario formulario) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Persona idpersona = formulario.getIdpersona();
            if (idpersona != null) {
                idpersona = em.getReference(idpersona.getClass(), idpersona.getIdper());
                formulario.setIdpersona(idpersona);
            }
            em.persist(formulario);
            if (idpersona != null) {
                idpersona.getFormularioList().add(formulario);
                idpersona = em.merge(idpersona);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findFormulario(formulario.getIdform()) != null) {
                throw new PreexistingEntityException("Formulario " + formulario + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Formulario formulario) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Formulario persistentFormulario = em.find(Formulario.class, formulario.getIdform());
            Persona idpersonaOld = persistentFormulario.getIdpersona();
            Persona idpersonaNew = formulario.getIdpersona();
            if (idpersonaNew != null) {
                idpersonaNew = em.getReference(idpersonaNew.getClass(), idpersonaNew.getIdper());
                formulario.setIdpersona(idpersonaNew);
            }
            formulario = em.merge(formulario);
            if (idpersonaOld != null && !idpersonaOld.equals(idpersonaNew)) {
                idpersonaOld.getFormularioList().remove(formulario);
                idpersonaOld = em.merge(idpersonaOld);
            }
            if (idpersonaNew != null && !idpersonaNew.equals(idpersonaOld)) {
                idpersonaNew.getFormularioList().add(formulario);
                idpersonaNew = em.merge(idpersonaNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                BigDecimal id = formulario.getIdform();
                if (findFormulario(id) == null) {
                    throw new NonexistentEntityException("The formulario with id " + id + " no longer exists.");
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
            Formulario formulario;
            try {
                formulario = em.getReference(Formulario.class, id);
                formulario.getIdform();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The formulario with id " + id + " no longer exists.", enfe);
            }
            Persona idpersona = formulario.getIdpersona();
            if (idpersona != null) {
                idpersona.getFormularioList().remove(formulario);
                idpersona = em.merge(idpersona);
            }
            em.remove(formulario);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Formulario> findFormularioEntities() {
        return findFormularioEntities(true, -1, -1);
    }

    public List<Formulario> findFormularioEntities(int maxResults, int firstResult) {
        return findFormularioEntities(false, maxResults, firstResult);
    }

    private List<Formulario> findFormularioEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Formulario.class));
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

    public Formulario findFormulario(BigDecimal id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Formulario.class, id);
        } finally {
            em.close();
        }
    }

    public int getFormularioCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Formulario> rt = cq.from(Formulario.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
    public List<Formulario> buscarFor(String id) {
        System.out.println(id);
        EntityManager em = getEntityManager();
        try {
            //Para realizar consultas 
            TypedQuery<Formulario> query = em.createNamedQuery("Formulario.findByIdform", Formulario.class);
            query.setParameter("idform", id);
            List<Formulario> list = query.getResultList();
            return list;
        } finally {
            em.close();
        }
    }
}
