package fr.abl.gestionjava.dao;

import fr.abl.gestionjava.model.Produits;
import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProduitsQuery extends Component {

    private JTextField idField;
    private JTextField nameField;

    public void addProduit(Produits produits) {
        try {
            Connection con =
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/projetjava", "admin", "admin");

            // Préparation de la requête SQL

            String query = "INSERT INTO Produits (id_produit, nom_produit, prix_produit, qte_produit, fournisseur_produit) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pstmt = con.prepareStatement(query);

            // Récupération des données saisies par l'utilisateur
            int idProduit = Integer.parseInt(idField.getText());
            String nomProduit = nameField.getText();
            Double prixProduit = Double.parseDouble(idField.getText());
            int qteProduit = Integer.parseInt(idField.getText());
            ;
            String fournisseurProduit = nameField.getText();

            // Remplissage des paramètres de la requête SQL
            pstmt.setInt(1, idProduit);
            pstmt.setString(2, nomProduit);
            pstmt.setDouble(3, prixProduit);
            pstmt.setInt(4, qteProduit);
            pstmt.setString(5, fournisseurProduit);

            // Exécution de la requête SQL
            int rowsAffected = pstmt.executeUpdate();
            // Fermeture de la connexion et du PreparedStatement
            pstmt.close();
            con.close();
            // Affichage d'un message de succès
            JOptionPane.showMessageDialog(this, "Produit ajouté avec succès!");
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erreur lors de l'ajout du produit: " + ex.getMessage());
        }
    }
}