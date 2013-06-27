
package it.arezzo.infor.jente.jfinanziaria.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bozzaOAtto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bozzaOAtto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bozzaOAtto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="organoSettore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="anno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "bozzaOAtto", propOrder = {
    "bozzaOAtto",
    "organoSettore",
    "anno",
    "numero",
    "data",
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
public class BozzaOAtto {

    protected String bozzaOAtto;
    protected String organoSettore;
    protected String anno;
    protected String numero;
    protected String data;
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
     * Gets the value of the bozzaOAtto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBozzaOAtto() {
        return bozzaOAtto;
    }

    /**
     * Sets the value of the bozzaOAtto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBozzaOAtto(String value) {
        this.bozzaOAtto = value;
    }

    /**
     * Gets the value of the organoSettore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganoSettore() {
        return organoSettore;
    }

    /**
     * Sets the value of the organoSettore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganoSettore(String value) {
        this.organoSettore = value;
    }

    /**
     * Gets the value of the anno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnno() {
        return anno;
    }

    /**
     * Sets the value of the anno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnno(String value) {
        this.anno = value;
    }

    /**
     * Gets the value of the numero property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Sets the value of the numero property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumero(String value) {
        this.numero = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setData(String value) {
        this.data = value;
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
