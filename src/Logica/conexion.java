/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author stalin
 */
public class conexion {
    public String db="basereserva";
    public String url="jdbc:mysql://localhost/"+db;
    public String user = "root";
    public String pass = "hp48g2010";
    
    
    public conexion(){
        
    }
    
    public Connection conectar() {
        Connection link = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");           
            link = DriverManager.getConnection(this.url, this.user, this.pass);
        }catch (Exception e){
            e.printStackTrace();
        }
        return link;
    }
    
}     
