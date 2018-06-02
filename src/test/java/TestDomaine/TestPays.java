package domaine;

import static org.testng.Assert.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class TestPays {
 	

 	@Test
    public void testPaysCode() {
        Pays instance = new Pays("CH");
        String result = instance.getCode();
        assertEquals(result, "CH");
    }


     @Test
    public void testToString() {
        Pays instance = new Pays("FR", "france");
        String result = instance.toString();
        assertEquals(result, "france");
    }
  
    @Test
    public void testGetNom() {
        Pays instance = new Pays("FR", "france");
        String result = instance.getNom();
        assertEquals(result, "france");
    }


    @Test
    public void testSetCode() {
        Pays instance = new Pays("FR", "france");
        instance.setCode("CH");
        String result = instance.getCode();
        assertEquals(result, "CH");
    }

    
    @Test
    public void testSetNom() {
        Pays instance = new Pays("FR", "france");
        instance.setNom("Suisse");
        String result = instance.getNom();
        assertEquals(result, "Suisse");
    }


    @Test
    public void testSetPays() {
        Pays instance = new Pays("FR", "france");
        Pays instanceVerification = new Pays("CH","Suisse");
        instance.setPays("CH","Suisse");
        assertEquals(instance, instanceVerification);
    }

}