
package com.axiastudio.pypapi.plugins.jente.webservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FNLiquidazioniRigaSogg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FNLiquidazioniRigaSogg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="soggetto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codiceFisc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pIva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modoPaga" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="importoTotSogg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="notePagamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="listaDocumenti" type="{http://infor.arezzo.it/jente/jfinanziaria/services}FNLiquidazioniRigaDoc" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FNLiquidazioniRigaSogg", propOrder = {
    "soggetto",
    "descr",
    "codiceFisc",
    "pIva",
    "modoPaga",
    "importoTotSogg",
    "notePagamento",
    "listaDocumenti"
})
public class FNLiquidazioniRigaSogg {

    protected String soggetto;
    protected String descr;
    protected String codiceFisc;
    protected String pIva;
    protected String modoPaga;
    protected String importoTotSogg;
    protected String notePagamento;
    protected List<FNLiquidazioniRigaDoc> listaDocumenti;

    /**
     * Gets the value of the soggetto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoggetto() {
        return soggetto;
    }

    /**
     * Sets the value of the soggetto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoggetto(String value) {
        this.soggetto = value;
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
     * Gets the value of the codiceFisc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceFisc() {
        return codiceFisc;
    }

    /**
     * Sets the value of the codiceFisc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceFisc(String value) {
        this.codiceFisc = value;
    }

    /**
     * Gets the value of the pIva property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPIva() {
        return pIva;
    }

    /**
     * Sets the value of the pIva property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPIva(String value) {
        this.pIva = value;
    }

    /**
     * Gets the value of the modoPaga property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModoPaga() {
        return modoPaga;
    }

    /**
     * Sets the value of the modoPaga property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModoPaga(String value) {
        this.modoPaga = value;
    }

    /**
     * Gets the value of the importoTotSogg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImportoTotSogg() {
        return importoTotSogg;
    }

    /**
     * Sets the value of the importoTotSogg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImportoTotSogg(String value) {
        this.importoTotSogg = value;
    }

    /**
     * Gets the value of the notePagamento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotePagamento() {
        return notePagamento;
    }

    /**
     * Sets the value of the notePagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotePagamento(String value) {
        this.notePagamento = value;
    }

    /**
     * Gets the value of the listaDocumenti property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaDocumenti property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaDocumenti().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FNLiquidazioniRigaDoc }
     * 
     * 
     */
    public List<FNLiquidazioniRigaDoc> getListaDocumenti() {
        if (listaDocumenti == null) {
            listaDocumenti = new ArrayList<FNLiquidazioniRigaDoc>();
        }
        return this.listaDocumenti;
    }

}
