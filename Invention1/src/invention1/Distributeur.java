package invention1;

import java.util.Scanner;

public class Distributeur {

    private int numeroSerie;
    private int banque;
    private Compte compte;
    
   
    public Distributeur(int numeroSerie, int banque) {
        this.numeroSerie = numeroSerie;
    }

    public int getNumeroSerie() {
        return numeroSerie;
    }

    public void menu() {
        int choix = 0;

        System.out.println("  ### Bienvenu dans le distrbuteur BNP Paribas ###");

        System.out.println("Etes-vous client de la BNP ?");

        System.out.println("1. Non");
        System.out.println("2. Oui");
        System.out.println("\nSaisissez le numéro correspond à votre choix :");

        Scanner sc = new Scanner(System.in);
        int str = sc.nextInt();

        if (str == 1) {
            System.out.println("Vous ne pouvez que retirer de l'argent");
            retirer();
        }

        if (str == 2) {
            System.out.println("\t- Que souhaitez-vous faire ? -\n");

            System.out.println("1. Retirer");
            System.out.println("2. Déposer");
            System.out.println("3. Consulter compte");

            System.out.println("\nSaisissez le numéro correspond à votre choix :");
        }
        
   
        
    }

    public void utiliser() {

        Scanner scChoix = new Scanner(System.in);
        int str = scChoix.nextInt();

        switch (str) {
            case 1:
                retirer();
                break;
            case 2:
                deposer();
                break;
            case 3:
                voirCompte();
                break;
            default:
                System.out.println("CHOIX IMPOSSIBLE");
        }

    }

    public void retirer() {

        Scanner retirer = new Scanner(System.in);
        System.out.println("Combien d'argent voulez-vous retirer ?");
        String str2 = retirer.nextLine();
        System.out.println("Vous avez retiré " + str2 + " euros.");
    }

    public void deposer() {

        Scanner deposer = new Scanner(System.in);
        System.out.println("Insérez de l'argent à déposer sur votre compte : ");
        String str1 = deposer.nextLine();
        System.out.println("Vous avez déposé " + str1 + " euros.");
    }

    public void voirCompte() {

        System.out.println("-- VOTRE COMPTE --\n");
        System.out.println("Vous avez " + compte.getSolde() + " euros sur votre compte.");

    }
}
