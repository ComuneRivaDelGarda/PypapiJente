
package com.axiastudio.pypapi.plugins.jente.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="attoInBozza" type="{http://infor.arezzo.it/jente/jfinanziaria/services}attoInBozza" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "attoInBozza"
})
@XmlRootElement(name = "richiestaTrasformazioneAttoInBozza")
public class RichiestaTrasformazioneAttoInBozza {

    protected AttoInBozza attoInBozza;

    /**
     * Gets the value of the attoInBozza property.
     * 
     * @return
     *     possible object is
     *     {@link AttoInBozza }
     *     
     */
    public AttoInBozza getAttoInBozza() {
        return attoInBozza;
    }

    /**
     * Sets the value of the attoInBozza property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttoInBozza }
     *     
     */
    public void setAttoInBozza(AttoInBozza value) {
        this.attoInBozza = value;
    }

}
