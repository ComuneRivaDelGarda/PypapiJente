/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.axiastudio.pypapi.plugins.jente;

import com.axiastudio.pypapi.Register;
import com.axiastudio.pypapi.plugins.IPlugin;
import com.axiastudio.pypapi.ui.Dialog;
import com.axiastudio.pypapi.ui.Window;
import com.axiastudio.pypapi.ui.widgets.PyPaPiToolBar;
import com.axiastudio.suite.base.entities.IUtente;
import com.axiastudio.suite.base.entities.Utente;
import com.axiastudio.suite.deliberedetermine.entities.Determina;
import com.axiastudio.suite.deliberedetermine.entities.ServizioDetermina;
import com.trolltech.qt.gui.QWidget;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


/**
 *
 * @author Tiziano Lattisi <tiziano at axiastudio.it>
 */
class JEnteMenuBar extends PyPaPiToolBar {
    public JEnteMenuBar(String title, Window parent, IPlugin plugin){
        super(title, parent);
        this.insertButton("showForm", "JEnte plugin",
                          "classpath:com/axiastudio/pypapi/plugins/jente/resources/jente.png",
                          "JEnte maschera impegni", plugin);
    }
}

public class JEntePlugin implements IPlugin {

    private static final String name="JEnte";
    private QWidget parent=null;

    @Override
    public void install(QWidget parent) {
        this.install(parent, Boolean.TRUE);
    }

    @Override
    public void install(QWidget parent, Boolean addToolbar) {
        if( Window.class.isInstance(parent) && addToolbar){
            JEnteMenuBar bar = new JEnteMenuBar("JEnte plugin", (Window) parent, this);
            ((Window) parent).addToolBar(bar);
            this.parent = (Window) parent;
        } else if( Dialog.class.isInstance(parent) ){
            this.parent = (Dialog) parent;
        } else {
            this.parent = parent;
        }
    }

    public void setup(){
    }
    
    @Override
    public String getName() {
        return JEntePlugin.name;
    }
    
    public void showForm() {
        String utente = ((Utente) Register.queryUtility(IUtente.class)).getLogin();
        Determina determina = (Determina) ((Window) this.parent).getContext().getCurrentEntity();
        String anno = determina.getIdPratica().substring(0, 4);
        String numero = ((Integer) Integer.parseInt(determina.getIdPratica().substring(4))).toString();
        Boolean vistoResponsabile = determina.getVistoResponsabile();
        String rProc=null;
        for( ServizioDetermina servizioDetermina: determina.getServizioDeterminaCollection() ){
            rProc = servizioDetermina.getServizio().getUfficio().getId().toString();
            //rProc = "0181";
            break;
        }
        String organoSettore = "DT";
        
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String dataDetermina = dateFormat.format(determina.getDataPratica());
        
        String dataVistoResponsabile = null;
        if( determina.getDataVistoResponsabile() != null ){
            dataVistoResponsabile = dateFormat.format(determina.getDataVistoResponsabile());
        }
        Finanziaria form = new Finanziaria(anno, organoSettore, numero, utente, rProc, vistoResponsabile, dataDetermina, dataVistoResponsabile);
        form.show();
    }
}
