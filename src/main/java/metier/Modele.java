
package metier;

import dao.PaysDao;
import domaine.Pays;
import java.util.ArrayList;
import java.util.Observable;
import outils.FileReader;

/**
 *
 * @author diego ruiz torres
 */
public class Modele extends Observable{
    public static final int NO_POS = -1;  
    private int posCrt = NO_POS;
    
    private ArrayList paysList = new ArrayList();
    FileReader r = new FileReader();
    PaysDao pays = new PaysDao(r);
    
    public void loadData(){
        paysList = pays.getListePays();
        setChanged();
        notifyObservers(new Action(Action.LOAD));
    }
    
    public Pays getPays(int pos){  return (Pays) paysList.get(pos);}
    
    public final int size() { return paysList.size(); }
    
    
     public Object get(int pos) {
        if (pos < 0 || pos >= paysList.size()) { return null; }
        return paysList.get(pos);
    }   
}
