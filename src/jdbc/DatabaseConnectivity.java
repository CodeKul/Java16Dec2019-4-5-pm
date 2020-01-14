package jdbc;

import java.sql.*;
import java.util.Scanner;

public class DatabaseConnectivity {

    void getData() throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");
        Connection con= DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Java16Dec","root","melayer1"
        );
        System.out.println(saveData(con)+" record inserted");
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery("select * from student");
        while (rs.next()){
            System.out.println("Id : "+rs.getInt(1)+"\n"+
                    "Name : "+rs.getString(2)+"\n"+
                    "Address : "+rs.getString(3)+"\n");
        }
        con.close();

    }

    int saveData(Connection con) throws SQLException {
        PreparedStatement pr=con.prepareStatement(
                "insert into student values(?,?,?)");
        System.out.print("Enter id,name and address : ");
        Scanner scanner=new Scanner(System.in);
        pr.setInt(1,scanner.nextInt());
        pr.setString(2,scanner.next());
        pr.setString(3,scanner.next());
        int i=pr.executeUpdate();
        return i;
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        DatabaseConnectivity connectivity=new DatabaseConnectivity();
        connectivity.getData();
    }
}
