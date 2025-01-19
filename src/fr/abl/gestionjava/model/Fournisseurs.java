package fr.abl.gestionjava.model;

public class Fournisseurs {

private int IdFournisseur;
private String NomFournisseur;
private String AdresseFournisseur;
private String EmailFournisseur;
private String TelephoneFournisseur;

public Fournisseurs(int id, String nom) {
    this.IdFournisseur = id;
    this.NomFournisseur = nom;
    this.AdresseFournisseur = "";
    this.EmailFournisseur = "";
    this.TelephoneFournisseur = "";


}
public int getIdFournisseur() {
    return IdFournisseur;
}
public void setIdFournisseur(int IdFournisseur) {
    this.IdFournisseur = IdFournisseur;
}
public String getNomFournisseur() {
    return NomFournisseur;
}
public void setNomFournisseur(String NomFournisseur) {
    this.NomFournisseur = NomFournisseur;
}
public String getAdresseFournisseur() {
    return AdresseFournisseur;
}
public void setAdresseFournisseur(String AdresseFournisseur) {
    this.AdresseFournisseur = AdresseFournisseur;
}
public String getEmailFournisseur() {
    return EmailFournisseur;
}
public void setEmailFournisseur(String EmailFournisseur) {
    this.EmailFournisseur = EmailFournisseur;
}
public String getTelephoneFournisseur() {
    return TelephoneFournisseur;
}
public void setTelephoneFournisseur(String TelephoneFournisseur) {
    this.TelephoneFournisseur = TelephoneFournisseur;
}

//Pour contrôler les sorties SQL si JFrame fonctionne pas !!
@Override
    public String toString() {
    return "Ton fournisseur est : " + this.IdFournisseur + " son nom est : " + this.NomFournisseur
            + " et ses infos sont : " + this.EmailFournisseur + "," + this.AdresseFournisseur + "," + this.TelephoneFournisseur;
}

}
