package E_commerce;

import java.sql.Connection;
import java.sql.Statement;

public class UpdateData {
    public static void main(String[] args) {
        try{
            //establish a database connection
            Connection con = DatabaseConnection.getConnection();
            Statement stmt = con.createStatement();

            //update a record
            System.out.println("Updating a record.....");
            String updateSql = "UPDATE products SET name = 'Sad' WHERE id = '5' ";
            int rowsUpdated  = stmt.executeUpdate(updateSql);
            System.out.println("Rows updated: " + rowsUpdated);
            con.close();

        }catch (Exception e){
            System.out.println("Unknown Error Occurred..");
            e.printStackTrace();
        }
    }
}
