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
@Table(name = "ASISTENTE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Asistente.findAll", query = "SELECT a FROM Asistente a"),
    @NamedQuery(name = "Asistente.findByIdasis", query = "SELECT a FROM Asistente a WHERE a.idasis = :idasis"),
    @NamedQuery(name = "Asistente.findByTituloasis", query = "SELECT a FROM Asistente a WHERE a.tituloasis = :tituloasis"),
    @NamedQuery(name = "Asistente.findByHorariotrabasis", query = "SELECT a FROM Asistente a WHERE a.horariotrabasis = :horariotrabasis"),
    @NamedQuery(name = "Asistente.findByUsuarioasis", query = "SELECT a FROM Asistente a WHERE a.usuarioasis = :usuarioasis"),
    @NamedQuery(name = "Asistente.findByClaveasis", query = "SELECT a FROM Asistente a WHERE a.claveasis = :claveasis")})
public class Asistente implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "IDASIS")
    private BigDecimal idasis;
    @Column(name = "TITULOASIS")
    private String tituloasis;
    @Column(name = "HORARIOTRABASIS")
    private String horariotrabasis;
    @Column(name = "USUARIOASIS")
    private String usuarioasis;
    @Column(name = "CLAVEASIS")
    private String claveasis;

    public Asistente() {
    }

    public Asistente(BigDecimal idasis) {
        this.idasis = idasis;
    }

    public BigDecimal getIdasis() {
        return idasis;
    }

    public void setIdasis(BigDecimal idasis) {
        this.idasis = idasis;
    }

    public String getTituloasis() {
        return tituloasis;
    }

    public void setTituloasis(String tituloasis) {
        this.tituloasis = tituloasis;
    }

    public String getHorariotrabasis() {
        return horariotrabasis;
    }

    public void setHorariotrabasis(String horariotrabasis) {
        this.horariotrabasis = horariotrabasis;
    }

    public String getUsuarioasis() {
        return usuarioasis;
    }

    public void setUsuarioasis(String usuarioasis) {
        this.usuarioasis = usuarioasis;
    }

    public String getClaveasis() {
        return claveasis;
    }

    public void setClaveasis(String claveasis) {
        this.claveasis = claveasis;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idasis != null ? idasis.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Asistente)) {
            return false;
        }
        Asistente other = (Asistente) object;
        if ((this.idasis == null && other.idasis != null) || (this.idasis != null && !this.idasis.equals(other.idasis))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Asistente[ idasis=" + idasis + " ]";
    }
    
}
