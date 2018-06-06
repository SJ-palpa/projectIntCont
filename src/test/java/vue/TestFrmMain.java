/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;



import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import java.awt.Dimension;



/**
 *
 * @author stephaneTRV
 */
public class TestFrmMain {
    
    private FrmMain frmMain;
    
    @BeforeTest
    protected void setUp()
    {
    	frmMain = new FrmMain(); 
    }
    
    @Test
    public void shouldNotBeNull() {
        assertNotNull(frmMain);
    }
    
    
    @Test 
    public void shouldHaveTitle() {
        assertEquals(frmMain.getTitle(),"My First Application");
    }
    
    @Test 
    public void shouldHaveCorrectSize() {
        Dimension expected = new Dimension(300,200) ;
        assertEquals(frmMain.getSize(),expected);
    }
    
    @Test
    public void frmShouldHaveWindowListner() {
       assertEquals(frmMain.getWindowListeners().length,1);
    }
    
    @Test
    public void modelePaysShouldHaveOneObserver() {
        assertEquals(frmMain.modelePays.countObservers(),1);
    }
}
