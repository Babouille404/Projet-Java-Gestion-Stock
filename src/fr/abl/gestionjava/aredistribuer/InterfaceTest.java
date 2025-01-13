package fr.abl.gestionjava.aredistribuer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.*;
import java.awt.*;


public class InterfaceTest extends JFrame {

    public InterfaceTest() {
        super();
        //Initialisation de l'interface :
        build();

        //panelCont.setLayout(CardLayoutFournisseurs);

    }


    private void build() {
        //Donner un titre et une taille à l'interface
        setTitle("Gestionnaire de stock");
        setSize(400, 400);

        //Pour centrer l'interface sur l'écran (ne marche pas forcément si on a plusieurs écrans) :
        setLocationRelativeTo(null);

        //Interdire le redimensionnement de la fenêtre :
        setResizable(false);

        //Dire à l'application de se fermer lorsqu'on clique sur la croix :
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        //Ajouter les boutons à l'interface
        setContentPane(Boutons());
    }
        //Pour créer les boutons
        private JPanel Boutons() {
            JPanel panel = new JPanel();
            panel.setLayout(new FlowLayout());

            JButton ProduitsBtn = new JButton("Produits");
            panel.add(ProduitsBtn);

            ProduitsBtn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    openProduits();
                }
            });

            JButton FournisseursBtn = new JButton("Fournisseurs");
            panel.add(FournisseursBtn);
//            JPanel panelContent = new JPanel();
//            JPanel panelFournisseurs = new JPanel();
//            panelFournisseurs.setLayout(new FlowLayout());
//            JButton FournisseursBtnAdd = new JButton("Ajouter");
//            JButton FournisseursBtnRemove = new JButton("Supprimer");
//            JButton FournisseursBtnEdit = new JButton("Modifier");
//            JButton FournisseursBtnShow = new JButton("Afficher");
//            JButton FournisseursBtnRetour = new JButton("Retour");
//            CardLayout CardLayoutFournisseurs = new CardLayout();
//
//            panelFournisseurs.add(FournisseursBtnAdd);
//            panelFournisseurs.add(FournisseursBtnRemove);
//            panelFournisseurs.add(FournisseursBtnEdit);
//            panelFournisseurs.add(FournisseursBtnShow);
//            panelFournisseurs.add(FournisseursBtnRetour);
//            panel.add(panelFournisseurs, CardLayoutFournisseurs);
//
//            panelContent.setLayout(CardLayoutFournisseurs);
//            panelContent.add(panel, "1");
//            panelContent.add(panelFournisseurs, "2");
//            CardLayoutFournisseurs.show(panelFournisseurs, "1");
//
//            FournisseursBtn.addActionListener(new ActionListener() {
//                public void actionPerformed(ActionEvent e) {
//                    CardLayoutFournisseurs.show(panelFournisseurs, "2");
//                }
//            });
//
//            FournisseursBtnRetour.addActionListener(new ActionListener() {
//                public void actionPerformed(ActionEvent e) {
//                    CardLayoutFournisseurs.show(panel, "1");
//                }
//            });



            JButton VentesBtn = new JButton("Ventes");
            panel.add(VentesBtn);

            JButton RapportsBtn = new JButton("Rapports");
            panel.add(RapportsBtn);

            return panel;
        }

        private void openProduits() {
            //Pour ouvrir une nouvelle fenêtre en gros on rend visible celle qu'on veut
            // ouvrir et on rend invisible la précédente mais je suis pas sure que ca fonctionne sur
            // le long
            //update: ca ne ferme meme pas la fenetre derriere en fait :(
            InterfaceProduits framePdt = new InterfaceProduits();
            framePdt.setVisible(true);
            InterfaceTest frameAcc = new InterfaceTest();
            frameAcc.setVisible(false);  // Ferme la fenêtre précédente
        }




    }






