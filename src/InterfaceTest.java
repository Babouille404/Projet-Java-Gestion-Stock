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






