
package com.axiastudio.pypapi.plugins.jente.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for attoInBozza complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="attoInBozza">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="organoSettoreAtto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="annoAtto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroAtto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "attoInBozza", propOrder = {
    "organoSettoreAtto",
    "annoAtto",
    "numeroAtto"
})
public class AttoInBozza {

    protected String organoSettoreAtto;
    protected String annoAtto;
    protected String numeroAtto;

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

}
