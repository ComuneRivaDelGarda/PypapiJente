
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
 *         &lt;element name="bozzaInAtto" type="{http://infor.arezzo.it/jente/jfinanziaria/services}bozzaInAtto" minOccurs="0"/>
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
    "bozzaInAtto"
})
@XmlRootElement(name = "richiestaTrasformazioneBozzaInAtto")
public class RichiestaTrasformazioneBozzaInAtto {

    protected BozzaInAtto bozzaInAtto;

    /**
     * Gets the value of the bozzaInAtto property.
     * 
     * @return
     *     possible object is
     *     {@link BozzaInAtto }
     *     
     */
    public BozzaInAtto getBozzaInAtto() {
        return bozzaInAtto;
    }

    /**
     * Sets the value of the bozzaInAtto property.
     * 
     * @param value
     *     allowed object is
     *     {@link BozzaInAtto }
     *     
     */
    public void setBozzaInAtto(BozzaInAtto value) {
        this.bozzaInAtto = value;
    }

}
