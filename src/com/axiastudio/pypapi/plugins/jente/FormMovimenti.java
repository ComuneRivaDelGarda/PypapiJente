/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.axiastudio.pypapi.plugins.jente;

import com.trolltech.qt.core.QUrl;
import com.trolltech.qt.gui.QDialog;
import com.trolltech.qt.gui.QVBoxLayout;
import com.trolltech.qt.webkit.QWebSettings;
import java.text.MessageFormat;

/**
 *
 * @author AXIA Studio (http://www.axiastudio.com)
 */
public class FormMovimenti extends QDialog {
    
    private static final String URLTEMPLATE = "http://{0}/jente/ControllerView?codeFunzione=FN&azione=proposteImpAcc&attoBozza={1}&organoProvvedimento=DT&annoProvvedimento={2}&numeroProvvedimento={3}&action=it.arezzo.infor.jente.jfinanziaria.base.proc.PFNInizio&rProc={4}&utente={5}";
    private static final String HOSTJENTE = "jente-ws";
    private CustomWebView webView;

    private final String annoBozza;
    private final String organoSettoreBozza;
    private final String numeroBozza;

    private final String annoAtto;
    private final String organoSettoreAtto;
    private final String numeroAtto;

    private final String utente;
    private final String rProc;
    private final Boolean vistoResponsabile;
    private String attoOBozza;
    private final String dataDetermina;
    private final String dataVistoResponsabile;
    
    private final Boolean READONLY=false;
    
    public FormMovimenti(String annoBozza, String organoSettoreBozza, String numeroBozza, String annoAtto, String organoSettoreAtto, String numeroAtto, String utente, String rProc, Boolean vistoResponsabile, String dataDetermina, String dataVistoResponsabile){
        super();

        this.annoBozza = annoBozza;
        this.organoSettoreBozza = organoSettoreBozza;
        this.numeroBozza = numeroBozza;

        this.annoAtto = annoAtto;
        this.organoSettoreAtto = organoSettoreAtto;
        this.numeroAtto = numeroAtto;

        this.utente = utente;
        this.rProc = rProc;
        this.vistoResponsabile = vistoResponsabile;
        this.dataDetermina = dataDetermina;
        this.dataVistoResponsabile = dataVistoResponsabile;
        if( !READONLY ){
             // XXX: altrimenti crea bozza o trasforma in atto
            this.presenzaAttoOBozza();
        } else {
            this.setAttoOBozza("A");
        }
        this.initWebView();        
    }
    
    private void presenzaAttoOBozza() {
        JEnteHelper jEnteHelper = new JEnteHelper(this.utente);
        // se esiste già l'atto, prendo quello
        if( jEnteHelper.chiamataRichiestaEsisteBozzaOAtto("A", this.organoSettoreAtto, this.annoAtto, this.numeroAtto) ){
            this.setAttoOBozza("A"); 
        } else {
            // altrimenti se esiste la bozza prendo quella
            if( jEnteHelper.chiamataRichiestaEsisteBozzaOAtto("B", this.organoSettoreBozza, this.annoBozza, this.numeroBozza)){
                this.setAttoOBozza("B");
            } else {
                // devo creare l'atto o la bozza
                if( !vistoResponsabile ){
                    // creo una bozza se la determina non è firmata dal responsabile
                    jEnteHelper.chiamataRichiestaInserimentoBozzaOAtto("B", this.organoSettoreBozza, this.annoBozza, this.numeroBozza, this.rProc, this.dataDetermina);
                    this.setAttoOBozza("B");
                } else {
                    // altrimenti creo direttamente un atto
                    jEnteHelper.chiamataRichiestaInserimentoBozzaOAtto("A", this.organoSettoreAtto, this.annoAtto, this.numeroAtto, this.rProc, this.dataVistoResponsabile);
                    this.setAttoOBozza("A");
                }
            }
        }
        if( vistoResponsabile && "B".equals(this.getAttoOBozza()) ){
            jEnteHelper.chiamataRichiestaTrasformazioneBozzaInAtto("B", this.organoSettoreBozza, this.annoBozza, this.numeroBozza, this.organoSettoreAtto, this.annoAtto, this.numeroAtto);
            this.setAttoOBozza("A");
        }
    }
    
    
    private void initWebView(){
        this.webView = new CustomWebView();
        QVBoxLayout vLayout = new QVBoxLayout(this);
        vLayout.addWidget(this.webView);
        this.reload();
    }
    
    private void reload(){
        String url;
        if( "B".equals(this.getAttoOBozza()) ){
            url = MessageFormat.format(URLTEMPLATE,
                                          HOSTJENTE,
                                          this.getAttoOBozza(),
                                          this.getAnnoBozza(),
                                          this.getNumeroBozza(),
                                          this.getrProc(), 
                                          this.getUtente());
        } else if( "A".equals(this.getAttoOBozza()) ){
            url = MessageFormat.format(URLTEMPLATE,
                    HOSTJENTE,
                    this.getAttoOBozza(),
                    this.getAnnoAtto(),
                    this.getNumeroAtto(),
                    this.getrProc(),
                    this.getUtente());
        } else {
            return;
        }
        this.webView.load(new QUrl(url));
        this.webView.settings().setAttribute(QWebSettings.WebAttribute.JavascriptEnabled, true);
        this.webView.settings().setAttribute(QWebSettings.WebAttribute.JavascriptCanOpenWindows, true);
        this.webView.settings().setAttribute(QWebSettings.WebAttribute.JavascriptCanAccessClipboard, true);
    }

    public String getAttoOBozza() {
        return attoOBozza;
    }

    public void setAttoOBozza(String attoOBozza) {
        this.attoOBozza = attoOBozza;
    }

    public String getAnnoBozza() {
        return annoBozza;
    }

    public String getNumeroBozza() {
        return numeroBozza;
    }

    public String getAnnoAtto() {
        return annoAtto;
    }

    public String getNumeroAtto() {
        return numeroAtto;
    }

    public String getUtente() {
        return utente;
    }

    public String getrProc() {
        return rProc;
    }

    public Boolean getFirmaResponsabile() {
        return vistoResponsabile;
    }
    
    
}
