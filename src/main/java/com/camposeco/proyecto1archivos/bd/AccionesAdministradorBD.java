/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camposeco.proyecto1archivos.bd;

import com.camposeco.proyecto1archivos.Encriptacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mariano
 */
public class AccionesAdministradorBD {
    public static void verEmpleados(Connection cnBD,Statement sT,ResultSet rS,JTable tablaEmpleados) throws SQLException{
        Statement sT1;
        ResultSet rS1;
        Statement sT2;
        ResultSet rS2;
        DefaultTableModel modeloEmpleado = new DefaultTableModel(){
            //True para hacer celdas editables, como no queremos eso, false
            @Override public boolean isCellEditable(int row, int column) 
            {
                return false; 
            } 
        };
        modeloEmpleado.addColumn("CUI");
        modeloEmpleado.addColumn("Sucursal");
        modeloEmpleado.addColumn("Rol");
        modeloEmpleado.addColumn("Nombre");
        modeloEmpleado.addColumn("Edad");
        modeloEmpleado.addColumn("Telefono");
        modeloEmpleado.addColumn("Usuario");
        String instruccionSql="SELECT * FROM ControlPersona.Empleado;";
        String[] elementosEmpleado = new String[7];
        sT = cnBD.createStatement();
        sT1 = cnBD.createStatement();
        sT2 = cnBD.createStatement();
        rS = sT.executeQuery(instruccionSql);
        while(rS.next()){
            elementosEmpleado[0]=rS.getString(1);
            rS1 = sT1.executeQuery("SELECT nombre FROM ControlAdministrativo.Sucursal Where id_sucursal='"+rS.getString(2)+"';");
            if (rS1.next()) {
                elementosEmpleado[1] = rS1.getString(1);
            }
            rS2 = sT2.executeQuery("SELECT nombre FROM ControlAdministrativo.Rol Where id_rol='"+rS.getString(3)+"';");
            if (rS2.next()) {
                elementosEmpleado[2] = rS2.getString(1);
            }
            elementosEmpleado[3]=rS.getString(4);
            elementosEmpleado[4]=rS.getString(5);
            elementosEmpleado[5]=rS.getString(6);
            elementosEmpleado[6]=rS.getString(7);
            modeloEmpleado.addRow(elementosEmpleado);
        }
        tablaEmpleados.setModel(modeloEmpleado);
    }
    public static void agregarBoxSucursalRol(Connection cnBD,Statement sT,ResultSet rS,JComboBox sucursal,JComboBox rol) throws SQLException{
        Statement sT1;
        ResultSet rS1;
        String instruccionSql="SELECT nombre FROM ControlAdministrativo.Sucursal;";
        String instruccionSql2="SELECT nombre FROM ControlAdministrativo.Rol;";
        sT = cnBD.createStatement();
        sT1 = cnBD.createStatement();
        rS = sT.executeQuery(instruccionSql);
        rS1 = sT1.executeQuery(instruccionSql2);
        while(rS.next()){
            sucursal.addItem(rS.getString(1));
        }
        while(rS1.next()){
            rol.addItem(rS1.getString(1));
        }
    }
    public static void registrarEmpleado(Connection cnBD,Statement sT,ResultSet rS,PreparedStatement pST,JComboBox sucursales,JComboBox roles,JTextField textCui,
            JTextField textNombre,JTextField textTelefono,JTextField textEdad,JTextField textUsuario,JTextField textPassword,Encriptacion encriptar){
        try {
            String passwordEncriptada=encriptar.encriptarPassword(textPassword.getText());
            Statement sT1;
            ResultSet rS1;
            String instruccionSql="SELECT id_sucursal FROM ControlAdministrativo.Sucursal WHERE nombre='"+sucursales.getSelectedItem().toString()+"';";
            String instruccionSql2="SELECT id_rol FROM ControlAdministrativo.Rol WHERE nombre='"+roles.getSelectedItem().toString()+"';";
            sT = cnBD.createStatement();
            sT1 = cnBD.createStatement();
            rS = sT.executeQuery(instruccionSql);
            rS1 = sT1.executeQuery(instruccionSql2);
            try {
                pST = cnBD.prepareStatement("INSERT INTO ControlPersona.Empleado VALUES(?,?,?,?,?,?,?,?)");
                pST.setString(1, textCui.getText());
                if(rS.next()){
                    pST.setInt(2, Integer.parseInt(rS.getString(1)));
                }
                if(rS1.next()){
                    pST.setInt(3, Integer.parseInt(rS1.getString(1)));
                }
                pST.setString(4, textNombre.getText());
                pST.setInt(5, Integer.parseInt(textEdad.getText()));
                pST.setString(6, textTelefono.getText());
                pST.setString(7, textUsuario.getText());
                pST.setString(8, passwordEncriptada);
                pST.execute();
                JOptionPane.showMessageDialog(null, "Empleado registrado correctamente "+textNombre.getText());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Ya existe el empleado verificar cui y usuario "+textCui.getText()+" - "+textUsuario.getText());
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al agregar datos a listados de sucursales y roles");
        }
    }
}
