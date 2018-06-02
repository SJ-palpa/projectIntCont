/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import composant.Feu;
import java.awt.List;
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
    
    private Modele modelePays = new Modele();
    
    public FrmMain()
    {          
	init();
        initObservers();
        modelePays.loadData();
    }
    
    private void init()
    {   
        // Init
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
        
        // Composant Feu
        feu = new composant.Feu();
        feu.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mousePressed(java.awt.event.MouseEvent evt) {
                feuMousePressed(evt);
            }
        });

        lstPays = new java.awt.List();
        
        
        
        add("East", lstPays);
        add("West", feu);
	pack();
	setSize(H_SIZE, V_SIZE);
    }
    
    private void initObservers () {
        modelePays.addObserver(new LstPaysObserver(lstPays));
    }
    
    
    private void feuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_feu2MousePressed
        //tfEtat.setText(feu2.getEtat().toString());
    }//GEN-LAST:event_feu2MousePressed
    

    
    private void formWindowClosing(java.awt.event.WindowEvent evt) {                                   
        dispose();
    }                                  

    private void formWindowClosed(java.awt.event.WindowEvent evt) {                                  
        System.exit(0);
    }    
    
    
    
}
