package invention1;

public class Main {

  
    public static void main(String[] args) {
       
       Compte ALEX = new Compte(12345, 50000);
       
       Distributeur BNP = new Distributeur(1, 5000);
       //BNP.retirer();
       BNP.menu();
       BNP.utiliser();
    }
    
}
