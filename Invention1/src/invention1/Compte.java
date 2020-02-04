package invention1;

public class Compte {
    
    private int iban = 15;
    private int numeroCompte;
    private int solde;
    
    
    public Compte(int iban, int solde)
    {
        this.iban = iban;
        this.solde = solde;
    }
    
    public int getIban()
    {
        return iban;
    }
    
    public int getSolde()
    {
        return solde;
    }
}
