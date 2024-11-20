import java.util.Scanner;

public class Produits {
    private String nomProduit;
    private double prixProduit;
    private int quantiteProduit;

    //Constructeur
    public Produits(String nomProduit, double prixProduit, int quantiteProduit) {
        this.nomProduit = nomProduit;
        this.prixProduit = prixProduit;
        this.quantiteProduit = quantiteProduit;
    }

    //GETTERS
    public String getNomProduit() {
        return nomProduit;
    }
    public double getPrixProduit() {
        return prixProduit;
    }
    public int getQuantiteProduit() {
        return quantiteProduit;
    }

    //SETTERS
    public void setNomProduit(String newNomProduit){
        this.nomProduit = newNomProduit;
    }
    public void setPrixProduit(double newPrixProduit){
        this.prixProduit = newPrixProduit;
    }
    public void setQuantiteProduit(int newQuantiteProduit){
        this.quantiteProduit = newQuantiteProduit;
    }

    //Méthode pour afficher les détails du produit
    public static void AfficherProduits(String nomProduit, double prixProduit, int quantiteProduit){
        System.out.println("Le nom du produit est " + nomProduit + ".");
        System.out.println("Le prix du produit est " + prixProduit + ".");
        System.out.println("Il reste " + quantiteProduit + "produits.");
    }

    public static void main (String [] args) {
        Produits p = new Produits("oui", 20, 10);

        p.AfficherProduits("oui",20,10);

    }




}