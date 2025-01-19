package fr.abl.gestionjava.model;

public class Produits {
    private int idProduit;
    private String nomProduit;
    private double prixProduit;
    private int qteProduit;
    private String fournisseurProduit;

    public Produits(int id, String nom) {
        this.idProduit = id;
        this.nomProduit = nom;
        this.prixProduit = 0;
        this.qteProduit = 0;
        this.fournisseurProduit = "";
    }

        // Getters and Setters
        public int getIdProduit() { return idProduit; }
        public void setIdProduit(int idProduit) { this.idProduit = idProduit; }

        public String getNomProduit() { return nomProduit; }
        public void setNomProduit(String nomProduit) { this.nomProduit = nomProduit; }

        public double getPrixProduit() { return prixProduit; }
        public void setPrixProduit(double prixProduit) { this.prixProduit = prixProduit; }

        public int getQteProduit() { return qteProduit; }
        public void setQteProduit(int qteProduit) { this.qteProduit = qteProduit; }

        public String getFournisseurProduit() { return fournisseurProduit; }
        public void setFournisseurProduit(String fournisseurProduit) { this.fournisseurProduit = fournisseurProduit; }
}

