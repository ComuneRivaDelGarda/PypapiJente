
package it.arezzo.infor.jente.jfinanziaria.services;

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
 *         &lt;element name="bozzaOAttoModificato" type="{http://infor.arezzo.it/jente/jfinanziaria/services}bozzaOAtto" minOccurs="0"/>
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
    "bozzaOAttoModificato"
})
@XmlRootElement(name = "richiestaModificaBozzaOAtto")
public class RichiestaModificaBozzaOAtto {

    protected BozzaOAtto bozzaOAttoModificato;

    /**
     * Gets the value of the bozzaOAttoModificato property.
     * 
     * @return
     *     possible object is
     *     {@link BozzaOAtto }
     *     
     */
    public BozzaOAtto getBozzaOAttoModificato() {
        return bozzaOAttoModificato;
    }

    /**
     * Sets the value of the bozzaOAttoModificato property.
     * 
     * @param value
     *     allowed object is
     *     {@link BozzaOAtto }
     *     
     */
    public void setBozzaOAttoModificato(BozzaOAtto value) {
        this.bozzaOAttoModificato = value;
    }

}
