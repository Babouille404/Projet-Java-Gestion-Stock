package fr.abl.gestionjava.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.JOptionPane;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

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
                //panelProduits.add(new JLabel("Panneau Produits", JLabel.CENTER), BorderLayout.CENTER);
                //panelFournisseurs.add(new JLabel("Fournisseurs", JLabel.CENTER), BorderLayout.CENTER);
                panelVentes.add(new JLabel("Panneau Ventes", JLabel.CENTER), BorderLayout.CENTER);
                panelRapports.add(new JLabel("Panneau Rapports", JLabel.CENTER), BorderLayout.CENTER);

                //Finaliser l'interface
                frame.add(panelAccueil);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setVisible(true);


                //Partie Fournisseur
                JButton addFournisseurs = new JButton("Ajouter");
                JButton delFournisseurs = new JButton("Supprimer");
                JButton updateFournisseurs = new JButton("Modifier");
                JButton showFournisseurs = new JButton("Afficher");
                JButton retourBtnFournisseur = new JButton("Retour");
                JButton ValidationTest = new JButton("Validation");

                JLabel idLabelFournisseurs = new JLabel("ID : ");
                JTextField idFournisseurs = new JTextField(10);
                JLabel nameLabelFournisseurs = new JLabel("Nom : ");
                JTextField nameFournisseurs = new JTextField(10);
                JLabel adresseLabelFournisseurs = new JLabel("Adresse : ");
                JTextField adresseFournisseurs = new JTextField(10);
                JLabel telLabelFournisseurs = new JLabel("Tel : ");
                JTextField telFournisseurs = new JTextField(10);
                JLabel emailLabelFournisseurs = new JLabel("Email : ");
                JTextField emailFournisseurs = new JTextField(10);



                CardLayout clFournisseurs = new CardLayout();
                panelFournisseurs.setLayout(clFournisseurs);

                panelFournisseurs.setLayout(new FlowLayout());

                //Zone de texte
                panelFournisseurs.add(idLabelFournisseurs);
                panelFournisseurs.add(idFournisseurs);
                panelFournisseurs.add(nameLabelFournisseurs);
                panelFournisseurs.add(nameFournisseurs);
                panelFournisseurs.add(adresseLabelFournisseurs);
                panelFournisseurs.add(adresseFournisseurs);
                panelFournisseurs.add(telLabelFournisseurs);
                panelFournisseurs.add(telFournisseurs);
                panelFournisseurs.add(emailLabelFournisseurs);
                panelFournisseurs.add(emailFournisseurs);

                //Boutons
                panelFournisseurs.add(addFournisseurs);
                panelFournisseurs.add(delFournisseurs);
                panelFournisseurs.add(updateFournisseurs);
                panelFournisseurs.add(showFournisseurs);
                panelFournisseurs.add(retourBtnFournisseur);
                panelFournisseurs.add(ValidationTest);


                //Action des boutons Fournisseurs

                addFournisseurs.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {}
                });
                delFournisseurs.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {}
                });
                updateFournisseurs.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {}
                });
                showFournisseurs.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {}
                });
                retourBtnFournisseur.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {cl.show(panelAccueil, "Accueil");}
                });




                //Validation des données

                ValidationTest.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String input = telFournisseurs.getText();
                        if (input.length() == 10) {
                            JOptionPane.showMessageDialog(frame, "C'est bon ! ");
                        }
                        else {
                            JOptionPane.showMessageDialog(frame, "Il faut que ce soit 10 caractères ! ");
                        }
                    }
                });

//                integerField.getDocument().setDocumentFilter(new IntegerDocumentFilter());
//
//                private boolean isInteger(String texte) {
//                    return texte.matches("");
//                }
//
//                class IntegerDocumentFilter extends DocumentFilter {
//                    @Override
//                    public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
//                        if (isInteger(String texte)) {
//                            super.insertString(fb, offset, string, attr);
//                        }
//                    }
//                }





                //Partie Produits
                JButton addProduits = new JButton("Ajouter");
                JButton delProduits = new JButton("Supprimer");
                JButton updateProduits = new JButton("Modifier");
                JButton showProduits = new JButton("Afficher");
                JButton retourBtnProduits = new JButton("Retour");

                JLabel idLabelProduits = new JLabel("ID : ");
                JTextField idProduits = new JTextField(10);
                JLabel nomLabelProduits = new JLabel("Nom : ");
                JTextField nomProduits = new JTextField(20);
                JLabel prixLabelProduits = new JLabel("Prix : ");
                JTextField prixProduits = new JTextField(10);
                JLabel qteLabelProduits = new JLabel("Quantité : ");
                JTextField qteProduits = new JTextField(4);
                JLabel fournisseursLabelProduits = new JLabel("Fournisseur : ");
                JTextField fournisseursProduits = new JTextField(20);

                CardLayout clProduits = new CardLayout();
                panelProduits.setLayout(clProduits);

                panelProduits.setLayout(new FlowLayout());

                panelProduits.add(idLabelProduits);
                panelProduits.add(idProduits);
                panelProduits.add(nomLabelProduits);
                panelProduits.add(nomProduits);
                panelProduits.add(prixLabelProduits);
                panelProduits.add(prixProduits);
                panelProduits.add(qteLabelProduits);
                panelProduits.add(qteProduits);
                panelProduits.add(fournisseursLabelProduits);
                panelProduits.add(fournisseursProduits);

                panelProduits.add(addProduits);
                panelProduits.add(delProduits);
                panelProduits.add(updateProduits);
                panelProduits.add(showProduits);
                panelProduits.add(retourBtnProduits);


                //Action des boutons Produits

                retourBtnProduits.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {cl.show(panelAccueil, "Accueil");}
                });



            }

        });
    }
}
