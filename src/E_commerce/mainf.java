package E_commerce;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class mainf {
    public static void main(String[] args) {
        try{
            Connection con = DatabaseConnection.getConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from products");
            ResultSetMetaData rsmd = rs.getMetaData();
            System.out.println("Hello "+ rsmd.getColumnCount());
//            System.out.println("Hello" + rsmd.getRowCount());
            while(rs.next()){
                System.out.println("id : "+rs.getInt("id")+ " name: "+rs.getString("name"));
            }
            con.close();
        }
        catch (Exception e){
            System.out.println("aa");
            e.printStackTrace();
        }
    }
}
