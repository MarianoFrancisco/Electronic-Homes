/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camposeco.proyecto1archivos.bd;

import static com.camposeco.proyecto1archivos.bd.ConexionBD.manejoEncriptaciones;
import static com.camposeco.proyecto1archivos.frame.Start.empleado;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Mariano
 */
public class ManejoEncriptacionBD {
    public static int encriptarPassword(Connection cnBD,Statement sT,ResultSet rS,String usuario,String password){
        int id_rol = 0;
        try {
            String passwordDesencriptada=manejoEncriptaciones.encriptarPassword(password);
            String instruccionSql="SELECT * FROM ControlPersona.Empleado WHERE usuario='"+usuario+"' AND password_empleado='"+passwordDesencriptada+"'";
            sT = cnBD.createStatement();
            rS = sT.executeQuery(instruccionSql);
            if(rS.next()){
                id_rol=rS.getInt(3);
                empleado.setCui(rS.getString(1));
                empleado.setId_sucursal(rS.getInt(2));
                empleado.setId_rol(id_rol);
                empleado.setNombre(rS.getString(4));
                empleado.setEdad(rS.getInt(5));
                empleado.setTelefono(rS.getString(6));
                empleado.setUsuario(rS.getString(7));
            }
            return id_rol;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Usuario y password ingresados no coinciden, por favor verificar");
        }
        return id_rol;
    }
}
