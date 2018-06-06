
package metier;


import domaine.Pays;
import java.util.ArrayList;
import vue.LstPaysObserver;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.testng.Assert.*;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import outils.FileReader;

public class TestModele {

	private Pays pays1,pays2;
	private Modele mdPays;
	private LstPaysObserver observer;
	private java.awt.List list;
        private ArrayList paysList;
    
    @BeforeTest
    protected void setUp()
    {
    	list = new java.awt.List();
    	observer = new LstPaysObserver(list);
    	mdPays = new Modele();
        pays1 = new Pays("CH","Suisse");
        pays2 = new Pays("FR","FRANCE");
        paysList = mock(ArrayList.class);
    }


	@Test
	public void shouldReturnNullWhenNoPays()
	{
		assertEquals(mdPays.get(),null);
	}

	@Test
	public void shouldReturnPaysWhenPays()
	{
		ArrayList<Pays> lst = new ArrayList();
		lst.add(pays1);
		mdPays.setList(lst);
		mdPays.setPos(0);
		assertEquals(mdPays.get(),new Pays("CH","Suisse"));
	}


	@Test
	public void shouldReturnPays2WhenPaysPos1()
	{
		ArrayList<Pays> lst = new ArrayList();
		lst.add(pays1);
		lst.add(pays2);
		mdPays.setList(lst);
		mdPays.setPos(1);
		assertEquals(mdPays.get(), new Pays("FR","FRANCE"));
	}
        
        @Test
	public void shouldReturnSamePos()
	{
		ArrayList<Pays> lst = new ArrayList();
		lst.add(pays1);
		lst.add(pays2);
		mdPays.setList(lst);
		mdPays.setPos(1);
                mdPays.setPos(1);
		assertEquals(mdPays.get(), new Pays("FR","FRANCE"));
	}
        
        @Test
	public void shouldReturnNoPos()
	{
		ArrayList<Pays> lst = new ArrayList();
		lst.add(pays1);
		lst.add(pays2);
		mdPays.setList(lst);
		mdPays.setPos(9);
		assertEquals(mdPays.get(),null);
	}

	@Test
        public void shouldReturnObserverIfNotNull() {
            mdPays = new Modele(observer);
            int nbOfObservers = mdPays.countObservers();
            assertThat(nbOfObservers).isGreaterThan(0);
        }
        
        @Test
        public void shouldReturnPaysposIfListFilled()
        {
            ArrayList<Pays> lst = new ArrayList();
            lst.add(pays1);
            lst.add(pays2);
            mdPays.setList(lst);
            assertEquals(mdPays.get(1), new Pays("FR","FRANCE"));   
        }
        
        @Test
        public void shouldReturnNullIfPaysListEmpty()
        {
            ArrayList<Pays> lst = new ArrayList();
            mdPays.setList(lst);
            assertEquals(mdPays.get(1), null);   
        }
        
        @Test
        public void shouldReturnNullIfgetZero()
        {
            ArrayList<Pays> lst = new ArrayList();
            mdPays.setList(lst);
            assertEquals(mdPays.get(0), null);   
        }
        
        @Test
        public void shouldReturnNullIfgetLIstSize()
        {
            when(paysList.size()).thenReturn(1);
            ArrayList<Pays> lst = new ArrayList();
            mdPays.setList(lst);
            assertEquals(mdPays.get(1),null);   
        }
        
        
        @Test
        public void shouldReturnNullIfPaysListEmptyWithget()
        {
            ArrayList<Pays> lst = new ArrayList();
            mdPays.setList(lst);
            assertEquals(mdPays.get(), null);   
        }
        
        @Test
        public void shouldReturnsizeListPays()
        {
            ArrayList<Pays> lst = new ArrayList();
            lst.add(pays1);
            lst.add(pays2);
            mdPays.setList(lst);
            assertEquals(mdPays.size(), 2);   
        }

}