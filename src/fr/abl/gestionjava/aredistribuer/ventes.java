package fr.abl.gestionjava.aredistribuer;

import javax.swing.*;
import java.sql.DriverManager;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class ventes extends JFrame {
    private JTextField idfield;
    private JTextField namefield;

            private void addVentes() {
                try {
//connection a la base de données sql
                    Connection con =
                            DriverManager.getConnection("jdbc:mysql://localhost:3306/projetjava", "root", "user");

//requete sql
                    String query = "insert into ventes (id-ventes, name_ventes) VALUES(?, ?)";
                    PreparedStatement pstmt = con.prepareStatement(query);

//Récupération des données saisies par l'utilisateur
                    int id = Integer.parseInt(idfield.getText());
                    String name = namefield.getText();

//Remplissage des paramètres de la requete SQL
                    pstmt.setInt(1, id);
                    pstmt.setString(2, name);

// Exécution de la requete SQL
                    int rowsAffected = pstmt.executeUpdate();

//Fermeture de la connexion et du PreparedStatement
                    pstmt.close();
                    con.close();

//Affichage d'un message de succès ou d'erreur
                    JOptionPane.showMessageDialog(this, "Ventes ajouté avec succès");

                } catch (SQLException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(this, "Erreur lors de l'ajout de la ventes" + ex.getMessage());
                }

            }
}
