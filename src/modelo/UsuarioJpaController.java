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
public class UsuarioJpaController implements Serializable {

    public UsuarioJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Usuario usuario) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Persona idpersona = usuario.getIdpersona();
            if (idpersona != null) {
                idpersona = em.getReference(idpersona.getClass(), idpersona.getIdper());
                usuario.setIdpersona(idpersona);
            }
            Roles idrol = usuario.getIdrol();
            if (idrol != null) {
                idrol = em.getReference(idrol.getClass(), idrol.getIdrol());
                usuario.setIdrol(idrol);
            }
            em.persist(usuario);
            if (idpersona != null) {
                idpersona.getUsuarioList().add(usuario);
                idpersona = em.merge(idpersona);
            }
            if (idrol != null) {
                idrol.getUsuarioList().add(usuario);
                idrol = em.merge(idrol);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findUsuario(usuario.getIdusuario()) != null) {
                throw new PreexistingEntityException("Usuario " + usuario + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Usuario usuario) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Usuario persistentUsuario = em.find(Usuario.class, usuario.getIdusuario());
            Persona idpersonaOld = persistentUsuario.getIdpersona();
            Persona idpersonaNew = usuario.getIdpersona();
            Roles idrolOld = persistentUsuario.getIdrol();
            Roles idrolNew = usuario.getIdrol();
            if (idpersonaNew != null) {
                idpersonaNew = em.getReference(idpersonaNew.getClass(), idpersonaNew.getIdper());
                usuario.setIdpersona(idpersonaNew);
            }
            if (idrolNew != null) {
                idrolNew = em.getReference(idrolNew.getClass(), idrolNew.getIdrol());
                usuario.setIdrol(idrolNew);
            }
            usuario = em.merge(usuario);
            if (idpersonaOld != null && !idpersonaOld.equals(idpersonaNew)) {
                idpersonaOld.getUsuarioList().remove(usuario);
                idpersonaOld = em.merge(idpersonaOld);
            }
            if (idpersonaNew != null && !idpersonaNew.equals(idpersonaOld)) {
                idpersonaNew.getUsuarioList().add(usuario);
                idpersonaNew = em.merge(idpersonaNew);
            }
            if (idrolOld != null && !idrolOld.equals(idrolNew)) {
                idrolOld.getUsuarioList().remove(usuario);
                idrolOld = em.merge(idrolOld);
            }
            if (idrolNew != null && !idrolNew.equals(idrolOld)) {
                idrolNew.getUsuarioList().add(usuario);
                idrolNew = em.merge(idrolNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                BigDecimal id = usuario.getIdusuario();
                if (findUsuario(id) == null) {
                    throw new NonexistentEntityException("The usuario with id " + id + " no longer exists.");
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
            Usuario usuario;
            try {
                usuario = em.getReference(Usuario.class, id);
                usuario.getIdusuario();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The usuario with id " + id + " no longer exists.", enfe);
            }
            Persona idpersona = usuario.getIdpersona();
            if (idpersona != null) {
                idpersona.getUsuarioList().remove(usuario);
                idpersona = em.merge(idpersona);
            }
            Roles idrol = usuario.getIdrol();
            if (idrol != null) {
                idrol.getUsuarioList().remove(usuario);
                idrol = em.merge(idrol);
            }
            em.remove(usuario);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Usuario> findUsuarioEntities() {
        return findUsuarioEntities(true, -1, -1);
    }

    public List<Usuario> findUsuarioEntities(int maxResults, int firstResult) {
        return findUsuarioEntities(false, maxResults, firstResult);
    }

    private List<Usuario> findUsuarioEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Usuario.class));
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

    public Usuario findUsuario(BigDecimal id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Usuario.class, id);
        } finally {
            em.close();
        }
    }

    public int getUsuarioCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Usuario> rt = cq.from(Usuario.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    public Usuario buscarUsuario(String usuario,String clave){
        Usuario u = null;
        for(Usuario user:findUsuarioEntities()){
            if(user.getNombreusuario().equals(usuario)&&user.getClave().equals(clave)){
                u=user;
            }
        }
        return u;
    }

    public List<Usuario> buscarUsuario(String nombre) {
        System.out.println(nombre);
        EntityManager em = getEntityManager();
        try {
            //Para realizar consultas 
            TypedQuery<Usuario> query = em.createNamedQuery("Usuario.findByNombreusuario", Usuario.class);
            query.setParameter("nombreusuario", nombre);
            List<Usuario> list = query.getResultList();
            return list;
        } finally {
            em.close();
}
    }
}
