/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camposeco.proyecto1archivos.bd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mariano
 */
public class AccionesVendedorBD {
    public static void verClientes(Connection cnBD,Statement sT,ResultSet rS,JTable tablaClientes) throws SQLException{
        DefaultTableModel modeloClientes = new DefaultTableModel() {
            //True para hacer celdas editables, como no queremos eso, false
            @Override public boolean isCellEditable(int row, int column) 
            {
                return false; 
            } 
        };
        modeloClientes.addColumn("Nit");
        modeloClientes.addColumn("Nombre");
        modeloClientes.addColumn("Telefono");
        modeloClientes.addColumn("Total Gasto");
        modeloClientes.addColumn("Ultima Compra");
        String instruccionSql="SELECT * FROM ControlPersona.Cliente;";
        String[] elementosClientes = new String[5];
        sT = cnBD.createStatement();
        rS = sT.executeQuery(instruccionSql);
        while (rS.next()) {
            elementosClientes[0] = rS.getString(1);
            elementosClientes[1] = rS.getString(2);
            elementosClientes[2] = rS.getString(3);
            elementosClientes[3] = rS.getString(4);
            elementosClientes[4] = rS.getString(5);
            modeloClientes.addRow(elementosClientes);
        }
        tablaClientes.setModel(modeloClientes);
    }
    public static void modificarCliente(Connection cnBD, ResultSet rS, PreparedStatement pST, JLabel nit, JTextField nombre, JTextField telefono, JTextField totalGasto, JTextField ultimoGasto) {
        try {
            pST = cnBD.prepareStatement("UPDATE ControlPersona.Cliente SET nombre=?,telefono=?,total_gasto=?,ultima_compra=? WHERE nit=?");
            pST.setString(1, nombre.getText());
            pST.setString(2, telefono.getText());
            pST.setDouble(3, Double.parseDouble(totalGasto.getText()));
            pST.setDouble(4, Double.parseDouble(ultimoGasto.getText()));
            pST.setString(5, nit.getText());
            pST.execute();
            JOptionPane.showMessageDialog(null, "Cliente modificado correctamente " + nit.getText());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo modificar al cliente"+nit.getText());
        }
    }
}
