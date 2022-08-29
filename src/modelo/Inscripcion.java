/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Laptop
 */
@Entity
@Table(name = "INSCRIPCION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Inscripcion.findAll", query = "SELECT i FROM Inscripcion i"),
    @NamedQuery(name = "Inscripcion.findByIdins", query = "SELECT i FROM Inscripcion i WHERE i.idins = :idins"),
    @NamedQuery(name = "Inscripcion.findByNdiasparticipacionins", query = "SELECT i FROM Inscripcion i WHERE i.ndiasparticipacionins = :ndiasparticipacionins")})
public class Inscripcion implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "IDINS")
    private BigDecimal idins;
    @Column(name = "NDIASPARTICIPACIONINS")
    private BigInteger ndiasparticipacionins;
    @JoinColumn(name = "IDPERSONA", referencedColumnName = "IDPER")
    @ManyToOne
    private Persona idpersona;
    @JoinColumn(name = "IDPROYINS", referencedColumnName = "IDPROY")
    @ManyToOne
    private Proyecto idproyins;

    public Inscripcion() {
    }

    public Inscripcion(BigDecimal idins) {
        this.idins = idins;
    }

    public BigDecimal getIdins() {
        return idins;
    }

    public void setIdins(BigDecimal idins) {
        this.idins = idins;
    }

    public BigInteger getNdiasparticipacionins() {
        return ndiasparticipacionins;
    }

    public void setNdiasparticipacionins(BigInteger ndiasparticipacionins) {
        this.ndiasparticipacionins = ndiasparticipacionins;
    }

    public Persona getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(Persona idpersona) {
        this.idpersona = idpersona;
    }

    public Proyecto getIdproyins() {
        return idproyins;
    }

    public void setIdproyins(Proyecto idproyins) {
        this.idproyins = idproyins;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idins != null ? idins.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Inscripcion)) {
            return false;
        }
        Inscripcion other = (Inscripcion) object;
        if ((this.idins == null && other.idins != null) || (this.idins != null && !this.idins.equals(other.idins))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Inscripcion[ idins=" + idins + " ]";
    }
    
}
