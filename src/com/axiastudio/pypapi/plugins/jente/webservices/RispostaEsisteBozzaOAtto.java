
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
 *     &lt;extension base="{http://infor.arezzo.it/jente/jfinanziaria/services}rispostaGenerica">
 *       &lt;sequence>
 *         &lt;element name="esiste" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "esiste"
})
@XmlRootElement(name = "rispostaEsisteBozzaOAtto")
public class RispostaEsisteBozzaOAtto
    extends RispostaGenerica
{

    protected Boolean esiste;

    /**
     * Gets the value of the esiste property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEsiste() {
        return esiste;
    }

    /**
     * Sets the value of the esiste property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEsiste(Boolean value) {
        this.esiste = value;
    }

}
