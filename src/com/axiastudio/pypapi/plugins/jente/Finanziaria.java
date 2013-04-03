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
public class Finanziaria extends QDialog {
    
    private static final String URLTEMPLATE = "http://{0}/jente/ControllerView?codeFunzione=FN&azione=proposteImpAcc&attoBozza={1}&organoProvvedimento=DT&annoProvvedimento={2}&numeroProvvedimento={3}&action=it.arezzo.infor.jente.jfinanziaria.base.proc.PFNInizio&rProc={4}&utente={5}";
    private static final String HOSTJENTE = "jente-ws";
    private CustomWebView webView;
    private final String anno;
    private final String numero;
    private final String utente;
    private final String rProc;
    private final Boolean vistoResponsabile;
    private String attoOBozza;
    private final String organoSettore;
    private final String dataDetermina;
    private final String dataVistoResponsabile;
    
    public Finanziaria(String anno, String organoSettore, String numero, String utente, String rProc, Boolean vistoResponsabile, String dataDetermina, String dataVistoResponsabile){
        super();
        this.anno = anno;
        this.organoSettore = organoSettore;
        this.numero = numero;
        this.utente = utente;
        this.rProc = rProc;
        this.vistoResponsabile = vistoResponsabile;
        this.dataDetermina = dataDetermina;
        this.dataVistoResponsabile = dataVistoResponsabile;
        this.presenzaAttoOBozza();
        this.initWebView();        
    }
    
    private void presenzaAttoOBozza() {
        JEnteHelper jEnteHelper = new JEnteHelper(this.utente);
        // se esiste già l'atto, prendo quello
        if( jEnteHelper.chiamataRichiestaEsisteBozzaOAtto("A", this.organoSettore, this.anno, this.numero) ){
            this.setAttoOBozza("A"); 
        } else {
            // altrimenti se esiste la bozza prendo quella
            if( jEnteHelper.chiamataRichiestaEsisteBozzaOAtto("B", this.organoSettore, this.anno, this.numero)){
                this.setAttoOBozza("B");
            } else {
                // devo creare l'atto o la bozza
                if( !vistoResponsabile ){
                    // creo una bozza se la determina non è firmata dal responsabile
                    jEnteHelper.chiamataRichiestaInserimentoBozzaOAtto("B", this.organoSettore, this.anno, this.numero, this.rProc, this.dataDetermina);
                    this.setAttoOBozza("B");
                } else {
                    // altrimenti creo direttamente un atto
                    jEnteHelper.chiamataRichiestaInserimentoBozzaOAtto("A", this.organoSettore, this.anno, this.numero, this.rProc, this.dataVistoResponsabile);
                    this.setAttoOBozza("A");
                }
            }
        }
        if( vistoResponsabile && "B".equals(this.getAttoOBozza()) ){
            jEnteHelper.chiamataRichiestaTrasformazioneBozzaInAtto("B", this.organoSettore, this.anno, this.numero);
        }
    }
    
    
    private void initWebView(){
        this.webView = new CustomWebView();
        QVBoxLayout vLayout = new QVBoxLayout(this);
        vLayout.addWidget(this.webView);
        this.reload();
    }
    
    private void reload(){
        //String attoBozza = "A";
        String url = MessageFormat.format(URLTEMPLATE,
                                          HOSTJENTE,
                                          this.getAttoOBozza(),
                                          this.getAnno(),
                                          this.getNumero(),
                                          this.getrProc(), 
                                          this.getUtente());
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

    public String getAnno() {
        return anno;
    }

    public String getNumero() {
        return numero;
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
