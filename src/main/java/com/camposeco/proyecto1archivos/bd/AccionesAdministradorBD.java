/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camposeco.proyecto1archivos.bd;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTable;
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
        DefaultTableModel modeloEmpleado = new DefaultTableModel();
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
}
