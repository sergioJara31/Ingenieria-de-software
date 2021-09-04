/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registro_ciclistas_rutas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Sergio
 */
public class Conexion {
    Connection connection;

    public Conexion() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistemas_rutas_ciclistas", "root", "");
            if(connection!= null)
                System.out.println("Conexión exitosa");
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("error de conexion");
        } 
    }
    
    public Connection getConnection(){
        return connection;
    }

    public PreparedStatement prepareStatement(String select__from_Person_WHERE_Name__) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}