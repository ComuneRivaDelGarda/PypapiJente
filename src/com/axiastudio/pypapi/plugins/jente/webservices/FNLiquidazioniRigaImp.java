
package com.axiastudio.pypapi.plugins.jente.webservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FNLiquidazioniRigaImp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FNLiquidazioniRigaImp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="anno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="impFormattato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoProvImp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="organoProvImp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="annoProvImp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroProvImp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataProvImp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataEsecProvImp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="importoTotaleImpegno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="importoDisponibileImp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ImportoAssestatoImp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataEsecAttoImpegno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codiceCUP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codiceCIG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="listaSogg" type="{http://infor.arezzo.it/jente/jfinanziaria/services}FNLiquidazioniRigaSogg" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FNLiquidazioniRigaImp", propOrder = {
    "anno",
    "numero",
    "sub",
    "impFormattato",
    "descr",
    "tipoProvImp",
    "organoProvImp",
    "annoProvImp",
    "numeroProvImp",
    "dataProvImp",
    "dataEsecProvImp",
    "importoTotaleImpegno",
    "importoDisponibileImp",
    "importoAssestatoImp",
    "dataEsecAttoImpegno",
    "codiceCUP",
    "codiceCIG",
    "listaSogg"
})
public class FNLiquidazioniRigaImp {

    protected String anno;
    protected String numero;
    protected String sub;
    protected String impFormattato;
    protected String descr;
    protected String tipoProvImp;
    protected String organoProvImp;
    protected String annoProvImp;
    protected String numeroProvImp;
    protected String dataProvImp;
    protected String dataEsecProvImp;
    protected String importoTotaleImpegno;
    protected String importoDisponibileImp;
    @XmlElement(name = "ImportoAssestatoImp")
    protected String importoAssestatoImp;
    protected String dataEsecAttoImpegno;
    protected String codiceCUP;
    protected String codiceCIG;
    protected List<FNLiquidazioniRigaSogg> listaSogg;

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
     * Gets the value of the sub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSub() {
        return sub;
    }

    /**
     * Sets the value of the sub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSub(String value) {
        this.sub = value;
    }

    /**
     * Gets the value of the impFormattato property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImpFormattato() {
        return impFormattato;
    }

    /**
     * Sets the value of the impFormattato property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImpFormattato(String value) {
        this.impFormattato = value;
    }

    /**
     * Gets the value of the descr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescr() {
        return descr;
    }

    /**
     * Sets the value of the descr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescr(String value) {
        this.descr = value;
    }

    /**
     * Gets the value of the tipoProvImp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoProvImp() {
        return tipoProvImp;
    }

    /**
     * Sets the value of the tipoProvImp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoProvImp(String value) {
        this.tipoProvImp = value;
    }

    /**
     * Gets the value of the organoProvImp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganoProvImp() {
        return organoProvImp;
    }

    /**
     * Sets the value of the organoProvImp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganoProvImp(String value) {
        this.organoProvImp = value;
    }

    /**
     * Gets the value of the annoProvImp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnoProvImp() {
        return annoProvImp;
    }

    /**
     * Sets the value of the annoProvImp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnoProvImp(String value) {
        this.annoProvImp = value;
    }

    /**
     * Gets the value of the numeroProvImp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroProvImp() {
        return numeroProvImp;
    }

    /**
     * Sets the value of the numeroProvImp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroProvImp(String value) {
        this.numeroProvImp = value;
    }

    /**
     * Gets the value of the dataProvImp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataProvImp() {
        return dataProvImp;
    }

    /**
     * Sets the value of the dataProvImp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataProvImp(String value) {
        this.dataProvImp = value;
    }

    /**
     * Gets the value of the dataEsecProvImp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataEsecProvImp() {
        return dataEsecProvImp;
    }

    /**
     * Sets the value of the dataEsecProvImp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataEsecProvImp(String value) {
        this.dataEsecProvImp = value;
    }

    /**
     * Gets the value of the importoTotaleImpegno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImportoTotaleImpegno() {
        return importoTotaleImpegno;
    }

    /**
     * Sets the value of the importoTotaleImpegno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImportoTotaleImpegno(String value) {
        this.importoTotaleImpegno = value;
    }

    /**
     * Gets the value of the importoDisponibileImp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImportoDisponibileImp() {
        return importoDisponibileImp;
    }

    /**
     * Sets the value of the importoDisponibileImp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImportoDisponibileImp(String value) {
        this.importoDisponibileImp = value;
    }

    /**
     * Gets the value of the importoAssestatoImp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImportoAssestatoImp() {
        return importoAssestatoImp;
    }

    /**
     * Sets the value of the importoAssestatoImp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImportoAssestatoImp(String value) {
        this.importoAssestatoImp = value;
    }

    /**
     * Gets the value of the dataEsecAttoImpegno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataEsecAttoImpegno() {
        return dataEsecAttoImpegno;
    }

    /**
     * Sets the value of the dataEsecAttoImpegno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataEsecAttoImpegno(String value) {
        this.dataEsecAttoImpegno = value;
    }

    /**
     * Gets the value of the codiceCUP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceCUP() {
        return codiceCUP;
    }

    /**
     * Sets the value of the codiceCUP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceCUP(String value) {
        this.codiceCUP = value;
    }

    /**
     * Gets the value of the codiceCIG property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceCIG() {
        return codiceCIG;
    }

    /**
     * Sets the value of the codiceCIG property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceCIG(String value) {
        this.codiceCIG = value;
    }

    /**
     * Gets the value of the listaSogg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaSogg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaSogg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FNLiquidazioniRigaSogg }
     * 
     * 
     */
    public List<FNLiquidazioniRigaSogg> getListaSogg() {
        if (listaSogg == null) {
            listaSogg = new ArrayList<FNLiquidazioniRigaSogg>();
        }
        return this.listaSogg;
    }

}
