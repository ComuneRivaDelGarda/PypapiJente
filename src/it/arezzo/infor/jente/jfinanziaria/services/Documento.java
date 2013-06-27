
package it.arezzo.infor.jente.jfinanziaria.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for documento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="documento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="soggettoCod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="soggettoNome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="anno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oggetto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="importo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="impegno" type="{http://infor.arezzo.it/jente/jfinanziaria/services}impegnoDoc" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "documento", propOrder = {
    "soggettoCod",
    "soggettoNome",
    "anno",
    "numero",
    "tipo",
    "data",
    "oggetto",
    "importo",
    "impegno"
})
public class Documento {

    protected String soggettoCod;
    protected String soggettoNome;
    protected String anno;
    protected String numero;
    protected String tipo;
    protected String data;
    protected String oggetto;
    protected String importo;
    protected ImpegnoDoc impegno;

    /**
     * Gets the value of the soggettoCod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoggettoCod() {
        return soggettoCod;
    }

    /**
     * Sets the value of the soggettoCod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoggettoCod(String value) {
        this.soggettoCod = value;
    }

    /**
     * Gets the value of the soggettoNome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoggettoNome() {
        return soggettoNome;
    }

    /**
     * Sets the value of the soggettoNome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoggettoNome(String value) {
        this.soggettoNome = value;
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
     * Gets the value of the tipo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Sets the value of the tipo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipo(String value) {
        this.tipo = value;
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
     * Gets the value of the impegno property.
     * 
     * @return
     *     possible object is
     *     {@link ImpegnoDoc }
     *     
     */
    public ImpegnoDoc getImpegno() {
        return impegno;
    }

    /**
     * Sets the value of the impegno property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImpegnoDoc }
     *     
     */
    public void setImpegno(ImpegnoDoc value) {
        this.impegno = value;
    }

}
