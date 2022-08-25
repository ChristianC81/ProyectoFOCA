/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Laptop
 */
@Entity
@Table(name = "BENEFICIARIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Beneficiario.findAll", query = "SELECT b FROM Beneficiario b"),
    @NamedQuery(name = "Beneficiario.findByIdbenefi", query = "SELECT b FROM Beneficiario b WHERE b.idbenefi = :idbenefi"),
    @NamedQuery(name = "Beneficiario.findByEstratosbenefi", query = "SELECT b FROM Beneficiario b WHERE b.estratosbenefi = :estratosbenefi")})
public class Beneficiario implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "IDBENEFI")
    private BigDecimal idbenefi;
    @Column(name = "ESTRATOSBENEFI")
    private String estratosbenefi;
    @OneToMany(mappedBy = "idbenefiproy")
    private List<Proyecto> proyectoList;
    @OneToMany(mappedBy = "idbenefiform")
    private List<Formulario> formularioList;

    public Beneficiario() {
    }

    public Beneficiario(BigDecimal idbenefi) {
        this.idbenefi = idbenefi;
    }

    public BigDecimal getIdbenefi() {
        return idbenefi;
    }

    public void setIdbenefi(BigDecimal idbenefi) {
        this.idbenefi = idbenefi;
    }

    public String getEstratosbenefi() {
        return estratosbenefi;
    }

    public void setEstratosbenefi(String estratosbenefi) {
        this.estratosbenefi = estratosbenefi;
    }

    @XmlTransient
    public List<Proyecto> getProyectoList() {
        return proyectoList;
    }

    public void setProyectoList(List<Proyecto> proyectoList) {
        this.proyectoList = proyectoList;
    }

    @XmlTransient
    public List<Formulario> getFormularioList() {
        return formularioList;
    }

    public void setFormularioList(List<Formulario> formularioList) {
        this.formularioList = formularioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idbenefi != null ? idbenefi.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Beneficiario)) {
            return false;
        }
        Beneficiario other = (Beneficiario) object;
        if ((this.idbenefi == null && other.idbenefi != null) || (this.idbenefi != null && !this.idbenefi.equals(other.idbenefi))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Beneficiario[ idbenefi=" + idbenefi + " ]";
    }
    
}
