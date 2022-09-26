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
public class PersonaJpaController implements Serializable {

    PersonaJpaController tjc;
    Persona p;

    public PersonaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Persona persona) throws PreexistingEntityException, Exception {
        if (persona.getInscripcionList() == null) {
            persona.setInscripcionList(new ArrayList<Inscripcion>());
        }
        if (persona.getProyectoList() == null) {
            persona.setProyectoList(new ArrayList<Proyecto>());
        }
        if (persona.getDonacionList() == null) {
            persona.setDonacionList(new ArrayList<Donacion>());
        }
        if (persona.getUsuarioList() == null) {
            persona.setUsuarioList(new ArrayList<Usuario>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Inscripcion> attachedInscripcionList = new ArrayList<Inscripcion>();
            for (Inscripcion inscripcionListInscripcionToAttach : persona.getInscripcionList()) {
                inscripcionListInscripcionToAttach = em.getReference(inscripcionListInscripcionToAttach.getClass(), inscripcionListInscripcionToAttach.getIdins());
                attachedInscripcionList.add(inscripcionListInscripcionToAttach);
            }
            persona.setInscripcionList(attachedInscripcionList);
            List<Proyecto> attachedProyectoList = new ArrayList<Proyecto>();
            for (Proyecto proyectoListProyectoToAttach : persona.getProyectoList()) {
                proyectoListProyectoToAttach = em.getReference(proyectoListProyectoToAttach.getClass(), proyectoListProyectoToAttach.getIdproy());
                attachedProyectoList.add(proyectoListProyectoToAttach);
            }
            persona.setProyectoList(attachedProyectoList);
            List<Donacion> attachedDonacionList = new ArrayList<Donacion>();
            for (Donacion donacionListDonacionToAttach : persona.getDonacionList()) {
                donacionListDonacionToAttach = em.getReference(donacionListDonacionToAttach.getClass(), donacionListDonacionToAttach.getIddona());
                attachedDonacionList.add(donacionListDonacionToAttach);
            }
            persona.setDonacionList(attachedDonacionList);
            List<Usuario> attachedUsuarioList = new ArrayList<Usuario>();
            for (Usuario usuarioListUsuarioToAttach : persona.getUsuarioList()) {
                usuarioListUsuarioToAttach = em.getReference(usuarioListUsuarioToAttach.getClass(), usuarioListUsuarioToAttach.getIdusuario());
                attachedUsuarioList.add(usuarioListUsuarioToAttach);
            }
            persona.setUsuarioList(attachedUsuarioList);
            em.persist(persona);
            for (Inscripcion inscripcionListInscripcion : persona.getInscripcionList()) {
                Persona oldIdpersonaOfInscripcionListInscripcion = inscripcionListInscripcion.getIdpersona();
                inscripcionListInscripcion.setIdpersona(persona);
                inscripcionListInscripcion = em.merge(inscripcionListInscripcion);
                if (oldIdpersonaOfInscripcionListInscripcion != null) {
                    oldIdpersonaOfInscripcionListInscripcion.getInscripcionList().remove(inscripcionListInscripcion);
                    oldIdpersonaOfInscripcionListInscripcion = em.merge(oldIdpersonaOfInscripcionListInscripcion);
                }
            }
            for (Proyecto proyectoListProyecto : persona.getProyectoList()) {
                Persona oldIdpersonaOfProyectoListProyecto = proyectoListProyecto.getIdpersona();
                proyectoListProyecto.setIdpersona(persona);
                proyectoListProyecto = em.merge(proyectoListProyecto);
                if (oldIdpersonaOfProyectoListProyecto != null) {
                    oldIdpersonaOfProyectoListProyecto.getProyectoList().remove(proyectoListProyecto);
                    oldIdpersonaOfProyectoListProyecto = em.merge(oldIdpersonaOfProyectoListProyecto);
                }
            }
            for (Donacion donacionListDonacion : persona.getDonacionList()) {
                Persona oldIdpersonaOfDonacionListDonacion = donacionListDonacion.getIdpersona();
                donacionListDonacion.setIdpersona(persona);
                donacionListDonacion = em.merge(donacionListDonacion);
                if (oldIdpersonaOfDonacionListDonacion != null) {
                    oldIdpersonaOfDonacionListDonacion.getDonacionList().remove(donacionListDonacion);
                    oldIdpersonaOfDonacionListDonacion = em.merge(oldIdpersonaOfDonacionListDonacion);
                }
            }
            for (Usuario usuarioListUsuario : persona.getUsuarioList()) {
                Persona oldIdpersonaOfUsuarioListUsuario = usuarioListUsuario.getIdpersona();
                usuarioListUsuario.setIdpersona(persona);
                usuarioListUsuario = em.merge(usuarioListUsuario);
                if (oldIdpersonaOfUsuarioListUsuario != null) {
                    oldIdpersonaOfUsuarioListUsuario.getUsuarioList().remove(usuarioListUsuario);
                    oldIdpersonaOfUsuarioListUsuario = em.merge(oldIdpersonaOfUsuarioListUsuario);
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findPersona(persona.getIdper()) != null) {
                throw new PreexistingEntityException("Persona " + persona + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Persona persona) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Persona persistentPersona = em.find(Persona.class, persona.getIdper());
            List<Inscripcion> inscripcionListOld = persistentPersona.getInscripcionList();
            List<Inscripcion> inscripcionListNew = persona.getInscripcionList();
            List<Proyecto> proyectoListOld = persistentPersona.getProyectoList();
            List<Proyecto> proyectoListNew = persona.getProyectoList();
            List<Donacion> donacionListOld = persistentPersona.getDonacionList();
            List<Donacion> donacionListNew = persona.getDonacionList();
            List<Usuario> usuarioListOld = persistentPersona.getUsuarioList();
            List<Usuario> usuarioListNew = persona.getUsuarioList();
            List<Inscripcion> attachedInscripcionListNew = new ArrayList<Inscripcion>();
            for (Inscripcion inscripcionListNewInscripcionToAttach : inscripcionListNew) {
                inscripcionListNewInscripcionToAttach = em.getReference(inscripcionListNewInscripcionToAttach.getClass(), inscripcionListNewInscripcionToAttach.getIdins());
                attachedInscripcionListNew.add(inscripcionListNewInscripcionToAttach);
            }
            inscripcionListNew = attachedInscripcionListNew;
            persona.setInscripcionList(inscripcionListNew);
            List<Proyecto> attachedProyectoListNew = new ArrayList<Proyecto>();
            for (Proyecto proyectoListNewProyectoToAttach : proyectoListNew) {
                proyectoListNewProyectoToAttach = em.getReference(proyectoListNewProyectoToAttach.getClass(), proyectoListNewProyectoToAttach.getIdproy());
                attachedProyectoListNew.add(proyectoListNewProyectoToAttach);
            }
            proyectoListNew = attachedProyectoListNew;
            persona.setProyectoList(proyectoListNew);
            List<Donacion> attachedDonacionListNew = new ArrayList<Donacion>();
            for (Donacion donacionListNewDonacionToAttach : donacionListNew) {
                donacionListNewDonacionToAttach = em.getReference(donacionListNewDonacionToAttach.getClass(), donacionListNewDonacionToAttach.getIddona());
                attachedDonacionListNew.add(donacionListNewDonacionToAttach);
            }
            donacionListNew = attachedDonacionListNew;
            persona.setDonacionList(donacionListNew);
            List<Usuario> attachedUsuarioListNew = new ArrayList<Usuario>();
            for (Usuario usuarioListNewUsuarioToAttach : usuarioListNew) {
                usuarioListNewUsuarioToAttach = em.getReference(usuarioListNewUsuarioToAttach.getClass(), usuarioListNewUsuarioToAttach.getIdusuario());
                attachedUsuarioListNew.add(usuarioListNewUsuarioToAttach);
            }
            usuarioListNew = attachedUsuarioListNew;
            persona.setUsuarioList(usuarioListNew);
            persona = em.merge(persona);
            for (Inscripcion inscripcionListOldInscripcion : inscripcionListOld) {
                if (!inscripcionListNew.contains(inscripcionListOldInscripcion)) {
                    inscripcionListOldInscripcion.setIdpersona(null);
                    inscripcionListOldInscripcion = em.merge(inscripcionListOldInscripcion);
                }
            }
            for (Inscripcion inscripcionListNewInscripcion : inscripcionListNew) {
                if (!inscripcionListOld.contains(inscripcionListNewInscripcion)) {
                    Persona oldIdpersonaOfInscripcionListNewInscripcion = inscripcionListNewInscripcion.getIdpersona();
                    inscripcionListNewInscripcion.setIdpersona(persona);
                    inscripcionListNewInscripcion = em.merge(inscripcionListNewInscripcion);
                    if (oldIdpersonaOfInscripcionListNewInscripcion != null && !oldIdpersonaOfInscripcionListNewInscripcion.equals(persona)) {
                        oldIdpersonaOfInscripcionListNewInscripcion.getInscripcionList().remove(inscripcionListNewInscripcion);
                        oldIdpersonaOfInscripcionListNewInscripcion = em.merge(oldIdpersonaOfInscripcionListNewInscripcion);
                    }
                }
            }
            for (Proyecto proyectoListOldProyecto : proyectoListOld) {
                if (!proyectoListNew.contains(proyectoListOldProyecto)) {
                    proyectoListOldProyecto.setIdpersona(null);
                    proyectoListOldProyecto = em.merge(proyectoListOldProyecto);
                }
            }
            for (Proyecto proyectoListNewProyecto : proyectoListNew) {
                if (!proyectoListOld.contains(proyectoListNewProyecto)) {
                    Persona oldIdpersonaOfProyectoListNewProyecto = proyectoListNewProyecto.getIdpersona();
                    proyectoListNewProyecto.setIdpersona(persona);
                    proyectoListNewProyecto = em.merge(proyectoListNewProyecto);
                    if (oldIdpersonaOfProyectoListNewProyecto != null && !oldIdpersonaOfProyectoListNewProyecto.equals(persona)) {
                        oldIdpersonaOfProyectoListNewProyecto.getProyectoList().remove(proyectoListNewProyecto);
                        oldIdpersonaOfProyectoListNewProyecto = em.merge(oldIdpersonaOfProyectoListNewProyecto);
                    }
                }
            }
            for (Donacion donacionListOldDonacion : donacionListOld) {
                if (!donacionListNew.contains(donacionListOldDonacion)) {
                    donacionListOldDonacion.setIdpersona(null);
                    donacionListOldDonacion = em.merge(donacionListOldDonacion);
                }
            }
            for (Donacion donacionListNewDonacion : donacionListNew) {
                if (!donacionListOld.contains(donacionListNewDonacion)) {
                    Persona oldIdpersonaOfDonacionListNewDonacion = donacionListNewDonacion.getIdpersona();
                    donacionListNewDonacion.setIdpersona(persona);
                    donacionListNewDonacion = em.merge(donacionListNewDonacion);
                    if (oldIdpersonaOfDonacionListNewDonacion != null && !oldIdpersonaOfDonacionListNewDonacion.equals(persona)) {
                        oldIdpersonaOfDonacionListNewDonacion.getDonacionList().remove(donacionListNewDonacion);
                        oldIdpersonaOfDonacionListNewDonacion = em.merge(oldIdpersonaOfDonacionListNewDonacion);
                    }
                }
            }
            for (Usuario usuarioListOldUsuario : usuarioListOld) {
                if (!usuarioListNew.contains(usuarioListOldUsuario)) {
                    usuarioListOldUsuario.setIdpersona(null);
                    usuarioListOldUsuario = em.merge(usuarioListOldUsuario);
                }
            }
            for (Usuario usuarioListNewUsuario : usuarioListNew) {
                if (!usuarioListOld.contains(usuarioListNewUsuario)) {
                    Persona oldIdpersonaOfUsuarioListNewUsuario = usuarioListNewUsuario.getIdpersona();
                    usuarioListNewUsuario.setIdpersona(persona);
                    usuarioListNewUsuario = em.merge(usuarioListNewUsuario);
                    if (oldIdpersonaOfUsuarioListNewUsuario != null && !oldIdpersonaOfUsuarioListNewUsuario.equals(persona)) {
                        oldIdpersonaOfUsuarioListNewUsuario.getUsuarioList().remove(usuarioListNewUsuario);
                        oldIdpersonaOfUsuarioListNewUsuario = em.merge(oldIdpersonaOfUsuarioListNewUsuario);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                BigDecimal id = persona.getIdper();
                if (findPersona(id) == null) {
                    throw new NonexistentEntityException("The persona with id " + id + " no longer exists.");
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
            Persona persona;
            try {
                persona = em.getReference(Persona.class, id);
                persona.getIdper();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The persona with id " + id + " no longer exists.", enfe);
            }
            List<Inscripcion> inscripcionList = persona.getInscripcionList();
            for (Inscripcion inscripcionListInscripcion : inscripcionList) {
                inscripcionListInscripcion.setIdpersona(null);
                inscripcionListInscripcion = em.merge(inscripcionListInscripcion);
            }
            List<Proyecto> proyectoList = persona.getProyectoList();
            for (Proyecto proyectoListProyecto : proyectoList) {
                proyectoListProyecto.setIdpersona(null);
                proyectoListProyecto = em.merge(proyectoListProyecto);
            }
            List<Donacion> donacionList = persona.getDonacionList();
            for (Donacion donacionListDonacion : donacionList) {
                donacionListDonacion.setIdpersona(null);
                donacionListDonacion = em.merge(donacionListDonacion);
            }
            List<Usuario> usuarioList = persona.getUsuarioList();
            for (Usuario usuarioListUsuario : usuarioList) {
                usuarioListUsuario.setIdpersona(null);
                usuarioListUsuario = em.merge(usuarioListUsuario);
            }
            em.remove(persona);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Persona> findPersonaEntities() {
        return findPersonaEntities(true, -1, -1);
    }

    public List<Persona> findPersonaEntities(int maxResults, int firstResult) {
        return findPersonaEntities(false, maxResults, firstResult);
    }

    private List<Persona> findPersonaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Persona.class));
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
//Lista de Beneficiarios

//    public List<Persona> findBeneficiariosEntities() {
//        return findBeneficiariosEntities(true, -1, -1);
//    }
//
//    public List<Persona> findBeneficiariosEntities(int maxResults, int firstResult) {
//        return findBeneficiariosEntities(false, maxResults, firstResult);
//    }
//
//    private List<Persona> findBeneficiariosEntities(boolean all, int maxResults, int firstResult) {
//        EntityManager em = getEntityManager();
//
//        String queryStringBaseAll = "Select nombresper || apellidosper from persona WHERE tipoper='Beneficiario' ";
//
//        List<Persona> listBeneficiarios = null;
//        try {
//
//            listBeneficiarios = em.createNativeQuery(queryStringBaseAll, Persona.class).getResultList();
//        } catch (Exception ex) {
//
//        }
//
//        if (listBeneficiarios == null) {
//            listBeneficiarios = new ArrayList<>();
//        }
//        for (int i = 0; i < listBeneficiarios.size(); i++) {
//            System.out.println(listBeneficiarios.get(i).getNombresper());
//        }
//        return listBeneficiarios;
//
//    }
    public Persona findPersona(BigDecimal id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Persona.class, id);
        } finally {
            em.close();
        }
    }

    public int getPersonaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Persona> rt = cq.from(Persona.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

    public List<Persona> buscarPersona(String cedula) {
        System.out.println(cedula);
        EntityManager em = getEntityManager();
        try {
            //Para realizar consultas 
            TypedQuery<Persona> query = em.createNamedQuery("Persona.findByCedulaper", Persona.class);
            query.setParameter("cedulaper", cedula);
            List<Persona> list = query.getResultList();
            return list;
        } finally {
            em.close();
        }
    }

    public void obtenerbeneficiario(JComboBox<Persona> comboper) {
        EntityManager em = tjc.getEntityManager();
        //Para realizar consultas 
        Iterator it = em.createQuery("SELECT p FROM Persona p").getResultList().iterator();
        try {
            while (it.hasNext()) {
                comboper.addItem(p);
            }
        } catch (Exception e) {
            System.out.println("ERROR");
        }
    }

    public List<Persona> beneficiarios() {
        String tipo = "Beneficiario";
        EntityManager em = getEntityManager();
        try {
            //Para realizar consultas 
            TypedQuery<Persona> query = em.createNamedQuery("Persona.findByTipoper", Persona.class);
            query.setParameter("tipoper", tipo);
            List<Persona> list = query.getResultList();
            return list;
        } finally {
            em.close();
        }
    }
}
