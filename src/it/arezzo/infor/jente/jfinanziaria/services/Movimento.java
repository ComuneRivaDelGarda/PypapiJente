
package it.arezzo.infor.jente.jfinanziaria.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for movimento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="movimento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="movImpAcce" type="{http://infor.arezzo.it/jente/jfinanziaria/services}impAcce" minOccurs="0"/>
 *         &lt;element name="liquidazione" type="{http://infor.arezzo.it/jente/jfinanziaria/services}liquidazione" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "movimento", propOrder = {
    "movImpAcce",
    "liquidazione"
})
public class Movimento {

    protected ImpAcce movImpAcce;
    protected Liquidazione liquidazione;

    /**
     * Gets the value of the movImpAcce property.
     * 
     * @return
     *     possible object is
     *     {@link ImpAcce }
     *     
     */
    public ImpAcce getMovImpAcce() {
        return movImpAcce;
    }

    /**
     * Sets the value of the movImpAcce property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImpAcce }
     *     
     */
    public void setMovImpAcce(ImpAcce value) {
        this.movImpAcce = value;
    }

    /**
     * Gets the value of the liquidazione property.
     * 
     * @return
     *     possible object is
     *     {@link Liquidazione }
     *     
     */
    public Liquidazione getLiquidazione() {
        return liquidazione;
    }

    /**
     * Sets the value of the liquidazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link Liquidazione }
     *     
     */
    public void setLiquidazione(Liquidazione value) {
        this.liquidazione = value;
    }

}
