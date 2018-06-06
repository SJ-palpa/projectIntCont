/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestOutils;
import java.io.FileNotFoundException;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import outils.FileStr;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.testng.Assert;
/**
 *
 * @author stephaneTRV
 */
public class TestFileStr {
      
  private String fileNotValid;
    private FileStr fileStr;
    
    @BeforeTest
    protected void setUp()
    {
    	fileNotValid = "Bonjour";
        fileStr= new FileStr();
        
    }
    /*
    //@Test  
    //@ExpectedExceptions(FileNotFoundException.class)
    @Test(expectedExceptions  = {FileNotFoundException.class}, expectedExceptionsMessageRegExp = ".*Bonjour (Le fichier spécifié est introuvable).*")
    public void ifFileNotValidReturnNull() throws FileNotFoundException{
       fileStr.read(fileNotValid);
       //throw new FileNotFoundException();
        when(fileStr.read(fileNotValid)).thenReturn(new JsonParser().parse("[{'num':1}]").getAsJsonArray());
        Assert.assertThrows(fileStr.read(fileNotValid),FileNotFoundException.class);

    }*/
}
