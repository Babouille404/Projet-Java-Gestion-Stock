import javax.swing.*;
import java.nio.channels.ClosedSelectorException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.ArrayList;
import java.sql.Statement;
import java.sql.*;

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


    //Ajouter
    public void Ajouter(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ajouter le fournisseur : " );
        String input = sc.nextLine().toLowerCase();
        liste.add(input);



        //Si la personne n'écrit rien, ça renvoit à un question !
       if (input.length() == 0){
           System.out.println("Bah t'as rien écrit ?");
           Scanner sc1 = new Scanner(System.in);
           System.out.println("Est ce que tu voulais vraiment rajouter un fournisseur ?");
           input = sc1.nextLine().toLowerCase();

           //Si il veut vraiment faut répondre yes
           if (input.equalsIgnoreCase("yes")){
               Ajouter();
           }
           //Sinon il mets no et ça annule tout
           else if (input.equalsIgnoreCase("no")) {
               System.out.println("Bon bah tant pis");

           }
       }
    }

    //Pour supprimer un objet de la liste
    public void Supprimer() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lequel vous voulez supprimer ? ");
        String input = sc.nextLine().toLowerCase();
        liste.remove(input);

    }

    //Pour modifier un objet de la liste
    public void Modifier(){
        Scanner sc = new Scanner(System.in);
        System.out.println(liste); //Pour pouvoir avoir les noms des fournisseurs avant de savoir lequel modifier
        System.out.println("Ecrire celui à modifier");
        String input = sc.nextLine().toLowerCase();
        System.out.println("Tu es bien sûr de vouloir modifier celui là ? ");
        input = sc.nextLine().toLowerCase();

        if (input.equalsIgnoreCase("oui")){
            System.out.println("Vas-y fais la modification !");
            int valeur = liste.indexOf(input);
            if (valeur != -1) {
                System.out.print("Entrez la nouvelle valeur : ");
                String modif = sc.nextLine();

                liste.set(valeur, modif);
                System.out.println("La liste modifiée : " + liste);
            } else {
                System.out.println("L'élément n'a pas été trouvé dans la liste.");
            }
            System.out.println("La modification a bien été prise en compte ! ");
        } else if (input.equalsIgnoreCase("non")) {
            System.out.println("Bon bah retour à la case départ :) ");

        }


    }

    public static void main(String[] args) {

    try{
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/projetjava",
                "root",
                "user"
        );

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM FOURNISSEUR");

        while(resultSet.next()){
            System.out.println(resultSet.getString("nomFournisseur"));
        }
    } catch (SQLException e){
        e.printStackTrace();
    }

    }

}