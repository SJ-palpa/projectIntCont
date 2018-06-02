/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composant;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

/**
 *
 * @author stephane.jermini
 */
public class Feu extends java.awt.Canvas{
    
    private int largeur = 30;
   
    private int margeYCouleur = 3;

    public int getLargeur () {return largeur;}
    public void setLargeur (int largeur) {this.largeur = largeur; }
    
    private FeuCouleur etat = FeuCouleur.ROUGE;
    public FeuCouleur getEtat() {return etat;}
    public void setEtat (FeuCouleur etat) {
        this.etat = etat;
        repaint();
    }
    
    public Feu () {
        this.setSize(largeur, 3 * largeur);
        init();
        addMouseListener(new MouseAdapter() { 
            @Override
            public void mousePressed (MouseEvent e) {
                if (e.getClickCount() > 1) {return;}
                int couleurInt = e.getY() / largeur + 1;
                switch (couleurInt) {
                    case 1:
                        setEtat( FeuCouleur.ROUGE);
                        break;
                    case 2:
                        setEtat( FeuCouleur.JAUNE);
                        break;
                    case 3:
                        setEtat( FeuCouleur.VERT);
                        break;
                    default:
                        break;
                }
            } 
        });
    } 
    
    private void init () {
        repaint();
    }
    
    @Override
    public void paint (Graphics g){  

        g.fillRect(0,0,largeur,3 * largeur); 
        g.setColor(Color.WHITE);
        g.fillOval(3, 3, 24, 24);
        g.fillOval(3,33, 24, 24);
        g.fillOval(3,63, 24, 24);
        g.setColor(etat.getValeur());
        g.fillOval(3, etat.ordinal()*largeur+ 3, 24, 24);     
    }

}
