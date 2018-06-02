package dao;

import java.util.ArrayList;
import java.util.StringTokenizer;
import outils.FileReader;
import domaine.Pays;

public class PaysDao {
    
    
    private final FileReader reader;

    public PaysDao(FileReader reader){ this.reader = reader; }

    public ArrayList getListePays() { 
	ArrayList aLst = new ArrayList();
        String[] tabPays = reader.readPays();    
        for (int i=0; i<tabPays.length; i++) { 
            StringTokenizer strT = new StringTokenizer(tabPays[i], ";");
                aLst.add(new Pays(strT.nextToken(), strT.nextToken()));
        }
        return aLst;
    } 
}