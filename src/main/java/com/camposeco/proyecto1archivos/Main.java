/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camposeco.proyecto1archivos;
import com.camposeco.proyecto1archivos.bd.ConexionBD;
import com.camposeco.proyecto1archivos.frame.Start;

/**
 *
 * @author Mariano
 */

public class Main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        ConexionBD cnBD = new ConexionBD();
        
        cnBD.empezarConexion();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //iniciamos frame inicio
                new Start().setVisible(true);      
            }
        });
    }
}
