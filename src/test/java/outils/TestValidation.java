/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestOutils;
import static org.testng.Assert.*;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import outils.Validation;
/**
 *
 * @author stephaneTRV
 */
public class TestValidation {
    private Validation validation;
    private String intValid;
    private String doubleValid;
    private String Int_Double_Invalid;
     
    @BeforeTest
    protected void setUp()
    {
    	Int_Double_Invalid = "Bonjour";
        intValid="1";
        doubleValid="2.0";
    }
    
    @Test
    public void IfIntValidReturnTrue() {
       validation= new Validation();
       assertEquals(validation.isIntValid(intValid),true);
    }
    
    @Test
    public void IfIntNotValidReturnFalse() {
        validation= new Validation();
       assertEquals(validation.isIntValid(Int_Double_Invalid),false);
    }
    
     @Test
    public void IfDoubleValidReturnTrue() {
        validation= new Validation();
       assertEquals(validation.isDoubleValid(doubleValid),true);
    }
    
    @Test
    public void IfDoubleNotValidReturnFalse() {
        validation= new Validation();
       assertEquals(validation.isDoubleValid(Int_Double_Invalid),false);
    }
}
