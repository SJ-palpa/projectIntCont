package domaine;

public class Pays {
    private String code;
    private String nom;
    
    public Pays(String code, String nom) { this.code=code; this.nom=nom; }
    public Pays(String code) { this(code, ""); }
    
    public String getCode() { return code; }
    public String getNom() { return nom; }
    
    public boolean equals(Object obj) { return this.code.equals(((Pays)obj).code); }
    public String toString() { return nom; }
}