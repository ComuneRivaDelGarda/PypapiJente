
package com.axiastudio.pypapi.plugins.jente.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bozzaInAtto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bozzaInAtto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="organoSettoreBozza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="annoBozza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroBozza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="organoSettoreAtto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="annoAtto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroAtto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataAtto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataEsecutivita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoEsecutivita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="importo" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="oggetto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="validoVariazioni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="validoImpegni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="validoAccertamenti" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="validoLiquidazioni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="validoAssegnazioni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="responsabileProcedimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bozzaInAtto", propOrder = {
    "organoSettoreBozza",
    "annoBozza",
    "numeroBozza",
    "organoSettoreAtto",
    "annoAtto",
    "numeroAtto",
    "dataAtto",
    "dataEsecutivita",
    "tipoEsecutivita",
    "importo",
    "oggetto",
    "validoVariazioni",
    "validoImpegni",
    "validoAccertamenti",
    "validoLiquidazioni",
    "validoAssegnazioni",
    "responsabileProcedimento"
})
public class BozzaInAtto {

    protected String organoSettoreBozza;
    protected String annoBozza;
    protected String numeroBozza;
    protected String organoSettoreAtto;
    protected String annoAtto;
    protected String numeroAtto;
    protected String dataAtto;
    protected String dataEsecutivita;
    protected String tipoEsecutivita;
    protected Double importo;
    protected String oggetto;
    protected String validoVariazioni;
    protected String validoImpegni;
    protected String validoAccertamenti;
    protected String validoLiquidazioni;
    protected String validoAssegnazioni;
    protected String responsabileProcedimento;

    /**
     * Gets the value of the organoSettoreBozza property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganoSettoreBozza() {
        return organoSettoreBozza;
    }

    /**
     * Sets the value of the organoSettoreBozza property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganoSettoreBozza(String value) {
        this.organoSettoreBozza = value;
    }

    /**
     * Gets the value of the annoBozza property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnoBozza() {
        return annoBozza;
    }

    /**
     * Sets the value of the annoBozza property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnoBozza(String value) {
        this.annoBozza = value;
    }

    /**
     * Gets the value of the numeroBozza property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroBozza() {
        return numeroBozza;
    }

    /**
     * Sets the value of the numeroBozza property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroBozza(String value) {
        this.numeroBozza = value;
    }

    /**
     * Gets the value of the organoSettoreAtto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganoSettoreAtto() {
        return organoSettoreAtto;
    }

    /**
     * Sets the value of the organoSettoreAtto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganoSettoreAtto(String value) {
        this.organoSettoreAtto = value;
    }

    /**
     * Gets the value of the annoAtto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnoAtto() {
        return annoAtto;
    }

    /**
     * Sets the value of the annoAtto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnoAtto(String value) {
        this.annoAtto = value;
    }

    /**
     * Gets the value of the numeroAtto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroAtto() {
        return numeroAtto;
    }

    /**
     * Sets the value of the numeroAtto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroAtto(String value) {
        this.numeroAtto = value;
    }

    /**
     * Gets the value of the dataAtto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataAtto() {
        return dataAtto;
    }

    /**
     * Sets the value of the dataAtto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataAtto(String value) {
        this.dataAtto = value;
    }

    /**
     * Gets the value of the dataEsecutivita property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataEsecutivita() {
        return dataEsecutivita;
    }

    /**
     * Sets the value of the dataEsecutivita property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataEsecutivita(String value) {
        this.dataEsecutivita = value;
    }

    /**
     * Gets the value of the tipoEsecutivita property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoEsecutivita() {
        return tipoEsecutivita;
    }

    /**
     * Sets the value of the tipoEsecutivita property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoEsecutivita(String value) {
        this.tipoEsecutivita = value;
    }

    /**
     * Gets the value of the importo property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getImporto() {
        return importo;
    }

    /**
     * Sets the value of the importo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setImporto(Double value) {
        this.importo = value;
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
     * Gets the value of the validoVariazioni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidoVariazioni() {
        return validoVariazioni;
    }

    /**
     * Sets the value of the validoVariazioni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidoVariazioni(String value) {
        this.validoVariazioni = value;
    }

    /**
     * Gets the value of the validoImpegni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidoImpegni() {
        return validoImpegni;
    }

    /**
     * Sets the value of the validoImpegni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidoImpegni(String value) {
        this.validoImpegni = value;
    }

    /**
     * Gets the value of the validoAccertamenti property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidoAccertamenti() {
        return validoAccertamenti;
    }

    /**
     * Sets the value of the validoAccertamenti property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidoAccertamenti(String value) {
        this.validoAccertamenti = value;
    }

    /**
     * Gets the value of the validoLiquidazioni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidoLiquidazioni() {
        return validoLiquidazioni;
    }

    /**
     * Sets the value of the validoLiquidazioni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidoLiquidazioni(String value) {
        this.validoLiquidazioni = value;
    }

    /**
     * Gets the value of the validoAssegnazioni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidoAssegnazioni() {
        return validoAssegnazioni;
    }

    /**
     * Sets the value of the validoAssegnazioni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidoAssegnazioni(String value) {
        this.validoAssegnazioni = value;
    }

    /**
     * Gets the value of the responsabileProcedimento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponsabileProcedimento() {
        return responsabileProcedimento;
    }

    /**
     * Sets the value of the responsabileProcedimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponsabileProcedimento(String value) {
        this.responsabileProcedimento = value;
    }

}
