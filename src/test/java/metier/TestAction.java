/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 *
 * @author stephaneTRV
 */
public class TestAction {
    
    private Action action;

    @BeforeTest
    protected void setUp()
    {
    	action = new Action(1);
    }
    
    @Test
    public void shouldReturnNullWhenNoPays()
    {
        assertEquals(action.getAction(),1);
    }
}
