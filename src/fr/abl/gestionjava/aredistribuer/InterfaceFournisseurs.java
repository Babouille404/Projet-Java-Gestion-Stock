package fr.abl.gestionjava.aredistribuer;

import javax.swing.*;
import java.awt.*;


public class InterfaceFournisseurs extends JFrame {

    JFrame frameFournisseurs = new JFrame();
    JPanel panelFournisseurs = new JPanel();
    JButton BtnAdd = new JButton("Ajouter");
    JButton BtnRemove = new JButton("Supprimer");
    JButton BtnUpdate = new JButton("Modifier");
    JButton BtnView = new JButton("Afficher");
    CardLayout clFournisseurs = new CardLayout();

    public InterfaceFournisseurs() {
        panelFournisseurs.setLayout(clFournisseurs);
        panelFournisseurs.add(BtnAdd, "Ajouter");
        panelFournisseurs.add(BtnRemove, "Supprimer");
        panelFournisseurs.add(BtnUpdate, "Modifier");
        panelFournisseurs.add(BtnView, "Afficher");


        panelFournisseurs.add(panelFournisseurs, "2");


    }
}

