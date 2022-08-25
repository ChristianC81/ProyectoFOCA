/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Laptop
 */
@Entity
@Table(name = "PERSONA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Persona.findAll", query = "SELECT p FROM Persona p"),
    @NamedQuery(name = "Persona.findByIdper", query = "SELECT p FROM Persona p WHERE p.idper = :idper"),
    @NamedQuery(name = "Persona.findByCedulaper", query = "SELECT p FROM Persona p WHERE p.cedulaper = :cedulaper"),
    @NamedQuery(name = "Persona.findByNombresper", query = "SELECT p FROM Persona p WHERE p.nombresper = :nombresper"),
    @NamedQuery(name = "Persona.findByApellidosper", query = "SELECT p FROM Persona p WHERE p.apellidosper = :apellidosper"),
    @NamedQuery(name = "Persona.findByDireccionper", query = "SELECT p FROM Persona p WHERE p.direccionper = :direccionper"),
    @NamedQuery(name = "Persona.findByTelefonoper", query = "SELECT p FROM Persona p WHERE p.telefonoper = :telefonoper"),
    @NamedQuery(name = "Persona.findByCorreoper", query = "SELECT p FROM Persona p WHERE p.correoper = :correoper"),
    @NamedQuery(name = "Persona.findByGeneroper", query = "SELECT p FROM Persona p WHERE p.generoper = :generoper"),
    @NamedQuery(name = "Persona.findByFechanacimiento", query = "SELECT p FROM Persona p WHERE p.fechanacimiento = :fechanacimiento"),
    @NamedQuery(name = "Persona.findByEstadocivil", query = "SELECT p FROM Persona p WHERE p.estadocivil = :estadocivil")})
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
        return "modelo.Persona[ idper=" + idper + " ]";
    }
    
}
