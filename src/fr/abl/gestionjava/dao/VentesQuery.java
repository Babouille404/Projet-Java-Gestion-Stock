package fr.abl.gestionjava.dao;

import fr.abl.gestionjava.model.Ventes;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class VentesQuery extends Component {
        private JTextField idfield;
        private JTextField namefield;

                public void addVentes(Ventes vente) {
                    try {
    //connection a la base de données sql
                        Connection con =
                                DriverManager.getConnection("jdbc:mysql://localhost:3306/projetjava", "admin", "admin");

    //requete sql
                        String query = "insert into Ventes (id_ventes, name_ventes) VALUES(?, ?)  "  ;
                        PreparedStatement pstmt = con.prepareStatement(query);

    //Récupération des données saisies par l'utilisateur
                        int id = Integer.parseInt(idfield.getText());
                        String nameVentes = namefield.getText();



    //Remplissage des paramètres de la requete SQL
                        pstmt.setInt(1, id);
                        pstmt.setString(2, nameVentes);

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

