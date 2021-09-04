/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registro_ciclistas_rutas;
import vista.RegistroCiclista;


/**
 *
 * @author Sergio Jaramillo
 */
public class Registro_ciclistas_rutas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conexion con = new Conexion();
        RegistroCiclista inst_frame = new RegistroCiclista();
        con.getConnection();
        inst_frame.setVisible(true);
        
    }
    
}
