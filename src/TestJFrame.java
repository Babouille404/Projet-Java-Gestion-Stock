import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//Classe pour permettre à l'interface de run!!

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

                //Créer une nouvelle instance de notre fenêtre :
                InterfaceTest frameAccueil = new InterfaceTest();

                //La rendre visible :
                frameAccueil.setVisible(true);

                InterfaceTest frameProduits = new InterfaceTest();

                frameAccueil.setVisible(true);
            }
        });
    }
}
