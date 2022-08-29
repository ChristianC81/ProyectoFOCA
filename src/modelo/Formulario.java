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
@Table(name = "FORMULARIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Formulario.findAll", query = "SELECT f FROM Formulario f"),
    @NamedQuery(name = "Formulario.findByIdform", query = "SELECT f FROM Formulario f WHERE f.idform = :idform"),
    @NamedQuery(name = "Formulario.findByDomicilioform", query = "SELECT f FROM Formulario f WHERE f.domicilioform = :domicilioform"),
    @NamedQuery(name = "Formulario.findByIngresoform", query = "SELECT f FROM Formulario f WHERE f.ingresoform = :ingresoform"),
    @NamedQuery(name = "Formulario.findByNiveleduform", query = "SELECT f FROM Formulario f WHERE f.niveleduform = :niveleduform"),
    @NamedQuery(name = "Formulario.findByTipoviviendaform", query = "SELECT f FROM Formulario f WHERE f.tipoviviendaform = :tipoviviendaform"),
    @NamedQuery(name = "Formulario.findByNhijosform", query = "SELECT f FROM Formulario f WHERE f.nhijosform = :nhijosform"),
    @NamedQuery(name = "Formulario.findByEtniaform", query = "SELECT f FROM Formulario f WHERE f.etniaform = :etniaform"),
    @NamedQuery(name = "Formulario.findByDiscapacidaform", query = "SELECT f FROM Formulario f WHERE f.discapacidaform = :discapacidaform"),
    @NamedQuery(name = "Formulario.findByNpropiedades", query = "SELECT f FROM Formulario f WHERE f.npropiedades = :npropiedades"),
    @NamedQuery(name = "Formulario.findByIeesform", query = "SELECT f FROM Formulario f WHERE f.ieesform = :ieesform"),
    @NamedQuery(name = "Formulario.findByInternetform", query = "SELECT f FROM Formulario f WHERE f.internetform = :internetform"),
    @NamedQuery(name = "Formulario.findByNdispositivos", query = "SELECT f FROM Formulario f WHERE f.ndispositivos = :ndispositivos"),
    @NamedQuery(name = "Formulario.findByServbasicos", query = "SELECT f FROM Formulario f WHERE f.servbasicos = :servbasicos"),
    @NamedQuery(name = "Formulario.findByNintefamform", query = "SELECT f FROM Formulario f WHERE f.nintefamform = :nintefamform")})
public class Formulario implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "IDFORM")
    private BigDecimal idform;
    @Column(name = "DOMICILIOFORM")
    private String domicilioform;
    @Column(name = "INGRESOFORM")
    private Double ingresoform;
    @Column(name = "NIVELEDUFORM")
    private String niveleduform;
    @Column(name = "TIPOVIVIENDAFORM")
    private String tipoviviendaform;
    @Column(name = "NHIJOSFORM")
    private BigInteger nhijosform;
    @Column(name = "ETNIAFORM")
    private String etniaform;
    @Column(name = "DISCAPACIDAFORM")
    private String discapacidaform;
    @Column(name = "NPROPIEDADES")
    private BigInteger npropiedades;
    @Column(name = "IEESFORM")
    private String ieesform;
    @Column(name = "INTERNETFORM")
    private String internetform;
    @Column(name = "NDISPOSITIVOS")
    private BigInteger ndispositivos;
    @Column(name = "SERVBASICOS")
    private String servbasicos;
    @Column(name = "NINTEFAMFORM")
    private BigInteger nintefamform;
    @JoinColumn(name = "IDPERSONA", referencedColumnName = "IDPER")
    @ManyToOne
    private Persona idpersona;

    public Formulario() {
    }

    public Formulario(BigDecimal idform) {
        this.idform = idform;
    }

    public BigDecimal getIdform() {
        return idform;
    }

    public void setIdform(BigDecimal idform) {
        this.idform = idform;
    }

    public String getDomicilioform() {
        return domicilioform;
    }

    public void setDomicilioform(String domicilioform) {
        this.domicilioform = domicilioform;
    }

    public Double getIngresoform() {
        return ingresoform;
    }

    public void setIngresoform(Double ingresoform) {
        this.ingresoform = ingresoform;
    }

    public String getNiveleduform() {
        return niveleduform;
    }

    public void setNiveleduform(String niveleduform) {
        this.niveleduform = niveleduform;
    }

    public String getTipoviviendaform() {
        return tipoviviendaform;
    }

    public void setTipoviviendaform(String tipoviviendaform) {
        this.tipoviviendaform = tipoviviendaform;
    }

    public BigInteger getNhijosform() {
        return nhijosform;
    }

    public void setNhijosform(BigInteger nhijosform) {
        this.nhijosform = nhijosform;
    }

    public String getEtniaform() {
        return etniaform;
    }

    public void setEtniaform(String etniaform) {
        this.etniaform = etniaform;
    }

    public String getDiscapacidaform() {
        return discapacidaform;
    }

    public void setDiscapacidaform(String discapacidaform) {
        this.discapacidaform = discapacidaform;
    }

    public BigInteger getNpropiedades() {
        return npropiedades;
    }

    public void setNpropiedades(BigInteger npropiedades) {
        this.npropiedades = npropiedades;
    }

    public String getIeesform() {
        return ieesform;
    }

    public void setIeesform(String ieesform) {
        this.ieesform = ieesform;
    }

    public String getInternetform() {
        return internetform;
    }

    public void setInternetform(String internetform) {
        this.internetform = internetform;
    }

    public BigInteger getNdispositivos() {
        return ndispositivos;
    }

    public void setNdispositivos(BigInteger ndispositivos) {
        this.ndispositivos = ndispositivos;
    }

    public String getServbasicos() {
        return servbasicos;
    }

    public void setServbasicos(String servbasicos) {
        this.servbasicos = servbasicos;
    }

    public BigInteger getNintefamform() {
        return nintefamform;
    }

    public void setNintefamform(BigInteger nintefamform) {
        this.nintefamform = nintefamform;
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
        hash += (idform != null ? idform.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Formulario)) {
            return false;
        }
        Formulario other = (Formulario) object;
        if ((this.idform == null && other.idform != null) || (this.idform != null && !this.idform.equals(other.idform))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Formulario[ idform=" + idform + " ]";
    }
    
}
