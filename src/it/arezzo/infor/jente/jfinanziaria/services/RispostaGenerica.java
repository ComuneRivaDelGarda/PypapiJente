
package it.arezzo.infor.jente.jfinanziaria.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rispostaGenerica complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rispostaGenerica">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ok" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rispostaGenerica", propOrder = {
    "tipo",
    "ok",
    "code",
    "message"
})
@XmlSeeAlso({
    RispostaGestioneProposte.RispostaInserimentoBozzaOAtto.class,
    RispostaGestioneProposte.RispostaModificaBozzaOAtto.class,
    RispostaGestioneProposte.RispostaCancellazioneBozzaOAtto.class,
    RispostaGestioneProposte.RispostaTrasformazioneBozzaInAtto.class,
    RispostaGestioneProposte.RispostaElencoMovimenti.class,
    RispostaGestioneProposte.RispostaEsisteBozzaOAtto.class,
    RispostaGestioneProposte.RispostaElencoMovimenti2 .class,
    RispostaGestioneProposte.class,
    it.arezzo.infor.jente.jfinanziaria.services.RispostaElencoMovimenti2 .class,
    it.arezzo.infor.jente.jfinanziaria.services.RispostaTrasformazioneBozzaInAtto.class,
    it.arezzo.infor.jente.jfinanziaria.services.RispostaElencoMovimenti.class,
    it.arezzo.infor.jente.jfinanziaria.services.RispostaModificaBozzaOAtto.class,
    it.arezzo.infor.jente.jfinanziaria.services.RispostaEsisteBozzaOAtto.class,
    it.arezzo.infor.jente.jfinanziaria.services.RispostaCancellazioneBozzaOAtto.class,
    it.arezzo.infor.jente.jfinanziaria.services.RispostaInserimentoBozzaOAtto.class
})
public class RispostaGenerica {

    protected String tipo;
    protected Boolean ok;
    protected String code;
    protected String message;

    /**
     * Gets the value of the tipo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Sets the value of the tipo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipo(String value) {
        this.tipo = value;
    }

    /**
     * Gets the value of the ok property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOk() {
        return ok;
    }

    /**
     * Sets the value of the ok property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOk(Boolean value) {
        this.ok = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

}
