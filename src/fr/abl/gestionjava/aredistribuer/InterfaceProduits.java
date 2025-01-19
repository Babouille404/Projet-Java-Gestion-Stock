//package fr.abl.gestionjava.aredistribuer;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//
//
//public class InterfaceProduits {
//
//    public static void afficherPanelProduits() {
//
//        JPanel panelAccueil = new JPanel();
//        JPanel panelProduits = new JPanel();
//
//        CardLayout cl = new CardLayout();
//
//        JButton btnRetour = new JButton("Retour à l'accueil");
//
//        panelAccueil.setLayout(cl);
//
//
//        JPanel panelButtonsProduits = new JPanel();
//        panelButtonsProduits.setLayout(new FlowLayout());
//
//        panelButtonsProduits.add(btnRetour);
//
//        panelProduits.add(panelButtonsProduits, "Retour à l'accueil");
//
//        cl.show(panelAccueil, "Produits");
//
//        //Actions boutons
//        btnRetour.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                cl.show(panelAccueil, "Accueil");                    }
//        });
//
//    }
//
//
//
//
//
//
//
////    public InterfaceProduits() {
//        super();
//        //Initialisation de l'interface :
//        build();
//    }
//
//    private void build() {
//        //Donner un titre et une taille à l'interface
//        setTitle("Produits");
//        setSize(400, 400);
//
//        //Pour centrer l'interface sur l'écran (ne marche pas forcément si on a plusieurs écrans) :
//        setLocationRelativeTo(null);
//
//        //Interdire le redimensionnement de la fenêtre :
//        setResizable(false);
//
//        //Dire à l'application de se fermer lorsqu'on clique sur la croix :
//        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//
//        //Ajouter les boutons à l'interface
//        setContentPane(Boutons());
//    }
//    //Pour créer les boutons
//    private JPanel Boutons() {
//        JPanel panel = new JPanel();
//        panel.setLayout(new FlowLayout());
//
//        JButton AfficherBtn = new JButton("Afficher les produits");
//        panel.add(AfficherBtn);
//
//        JButton ModifierBtn = new JButton("Modifier un produit");
//        panel.add(ModifierBtn);
//
//        JButton SupprimerBtn = new JButton("Supprimer un produit");
//        panel.add(SupprimerBtn);
//
//        return panel;
//    }
//}

