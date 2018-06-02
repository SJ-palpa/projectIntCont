package vue;

import static org.testng.Assert.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
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
    public void should_have_empty_list_if_action_received_is_not_instanceof_action() {
        lstPays.loadData();
        observer.update(lstPays, "LOAD");
        ArrayList list = new ArrayList();
        for(int i = 0; i<lstGUI.getItemCount(); i++) { list.add(lstGUI.getItem(i)); } 
        assertThat(list).isEmpty();
    }

}