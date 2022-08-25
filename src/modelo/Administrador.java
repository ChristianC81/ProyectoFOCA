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
@Table(name = "ADMINISTRADOR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Administrador.findAll", query = "SELECT a FROM Administrador a"),
    @NamedQuery(name = "Administrador.findByIdadmin", query = "SELECT a FROM Administrador a WHERE a.idadmin = :idadmin"),
    @NamedQuery(name = "Administrador.findByTituloadmin", query = "SELECT a FROM Administrador a WHERE a.tituloadmin = :tituloadmin"),
    @NamedQuery(name = "Administrador.findBySeguroadmin", query = "SELECT a FROM Administrador a WHERE a.seguroadmin = :seguroadmin"),
    @NamedQuery(name = "Administrador.findByUsuarioadmin", query = "SELECT a FROM Administrador a WHERE a.usuarioadmin = :usuarioadmin"),
    @NamedQuery(name = "Administrador.findByClaveadmin", query = "SELECT a FROM Administrador a WHERE a.claveadmin = :claveadmin")})
public class Administrador implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "IDADMIN")
    private BigDecimal idadmin;
    @Column(name = "TITULOADMIN")
    private String tituloadmin;
    @Column(name = "SEGUROADMIN")
    private String seguroadmin;
    @Column(name = "USUARIOADMIN")
    private String usuarioadmin;
    @Column(name = "CLAVEADMIN")
    private String claveadmin;

    public Administrador() {
    }

    public Administrador(BigDecimal idadmin) {
        this.idadmin = idadmin;
    }

    public BigDecimal getIdadmin() {
        return idadmin;
    }

    public void setIdadmin(BigDecimal idadmin) {
        this.idadmin = idadmin;
    }

    public String getTituloadmin() {
        return tituloadmin;
    }

    public void setTituloadmin(String tituloadmin) {
        this.tituloadmin = tituloadmin;
    }

    public String getSeguroadmin() {
        return seguroadmin;
    }

    public void setSeguroadmin(String seguroadmin) {
        this.seguroadmin = seguroadmin;
    }

    public String getUsuarioadmin() {
        return usuarioadmin;
    }

    public void setUsuarioadmin(String usuarioadmin) {
        this.usuarioadmin = usuarioadmin;
    }

    public String getClaveadmin() {
        return claveadmin;
    }

    public void setClaveadmin(String claveadmin) {
        this.claveadmin = claveadmin;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idadmin != null ? idadmin.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Administrador)) {
            return false;
        }
        Administrador other = (Administrador) object;
        if ((this.idadmin == null && other.idadmin != null) || (this.idadmin != null && !this.idadmin.equals(other.idadmin))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Administrador[ idadmin=" + idadmin + " ]";
    }
    
}
