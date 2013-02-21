/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.axiastudio.pypapi.plugins.jente;

import com.trolltech.qt.gui.QWidget;
import com.trolltech.qt.network.QNetworkCookieJar;
import com.trolltech.qt.webkit.QWebPage;
import com.trolltech.qt.webkit.QWebView;

/**
 *
 * @author AXIA Studio (http://www.axiastudio.com)
 */
public class CustomWebView extends QWebView {
    
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
        this.page().mainFrame().evaluateJavaScript(this.JSSTYPE);
    }
}
