
package it.arezzo.infor.jente.jfinanziaria.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for chiaveBozzaOAtto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="chiaveBozzaOAtto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bozzaOAtto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="organoSettore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="anno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "chiaveBozzaOAtto", propOrder = {
    "bozzaOAtto",
    "organoSettore",
    "anno",
    "numero"
})
public class ChiaveBozzaOAtto {

    protected String bozzaOAtto;
    protected String organoSettore;
    protected String anno;
    protected String numero;

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

}
