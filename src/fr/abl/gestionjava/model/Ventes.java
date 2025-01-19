package fr.abl.gestionjava.model;

public class Ventes {
    private int idVente;
    private String nomVente;

public Ventes(int id, String nom) {
    this.idVente = id;
    this.nomVente = nom;
}
    //getter et setter classe vente
public int getIdVente() { return idVente;}
public void setIdVente (int idVente) {this.idVente = idVente;}
public String getNomVente() {return nomVente;}
public void setNomVente(String nomVente){
    this.nomVente = nomVente;
    }
}

