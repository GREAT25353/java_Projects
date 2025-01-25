/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connector;
import java.sql.*;
public class jasper {
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.jdbc.drives");
            String url = "jdbc:mysql://localhost:3306/libraries";
            Connection con = DriverManager.getConnection(url, "root", "root");
            return con;
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
}
