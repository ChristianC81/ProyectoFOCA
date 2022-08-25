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
@Table(name = "VOLUNTARIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Voluntario.findAll", query = "SELECT v FROM Voluntario v"),
    @NamedQuery(name = "Voluntario.findByIdvol", query = "SELECT v FROM Voluntario v WHERE v.idvol = :idvol"),
    @NamedQuery(name = "Voluntario.findByPeriodovol", query = "SELECT v FROM Voluntario v WHERE v.periodovol = :periodovol"),
    @NamedQuery(name = "Voluntario.findByCargovol", query = "SELECT v FROM Voluntario v WHERE v.cargovol = :cargovol"),
    @NamedQuery(name = "Voluntario.findByTipovol", query = "SELECT v FROM Voluntario v WHERE v.tipovol = :tipovol")})
public class Voluntario implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "IDVOL")
    private BigDecimal idvol;
    @Column(name = "PERIODOVOL")
    private String periodovol;
    @Column(name = "CARGOVOL")
    private String cargovol;
    @Column(name = "TIPOVOL")
    private String tipovol;
    @OneToMany(mappedBy = "idvolins")
    private List<Inscripcion> inscripcionList;

    public Voluntario() {
    }

    public Voluntario(BigDecimal idvol) {
        this.idvol = idvol;
    }

    public BigDecimal getIdvol() {
        return idvol;
    }

    public void setIdvol(BigDecimal idvol) {
        this.idvol = idvol;
    }

    public String getPeriodovol() {
        return periodovol;
    }

    public void setPeriodovol(String periodovol) {
        this.periodovol = periodovol;
    }

    public String getCargovol() {
        return cargovol;
    }

    public void setCargovol(String cargovol) {
        this.cargovol = cargovol;
    }

    public String getTipovol() {
        return tipovol;
    }

    public void setTipovol(String tipovol) {
        this.tipovol = tipovol;
    }

    @XmlTransient
    public List<Inscripcion> getInscripcionList() {
        return inscripcionList;
    }

    public void setInscripcionList(List<Inscripcion> inscripcionList) {
        this.inscripcionList = inscripcionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idvol != null ? idvol.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Voluntario)) {
            return false;
        }
        Voluntario other = (Voluntario) object;
        if ((this.idvol == null && other.idvol != null) || (this.idvol != null && !this.idvol.equals(other.idvol))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Voluntario[ idvol=" + idvol + " ]";
    }
    
}
