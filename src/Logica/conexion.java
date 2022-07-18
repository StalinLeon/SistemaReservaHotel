/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author stalin
 */
public class conexion {
    public String db="basereserva";
    public String url="jdbc:mysql://localhost/"+db;
    public String user = "root";
    public String pass = "";
    
    
    public conexion(){
        
    }
    
    public Connection conectar() {
        Connection connection=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("show databases;");
            System.out.println("Connected");
        } catch (Exception e) {
            System.out.println(e);
        }
        return connection;
    }
    
}     
