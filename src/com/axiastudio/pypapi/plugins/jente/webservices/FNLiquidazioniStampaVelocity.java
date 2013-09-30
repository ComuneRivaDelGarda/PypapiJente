
package com.axiastudio.pypapi.plugins.jente.webservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FNLiquidazioniStampaVelocity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FNLiquidazioniStampaVelocity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idLiquidazione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="annoLiq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroLiq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataLiq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="esercizio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codRproc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descRProc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeRProc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeRProc2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dirigente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoAttoLiq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="organoAttoLiq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="annoAttoLiq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroAttoLiq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataAttoLiq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataEsecAttoLiq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descLiquidazione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totaleLiq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroElenco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroRighe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="listaCapitoli" type="{http://infor.arezzo.it/jente/jfinanziaria/services}FNLiquidazioniRigaCapit" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FNLiquidazioniStampaVelocity", propOrder = {
    "id",
    "idLiquidazione",
    "annoLiq",
    "numeroLiq",
    "dataLiq",
    "esercizio",
    "codRproc",
    "descRProc",
    "nomeRProc",
    "nomeRProc2",
    "dirigente",
    "tipoAttoLiq",
    "organoAttoLiq",
    "annoAttoLiq",
    "numeroAttoLiq",
    "dataAttoLiq",
    "dataEsecAttoLiq",
    "descLiquidazione",
    "totaleLiq",
    "numeroElenco",
    "numeroRighe",
    "listaCapitoli"
})
public class FNLiquidazioniStampaVelocity {

    protected String id;
    protected String idLiquidazione;
    protected String annoLiq;
    protected String numeroLiq;
    protected String dataLiq;
    protected String esercizio;
    protected String codRproc;
    protected String descRProc;
    protected String nomeRProc;
    protected String nomeRProc2;
    protected String dirigente;
    protected String tipoAttoLiq;
    protected String organoAttoLiq;
    protected String annoAttoLiq;
    protected String numeroAttoLiq;
    protected String dataAttoLiq;
    protected String dataEsecAttoLiq;
    protected String descLiquidazione;
    protected String totaleLiq;
    protected String numeroElenco;
    protected String numeroRighe;
    protected List<FNLiquidazioniRigaCapit> listaCapitoli;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the idLiquidazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdLiquidazione() {
        return idLiquidazione;
    }

    /**
     * Sets the value of the idLiquidazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdLiquidazione(String value) {
        this.idLiquidazione = value;
    }

    /**
     * Gets the value of the annoLiq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnoLiq() {
        return annoLiq;
    }

    /**
     * Sets the value of the annoLiq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnoLiq(String value) {
        this.annoLiq = value;
    }

    /**
     * Gets the value of the numeroLiq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroLiq() {
        return numeroLiq;
    }

    /**
     * Sets the value of the numeroLiq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroLiq(String value) {
        this.numeroLiq = value;
    }

    /**
     * Gets the value of the dataLiq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataLiq() {
        return dataLiq;
    }

    /**
     * Sets the value of the dataLiq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataLiq(String value) {
        this.dataLiq = value;
    }

    /**
     * Gets the value of the esercizio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEsercizio() {
        return esercizio;
    }

    /**
     * Sets the value of the esercizio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEsercizio(String value) {
        this.esercizio = value;
    }

    /**
     * Gets the value of the codRproc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodRproc() {
        return codRproc;
    }

    /**
     * Sets the value of the codRproc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodRproc(String value) {
        this.codRproc = value;
    }

    /**
     * Gets the value of the descRProc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescRProc() {
        return descRProc;
    }

    /**
     * Sets the value of the descRProc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescRProc(String value) {
        this.descRProc = value;
    }

    /**
     * Gets the value of the nomeRProc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeRProc() {
        return nomeRProc;
    }

    /**
     * Sets the value of the nomeRProc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeRProc(String value) {
        this.nomeRProc = value;
    }

    /**
     * Gets the value of the nomeRProc2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeRProc2() {
        return nomeRProc2;
    }

    /**
     * Sets the value of the nomeRProc2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeRProc2(String value) {
        this.nomeRProc2 = value;
    }

    /**
     * Gets the value of the dirigente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirigente() {
        return dirigente;
    }

    /**
     * Sets the value of the dirigente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirigente(String value) {
        this.dirigente = value;
    }

    /**
     * Gets the value of the tipoAttoLiq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoAttoLiq() {
        return tipoAttoLiq;
    }

    /**
     * Sets the value of the tipoAttoLiq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoAttoLiq(String value) {
        this.tipoAttoLiq = value;
    }

    /**
     * Gets the value of the organoAttoLiq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganoAttoLiq() {
        return organoAttoLiq;
    }

    /**
     * Sets the value of the organoAttoLiq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganoAttoLiq(String value) {
        this.organoAttoLiq = value;
    }

    /**
     * Gets the value of the annoAttoLiq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnoAttoLiq() {
        return annoAttoLiq;
    }

    /**
     * Sets the value of the annoAttoLiq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnoAttoLiq(String value) {
        this.annoAttoLiq = value;
    }

    /**
     * Gets the value of the numeroAttoLiq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroAttoLiq() {
        return numeroAttoLiq;
    }

    /**
     * Sets the value of the numeroAttoLiq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroAttoLiq(String value) {
        this.numeroAttoLiq = value;
    }

    /**
     * Gets the value of the dataAttoLiq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataAttoLiq() {
        return dataAttoLiq;
    }

    /**
     * Sets the value of the dataAttoLiq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataAttoLiq(String value) {
        this.dataAttoLiq = value;
    }

    /**
     * Gets the value of the dataEsecAttoLiq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataEsecAttoLiq() {
        return dataEsecAttoLiq;
    }

    /**
     * Sets the value of the dataEsecAttoLiq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataEsecAttoLiq(String value) {
        this.dataEsecAttoLiq = value;
    }

    /**
     * Gets the value of the descLiquidazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescLiquidazione() {
        return descLiquidazione;
    }

    /**
     * Sets the value of the descLiquidazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescLiquidazione(String value) {
        this.descLiquidazione = value;
    }

    /**
     * Gets the value of the totaleLiq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotaleLiq() {
        return totaleLiq;
    }

    /**
     * Sets the value of the totaleLiq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotaleLiq(String value) {
        this.totaleLiq = value;
    }

    /**
     * Gets the value of the numeroElenco property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroElenco() {
        return numeroElenco;
    }

    /**
     * Sets the value of the numeroElenco property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroElenco(String value) {
        this.numeroElenco = value;
    }

    /**
     * Gets the value of the numeroRighe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroRighe() {
        return numeroRighe;
    }

    /**
     * Sets the value of the numeroRighe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroRighe(String value) {
        this.numeroRighe = value;
    }

    /**
     * Gets the value of the listaCapitoli property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaCapitoli property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaCapitoli().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FNLiquidazioniRigaCapit }
     * 
     * 
     */
    public List<FNLiquidazioniRigaCapit> getListaCapitoli() {
        if (listaCapitoli == null) {
            listaCapitoli = new ArrayList<FNLiquidazioniRigaCapit>();
        }
        return this.listaCapitoli;
    }

}
