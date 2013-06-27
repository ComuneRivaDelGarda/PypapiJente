
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
 *         &lt;element name="movimento" type="{http://infor.arezzo.it/jente/jfinanziaria/services}movimento" maxOccurs="unbounded" minOccurs="0"/>
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
    "movimento"
})
@XmlRootElement(name = "rispostaElencoMovimenti")
public class RispostaElencoMovimenti
    extends RispostaGenerica
{

    protected List<Movimento> movimento;

    /**
     * Gets the value of the movimento property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the movimento property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMovimento().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Movimento }
     * 
     * 
     */
    public List<Movimento> getMovimento() {
        if (movimento == null) {
            movimento = new ArrayList<Movimento>();
        }
        return this.movimento;
    }

}
