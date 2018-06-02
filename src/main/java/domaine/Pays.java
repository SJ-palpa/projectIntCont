package domaine;

public class Pays {
    private String code;
    private String nom;
    
    public Pays(String code, String nom) { this.code=code; this.nom=nom; }
    public Pays(String code) { this(code, ""); }
    
    public String getCode() { return code; }
    public String getNom() { return nom; }

    public void setCode(String codeSet) { this.code = codeSet;}
    public void setNom(String nomSet) { this.nom = nomSet;}
    public void setPays(String codeSet, String nomSet) { this.code=codeSet; this.nom=nomSet; }
    
    
    public boolean equals(Object obj) { return this.code.equals(((Pays)obj).code); }
    public String toString() { return nom; }
}