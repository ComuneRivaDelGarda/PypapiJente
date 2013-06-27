
package it.arezzo.infor.jente.jfinanziaria.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FNLiquidazioniRigaCapit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FNLiquidazioniRigaCapit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="capitolo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="articolo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="meccanografico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="importoTotaleCapitolo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assestatoCapit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="listaImpegni" type="{http://infor.arezzo.it/jente/jfinanziaria/services}FNLiquidazioniRigaImp" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FNLiquidazioniRigaCapit", propOrder = {
    "capitolo",
    "articolo",
    "descr",
    "meccanografico",
    "importoTotaleCapitolo",
    "assestatoCapit",
    "listaImpegni"
})
public class FNLiquidazioniRigaCapit {

    protected String capitolo;
    protected String articolo;
    protected String descr;
    protected String meccanografico;
    protected String importoTotaleCapitolo;
    protected String assestatoCapit;
    protected List<FNLiquidazioniRigaImp> listaImpegni;

    /**
     * Gets the value of the capitolo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapitolo() {
        return capitolo;
    }

    /**
     * Sets the value of the capitolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapitolo(String value) {
        this.capitolo = value;
    }

    /**
     * Gets the value of the articolo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArticolo() {
        return articolo;
    }

    /**
     * Sets the value of the articolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArticolo(String value) {
        this.articolo = value;
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
     * Gets the value of the meccanografico property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeccanografico() {
        return meccanografico;
    }

    /**
     * Sets the value of the meccanografico property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeccanografico(String value) {
        this.meccanografico = value;
    }

    /**
     * Gets the value of the importoTotaleCapitolo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImportoTotaleCapitolo() {
        return importoTotaleCapitolo;
    }

    /**
     * Sets the value of the importoTotaleCapitolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImportoTotaleCapitolo(String value) {
        this.importoTotaleCapitolo = value;
    }

    /**
     * Gets the value of the assestatoCapit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssestatoCapit() {
        return assestatoCapit;
    }

    /**
     * Sets the value of the assestatoCapit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssestatoCapit(String value) {
        this.assestatoCapit = value;
    }

    /**
     * Gets the value of the listaImpegni property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaImpegni property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaImpegni().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FNLiquidazioniRigaImp }
     * 
     * 
     */
    public List<FNLiquidazioniRigaImp> getListaImpegni() {
        if (listaImpegni == null) {
            listaImpegni = new ArrayList<FNLiquidazioniRigaImp>();
        }
        return this.listaImpegni;
    }

}
