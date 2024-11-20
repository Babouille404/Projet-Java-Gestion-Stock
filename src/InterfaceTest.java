import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;

public class InterfaceTest extends JFrame {

    public InterfaceTest() {
        super();
        //Initialisation de l'interface :
        build();
    }

    private void build() {
        //Donner un titre et une taille à l'interface
        setTitle("Interface gestion de stock");
        setSize(400, 400);

        //Pour centrer l'interface sur l'écran (ne marche pas forcément si on a plusieurs écrans) :
        setLocationRelativeTo(null);

        //Interdire le redimensionnement de la fenêtre :
        setResizable(false);

        //Dire à l'application de se fermer lorsqu'on clique sur la croix :
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Ajouter les boutons à l'interface
        setContentPane(Boutons());
    }
        //Pour créer les boutons (qui pour l'instant ne mènent à rien)
        private JPanel Boutons() {
            JPanel panel = new JPanel();
            panel.setLayout(new FlowLayout());

            JButton bouton1 = new JButton("Produits");
            panel.add(bouton1);

            JButton bouton2 = new JButton("Fournisseurs");
            panel.add(bouton2);

            JButton bouton3 = new JButton("Ventes");
            panel.add(bouton3);

            JButton bouton4 = new JButton("Rapports");
            panel.add(bouton4);

            return panel;
        }
    }




