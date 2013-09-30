
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
 *         &lt;element name="chiaveBozzaOAtto" type="{http://infor.arezzo.it/jente/jfinanziaria/services}chiaveBozzaOAtto" minOccurs="0"/>
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
    "chiaveBozzaOAtto"
})
@XmlRootElement(name = "richiestaElencoMovimenti")
public class RichiestaElencoMovimenti {

    protected ChiaveBozzaOAtto chiaveBozzaOAtto;

    /**
     * Gets the value of the chiaveBozzaOAtto property.
     * 
     * @return
     *     possible object is
     *     {@link ChiaveBozzaOAtto }
     *     
     */
    public ChiaveBozzaOAtto getChiaveBozzaOAtto() {
        return chiaveBozzaOAtto;
    }

    /**
     * Sets the value of the chiaveBozzaOAtto property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChiaveBozzaOAtto }
     *     
     */
    public void setChiaveBozzaOAtto(ChiaveBozzaOAtto value) {
        this.chiaveBozzaOAtto = value;
    }

}
