import java.util.Scanner;
import java.util.ArrayList;

public class fournisseurs {

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

    public void Ajouter(){
    ArrayList<String> fournisseurs = new ArrayList<>();
    fournisseurs.add(identifiant);
    Scanner sc = new Scanner(System.in);
    System.out.println("Veuillez entrer les fournisseurs : ");
    fournisseurs.add(sc.nextLine());
    }

    public static void main(String[] args) {
    fournisseurs f = new fournisseurs("");
    f.Ajouter();
    f.Consulter();
    }

}