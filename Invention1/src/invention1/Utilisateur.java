package invention1;


public class Utilisateur {

    protected String nom;
    protected String prenom;
    protected int mdp;
    protected int monnaie;

    public Utilisateur(String nom, String prenom, int mdp, int monnaie) {

        this.nom = nom;
        this.prenom = prenom;
        this.mdp = mdp;
        this.monnaie = monnaie;
    }

    public String getNom()
    {
        return nom;
    }
    
    public String getPrenom()
    {
        return prenom;
    }
    
    public int getMdp()
    {
        return mdp;
    }
    
    
    
    
}
