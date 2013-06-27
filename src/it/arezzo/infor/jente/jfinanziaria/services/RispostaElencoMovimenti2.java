
package it.arezzo.infor.jente.jfinanziaria.services;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="liquidazione" type="{http://infor.arezzo.it/jente/jfinanziaria/services}FNLiquidazioniStampaVelocity" maxOccurs="unbounded" minOccurs="0"/>
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
    "liquidazione"
})
@XmlRootElement(name = "rispostaElencoMovimenti2")
public class RispostaElencoMovimenti2
    extends RispostaGenerica
{

    protected List<FNLiquidazioniStampaVelocity> liquidazione;

    /**
     * Gets the value of the liquidazione property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the liquidazione property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLiquidazione().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FNLiquidazioniStampaVelocity }
     * 
     * 
     */
    public List<FNLiquidazioniStampaVelocity> getLiquidazione() {
        if (liquidazione == null) {
            liquidazione = new ArrayList<FNLiquidazioniStampaVelocity>();
        }
        return this.liquidazione;
    }

}
