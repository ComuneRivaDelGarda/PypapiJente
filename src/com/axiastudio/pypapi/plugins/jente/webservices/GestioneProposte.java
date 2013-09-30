
package com.axiastudio.pypapi.plugins.jente.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gestioneProposte complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gestioneProposte">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="richiesta" type="{http://infor.arezzo.it/jente/jfinanziaria/services}richiestaGestioneProposte" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gestioneProposte", propOrder = {
    "richiesta"
})
public class GestioneProposte {

    protected RichiestaGestioneProposte richiesta;

    /**
     * Gets the value of the richiesta property.
     * 
     * @return
     *     possible object is
     *     {@link RichiestaGestioneProposte }
     *     
     */
    public RichiestaGestioneProposte getRichiesta() {
        return richiesta;
    }

    /**
     * Sets the value of the richiesta property.
     * 
     * @param value
     *     allowed object is
     *     {@link RichiestaGestioneProposte }
     *     
     */
    public void setRichiesta(RichiestaGestioneProposte value) {
        this.richiesta = value;
    }

}
