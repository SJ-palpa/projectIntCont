/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composant;

import java.awt.Color;

/**
 *
 * @author stephane.jermini
 */
public enum FeuCouleur {
    ROUGE( java.awt.Color.RED),
    JAUNE(java.awt.Color.YELLOW),
    VERT(java.awt.Color.GREEN);
    private Color c;
    FeuCouleur(Color c) {this.c =c;}
    Color getValeur() {return c;}
}
