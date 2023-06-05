package E_commerce;

import java.sql.Connection;
import java.sql.Statement;

public class DeleteData {
    public static void main(String[] args) {
        try {
            //establish a database connection
            Connection con = DatabaseConnection.getConnection();
            Statement stmt = con.createStatement();

            //Delete a data
            System.out.println("Deleting a data....");
            String deleteSql = "DELETE FROM products WHERE id = 1";
            int rowsDeleted = stmt.executeUpdate(deleteSql);
            System.out.println("Rows deleted: " + rowsDeleted);
            con.close();
        } catch (Exception e) {
            System.out.println("Error Occurred....");
            e.printStackTrace();
        }
    }
}