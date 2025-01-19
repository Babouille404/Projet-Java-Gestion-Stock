package fr.abl.gestionjava.dao;

import fr.abl.gestionjava.model.Fournisseurs;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class FournisseursQuery extends Component {

    private JTextField idField;
    private JTextField nameField;

public void addFournisseur(Fournisseurs fournisseur) {
    try {
// Connexion à la base de données
        Connection con =
                DriverManager.getConnection("jdbc:mysql://localhost:3306/projetjava", "admin",
                        "admin");

// Préparation de la requête SQL
        String query = "INSERT INTO fournisseur (id_fournisseur, nom_fournisseur, mail_fournisseur, addresse_fournisseur, num_fournisseur) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement pstmt = con.prepareStatement(query);
// Récupération des données saisies par l'utilisateur
        int id = Integer.parseInt(idField.getText());
        String nameFournisseur = nameField.getText();
        String mailFournisseur = nameField.getText();
        String addressFournisseur = nameField.getText();
        String numFournisseur = nameField.getText();
// Remplissage des paramètres de la requête SQL
        pstmt.setInt(1, id);
        pstmt.setString(2, nameFournisseur);
        pstmt.setString(3, mailFournisseur);
        pstmt.setString(4, addressFournisseur);
        pstmt.setString(5, numFournisseur);

// Exécution de la requête SQL
        int rowsAffected = pstmt.executeUpdate();
// Fermeture de la connexion et du PreparedStatement
        pstmt.close();
        con.close();
// Affichage d'un message de succès
        JOptionPane.showMessageDialog(this, "Fournisseur ajouté avec succès!");
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Erreur lors de l'ajout du fournisseur: " + ex.getMessage());
    }
}

    public void delFournisseur(Fournisseurs fournisseur) {
        try {
            // Connexion à la base de données
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/swing", "admin", "admin");

            // Préparation de la requête SQL
            String query = "DELETE FROM fournisseur WHERE id_fournisseur = ?";
            PreparedStatement pstmt = con.prepareStatement(query);

            // Récupération de l'ID saisi par l'utilisateur
            int id = Integer.parseInt(idField.getText());

            // Remplissage du paramètre de la requête SQL
            pstmt.setInt(1, id);

            // Exécution de la requête SQL
            int rowsAffected = pstmt.executeUpdate();

            // Fermeture des ressources
            pstmt.close();
            con.close();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Fournisseur supprimé avec succès !");
            } else {
                JOptionPane.showMessageDialog(this, "Aucun fournisseur trouvé avec cet ID.");
            }
        } catch (SQLException ex) {
            // Gestion des erreurs SQL
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erreur lors de la suppression du fournisseur : " + ex.getMessage());
        } catch (NumberFormatException ex) {
            // Gestion des erreurs de conversion
            JOptionPane.showMessageDialog(this, "Veuillez entrer un ID fournisseur valide.");
        }
    }

    public void updateFournisseur(Fournisseurs fournisseur) {
        try {
// Connexion à la base de données
            Connection con =
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/projetjava", "admin",
                            "admin");

// Préparation de la requête SQL
            String query = "UPDATE INTO Fournisseur (id_fournisseur, nom_fournisseur, mail_fournisseur, addresse_fournisseur, num_fournisseur) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pstmt = con.prepareStatement(query);
// Récupération des données saisies par l'utilisateur
            int id = Integer.parseInt(idField.getText());
            String nameFournisseur = nameField.getText();
            String mailFournisseur = nameField.getText();
            String addressFournisseur = nameField.getText();
            String numFournisseur = nameField.getText();
// Remplissage des paramètres de la requête SQL
            pstmt.setInt(1, id);
            pstmt.setString(2, nameFournisseur);
            pstmt.setString(3, mailFournisseur);
            pstmt.setString(4, addressFournisseur);
            pstmt.setString(5, numFournisseur);

// Exécution de la requête SQL
            int rowsAffected = pstmt.executeUpdate();
// Fermeture de la connexion et du PreparedStatement
            pstmt.close();
            con.close();
// Affichage d'un message de succès
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Fournisseur modifié avec succès !");
            } else {
                JOptionPane.showMessageDialog(this, "Aucun fournisseur trouvé avec cet ID.");
            }
        } catch (SQLException ex) {
            // Gestion des erreurs SQL
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erreur lors de la modification du fournisseur : " + ex.getMessage());
        } catch (NumberFormatException ex) {
            // Gestion des erreurs de conversion
            JOptionPane.showMessageDialog(this, "Veuillez entrer un ID fournisseur valide.");
        }
    }

//    public void showFournisseurs() {
//        try {
//// Connexion à la base de données
//            Connection con =
//                    DriverManager.getConnection("jdbc:mysql://localhost:3306/projetjava", "root",
//                            "user");
//
//// Préparation de la requête SQL
//            String query = "SELECT * FROM fournisseur WHERE Id_Fournisseur = ? (Id_Fournisseur) VALUES (?)";
//            PreparedStatement pstmt = con.prepareStatement(query);
//// Récupération des données saisies par l'utilisateur
//            int id = Integer.parseInt(idField.getText());
//
//// Remplissage des paramètres de la requête SQL
//            pstmt.setInt(1, id);
//
//// Exécution de la requête SQL
//            int rowsAffected = pstmt.executeUpdate();
//// Fermeture de la connexion et du PreparedStatement
//            pstmt.close();
//            con.close();
//// Affichage d'un message de succès
//            JOptionPane.showMessageDialog(this, "Fournisseur ajouté avec succès!");
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//            JOptionPane.showMessageDialog(this, "Erreur lors de l'ajout du fournisseur: " + ex.getMessage());
//        }
//
//    }
}




