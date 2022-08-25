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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Laptop
 */
@Entity
@Table(name = "PRODUCTO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Producto.findAll", query = "SELECT p FROM Producto p"),
    @NamedQuery(name = "Producto.findByIdprod", query = "SELECT p FROM Producto p WHERE p.idprod = :idprod"),
    @NamedQuery(name = "Producto.findByCantidadprod", query = "SELECT p FROM Producto p WHERE p.cantidadprod = :cantidadprod"),
    @NamedQuery(name = "Producto.findByTipoprod", query = "SELECT p FROM Producto p WHERE p.tipoprod = :tipoprod"),
    @NamedQuery(name = "Producto.findByIddonaprod", query = "SELECT p FROM Producto p WHERE p.iddonaprod = :iddonaprod")})
public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "IDPROD")
    private BigDecimal idprod;
    @Column(name = "CANTIDADPROD")
    private BigInteger cantidadprod;
    @Column(name = "TIPOPROD")
    private String tipoprod;
    @Column(name = "IDDONAPROD")
    private BigInteger iddonaprod;
    @JoinColumn(name = "IDPROD", referencedColumnName = "IDDONA", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Donacion donacion;
    @JoinColumn(name = "IDPROYPROD", referencedColumnName = "IDPROY")
    @ManyToOne
    private Proyecto idproyprod;

    public Producto() {
    }

    public Producto(BigDecimal idprod) {
        this.idprod = idprod;
    }

    public BigDecimal getIdprod() {
        return idprod;
    }

    public void setIdprod(BigDecimal idprod) {
        this.idprod = idprod;
    }

    public BigInteger getCantidadprod() {
        return cantidadprod;
    }

    public void setCantidadprod(BigInteger cantidadprod) {
        this.cantidadprod = cantidadprod;
    }

    public String getTipoprod() {
        return tipoprod;
    }

    public void setTipoprod(String tipoprod) {
        this.tipoprod = tipoprod;
    }

    public BigInteger getIddonaprod() {
        return iddonaprod;
    }

    public void setIddonaprod(BigInteger iddonaprod) {
        this.iddonaprod = iddonaprod;
    }

    public Donacion getDonacion() {
        return donacion;
    }

    public void setDonacion(Donacion donacion) {
        this.donacion = donacion;
    }

    public Proyecto getIdproyprod() {
        return idproyprod;
    }

    public void setIdproyprod(Proyecto idproyprod) {
        this.idproyprod = idproyprod;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idprod != null ? idprod.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Producto)) {
            return false;
        }
        Producto other = (Producto) object;
        if ((this.idprod == null && other.idprod != null) || (this.idprod != null && !this.idprod.equals(other.idprod))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Producto[ idprod=" + idprod + " ]";
    }
    
}
