package E_commerce;

import java.sql.Connection;
import java.sql.Statement;

public class InsertData {
    public static void main(String[] args) {
        try{
            Connection con = DatabaseConnection.getConnection();
            Statement stmt = con.createStatement();
            System.out.println("Inserting records into the table...");
            String sql;
            sql = "INSERT INTO products VALUES (NULL,'Fatma')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO products VALUES (NULL,'Happy')";
            stmt.executeUpdate(sql);
            con.close();

        }
        catch (Exception e){
            System.out.println("aa");
            e.printStackTrace();
        }
    }
}
