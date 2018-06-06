/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composant;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import static org.testng.Assert.*;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import vue.FrmMain;
/**
 *
 * @author stephaneTRV
 */
public class TestFeu {
    private Feu feu;
    private FrmMain main;
    
    @BeforeTest
    protected void setUp()
    {
        main = new FrmMain();
    	feu = new Feu(); 
    }
    
    @Test
    public void largeurshouldBe30() { 
        
        Feu feuTest = new Feu(); 
        assertEquals(feuTest.getLargeur(),30);
    }
    
    @Test
    public void largeurshouldBe10ifSetTo10() {

        feu.setLargeur(10);
        assertEquals(feu.getLargeur(),10);
    }
    
    @Test
    public void etatshouldBeRouge() { 

        assertEquals(feu.getEtat(),FeuCouleur.ROUGE);
    }
    
    @Test
    public void etatshouldBeSetToVERT() { 
        feu.setEtat(FeuCouleur.VERT);
        assertEquals(feu.getEtat(),FeuCouleur.VERT);
    }
    
    @Test
    public void fillRectSouldBeField() throws AWTException
    {
       
    
    }
    
    
}
