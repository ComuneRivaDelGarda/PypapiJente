
package com.axiastudio.pypapi.plugins.jente.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for impAcce complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="impAcce">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="archivio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoMovimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="esercizio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="capitolo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="articolo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descCapitolo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="annoImpacc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroImpacc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subImpacc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descImpacc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="importoImpacc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oggetto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="respProc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descRespProc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipologiaMovimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="importo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codiceObiettivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descObiettivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="causaleObiettivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descCausaleObiettivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="voceEconomica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descVoceEconomica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="centroCosto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descCentroCosto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codDebBen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descCodDebBen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="naturaCoge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descNaturaCoge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codiceCup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codiceCig" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cespite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descCespite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codFondo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descFondo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codTipoFinanz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descTipoFinanz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="siope" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descSiope" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mutuo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descMutuo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="perfezionamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descPerfezionamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vincolo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descVincolo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="programma" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descProgramma" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="progetto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descProgetto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codMeccanografico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codLibroIva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descLibroIva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "impAcce", propOrder = {
    "archivio",
    "tipoMovimento",
    "esercizio",
    "eu",
    "capitolo",
    "articolo",
    "descCapitolo",
    "annoImpacc",
    "numeroImpacc",
    "subImpacc",
    "descImpacc",
    "importoImpacc",
    "oggetto",
    "respProc",
    "descRespProc",
    "tipologiaMovimento",
    "importo",
    "codiceObiettivo",
    "descObiettivo",
    "causaleObiettivo",
    "descCausaleObiettivo",
    "voceEconomica",
    "descVoceEconomica",
    "centroCosto",
    "descCentroCosto",
    "codDebBen",
    "descCodDebBen",
    "naturaCoge",
    "descNaturaCoge",
    "codiceCup",
    "codiceCig",
    "cespite",
    "descCespite",
    "codFondo",
    "descFondo",
    "codTipoFinanz",
    "descTipoFinanz",
    "siope",
    "descSiope",
    "mutuo",
    "descMutuo",
    "perfezionamento",
    "descPerfezionamento",
    "vincolo",
    "descVincolo",
    "programma",
    "descProgramma",
    "progetto",
    "descProgetto",
    "codMeccanografico",
    "codLibroIva",
    "descLibroIva"
})
public class ImpAcce {

    protected String archivio;
    protected String tipoMovimento;
    protected String esercizio;
    protected String eu;
    protected String capitolo;
    protected String articolo;
    protected String descCapitolo;
    protected String annoImpacc;
    protected String numeroImpacc;
    protected String subImpacc;
    protected String descImpacc;
    protected String importoImpacc;
    protected String oggetto;
    protected String respProc;
    protected String descRespProc;
    protected String tipologiaMovimento;
    protected String importo;
    protected String codiceObiettivo;
    protected String descObiettivo;
    protected String causaleObiettivo;
    protected String descCausaleObiettivo;
    protected String voceEconomica;
    protected String descVoceEconomica;
    protected String centroCosto;
    protected String descCentroCosto;
    protected String codDebBen;
    protected String descCodDebBen;
    protected String naturaCoge;
    protected String descNaturaCoge;
    protected String codiceCup;
    protected String codiceCig;
    protected String cespite;
    protected String descCespite;
    protected String codFondo;
    protected String descFondo;
    protected String codTipoFinanz;
    protected String descTipoFinanz;
    protected String siope;
    protected String descSiope;
    protected String mutuo;
    protected String descMutuo;
    protected String perfezionamento;
    protected String descPerfezionamento;
    protected String vincolo;
    protected String descVincolo;
    protected String programma;
    protected String descProgramma;
    protected String progetto;
    protected String descProgetto;
    protected String codMeccanografico;
    protected String codLibroIva;
    protected String descLibroIva;

    /**
     * Gets the value of the archivio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArchivio() {
        return archivio;
    }

    /**
     * Sets the value of the archivio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArchivio(String value) {
        this.archivio = value;
    }

    /**
     * Gets the value of the tipoMovimento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoMovimento() {
        return tipoMovimento;
    }

    /**
     * Sets the value of the tipoMovimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoMovimento(String value) {
        this.tipoMovimento = value;
    }

    /**
     * Gets the value of the esercizio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEsercizio() {
        return esercizio;
    }

    /**
     * Sets the value of the esercizio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEsercizio(String value) {
        this.esercizio = value;
    }

    /**
     * Gets the value of the eu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEu() {
        return eu;
    }

    /**
     * Sets the value of the eu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEu(String value) {
        this.eu = value;
    }

    /**
     * Gets the value of the capitolo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapitolo() {
        return capitolo;
    }

    /**
     * Sets the value of the capitolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapitolo(String value) {
        this.capitolo = value;
    }

    /**
     * Gets the value of the articolo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArticolo() {
        return articolo;
    }

    /**
     * Sets the value of the articolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArticolo(String value) {
        this.articolo = value;
    }

    /**
     * Gets the value of the descCapitolo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescCapitolo() {
        return descCapitolo;
    }

    /**
     * Sets the value of the descCapitolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescCapitolo(String value) {
        this.descCapitolo = value;
    }

    /**
     * Gets the value of the annoImpacc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnoImpacc() {
        return annoImpacc;
    }

    /**
     * Sets the value of the annoImpacc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnoImpacc(String value) {
        this.annoImpacc = value;
    }

    /**
     * Gets the value of the numeroImpacc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroImpacc() {
        return numeroImpacc;
    }

    /**
     * Sets the value of the numeroImpacc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroImpacc(String value) {
        this.numeroImpacc = value;
    }

    /**
     * Gets the value of the subImpacc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubImpacc() {
        return subImpacc;
    }

    /**
     * Sets the value of the subImpacc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubImpacc(String value) {
        this.subImpacc = value;
    }

    /**
     * Gets the value of the descImpacc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescImpacc() {
        return descImpacc;
    }

    /**
     * Sets the value of the descImpacc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescImpacc(String value) {
        this.descImpacc = value;
    }

    /**
     * Gets the value of the importoImpacc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImportoImpacc() {
        return importoImpacc;
    }

    /**
     * Sets the value of the importoImpacc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImportoImpacc(String value) {
        this.importoImpacc = value;
    }

    /**
     * Gets the value of the oggetto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOggetto() {
        return oggetto;
    }

    /**
     * Sets the value of the oggetto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOggetto(String value) {
        this.oggetto = value;
    }

    /**
     * Gets the value of the respProc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRespProc() {
        return respProc;
    }

    /**
     * Sets the value of the respProc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRespProc(String value) {
        this.respProc = value;
    }

    /**
     * Gets the value of the descRespProc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescRespProc() {
        return descRespProc;
    }

    /**
     * Sets the value of the descRespProc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescRespProc(String value) {
        this.descRespProc = value;
    }

    /**
     * Gets the value of the tipologiaMovimento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipologiaMovimento() {
        return tipologiaMovimento;
    }

    /**
     * Sets the value of the tipologiaMovimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipologiaMovimento(String value) {
        this.tipologiaMovimento = value;
    }

    /**
     * Gets the value of the importo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImporto() {
        return importo;
    }

    /**
     * Sets the value of the importo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImporto(String value) {
        this.importo = value;
    }

    /**
     * Gets the value of the codiceObiettivo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceObiettivo() {
        return codiceObiettivo;
    }

    /**
     * Sets the value of the codiceObiettivo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceObiettivo(String value) {
        this.codiceObiettivo = value;
    }

    /**
     * Gets the value of the descObiettivo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescObiettivo() {
        return descObiettivo;
    }

    /**
     * Sets the value of the descObiettivo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescObiettivo(String value) {
        this.descObiettivo = value;
    }

    /**
     * Gets the value of the causaleObiettivo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCausaleObiettivo() {
        return causaleObiettivo;
    }

    /**
     * Sets the value of the causaleObiettivo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCausaleObiettivo(String value) {
        this.causaleObiettivo = value;
    }

    /**
     * Gets the value of the descCausaleObiettivo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescCausaleObiettivo() {
        return descCausaleObiettivo;
    }

    /**
     * Sets the value of the descCausaleObiettivo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescCausaleObiettivo(String value) {
        this.descCausaleObiettivo = value;
    }

    /**
     * Gets the value of the voceEconomica property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoceEconomica() {
        return voceEconomica;
    }

    /**
     * Sets the value of the voceEconomica property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoceEconomica(String value) {
        this.voceEconomica = value;
    }

    /**
     * Gets the value of the descVoceEconomica property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescVoceEconomica() {
        return descVoceEconomica;
    }

    /**
     * Sets the value of the descVoceEconomica property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescVoceEconomica(String value) {
        this.descVoceEconomica = value;
    }

    /**
     * Gets the value of the centroCosto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCentroCosto() {
        return centroCosto;
    }

    /**
     * Sets the value of the centroCosto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCentroCosto(String value) {
        this.centroCosto = value;
    }

    /**
     * Gets the value of the descCentroCosto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescCentroCosto() {
        return descCentroCosto;
    }

    /**
     * Sets the value of the descCentroCosto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescCentroCosto(String value) {
        this.descCentroCosto = value;
    }

    /**
     * Gets the value of the codDebBen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodDebBen() {
        return codDebBen;
    }

    /**
     * Sets the value of the codDebBen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodDebBen(String value) {
        this.codDebBen = value;
    }

    /**
     * Gets the value of the descCodDebBen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescCodDebBen() {
        return descCodDebBen;
    }

    /**
     * Sets the value of the descCodDebBen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescCodDebBen(String value) {
        this.descCodDebBen = value;
    }

    /**
     * Gets the value of the naturaCoge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaturaCoge() {
        return naturaCoge;
    }

    /**
     * Sets the value of the naturaCoge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaturaCoge(String value) {
        this.naturaCoge = value;
    }

    /**
     * Gets the value of the descNaturaCoge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescNaturaCoge() {
        return descNaturaCoge;
    }

    /**
     * Sets the value of the descNaturaCoge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescNaturaCoge(String value) {
        this.descNaturaCoge = value;
    }

    /**
     * Gets the value of the codiceCup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceCup() {
        return codiceCup;
    }

    /**
     * Sets the value of the codiceCup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceCup(String value) {
        this.codiceCup = value;
    }

    /**
     * Gets the value of the codiceCig property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceCig() {
        return codiceCig;
    }

    /**
     * Sets the value of the codiceCig property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceCig(String value) {
        this.codiceCig = value;
    }

    /**
     * Gets the value of the cespite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCespite() {
        return cespite;
    }

    /**
     * Sets the value of the cespite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCespite(String value) {
        this.cespite = value;
    }

    /**
     * Gets the value of the descCespite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescCespite() {
        return descCespite;
    }

    /**
     * Sets the value of the descCespite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescCespite(String value) {
        this.descCespite = value;
    }

    /**
     * Gets the value of the codFondo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodFondo() {
        return codFondo;
    }

    /**
     * Sets the value of the codFondo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodFondo(String value) {
        this.codFondo = value;
    }

    /**
     * Gets the value of the descFondo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescFondo() {
        return descFondo;
    }

    /**
     * Sets the value of the descFondo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescFondo(String value) {
        this.descFondo = value;
    }

    /**
     * Gets the value of the codTipoFinanz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodTipoFinanz() {
        return codTipoFinanz;
    }

    /**
     * Sets the value of the codTipoFinanz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodTipoFinanz(String value) {
        this.codTipoFinanz = value;
    }

    /**
     * Gets the value of the descTipoFinanz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescTipoFinanz() {
        return descTipoFinanz;
    }

    /**
     * Sets the value of the descTipoFinanz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescTipoFinanz(String value) {
        this.descTipoFinanz = value;
    }

    /**
     * Gets the value of the siope property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiope() {
        return siope;
    }

    /**
     * Sets the value of the siope property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiope(String value) {
        this.siope = value;
    }

    /**
     * Gets the value of the descSiope property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescSiope() {
        return descSiope;
    }

    /**
     * Sets the value of the descSiope property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescSiope(String value) {
        this.descSiope = value;
    }

    /**
     * Gets the value of the mutuo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMutuo() {
        return mutuo;
    }

    /**
     * Sets the value of the mutuo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMutuo(String value) {
        this.mutuo = value;
    }

    /**
     * Gets the value of the descMutuo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescMutuo() {
        return descMutuo;
    }

    /**
     * Sets the value of the descMutuo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescMutuo(String value) {
        this.descMutuo = value;
    }

    /**
     * Gets the value of the perfezionamento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerfezionamento() {
        return perfezionamento;
    }

    /**
     * Sets the value of the perfezionamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerfezionamento(String value) {
        this.perfezionamento = value;
    }

    /**
     * Gets the value of the descPerfezionamento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescPerfezionamento() {
        return descPerfezionamento;
    }

    /**
     * Sets the value of the descPerfezionamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescPerfezionamento(String value) {
        this.descPerfezionamento = value;
    }

    /**
     * Gets the value of the vincolo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVincolo() {
        return vincolo;
    }

    /**
     * Sets the value of the vincolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVincolo(String value) {
        this.vincolo = value;
    }

    /**
     * Gets the value of the descVincolo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescVincolo() {
        return descVincolo;
    }

    /**
     * Sets the value of the descVincolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescVincolo(String value) {
        this.descVincolo = value;
    }

    /**
     * Gets the value of the programma property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramma() {
        return programma;
    }

    /**
     * Sets the value of the programma property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramma(String value) {
        this.programma = value;
    }

    /**
     * Gets the value of the descProgramma property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescProgramma() {
        return descProgramma;
    }

    /**
     * Sets the value of the descProgramma property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescProgramma(String value) {
        this.descProgramma = value;
    }

    /**
     * Gets the value of the progetto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgetto() {
        return progetto;
    }

    /**
     * Sets the value of the progetto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgetto(String value) {
        this.progetto = value;
    }

    /**
     * Gets the value of the descProgetto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescProgetto() {
        return descProgetto;
    }

    /**
     * Sets the value of the descProgetto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescProgetto(String value) {
        this.descProgetto = value;
    }

    /**
     * Gets the value of the codMeccanografico property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodMeccanografico() {
        return codMeccanografico;
    }

    /**
     * Sets the value of the codMeccanografico property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodMeccanografico(String value) {
        this.codMeccanografico = value;
    }

    /**
     * Gets the value of the codLibroIva property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodLibroIva() {
        return codLibroIva;
    }

    /**
     * Sets the value of the codLibroIva property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodLibroIva(String value) {
        this.codLibroIva = value;
    }

    /**
     * Gets the value of the descLibroIva property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescLibroIva() {
        return descLibroIva;
    }

    /**
     * Sets the value of the descLibroIva property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescLibroIva(String value) {
        this.descLibroIva = value;
    }

}
