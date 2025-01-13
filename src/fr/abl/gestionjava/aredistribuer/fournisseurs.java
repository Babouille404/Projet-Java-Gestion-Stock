package fr.abl.gestionjava.aredistribuer;

import javax.swing.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class fournisseurs extends JFrame {

    private JTextField idField;
    private JTextField nameField;


    private void addFournisseur() {
        try {
// Connexion à la base de données
            Connection con =
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/projetjava", "root",
                            "user");

// Préparation de la requête SQL
            String query = "INSERT INTO fournisseur (Id_Fournisseur, Nom_Fournisseur) VALUES (?, ?)";
            PreparedStatement pstmt = con.prepareStatement(query);
// Récupération des données saisies par l'utilisateur
            int id = Integer.parseInt(idField.getText());
            String name = nameField.getText();
// Remplissage des paramètres de la requête SQL
            pstmt.setInt(1, id);
            pstmt.setString(2, name);
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

    private void deleteUser() {
        try {
            // Connexion à la base de données
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/swing", "root", "user");

            // Préparation de la requête SQL
            String query = "DELETE FROM fournisseur WHERE Id_Fournisseur = ?";
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

    private void editFournisseur() {

        try {
            // Connexion à la base de données
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/swing", "root", "user");

            // Préparation de la requête SQL
            String query = "UPDATE FROM fournisseur WHERE Id_Fournisseur = ? SET Nom_Fournisseur = ?";
            PreparedStatement pstmt = con.prepareStatement(query);

            // Récupération de l'ID saisi par l'utilisateur
            int id = Integer.parseInt(idField.getText());
            String name = nameField.getText();

            // Remplissage du paramètre de la requête SQL
            pstmt.setInt(1, id);
            pstmt.setString(2, name);

            // Exécution de la requête SQL
            int rowsAffected = pstmt.executeUpdate();

            // Fermeture des ressources
            pstmt.close();
            con.close();

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





}
