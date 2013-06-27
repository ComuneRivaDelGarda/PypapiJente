
package it.arezzo.infor.jente.jfinanziaria.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gestioneProposteResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gestioneProposteResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://infor.arezzo.it/jente/jfinanziaria/services}rispostaGestioneProposte" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gestioneProposteResponse", propOrder = {
    "_return"
})
public class GestioneProposteResponse {

    @XmlElement(name = "return")
    protected RispostaGestioneProposte _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link RispostaGestioneProposte }
     *     
     */
    public RispostaGestioneProposte getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link RispostaGestioneProposte }
     *     
     */
    public void setReturn(RispostaGestioneProposte value) {
        this._return = value;
    }

}
