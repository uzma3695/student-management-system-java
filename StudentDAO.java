import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;

public class StudentDAO {

    public static void addStudent(String name, String branch, String email) {

        try {
            Connection con = DBConnection.getConnection();

            String query = "INSERT INTO students(name, branch, email) VALUES (?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, name);
            ps.setString(2, branch);
            ps.setString(3, email);

            ps.executeUpdate();

            System.out.println("Student Added Successfully!");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void viewStudents() {

        try {
            Connection con = DBConnection.getConnection();

            String query = "SELECT * FROM students";

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            System.out.println("\nID | Name | Branch | Email");
            System.out.println("------------------------------");

            while (rs.next()) {

                System.out.println(
                        rs.getInt("id") + " | " +
                        rs.getString("name") + " | " +
                        rs.getString("branch") + " | " +
                        rs.getString("email"));
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void deleteStudent(int id) {

        try {
            Connection con = DBConnection.getConnection();

            String query = "DELETE FROM students WHERE id=?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            if(rows > 0){
                System.out.println("Student Deleted Successfully!");
            }
            else{
                System.out.println("Student Not Found!");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void updateStudent(int id, String name, String branch, String email) {

    try {
        Connection con = DBConnection.getConnection();

        String query = "UPDATE students SET name=?, branch=?, email=? WHERE id=?";

        PreparedStatement ps = con.prepareStatement(query);

        ps.setString(1, name);
        ps.setString(2, branch);
        ps.setString(3, email);
        ps.setInt(4, id);

        int rows = ps.executeUpdate();

        if(rows > 0){
            System.out.println("Student Updated Successfully!");
        }
        else{
            System.out.println("Student Not Found!");
        }

    } catch (Exception e) {
        System.out.println(e);
    }
}
}