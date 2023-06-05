package E_commerce;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class RetriveData {
    public static void main(String[] args) {
        try{
            //establish a database connection
            Connection con = DatabaseConnection.getConnection();
            Statement stmt = con.createStatement();

            //retrive data from db with condition
            System.out.println("Retrieving data with condition: ");
            String condition = "name LIKE '%fat%'";
            String selectSql = "SELECT * FROM products WHERE "+condition;
            ResultSet rs = stmt.executeQuery(selectSql);

            //process the resultset
            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                System.out.println("ID: "+id + ", Name: "+name);
            }
            con.close();


        }catch (Exception e){
            System.out.println("Unkown error occurred..");
            e.printStackTrace();
        }
    }
}
