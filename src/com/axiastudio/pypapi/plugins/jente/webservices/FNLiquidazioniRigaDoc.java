
package com.axiastudio.pypapi.plugins.jente.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FNLiquidazioniRigaDoc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FNLiquidazioniRigaDoc">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="annoDoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroDoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoDoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descrTipoDoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataDoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oggetto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="importo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataRegistrDoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataScadDoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="importoTotaleDoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroRata" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoAttoLiq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="organoAttoLiq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="annoAttoLiq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroAttoLiq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataAttoLiq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataEsecAttoLiq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FNLiquidazioniRigaDoc", propOrder = {
    "annoDoc",
    "numeroDoc",
    "tipoDoc",
    "descrTipoDoc",
    "dataDoc",
    "oggetto",
    "importo",
    "dataRegistrDoc",
    "dataScadDoc",
    "importoTotaleDoc",
    "numeroRata",
    "tipoAttoLiq",
    "organoAttoLiq",
    "annoAttoLiq",
    "numeroAttoLiq",
    "dataAttoLiq",
    "dataEsecAttoLiq"
})
public class FNLiquidazioniRigaDoc {

    protected String annoDoc;
    protected String numeroDoc;
    protected String tipoDoc;
    protected String descrTipoDoc;
    protected String dataDoc;
    protected String oggetto;
    protected String importo;
    protected String dataRegistrDoc;
    protected String dataScadDoc;
    protected String importoTotaleDoc;
    protected String numeroRata;
    protected String tipoAttoLiq;
    protected String organoAttoLiq;
    protected String annoAttoLiq;
    protected String numeroAttoLiq;
    protected String dataAttoLiq;
    protected String dataEsecAttoLiq;

    /**
     * Gets the value of the annoDoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnoDoc() {
        return annoDoc;
    }

    /**
     * Sets the value of the annoDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnoDoc(String value) {
        this.annoDoc = value;
    }

    /**
     * Gets the value of the numeroDoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroDoc() {
        return numeroDoc;
    }

    /**
     * Sets the value of the numeroDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroDoc(String value) {
        this.numeroDoc = value;
    }

    /**
     * Gets the value of the tipoDoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDoc() {
        return tipoDoc;
    }

    /**
     * Sets the value of the tipoDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDoc(String value) {
        this.tipoDoc = value;
    }

    /**
     * Gets the value of the descrTipoDoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrTipoDoc() {
        return descrTipoDoc;
    }

    /**
     * Sets the value of the descrTipoDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrTipoDoc(String value) {
        this.descrTipoDoc = value;
    }

    /**
     * Gets the value of the dataDoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataDoc() {
        return dataDoc;
    }

    /**
     * Sets the value of the dataDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataDoc(String value) {
        this.dataDoc = value;
    }

    /**
     * Gets the value of the oggetto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOggetto() {
        return oggetto;
    }

    /**
     * Sets the value of the oggetto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOggetto(String value) {
        this.oggetto = value;
    }

    /**
     * Gets the value of the importo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImporto() {
        return importo;
    }

    /**
     * Sets the value of the importo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImporto(String value) {
        this.importo = value;
    }

    /**
     * Gets the value of the dataRegistrDoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataRegistrDoc() {
        return dataRegistrDoc;
    }

    /**
     * Sets the value of the dataRegistrDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataRegistrDoc(String value) {
        this.dataRegistrDoc = value;
    }

    /**
     * Gets the value of the dataScadDoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataScadDoc() {
        return dataScadDoc;
    }

    /**
     * Sets the value of the dataScadDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataScadDoc(String value) {
        this.dataScadDoc = value;
    }

    /**
     * Gets the value of the importoTotaleDoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImportoTotaleDoc() {
        return importoTotaleDoc;
    }

    /**
     * Sets the value of the importoTotaleDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImportoTotaleDoc(String value) {
        this.importoTotaleDoc = value;
    }

    /**
     * Gets the value of the numeroRata property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroRata() {
        return numeroRata;
    }

    /**
     * Sets the value of the numeroRata property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroRata(String value) {
        this.numeroRata = value;
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

}
