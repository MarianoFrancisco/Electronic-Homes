/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camposeco.proyecto1archivos.bd;

import static com.camposeco.proyecto1archivos.bd.ConexionBD.manejoEncriptaciones;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Mariano
 */
public class ManejoEncriptacionBD {
    public static int encriptarPassword(Connection cnBD,Statement sT,ResultSet rS,JTextField usuario,JTextField password){
        int id_rol = 0;
        try {
            String passwordDesencriptada=manejoEncriptaciones.encriptarPassword(password.getText());
            String instruccionSql="SELECT id_rol FROM ControlPersona.Empleado WHERE usuario='"+usuario.getText()+"' AND password_empleado='"+passwordDesencriptada+"'";
            sT = cnBD.createStatement();
            rS = sT.executeQuery(instruccionSql);
            if(rS.next()){
                id_rol=rS.getInt(1);
            }
            return id_rol;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Usuario y password ingresados no coinciden, por favor verificar");
        }
        return id_rol;
    }
}
