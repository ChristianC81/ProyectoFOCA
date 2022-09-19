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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "PROYECTO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Proyecto.findAll", query = "SELECT p FROM Proyecto p"),
    @NamedQuery(name = "Proyecto.findByIdproy", query = "SELECT p FROM Proyecto p WHERE p.idproy = :idproy"),
    @NamedQuery(name = "Proyecto.findByNombreproy", query = "SELECT p FROM Proyecto p WHERE p.nombreproy = :nombreproy"),
    @NamedQuery(name = "Proyecto.findByFechainicioproy", query = "SELECT p FROM Proyecto p WHERE p.fechainicioproy = :fechainicioproy"),
    @NamedQuery(name = "Proyecto.findByFechafinproy", query = "SELECT p FROM Proyecto p WHERE p.fechafinproy = :fechafinproy"),
    @NamedQuery(name = "Proyecto.findByLugarproy", query = "SELECT p FROM Proyecto p WHERE p.lugarproy = :lugarproy")})
public class Proyecto implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "IDPROY")
    private BigDecimal idproy;
    @Column(name = "NOMBREPROY")
    private String nombreproy;
    @Column(name = "FECHAINICIOPROY")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechainicioproy;
    @Column(name = "FECHAFINPROY")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechafinproy;
    @Column(name = "LUGARPROY")
    private String lugarproy;
    @OneToMany(mappedBy = "idproyprod")
    private List<Producto> productoList;
    @OneToMany(mappedBy = "idproyins")
    private List<Inscripcion> inscripcionList;
    @JoinColumn(name = "IDPERSONA", referencedColumnName = "IDPER")
    @ManyToOne
    private Persona idpersona;

    public Proyecto() {
    }

    public Proyecto(BigDecimal idproy) {
        this.idproy = idproy;
    }

    public BigDecimal getIdproy() {
        return idproy;
    }

    public void setIdproy(BigDecimal idproy) {
        this.idproy = idproy;
    }

    public String getNombreproy() {
        return nombreproy;
    }

    public void setNombreproy(String nombreproy) {
        this.nombreproy = nombreproy;
    }

    public Date getFechainicioproy() {
        return fechainicioproy;
    }

    public void setFechainicioproy(Date fechainicioproy) {
        this.fechainicioproy = fechainicioproy;
    }

    public Date getFechafinproy() {
        return fechafinproy;
    }

    public void setFechafinproy(Date fechafinproy) {
        this.fechafinproy = fechafinproy;
    }

    public String getLugarproy() {
        return lugarproy;
    }

    public void setLugarproy(String lugarproy) {
        this.lugarproy = lugarproy;
    }

    @XmlTransient
    public List<Producto> getProductoList() {
        return productoList;
    }

    public void setProductoList(List<Producto> productoList) {
        this.productoList = productoList;
    }

    @XmlTransient
    public List<Inscripcion> getInscripcionList() {
        return inscripcionList;
    }

    public void setInscripcionList(List<Inscripcion> inscripcionList) {
        this.inscripcionList = inscripcionList;
    }

    public Persona getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(Persona idpersona) {
        this.idpersona = idpersona;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idproy != null ? idproy.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Proyecto)) {
            return false;
        }
        Proyecto other = (Proyecto) object;
        if ((this.idproy == null && other.idproy != null) || (this.idproy != null && !this.idproy.equals(other.idproy))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nombreproy;
    }
    
}
