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
@Table(name = "BENEFACTOR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Benefactor.findAll", query = "SELECT b FROM Benefactor b"),
    @NamedQuery(name = "Benefactor.findByIdbenefac", query = "SELECT b FROM Benefactor b WHERE b.idbenefac = :idbenefac"),
    @NamedQuery(name = "Benefactor.findBySalariobenefac", query = "SELECT b FROM Benefactor b WHERE b.salariobenefac = :salariobenefac")})
public class Benefactor implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "IDBENEFAC")
    private BigDecimal idbenefac;
    @Column(name = "SALARIOBENEFAC")
    private Double salariobenefac;
    @OneToMany(mappedBy = "idbenefacdona")
    private List<Donacion> donacionList;

    public Benefactor() {
    }

    public Benefactor(BigDecimal idbenefac) {
        this.idbenefac = idbenefac;
    }

    public BigDecimal getIdbenefac() {
        return idbenefac;
    }

    public void setIdbenefac(BigDecimal idbenefac) {
        this.idbenefac = idbenefac;
    }

    public Double getSalariobenefac() {
        return salariobenefac;
    }

    public void setSalariobenefac(Double salariobenefac) {
        this.salariobenefac = salariobenefac;
    }

    @XmlTransient
    public List<Donacion> getDonacionList() {
        return donacionList;
    }

    public void setDonacionList(List<Donacion> donacionList) {
        this.donacionList = donacionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idbenefac != null ? idbenefac.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Benefactor)) {
            return false;
        }
        Benefactor other = (Benefactor) object;
        if ((this.idbenefac == null && other.idbenefac != null) || (this.idbenefac != null && !this.idbenefac.equals(other.idbenefac))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Benefactor[ idbenefac=" + idbenefac + " ]";
    }
    
}
