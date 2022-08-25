/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Laptop
 */
@Entity
@Table(name = "JEFE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Jefe.findAll", query = "SELECT j FROM Jefe j"),
    @NamedQuery(name = "Jefe.findByIdjefe", query = "SELECT j FROM Jefe j WHERE j.idjefe = :idjefe"),
    @NamedQuery(name = "Jefe.findByTitulojefe", query = "SELECT j FROM Jefe j WHERE j.titulojefe = :titulojefe"),
    @NamedQuery(name = "Jefe.findBySegurojefe", query = "SELECT j FROM Jefe j WHERE j.segurojefe = :segurojefe"),
    @NamedQuery(name = "Jefe.findByUsuariojefe", query = "SELECT j FROM Jefe j WHERE j.usuariojefe = :usuariojefe"),
    @NamedQuery(name = "Jefe.findByClavejefe", query = "SELECT j FROM Jefe j WHERE j.clavejefe = :clavejefe")})
public class Jefe implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "IDJEFE")
    private BigDecimal idjefe;
    @Column(name = "TITULOJEFE")
    private String titulojefe;
    @Column(name = "SEGUROJEFE")
    private String segurojefe;
    @Column(name = "USUARIOJEFE")
    private String usuariojefe;
    @Column(name = "CLAVEJEFE")
    private String clavejefe;

    public Jefe() {
    }

    public Jefe(BigDecimal idjefe) {
        this.idjefe = idjefe;
    }

    public BigDecimal getIdjefe() {
        return idjefe;
    }

    public void setIdjefe(BigDecimal idjefe) {
        this.idjefe = idjefe;
    }

    public String getTitulojefe() {
        return titulojefe;
    }

    public void setTitulojefe(String titulojefe) {
        this.titulojefe = titulojefe;
    }

    public String getSegurojefe() {
        return segurojefe;
    }

    public void setSegurojefe(String segurojefe) {
        this.segurojefe = segurojefe;
    }

    public String getUsuariojefe() {
        return usuariojefe;
    }

    public void setUsuariojefe(String usuariojefe) {
        this.usuariojefe = usuariojefe;
    }

    public String getClavejefe() {
        return clavejefe;
    }

    public void setClavejefe(String clavejefe) {
        this.clavejefe = clavejefe;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idjefe != null ? idjefe.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Jefe)) {
            return false;
        }
        Jefe other = (Jefe) object;
        if ((this.idjefe == null && other.idjefe != null) || (this.idjefe != null && !this.idjefe.equals(other.idjefe))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Jefe[ idjefe=" + idjefe + " ]";
    }
    
}
