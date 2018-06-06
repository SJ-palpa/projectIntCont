/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import composant.Feu;
import java.awt.event.WindowListener;
import metier.Modele;

/**
 *
 * @author stephaneTRV
 */
public class FrmMain extends java.awt.Frame {
    
    static final int H_SIZE = 300;
    static final int V_SIZE = 200;
    private java.awt.List lstPays;
    private Feu feu;
    
    public Modele modelePays = new Modele();
    
    public FrmMain()
    {          
	init();
        initObservers();
        modelePays.loadData();
    }

    private void init()
    {   
        setTitle("My First Application");
       
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            @Override
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        feu = new composant.Feu();   
        lstPays = new java.awt.List();
        
        
        
        add("East", lstPays);
        add("West", feu);
	pack();
	setSize(H_SIZE, V_SIZE);
    }
    
    private void initObservers () {
        modelePays.addObserver(new LstPaysObserver(lstPays));
    }   
    
    private void formWindowClosing(java.awt.event.WindowEvent evt) {                                   
        dispose();
    }                                  

    private void formWindowClosed(java.awt.event.WindowEvent evt) {                                  
        System.exit(0);
    }    
    
    
    
}
