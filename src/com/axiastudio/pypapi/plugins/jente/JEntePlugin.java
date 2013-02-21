/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.axiastudio.pypapi.plugins.jente;

import com.axiastudio.pypapi.plugins.IPlugin;
import com.axiastudio.pypapi.ui.Dialog;
import com.axiastudio.pypapi.ui.Window;
import com.axiastudio.pypapi.ui.widgets.PyPaPiToolBar;
import com.trolltech.qt.gui.QWidget;


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
        if( Window.class.isInstance(parent) ){
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
        System.out.println("setup");
        
    }
    
    @Override
    public String getName() {
        return JEntePlugin.name;
    }
    
    public void showForm() {
        System.out.println("ok");
        Finanziaria form = new Finanziaria();
        form.show();
    }
}
