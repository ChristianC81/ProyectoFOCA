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
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Laptop
 */
@Entity
@Table(name = "DONACION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Donacion.findAll", query = "SELECT d FROM Donacion d"),
    @NamedQuery(name = "Donacion.findByIddona", query = "SELECT d FROM Donacion d WHERE d.iddona = :iddona"),
    @NamedQuery(name = "Donacion.findByDetalleproductodona", query = "SELECT d FROM Donacion d WHERE d.detalleproductodona = :detalleproductodona"),
    @NamedQuery(name = "Donacion.findByFechaentregadona", query = "SELECT d FROM Donacion d WHERE d.fechaentregadona = :fechaentregadona"),
    @NamedQuery(name = "Donacion.findByMotivodona", query = "SELECT d FROM Donacion d WHERE d.motivodona = :motivodona")})
public class Donacion implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "IDDONA")
    private BigDecimal iddona;
    @Column(name = "DETALLEPRODUCTODONA")
    private String detalleproductodona;
    @Column(name = "FECHAENTREGADONA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaentregadona;
    @Column(name = "MOTIVODONA")
    private String motivodona;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "donacion")
    private Producto producto;
    @JoinColumn(name = "IDBENEFACDONA", referencedColumnName = "IDBENEFAC")
    @ManyToOne
    private Benefactor idbenefacdona;

    public Donacion() {
    }

    public Donacion(BigDecimal iddona) {
        this.iddona = iddona;
    }

    public BigDecimal getIddona() {
        return iddona;
    }

    public void setIddona(BigDecimal iddona) {
        this.iddona = iddona;
    }

    public String getDetalleproductodona() {
        return detalleproductodona;
    }

    public void setDetalleproductodona(String detalleproductodona) {
        this.detalleproductodona = detalleproductodona;
    }

    public Date getFechaentregadona() {
        return fechaentregadona;
    }

    public void setFechaentregadona(Date fechaentregadona) {
        this.fechaentregadona = fechaentregadona;
    }

    public String getMotivodona() {
        return motivodona;
    }

    public void setMotivodona(String motivodona) {
        this.motivodona = motivodona;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Benefactor getIdbenefacdona() {
        return idbenefacdona;
    }

    public void setIdbenefacdona(Benefactor idbenefacdona) {
        this.idbenefacdona = idbenefacdona;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddona != null ? iddona.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Donacion)) {
            return false;
        }
        Donacion other = (Donacion) object;
        if ((this.iddona == null && other.iddona != null) || (this.iddona != null && !this.iddona.equals(other.iddona))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Donacion[ iddona=" + iddona + " ]";
    }
    
}