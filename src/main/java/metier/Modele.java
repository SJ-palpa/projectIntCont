
package metier;

import dao.PaysDao;
import domaine.Pays;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import outils.FileReader;


public class Modele extends Observable{
    public static final int NO_POS = -1;  
    private int posCrt = NO_POS; 
    private ArrayList paysList = new ArrayList();

    public Modele() {}
    public Modele(Observer obs) { if (obs != null) { addObserver(obs); } }

    FileReader r = new FileReader();
    PaysDao pays = new PaysDao(r);

 
    
    public void loadData(){
        paysList = pays.getListePays();
        setChanged();
        notifyObservers(new Action(Action.LOAD));
    }
  
    public final int size() { return paysList.size(); }
    
    
     public Object get(int pos) {
        if (pos < 0 || pos >= paysList.size()) { return null; }
        return paysList.get(pos);
    }

     protected Object get() {
        if (posCrt < 0 || posCrt >= paysList.size()) { return null; }
        return paysList.get(posCrt);
    }

    public final void setList(ArrayList lst) { paysList = lst; }

    public final void setPos(int pos) {
        if (pos != posCrt) {
            posCrt = (pos >= 0 && pos < paysList.size()) ? pos : NO_POS;
            setChanged(); 
            notifyObservers(new Action(Action.SEL, posCrt));
        }
    }
}
