import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Produits {
    private String nomProduit;
    private double prixProduit;
    private int qteProduit;

    //Constructeur
    public Produits(String nomProduit, double prixProduit, int qteProduit) {
        this.nomProduit = nomProduit;
        this.prixProduit = prixProduit;
        this.qteProduit = qteProduit;
    }

    //GETTERS
    public String getNomProduit() { return nomProduit; }
    public double getPrixProduit() { return prixProduit; }
    public int getQteProduit() { return qteProduit; }

    //SETTERS
    public void setNomProduit(String newNomProduit){
        this.nomProduit = newNomProduit;
    }
    public void setPrixProduit(double newPrixProduit){
        this.prixProduit = newPrixProduit;
    }
    public void setQteProduit(int newQteProduit){
        this.qteProduit = newQteProduit;
    }

    static ArrayList<Produits> listeProduits = new ArrayList<>();

    //petite liste pour tester, j'ai trouvé cette façon de faire dans un forum pour créer la "base de données"
    //en dehors du main pcq ca me semblait pas pratique/viable sinon.
    static {
        Produits pomme = new Produits("Pomme", 1.50, 50);
        Produits poire = new Produits("Poire", 1.30, 50);
        Produits banane = new Produits("Banane", 0.99, 35);
        Produits fraises = new Produits("Fraises", 2.99, 70);
        Produits abricot = new Produits("Abricot", 1.75, 45);

        listeProduits.add(pomme);
        listeProduits.add(poire);
        listeProduits.add(banane);
        listeProduits.add(fraises);
        listeProduits.add(abricot);
    }

    //Afficher la liste de produits au complet avec ses données complémentaires
    public static void afficherProduits() {
        for (Produits produit : listeProduits) {
            System.out.println("Nom: " + produit.nomProduit + ", Prix: " + produit.prixProduit + "€" + ", Quantité: " + produit.qteProduit +".");
        }
    }

    public static void ajouterProduits() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quel est produit souhaitez-vous ajouter? :");
        String nomTruc = sc.nextLine().toLowerCase();

        System.out.println("Quel est le prix de ce produit? (exemple: 3,10):");
        double prixTruc = sc.nextDouble();

        System.out.println("Quelle est la quantité de ce produit? :");
        int qteTruc = sc.nextInt();

        Produits nouveauProduit = new Produits(nomTruc, prixTruc, qteTruc);
        listeProduits.add(nouveauProduit);
    }

    public static void main (String [] args) {
        ArrayList<Produits> listeProduits = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Voici les produits que nous avons en stock: ");
        afficherProduits();

        ajouterProduits();

        System.out.println("Voici la liste à jour des produits: ");
        afficherProduits();

        System.out.println("Souhaitez-vous ajouter un autre produit? (oui/non)");
        String rajout = sc.nextLine().toLowerCase();
        if(rajout.equals("oui")) {
            ajouterProduits();

            System.out.println("Voici la liste à jour des produits: ");
            afficherProduits();
        }
        else { System.out.println("Merci et à bientôt!");
            }

    }
}