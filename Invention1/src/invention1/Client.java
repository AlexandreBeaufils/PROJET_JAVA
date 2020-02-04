package invention1;

public class Client extends Utilisateur {
    
    private int numeroClient;
        
    
    public Client(String nom, String prenom, int mdp, int monnaie, int numeroClient) {
        super(nom,prenom,mdp,monnaie);
        this.numeroClient = numeroClient;
       
}
}