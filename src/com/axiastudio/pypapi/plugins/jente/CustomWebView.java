/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.axiastudio.pypapi.plugins.jente;

import com.trolltech.qt.gui.QWidget;
import com.trolltech.qt.network.QNetworkCookieJar;
import com.trolltech.qt.webkit.QWebPage;
import com.trolltech.qt.webkit.QWebView;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author AXIA Studio (http://www.axiastudio.com)
 */
public class CustomWebView extends QWebView {

    private static final String HOST="http://192.168.64.41/";
    private static final Map<String, String> GIF2PNGMAP;
    static
    {
        GIF2PNGMAP = new HashMap<String, String>();
        GIF2PNGMAP.put("Ricerca Capitoli Spesa", "rubrica.png");
        GIF2PNGMAP.put("Ricerca Capitoli Entrata", "rubrica.png");
        GIF2PNGMAP.put("Ricerca Impegni", "rubrica.png");
        GIF2PNGMAP.put("Ricerca Accertamenti", "rubrica.png");
        GIF2PNGMAP.put("Ricerca Responsabili Procedura", "rubrica.png");
        GIF2PNGMAP.put("Ricerca Soggetti in in Anagrafico Clienti/Fornitori", "rubrica.png");
        GIF2PNGMAP.put("Ricerca Centri di Costo", "rubrica.png");
        GIF2PNGMAP.put("Ricerca Nature COGE", "rubrica.png");
        GIF2PNGMAP.put("Ricerca Voci Economiche", "rubrica.png");
        GIF2PNGMAP.put("Ricerca CGU", "rubrica.png");
        GIF2PNGMAP.put("Ricerca Fondi", "rubrica.png");
        GIF2PNGMAP.put("Ricerca Tipi Finanziamento", "rubrica.png");
        GIF2PNGMAP.put("Ricerca Cespiti", "rubrica.png");
        GIF2PNGMAP.put("Ricerca Patto", "rubrica.png");
        GIF2PNGMAP.put("Ricerca Mutui", "rubrica.png");
        GIF2PNGMAP.put("Ricerca Perfezionamenti", "rubrica.png");
        GIF2PNGMAP.put("Ricerca Vincoli", "rubrica.png");
        GIF2PNGMAP.put("Ricerca Obiettivi", "rubrica.png");
        GIF2PNGMAP.put("Ricerca ALBO (Albo beneficiari)", "rubrica.png");
        GIF2PNGMAP.put("Nuovo", "Add16.png");
        GIF2PNGMAP.put("Zoom", "Zoom16.png");
        GIF2PNGMAP.put("Modifica", "Edit16.png");
        GIF2PNGMAP.put("Elimina", "Delete16.png");
        GIF2PNGMAP.put("Duplica", "Copy16.png");
        GIF2PNGMAP.put("Primo", "RecordFirst16.png");
        GIF2PNGMAP.put("Precedente", "RecordPrevious16.png");
        GIF2PNGMAP.put("Successivo", "RecordNext16.png");
        GIF2PNGMAP.put("Ultimo", "RecordLast16.png");
        GIF2PNGMAP.put("Rientra alla Lista", "BacktoList16.png");
    }
    private static final String GIF2PNG = "var allImages = document.getElementsByTagName(\"img\"); for (var i = 0, len = allImages.length; i < len; ++i) '{' if (allImages[i].alt == \"{0}\") '{' allImages[i].src = \"{1}\" '}' '}'";
    private static final String JSSTYPE = "document.getElementById(\"masthead_imenus\").style.display='none'; document.getElementById(\"footer\").style.display='none'; document.getElementById(\"imcontainer20\").style.visibility='hidden'; //table_list = document.getElementsByTagName(\"table\")";
    private QNetworkCookieJar cookieJar;

    public CustomWebView() {
        this(null);
    }

    public CustomWebView(QWidget parent) {
        super(parent);
        this.cookieJar = new QNetworkCookieJar();
        this.page().networkAccessManager().setCookieJar(this.cookieJar);
        this.page().loadFinished.connect(this, "hideHeaderFooter()");
        this.page().windowCloseRequested.connect(this, "close()");
    }

    @Override
    protected QWebView createWindow(QWebPage.WebWindowType type) {
        CustomWebView view = new CustomWebView();
        view.page().networkAccessManager().setCookieJar(this.cookieJar);
        view.show();
        //this.parent().popupHandler = view;
        return view;
    }
    
    
    private void hideHeaderFooter(){
        this.page().mainFrame().evaluateJavaScript(JSSTYPE);
        for( String key: GIF2PNGMAP.keySet() ) {
            String resource = GIF2PNGMAP.get(key);
            String js = MessageFormat.format(GIF2PNG, key, HOST+resource);
            this.page().mainFrame().evaluateJavaScript(js);
        }
    }
}
