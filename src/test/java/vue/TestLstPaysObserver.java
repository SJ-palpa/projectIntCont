package vue;

import static org.testng.Assert.*;
import org.testng.annotations.Test;
import java.awt.List;
import java.util.ArrayList;
import metier.Action;
import metier.Modele;
import static org.assertj.core.api.Assertions.assertThat;
import org.testng.annotations.BeforeTest;

public class TestLstPaysObserver
{
    private LstPaysObserver observer;
    private List lstGUI;
    private Modele lstPays;
    private Action action;

    @BeforeTest
    protected void setUp() {
        lstPays = new Modele();
        lstGUI = new List();
        observer = new LstPaysObserver(lstGUI);
    }

    @Test
    public void IfEmptylistIfActionIsNotInstanceofAction() {
        lstPays.loadData();
        observer.update(lstPays, "LOAD");
        ArrayList list = new ArrayList();
        for(int i = 0; i<lstGUI.getItemCount(); i++) { list.add(lstGUI.getItem(i)); } 
        assertThat(list).isEmpty();
    }
    
    @Test
    public void shouldReturnActionPos()
    {   
        action = new Action(1);
        assertEquals(action.getPos(),-1);
    }
    
    @Test
    public void testShouldReturnEmptyWhenWrongAction() {
        observer.update(lstPays, "aaaa");
        ArrayList list = new ArrayList();
        for(int i = 0; i<lstGUI.getItemCount(); i++) { list.add(lstGUI.getItem(i)); } 
        assertThat(list).isEmpty();
    }

}