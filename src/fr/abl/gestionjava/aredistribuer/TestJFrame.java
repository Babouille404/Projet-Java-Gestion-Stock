package fr.abl.gestionjava.aredistribuer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestJFrame {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/projetjava", "root", "root");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("show databases;");
            System.out.println("Connected");
        } catch (Exception e) {
            System.out.println(e);
        }

        SwingUtilities.invokeLater(new Runnable() {
            public void run (){

                //Fenêtre principale
                JFrame frame = new JFrame("Gestionnaire de stocks");

                //Choisir la taille de la fenêtre
                frame.setSize(400, 400);

                //Pour centrer l'interface sur l'écran (ne marche pas forcément si on a plusieurs écrans) :
                frame.setLocationRelativeTo(null);

                //Interdire le redimensionnement de la fenêtre :
                frame.setResizable(false);


                JPanel panelAccueil = new JPanel();
                JPanel panelProduits = new JPanel();
                JPanel panelFournisseurs = new JPanel();
                JPanel panelVentes = new JPanel();
                JPanel panelRapports = new JPanel();

                JButton produitsBtn = new JButton("Produits");
                JButton fournisseursBtn = new JButton("Fournisseurs");
                JButton ventesBtn = new JButton("Ventes");
                JButton rapportsBtn = new JButton("Rapports");

                CardLayout cl = new CardLayout();
                panelAccueil.setLayout(cl);

                JPanel panelButtonsAccueil = new JPanel();
                panelButtonsAccueil.setLayout(new FlowLayout());

                panelButtonsAccueil.add(produitsBtn);
                panelButtonsAccueil.add(fournisseursBtn);
                panelButtonsAccueil.add(ventesBtn);
                panelButtonsAccueil.add(rapportsBtn);

                panelAccueil.add(panelButtonsAccueil, "Accueil");
                panelAccueil.add(panelProduits, "Produits");
                panelAccueil.add(panelFournisseurs, "Fournisseurs");
                panelAccueil.add(panelVentes, "Ventes");
                panelAccueil.add(panelRapports, "Rapports");

                cl.show(panelAccueil, "Accueil");

                //Actions boutons
                produitsBtn.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        cl.show(panelAccueil, "Produits");                    }
                });
                fournisseursBtn.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        cl.show(panelAccueil, "Fournisseurs");
                    }
                });
                ventesBtn.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        cl.show(panelAccueil, "Ventes");
                    }
                });
                rapportsBtn.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        cl.show(panelAccueil, "Rapports");
                    }
                });

                panelProduits.setLayout(new BorderLayout());
                panelFournisseurs.setLayout(new BorderLayout());
                panelVentes.setLayout(new BorderLayout());
                panelRapports.setLayout(new BorderLayout());

                //Msg test
                panelProduits.add(new JLabel("Panneau Produits", JLabel.CENTER), BorderLayout.CENTER);
                panelFournisseurs.add(new JLabel("Fournisseurs", JLabel.CENTER), BorderLayout.CENTER);
                panelVentes.add(new JLabel("Panneau Ventes", JLabel.CENTER), BorderLayout.CENTER);
                panelRapports.add(new JLabel("Panneau Rapports", JLabel.CENTER), BorderLayout.CENTER);

                //Finaliser l'interface
                frame.add(panelAccueil);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setVisible(true);

            }
        });
    }
}
