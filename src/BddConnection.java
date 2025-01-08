import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class BddConnection {

    //test de connection avec la bdd, j'ai reprit celle du tp bien sûr j'suis pas si fort
        public static void main(String[] args) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/projetjava", "root", "user");
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("show databases;");
                System.out.println("Connected");
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

