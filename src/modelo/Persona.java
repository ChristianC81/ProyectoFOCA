/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author chris
 */
@Entity
@Table(name = "PERSONA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Persona.findAll", query = "SELECT p FROM Persona p"),
    @NamedQuery(name = "Persona.findByIdper", query = "SELECT p FROM Persona p WHERE p.idper = :idper"),
    @NamedQuery(name = "Persona.findByCedulaper", query = "SELECT p FROM Persona p WHERE p.cedulaper = :cedulaper"),
    @NamedQuery(name = "Persona.findByTipoper", query = "SELECT p FROM Persona p WHERE p.tipoper = :tipoper"),
    @NamedQuery(name = "Persona.findByNombresper", query = "SELECT p FROM Persona p WHERE p.nombresper = :nombresper"),
    @NamedQuery(name = "Persona.findByApellidosper", query = "SELECT p FROM Persona p WHERE p.apellidosper = :apellidosper"),
    @NamedQuery(name = "Persona.findByDireccionper", query = "SELECT p FROM Persona p WHERE p.direccionper = :direccionper"),
    @NamedQuery(name = "Persona.findByTelefonoper", query = "SELECT p FROM Persona p WHERE p.telefonoper = :telefonoper"),
    @NamedQuery(name = "Persona.findByCorreoper", query = "SELECT p FROM Persona p WHERE p.correoper = :correoper"),
    @NamedQuery(name = "Persona.findByGeneroper", query = "SELECT p FROM Persona p WHERE p.generoper = :generoper"),
    @NamedQuery(name = "Persona.findByFechanacimiento", query = "SELECT p FROM Persona p WHERE p.fechanacimiento = :fechanacimiento"),
    @NamedQuery(name = "Persona.findByEstadocivil", query = "SELECT p FROM Persona p WHERE p.estadocivil = :estadocivil"),
    @NamedQuery(name = "Persona.findBySalariobenefac", query = "SELECT p FROM Persona p WHERE p.salariobenefac = :salariobenefac"),
    @NamedQuery(name = "Persona.findByEstratosbenefi", query = "SELECT p FROM Persona p WHERE p.estratosbenefi = :estratosbenefi"),
    @NamedQuery(name = "Persona.findByTitulo", query = "SELECT p FROM Persona p WHERE p.titulo = :titulo"),
    @NamedQuery(name = "Persona.findBySeguro", query = "SELECT p FROM Persona p WHERE p.seguro = :seguro"),
    @NamedQuery(name = "Persona.findByHorario", query = "SELECT p FROM Persona p WHERE p.horario = :horario"),
    @NamedQuery(name = "Persona.findByPeriodovol", query = "SELECT p FROM Persona p WHERE p.periodovol = :periodovol"),
    @NamedQuery(name = "Persona.findByTipovol", query = "SELECT p FROM Persona p WHERE p.tipovol = :tipovol")})
public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "IDPER")
    private BigDecimal idper;
    @Basic(optional = false)
    @Column(name = "CEDULAPER")
    private String cedulaper;
    @Column(name = "TIPOPER")
    private String tipoper;
    @Column(name = "NOMBRESPER")
    private String nombresper;
    @Column(name = "APELLIDOSPER")
    private String apellidosper;
    @Column(name = "DIRECCIONPER")
    private String direccionper;
    @Column(name = "TELEFONOPER")
    private String telefonoper;
    @Column(name = "CORREOPER")
    private String correoper;
    @Column(name = "GENEROPER")
    private String generoper;
    @Column(name = "FECHANACIMIENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechanacimiento;
    @Column(name = "ESTADOCIVIL")
    private String estadocivil;
    @Column(name = "SALARIOBENEFAC")
    private Double salariobenefac;
    @Column(name = "ESTRATOSBENEFI")
    private String estratosbenefi;
    @Column(name = "TITULO")
    private String titulo;
    @Column(name = "SEGURO")
    private String seguro;
    @Column(name = "HORARIO")
    private String horario;
    @Column(name = "PERIODOVOL")
    private String periodovol;
    @Column(name = "TIPOVOL")
    private String tipovol;
    @Lob
    @Column(name = "FOTO")
    private Serializable foto;
    @OneToMany(mappedBy = "idpersona")
    private List<Inscripcion> inscripcionList;
    @OneToMany(mappedBy = "idpersona")
    private List<Proyecto> proyectoList;
    @OneToMany(mappedBy = "idpersona")
    private List<Donacion> donacionList;
    @OneToMany(mappedBy = "idpersona")
    private List<Usuario> usuarioList;

    public Persona() {
    }

    public Persona(BigDecimal idper) {
        this.idper = idper;
    }

    public Persona(BigDecimal idper, String cedulaper) {
        this.idper = idper;
        this.cedulaper = cedulaper;
    }

    public BigDecimal getIdper() {
        return idper;
    }

    public void setIdper(BigDecimal idper) {
        this.idper = idper;
    }

    public String getCedulaper() {
        return cedulaper;
    }

    public void setCedulaper(String cedulaper) {
        this.cedulaper = cedulaper;
    }

    public String getTipoper() {
        return tipoper;
    }

    public void setTipoper(String tipoper) {
        this.tipoper = tipoper;
    }

    public String getNombresper() {
        return nombresper;
    }

    public void setNombresper(String nombresper) {
        this.nombresper = nombresper;
    }

    public String getApellidosper() {
        return apellidosper;
    }

    public void setApellidosper(String apellidosper) {
        this.apellidosper = apellidosper;
    }

    public String getDireccionper() {
        return direccionper;
    }

    public void setDireccionper(String direccionper) {
        this.direccionper = direccionper;
    }

    public String getTelefonoper() {
        return telefonoper;
    }

    public void setTelefonoper(String telefonoper) {
        this.telefonoper = telefonoper;
    }

    public String getCorreoper() {
        return correoper;
    }

    public void setCorreoper(String correoper) {
        this.correoper = correoper;
    }

    public String getGeneroper() {
        return generoper;
    }

    public void setGeneroper(String generoper) {
        this.generoper = generoper;
    }

    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public String getEstadocivil() {
        return estadocivil;
    }

    public void setEstadocivil(String estadocivil) {
        this.estadocivil = estadocivil;
    }

    public Double getSalariobenefac() {
        return salariobenefac;
    }

    public void setSalariobenefac(Double salariobenefac) {
        this.salariobenefac = salariobenefac;
    }

    public String getEstratosbenefi() {
        return estratosbenefi;
    }

    public void setEstratosbenefi(String estratosbenefi) {
        this.estratosbenefi = estratosbenefi;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSeguro() {
        return seguro;
    }

    public void setSeguro(String seguro) {
        this.seguro = seguro;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getPeriodovol() {
        return periodovol;
    }

    public void setPeriodovol(String periodovol) {
        this.periodovol = periodovol;
    }

    public String getTipovol() {
        return tipovol;
    }

    public void setTipovol(String tipovol) {
        this.tipovol = tipovol;
    }

    public Serializable getFoto() {
        return foto;
    }

    public void setFoto(Serializable foto) {
        this.foto = foto;
    }

    @XmlTransient
    public List<Inscripcion> getInscripcionList() {
        return inscripcionList;
    }

    public void setInscripcionList(List<Inscripcion> inscripcionList) {
        this.inscripcionList = inscripcionList;
    }

    @XmlTransient
    public List<Proyecto> getProyectoList() {
        return proyectoList;
    }

    public void setProyectoList(List<Proyecto> proyectoList) {
        this.proyectoList = proyectoList;
    }

    @XmlTransient
    public List<Donacion> getDonacionList() {
        return donacionList;
    }

    public void setDonacionList(List<Donacion> donacionList) {
        this.donacionList = donacionList;
    }

    @XmlTransient
    public List<Usuario> getUsuarioList() {
        return usuarioList;
    }

    public void setUsuarioList(List<Usuario> usuarioList) {
        this.usuarioList = usuarioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idper != null ? idper.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Persona)) {
            return false;
        }
        Persona other = (Persona) object;
        if ((this.idper == null && other.idper != null) || (this.idper != null && !this.idper.equals(other.idper))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.nombresper + " " + this.apellidosper;
    }

}
