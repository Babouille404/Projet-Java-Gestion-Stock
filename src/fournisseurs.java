import javax.swing.*;
import java.util.Scanner;
import java.util.ArrayList;

public class fournisseurs extends JFrame {

    private String identifiant;

    public fournisseurs(String identifiant) {
        this.identifiant = identifiant;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public void Consulter() {
        System.out.println("Voici les fournisseurs : " + identifiant);
    }

//    public void Ajouter(){
//    ArrayList<String> fournisseurs = new ArrayList<>();
//    fournisseurs.add(identifiant);
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Veuillez entrer les fournisseurs : ");
//    fournisseurs.add(sc.nextLine());
//    }

//    public static String[] Ajouter(String id){
//        String [] test = new String[id];
//        for (int i = 0; i < id; i++){
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Vas-y dis moi tes fournisseurs ! " + i);
//            test[i] = sc.nextLine();
//        }
//        return test;
//
//    }

//    public static void Ajouter(){
//        ArrayList<String> fournisseurs = new ArrayList<String>();
//        System.out.println("Ajouter le fournisseur : ");
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNextLine()) {
//            fournisseurs.add(sc.nextLine());
//        }
//        System.out.println(String.join(",", fournisseurs));
//
//    }

    public static void Ajouter(){
        ArrayList<String> fournisseurs = new ArrayList();
        String input;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ajouter le fournisseur : ");
        input = sc.nextLine().toLowerCase();
        fournisseurs.add(input);


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

    public static void main(String[] args) {
    fournisseurs f = new fournisseurs("");
    Ajouter();

    }

}