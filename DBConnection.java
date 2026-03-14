

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection getConnection() {

        Connection con = null;

        try {

            con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/studentdb",
            "root",
            "Sairam@123");

            System.out.println("Database Connected");

        } catch (Exception e) {

            System.out.println(e);

        }

        return con;
    }

    public static void main(String[] args) {

        getConnection();
       StudentDAO.addStudent("Aaliya", "ECE", "Aaliya@gmail.com");
    }
}