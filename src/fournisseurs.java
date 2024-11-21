import javax.swing.*;
import java.util.Scanner;
import java.util.ArrayList;

public class fournisseurs extends JFrame {

    private String identifiant;
    private ArrayList<String> liste = new ArrayList<>();



//    public fournisseurs(String identifiant, ArrayList<String> liste) {
//        this.identifiant = identifiant;
//        this.liste = liste;
//
//    }


    public ArrayList<String> getFournisseur() {
        return liste;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public void Consulter() {
        System.out.println("Voici les fournisseurs : " + liste);
    }

    public void Ajouter(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ajouter le fournisseur : " );
        String input = sc.nextLine().toLowerCase();
        liste.add(input);



       if (input.length() == 0){
           System.out.println("Bah t'as rien écrit ?");
           Scanner sc1 = new Scanner(System.in);
           System.out.println("Est ce que tu voulais vraiment rajouter un fournisseur ?");
           input = sc1.nextLine().toLowerCase();
           if (input.equalsIgnoreCase("yes")){
               Ajouter();
           } else if (input.equalsIgnoreCase("no")) {
               System.out.println("Bon bah tant pis");

           }
       }
    }

    public void Supprimer() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lequel vous voulez supprimer ? ");
        String input = sc.nextLine().toLowerCase();
        liste.remove(input);

    }

    public void Modifier(){
        Scanner sc = new Scanner(System.in);
        System.out.println(liste);
        System.out.println("Ecrire celui à modifier");
        String input = sc.nextLine().toLowerCase();


    }

    public static void main(String[] args) {
        fournisseurs f = new fournisseurs();
        f.Ajouter();
        f.Consulter();
        f.Ajouter();
        f.Consulter();
        f.Modifier();
        f.Consulter();

    }

}