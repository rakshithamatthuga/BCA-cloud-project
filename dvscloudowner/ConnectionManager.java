package dvscloudowner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConnectionManager{
    private static String url="jdbc:mysql://localhost:3306/college";
    private static String driverName="com.mysql.jdbc.Driver";
    private static String username="root";
    private static String password="root";
    private static  Connection con;
    public static Connection getConnection(){
        try{
            Class.forName(driverName);
            try{
                con=DriverManager.getConnection(url,username,password);
        }catch(SQLException ex){
            System.out.println("Failed to create the database");
        }
    }catch(ClassNotFoundException ex){
        System.out.println("driver not found");
    }
        return con;
    }
}

    
            
       

