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
    private CustomWebView webView;
    
    public Finanziaria(){
        super();
        this.initWebView();        
    }
    
    
    private void initWebView(){
        this.webView = new CustomWebView();
        QVBoxLayout vLayout = new QVBoxLayout(this);
        vLayout.addWidget(this.webView);
        this.reload();
    }
    
    private void reload(){
        String host = "192.168.90.4";
        String attoBozza = "A";
        String anno = "2012";
        String numeroProvvedimento = "8398";
        String rProc = "0181";
        String utente = "pivamichela";
        String url = MessageFormat.format(URLTEMPLATE,
                                          host,
                                          attoBozza,
                                          anno,
                                          numeroProvvedimento,
                                          rProc, 
                                          utente);
        this.webView.load(new QUrl(url));
        this.webView.settings().setAttribute(QWebSettings.WebAttribute.JavascriptEnabled, true);
        this.webView.settings().setAttribute(QWebSettings.WebAttribute.JavascriptCanOpenWindows, true);
        this.webView.settings().setAttribute(QWebSettings.WebAttribute.JavascriptCanAccessClipboard, true);
    }
}
