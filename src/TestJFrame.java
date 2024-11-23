import javax.swing.*;

//Classe pour permettre à l'interface de run!!

public class TestJFrame {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run (){

                //Créer une nouvelle instance de notre fenêtre :
                InterfaceTest frame = new InterfaceTest();

                //La rendre visible :
                frame.setVisible(true);
            }
        });
    }
}
