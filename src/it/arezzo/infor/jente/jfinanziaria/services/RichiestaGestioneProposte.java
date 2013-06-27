
package it.arezzo.infor.jente.jfinanziaria.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for richiestaGestioneProposte complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="richiestaGestioneProposte">
 *   &lt;complexContent>
 *     &lt;extension base="{http://infor.arezzo.it/jente/jfinanziaria/services}richiestaGenerica">
 *       &lt;sequence>
 *         &lt;element name="richiestaInserimentoBozzaOAtto" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="bozzaOAtto" type="{http://infor.arezzo.it/jente/jfinanziaria/services}bozzaOAtto" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="richiestaModificaBozzaOAtto" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="bozzaOAttoModificato" type="{http://infor.arezzo.it/jente/jfinanziaria/services}bozzaOAtto" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="richiestaCancellazioneBozzaOAtto" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="chiaveBozzaOAtto" type="{http://infor.arezzo.it/jente/jfinanziaria/services}chiaveBozzaOAtto" minOccurs="0"/>
 *                   &lt;element name="cancellaProvvedimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="richiestaTrasformazioneBozzaInAtto" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="bozzaInAtto" type="{http://infor.arezzo.it/jente/jfinanziaria/services}bozzaInAtto" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="richiestaElencoMovimenti" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="chiaveBozzaOAtto" type="{http://infor.arezzo.it/jente/jfinanziaria/services}chiaveBozzaOAtto" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="richiestaEsisteBozzaOAtto" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="chiaveBozzaOAtto" type="{http://infor.arezzo.it/jente/jfinanziaria/services}chiaveBozzaOAtto" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
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
@XmlType(name = "richiestaGestioneProposte", propOrder = {
    "richiestaInserimentoBozzaOAtto",
    "richiestaModificaBozzaOAtto",
    "richiestaCancellazioneBozzaOAtto",
    "richiestaTrasformazioneBozzaInAtto",
    "richiestaElencoMovimenti",
    "richiestaEsisteBozzaOAtto"
})
public class RichiestaGestioneProposte
    extends RichiestaGenerica
{

    protected RichiestaGestioneProposte.RichiestaInserimentoBozzaOAtto richiestaInserimentoBozzaOAtto;
    protected RichiestaGestioneProposte.RichiestaModificaBozzaOAtto richiestaModificaBozzaOAtto;
    protected RichiestaGestioneProposte.RichiestaCancellazioneBozzaOAtto richiestaCancellazioneBozzaOAtto;
    protected RichiestaGestioneProposte.RichiestaTrasformazioneBozzaInAtto richiestaTrasformazioneBozzaInAtto;
    protected RichiestaGestioneProposte.RichiestaElencoMovimenti richiestaElencoMovimenti;
    protected RichiestaGestioneProposte.RichiestaEsisteBozzaOAtto richiestaEsisteBozzaOAtto;

    /**
     * Gets the value of the richiestaInserimentoBozzaOAtto property.
     * 
     * @return
     *     possible object is
     *     {@link RichiestaGestioneProposte.RichiestaInserimentoBozzaOAtto }
     *     
     */
    public RichiestaGestioneProposte.RichiestaInserimentoBozzaOAtto getRichiestaInserimentoBozzaOAtto() {
        return richiestaInserimentoBozzaOAtto;
    }

    /**
     * Sets the value of the richiestaInserimentoBozzaOAtto property.
     * 
     * @param value
     *     allowed object is
     *     {@link RichiestaGestioneProposte.RichiestaInserimentoBozzaOAtto }
     *     
     */
    public void setRichiestaInserimentoBozzaOAtto(RichiestaGestioneProposte.RichiestaInserimentoBozzaOAtto value) {
        this.richiestaInserimentoBozzaOAtto = value;
    }

    /**
     * Gets the value of the richiestaModificaBozzaOAtto property.
     * 
     * @return
     *     possible object is
     *     {@link RichiestaGestioneProposte.RichiestaModificaBozzaOAtto }
     *     
     */
    public RichiestaGestioneProposte.RichiestaModificaBozzaOAtto getRichiestaModificaBozzaOAtto() {
        return richiestaModificaBozzaOAtto;
    }

    /**
     * Sets the value of the richiestaModificaBozzaOAtto property.
     * 
     * @param value
     *     allowed object is
     *     {@link RichiestaGestioneProposte.RichiestaModificaBozzaOAtto }
     *     
     */
    public void setRichiestaModificaBozzaOAtto(RichiestaGestioneProposte.RichiestaModificaBozzaOAtto value) {
        this.richiestaModificaBozzaOAtto = value;
    }

    /**
     * Gets the value of the richiestaCancellazioneBozzaOAtto property.
     * 
     * @return
     *     possible object is
     *     {@link RichiestaGestioneProposte.RichiestaCancellazioneBozzaOAtto }
     *     
     */
    public RichiestaGestioneProposte.RichiestaCancellazioneBozzaOAtto getRichiestaCancellazioneBozzaOAtto() {
        return richiestaCancellazioneBozzaOAtto;
    }

    /**
     * Sets the value of the richiestaCancellazioneBozzaOAtto property.
     * 
     * @param value
     *     allowed object is
     *     {@link RichiestaGestioneProposte.RichiestaCancellazioneBozzaOAtto }
     *     
     */
    public void setRichiestaCancellazioneBozzaOAtto(RichiestaGestioneProposte.RichiestaCancellazioneBozzaOAtto value) {
        this.richiestaCancellazioneBozzaOAtto = value;
    }

    /**
     * Gets the value of the richiestaTrasformazioneBozzaInAtto property.
     * 
     * @return
     *     possible object is
     *     {@link RichiestaGestioneProposte.RichiestaTrasformazioneBozzaInAtto }
     *     
     */
    public RichiestaGestioneProposte.RichiestaTrasformazioneBozzaInAtto getRichiestaTrasformazioneBozzaInAtto() {
        return richiestaTrasformazioneBozzaInAtto;
    }

    /**
     * Sets the value of the richiestaTrasformazioneBozzaInAtto property.
     * 
     * @param value
     *     allowed object is
     *     {@link RichiestaGestioneProposte.RichiestaTrasformazioneBozzaInAtto }
     *     
     */
    public void setRichiestaTrasformazioneBozzaInAtto(RichiestaGestioneProposte.RichiestaTrasformazioneBozzaInAtto value) {
        this.richiestaTrasformazioneBozzaInAtto = value;
    }

    /**
     * Gets the value of the richiestaElencoMovimenti property.
     * 
     * @return
     *     possible object is
     *     {@link RichiestaGestioneProposte.RichiestaElencoMovimenti }
     *     
     */
    public RichiestaGestioneProposte.RichiestaElencoMovimenti getRichiestaElencoMovimenti() {
        return richiestaElencoMovimenti;
    }

    /**
     * Sets the value of the richiestaElencoMovimenti property.
     * 
     * @param value
     *     allowed object is
     *     {@link RichiestaGestioneProposte.RichiestaElencoMovimenti }
     *     
     */
    public void setRichiestaElencoMovimenti(RichiestaGestioneProposte.RichiestaElencoMovimenti value) {
        this.richiestaElencoMovimenti = value;
    }

    /**
     * Gets the value of the richiestaEsisteBozzaOAtto property.
     * 
     * @return
     *     possible object is
     *     {@link RichiestaGestioneProposte.RichiestaEsisteBozzaOAtto }
     *     
     */
    public RichiestaGestioneProposte.RichiestaEsisteBozzaOAtto getRichiestaEsisteBozzaOAtto() {
        return richiestaEsisteBozzaOAtto;
    }

    /**
     * Sets the value of the richiestaEsisteBozzaOAtto property.
     * 
     * @param value
     *     allowed object is
     *     {@link RichiestaGestioneProposte.RichiestaEsisteBozzaOAtto }
     *     
     */
    public void setRichiestaEsisteBozzaOAtto(RichiestaGestioneProposte.RichiestaEsisteBozzaOAtto value) {
        this.richiestaEsisteBozzaOAtto = value;
    }


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
     *         &lt;element name="cancellaProvvedimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "chiaveBozzaOAtto",
        "cancellaProvvedimento"
    })
    public static class RichiestaCancellazioneBozzaOAtto {

        protected ChiaveBozzaOAtto chiaveBozzaOAtto;
        protected String cancellaProvvedimento;

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

        /**
         * Gets the value of the cancellaProvvedimento property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCancellaProvvedimento() {
            return cancellaProvvedimento;
        }

        /**
         * Sets the value of the cancellaProvvedimento property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCancellaProvvedimento(String value) {
            this.cancellaProvvedimento = value;
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
    public static class RichiestaElencoMovimenti {

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
    public static class RichiestaEsisteBozzaOAtto {

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
    public static class RichiestaInserimentoBozzaOAtto {

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
    public static class RichiestaModificaBozzaOAtto {

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
     *         &lt;element name="bozzaInAtto" type="{http://infor.arezzo.it/jente/jfinanziaria/services}bozzaInAtto" minOccurs="0"/>
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
        "bozzaInAtto"
    })
    public static class RichiestaTrasformazioneBozzaInAtto {

        protected BozzaInAtto bozzaInAtto;

        /**
         * Gets the value of the bozzaInAtto property.
         * 
         * @return
         *     possible object is
         *     {@link BozzaInAtto }
         *     
         */
        public BozzaInAtto getBozzaInAtto() {
            return bozzaInAtto;
        }

        /**
         * Sets the value of the bozzaInAtto property.
         * 
         * @param value
         *     allowed object is
         *     {@link BozzaInAtto }
         *     
         */
        public void setBozzaInAtto(BozzaInAtto value) {
            this.bozzaInAtto = value;
        }

    }

}
