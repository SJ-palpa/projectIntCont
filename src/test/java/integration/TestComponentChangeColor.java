/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integration;


import composant.FeuCouleur;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import vue.FrmMain;


/**
 *
 * @author stephaneTRV
 */
public class TestComponentChangeColor {
    
    private FrmMain frmMain1;
    private FrmMain frmMain2;
    @BeforeTest
    protected void setUp() {
        frmMain1 = new FrmMain();
        frmMain2 = new FrmMain();
    }
    
    @Test
    public void selectPays_AfriqueDuSud() {
        
        frmMain1.lstPays.select(0);
        frmMain1.feu.setEtat(FeuCouleur.ROUGE); 
        assertEquals(frmMain1.lstPays.getSelectedItem(),"Afrique du Sud");
    }
    
    @Test(dependsOnMethods = "selectPays_AfriqueDuSud")
    public void componentColorRed() {
       assertEquals(frmMain1.feu.getEtat(),FeuCouleur.ROUGE);
    }
      
    @Test
    public void selectPays_Allemagne() {
        
        frmMain2.lstPays.select(2);
        frmMain2.feu.setEtat(FeuCouleur.VERT);
        assertEquals(frmMain2.lstPays.getSelectedItem(),"Allemagne");
    }
    
    @Test(dependsOnMethods = "selectPays_Allemagne")
    public void componentColorGreen() {
       assertEquals(frmMain2.feu.getEtat(),FeuCouleur.VERT);
    }
    
    
}
