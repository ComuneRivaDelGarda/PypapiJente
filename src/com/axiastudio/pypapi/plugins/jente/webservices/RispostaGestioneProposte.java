
package com.axiastudio.pypapi.plugins.jente.webservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rispostaGestioneProposte complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rispostaGestioneProposte">
 *   &lt;complexContent>
 *     &lt;extension base="{http://infor.arezzo.it/jente/jfinanziaria/services}rispostaGenerica">
 *       &lt;sequence>
 *         &lt;element name="rispostaInserimentoBozzaOAtto" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://infor.arezzo.it/jente/jfinanziaria/services}rispostaGenerica">
 *                 &lt;sequence>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="rispostaModificaBozzaOAtto" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://infor.arezzo.it/jente/jfinanziaria/services}rispostaGenerica">
 *                 &lt;sequence>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="rispostaCancellazioneBozzaOAtto" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://infor.arezzo.it/jente/jfinanziaria/services}rispostaGenerica">
 *                 &lt;sequence>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="rispostaTrasformazioneBozzaInAtto" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://infor.arezzo.it/jente/jfinanziaria/services}rispostaGenerica">
 *                 &lt;sequence>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="rispostaTrasformazioneAttoInBozza" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://infor.arezzo.it/jente/jfinanziaria/services}rispostaGenerica">
 *                 &lt;sequence>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="rispostaElencoMovimenti" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://infor.arezzo.it/jente/jfinanziaria/services}rispostaGenerica">
 *                 &lt;sequence>
 *                   &lt;element name="movimento" type="{http://infor.arezzo.it/jente/jfinanziaria/services}movimento" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="rispostaEsisteBozzaOAtto" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://infor.arezzo.it/jente/jfinanziaria/services}rispostaGenerica">
 *                 &lt;sequence>
 *                   &lt;element name="esiste" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="rispostaElencoLiquidazioni" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://infor.arezzo.it/jente/jfinanziaria/services}rispostaGenerica">
 *                 &lt;sequence>
 *                   &lt;element name="liquidazione" type="{http://infor.arezzo.it/jente/jfinanziaria/services}FNLiquidazioniStampaVelocity" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rispostaGestioneProposte", propOrder = {
    "rispostaInserimentoBozzaOAtto",
    "rispostaModificaBozzaOAtto",
    "rispostaCancellazioneBozzaOAtto",
    "rispostaTrasformazioneBozzaInAtto",
    "rispostaTrasformazioneAttoInBozza",
    "rispostaElencoMovimenti",
    "rispostaEsisteBozzaOAtto",
    "rispostaElencoLiquidazioni"
})
public class RispostaGestioneProposte
    extends RispostaGenerica
{

    protected RispostaGestioneProposte.RispostaInserimentoBozzaOAtto rispostaInserimentoBozzaOAtto;
    protected RispostaGestioneProposte.RispostaModificaBozzaOAtto rispostaModificaBozzaOAtto;
    protected RispostaGestioneProposte.RispostaCancellazioneBozzaOAtto rispostaCancellazioneBozzaOAtto;
    protected RispostaGestioneProposte.RispostaTrasformazioneBozzaInAtto rispostaTrasformazioneBozzaInAtto;
    protected RispostaGestioneProposte.RispostaTrasformazioneAttoInBozza rispostaTrasformazioneAttoInBozza;
    protected RispostaGestioneProposte.RispostaElencoMovimenti rispostaElencoMovimenti;
    protected RispostaGestioneProposte.RispostaEsisteBozzaOAtto rispostaEsisteBozzaOAtto;
    protected RispostaGestioneProposte.RispostaElencoLiquidazioni rispostaElencoLiquidazioni;

    /**
     * Gets the value of the rispostaInserimentoBozzaOAtto property.
     * 
     * @return
     *     possible object is
     *     {@link RispostaGestioneProposte.RispostaInserimentoBozzaOAtto }
     *     
     */
    public RispostaGestioneProposte.RispostaInserimentoBozzaOAtto getRispostaInserimentoBozzaOAtto() {
        return rispostaInserimentoBozzaOAtto;
    }

    /**
     * Sets the value of the rispostaInserimentoBozzaOAtto property.
     * 
     * @param value
     *     allowed object is
     *     {@link RispostaGestioneProposte.RispostaInserimentoBozzaOAtto }
     *     
     */
    public void setRispostaInserimentoBozzaOAtto(RispostaGestioneProposte.RispostaInserimentoBozzaOAtto value) {
        this.rispostaInserimentoBozzaOAtto = value;
    }

    /**
     * Gets the value of the rispostaModificaBozzaOAtto property.
     * 
     * @return
     *     possible object is
     *     {@link RispostaGestioneProposte.RispostaModificaBozzaOAtto }
     *     
     */
    public RispostaGestioneProposte.RispostaModificaBozzaOAtto getRispostaModificaBozzaOAtto() {
        return rispostaModificaBozzaOAtto;
    }

    /**
     * Sets the value of the rispostaModificaBozzaOAtto property.
     * 
     * @param value
     *     allowed object is
     *     {@link RispostaGestioneProposte.RispostaModificaBozzaOAtto }
     *     
     */
    public void setRispostaModificaBozzaOAtto(RispostaGestioneProposte.RispostaModificaBozzaOAtto value) {
        this.rispostaModificaBozzaOAtto = value;
    }

    /**
     * Gets the value of the rispostaCancellazioneBozzaOAtto property.
     * 
     * @return
     *     possible object is
     *     {@link RispostaGestioneProposte.RispostaCancellazioneBozzaOAtto }
     *     
     */
    public RispostaGestioneProposte.RispostaCancellazioneBozzaOAtto getRispostaCancellazioneBozzaOAtto() {
        return rispostaCancellazioneBozzaOAtto;
    }

    /**
     * Sets the value of the rispostaCancellazioneBozzaOAtto property.
     * 
     * @param value
     *     allowed object is
     *     {@link RispostaGestioneProposte.RispostaCancellazioneBozzaOAtto }
     *     
     */
    public void setRispostaCancellazioneBozzaOAtto(RispostaGestioneProposte.RispostaCancellazioneBozzaOAtto value) {
        this.rispostaCancellazioneBozzaOAtto = value;
    }

    /**
     * Gets the value of the rispostaTrasformazioneBozzaInAtto property.
     * 
     * @return
     *     possible object is
     *     {@link RispostaGestioneProposte.RispostaTrasformazioneBozzaInAtto }
     *     
     */
    public RispostaGestioneProposte.RispostaTrasformazioneBozzaInAtto getRispostaTrasformazioneBozzaInAtto() {
        return rispostaTrasformazioneBozzaInAtto;
    }

    /**
     * Sets the value of the rispostaTrasformazioneBozzaInAtto property.
     * 
     * @param value
     *     allowed object is
     *     {@link RispostaGestioneProposte.RispostaTrasformazioneBozzaInAtto }
     *     
     */
    public void setRispostaTrasformazioneBozzaInAtto(RispostaGestioneProposte.RispostaTrasformazioneBozzaInAtto value) {
        this.rispostaTrasformazioneBozzaInAtto = value;
    }

    /**
     * Gets the value of the rispostaTrasformazioneAttoInBozza property.
     * 
     * @return
     *     possible object is
     *     {@link RispostaGestioneProposte.RispostaTrasformazioneAttoInBozza }
     *     
     */
    public RispostaGestioneProposte.RispostaTrasformazioneAttoInBozza getRispostaTrasformazioneAttoInBozza() {
        return rispostaTrasformazioneAttoInBozza;
    }

    /**
     * Sets the value of the rispostaTrasformazioneAttoInBozza property.
     * 
     * @param value
     *     allowed object is
     *     {@link RispostaGestioneProposte.RispostaTrasformazioneAttoInBozza }
     *     
     */
    public void setRispostaTrasformazioneAttoInBozza(RispostaGestioneProposte.RispostaTrasformazioneAttoInBozza value) {
        this.rispostaTrasformazioneAttoInBozza = value;
    }

    /**
     * Gets the value of the rispostaElencoMovimenti property.
     * 
     * @return
     *     possible object is
     *     {@link RispostaGestioneProposte.RispostaElencoMovimenti }
     *     
     */
    public RispostaGestioneProposte.RispostaElencoMovimenti getRispostaElencoMovimenti() {
        return rispostaElencoMovimenti;
    }

    /**
     * Sets the value of the rispostaElencoMovimenti property.
     * 
     * @param value
     *     allowed object is
     *     {@link RispostaGestioneProposte.RispostaElencoMovimenti }
     *     
     */
    public void setRispostaElencoMovimenti(RispostaGestioneProposte.RispostaElencoMovimenti value) {
        this.rispostaElencoMovimenti = value;
    }

    /**
     * Gets the value of the rispostaEsisteBozzaOAtto property.
     * 
     * @return
     *     possible object is
     *     {@link RispostaGestioneProposte.RispostaEsisteBozzaOAtto }
     *     
     */
    public RispostaGestioneProposte.RispostaEsisteBozzaOAtto getRispostaEsisteBozzaOAtto() {
        return rispostaEsisteBozzaOAtto;
    }

    /**
     * Sets the value of the rispostaEsisteBozzaOAtto property.
     * 
     * @param value
     *     allowed object is
     *     {@link RispostaGestioneProposte.RispostaEsisteBozzaOAtto }
     *     
     */
    public void setRispostaEsisteBozzaOAtto(RispostaGestioneProposte.RispostaEsisteBozzaOAtto value) {
        this.rispostaEsisteBozzaOAtto = value;
    }

    /**
     * Gets the value of the rispostaElencoLiquidazioni property.
     * 
     * @return
     *     possible object is
     *     {@link RispostaGestioneProposte.RispostaElencoLiquidazioni }
     *     
     */
    public RispostaGestioneProposte.RispostaElencoLiquidazioni getRispostaElencoLiquidazioni() {
        return rispostaElencoLiquidazioni;
    }

    /**
     * Sets the value of the rispostaElencoLiquidazioni property.
     * 
     * @param value
     *     allowed object is
     *     {@link RispostaGestioneProposte.RispostaElencoLiquidazioni }
     *     
     */
    public void setRispostaElencoLiquidazioni(RispostaGestioneProposte.RispostaElencoLiquidazioni value) {
        this.rispostaElencoLiquidazioni = value;
    }


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
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RispostaCancellazioneBozzaOAtto
        extends RispostaGenerica
    {


    }


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
    public static class RispostaElencoLiquidazioni
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
    public static class RispostaElencoMovimenti
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
    public static class RispostaEsisteBozzaOAtto
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
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RispostaInserimentoBozzaOAtto
        extends RispostaGenerica
    {


    }


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
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RispostaModificaBozzaOAtto
        extends RispostaGenerica
    {


    }


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
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RispostaTrasformazioneAttoInBozza
        extends RispostaGenerica
    {


    }


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
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RispostaTrasformazioneBozzaInAtto
        extends RispostaGenerica
    {


    }

}
