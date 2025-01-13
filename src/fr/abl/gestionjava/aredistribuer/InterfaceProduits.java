package fr.abl.gestionjava.aredistribuer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;



public class InterfaceProduits extends JFrame {

    public InterfaceProduits() {
        super();
        //Initialisation de l'interface :
        build();
    }

    private void build() {
        //Donner un titre et une taille à l'interface
        setTitle("Produits");
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

        JButton AfficherBtn = new JButton("Afficher les produits");
        panel.add(AfficherBtn);

        JButton ModifierBtn = new JButton("Modifier un produit");
        panel.add(ModifierBtn);

        JButton SupprimerBtn = new JButton("Supprimer un produit");
        panel.add(SupprimerBtn);

        return panel;
    }
}

