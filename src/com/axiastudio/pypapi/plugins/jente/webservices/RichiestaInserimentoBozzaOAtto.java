
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
 *         &lt;element name="bozzaOAtto" type="{http://infor.arezzo.it/jente/jfinanziaria/services}bozzaOAtto" minOccurs="0"/>
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
    "bozzaOAtto"
})
@XmlRootElement(name = "richiestaInserimentoBozzaOAtto")
public class RichiestaInserimentoBozzaOAtto {

    protected BozzaOAtto bozzaOAtto;

    /**
     * Gets the value of the bozzaOAtto property.
     * 
     * @return
     *     possible object is
     *     {@link BozzaOAtto }
     *     
     */
    public BozzaOAtto getBozzaOAtto() {
        return bozzaOAtto;
    }

    /**
     * Sets the value of the bozzaOAtto property.
     * 
     * @param value
     *     allowed object is
     *     {@link BozzaOAtto }
     *     
     */
    public void setBozzaOAtto(BozzaOAtto value) {
        this.bozzaOAtto = value;
    }

}
