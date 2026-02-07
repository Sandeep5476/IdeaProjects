import java.sql.*;

public class MyJDBC {
    public static void main(String[] args) {

        try{

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/login_schema",
                    "root",
                    "password"
            );
            Statement stmt = con.createStatement();
            ResultSet rs=stmt.executeQuery("SELECT *FROM sandeep");

            while(rs.next()){
                System.out.println(rs.getString("username"));
                System.out.println(rs.getString("password"));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
