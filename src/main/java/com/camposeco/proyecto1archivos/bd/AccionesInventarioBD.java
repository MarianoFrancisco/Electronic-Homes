/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camposeco.proyecto1archivos.bd;

import static com.camposeco.proyecto1archivos.frame.Start.empleado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mariano
 */
public class AccionesInventarioBD {
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
    public static void moverDesdeSucursal(Connection cnBD,Statement sT,ResultSet rS,PreparedStatement pST,JComboBox sucursal,JLabel codigo, JTextField ubicacion,JTextField cantidad) throws SQLException{
        Statement sT1;
        ResultSet rS1;
        Statement sT2;
        ResultSet rS2;
        Statement sT3;
        ResultSet rS3;
        Statement sT4;
        ResultSet rS4;
        PreparedStatement pST2;
        int operacion=0;
        int operacion2=0;
        int sucursalID=0;
        int cantidadSolicitud=0;
        int cantidadSolicitante=0;
        int cantidadTotal=0;
        sT = cnBD.createStatement();
        sT1 = cnBD.createStatement();
        sT2 = cnBD.createStatement();
        sT3 = cnBD.createStatement();
        sT4 = cnBD.createStatement();
        String instruccionSql="SELECT id_sucursal FROM ControlAdministrativo.Sucursal WHERE nombre='"+sucursal.getSelectedItem().toString()+"';";
        rS = sT.executeQuery(instruccionSql);
        if (rS.next()) {
            sucursalID = rS.getInt(1);
        }
        String instruccionSql4 = "SELECT COUNT(*) FROM ControlAdministrativo.Producto_Sucursal WHERE id_sucursal=" + sucursalID + " AND codigo_producto='" + codigo.getText() + "';";
        String instruccionSql5 = "SELECT COUNT(*) FROM ControlAdministrativo.Producto_Sucursal WHERE id_sucursal=" + empleado.getId_sucursal() + " AND codigo_producto='" + codigo.getText() + "';";
        rS3 = sT3.executeQuery(instruccionSql4);
        rS4 = sT4.executeQuery(instruccionSql5);
        if (rS3.next()) {
            cantidadSolicitud = rS3.getInt(1);
        }
        if (rS4.next()) {
            cantidadSolicitante = rS4.getInt(1);
        }
        if (sucursalID != empleado.getId_sucursal()) {
            if (cantidadSolicitud == 0) {
                JOptionPane.showMessageDialog(null, "No hay stock de este producto en la sucursal solicitada");
            } else {
                if (cantidadSolicitante == 0) {//existe producto pero se va a ingresar
                    String instruccionSql2 = "SELECT cantidad_sucursal FROM ControlAdministrativo.Producto_Sucursal WHERE id_sucursal=" + sucursalID + " AND codigo_producto='" + codigo.getText() + "';";
                    rS1 = sT1.executeQuery(instruccionSql2);
                    if (rS1.next()) {
                        cantidadTotal = rS1.getInt(1);
                    }
                    if (cantidadTotal < Integer.parseInt(cantidad.getText())) {
                        JOptionPane.showMessageDialog(null, "No hay suficiente stock de lo solicitado");
                    } else {
                        //suma
                        pST = cnBD.prepareStatement("INSERT INTO ControlAdministrativo.Producto_Sucursal VALUES(?,?,?,?);");
                        pST.setInt(1, empleado.getId_rol());
                        pST.setString(2, codigo.getText());
                        pST.setString(3, ubicacion.getText());
                        pST.setInt(4, Integer.parseInt(cantidad.getText()));
                        pST.execute();
                        pST2 = cnBD.prepareStatement("UPDATE ControlAdministrativo.Producto_Sucursal SET cantidad_sucursal=?"
                                + " WHERE id_sucursal=? AND codigo_producto=?");
                        operacion2 = cantidadTotal - Integer.parseInt(cantidad.getText());
                        //resta
                        pST2.setInt(1, operacion2);
                        pST2.setInt(2, sucursalID);
                        pST2.setString(3, codigo.getText());
                        pST2.execute();
                        JOptionPane.showMessageDialog(null, "Agregado stock de " + codigo.getText() + " de sucursal " + sucursalID + " a " + empleado.getId_rol());
                    }
                } else {//existe producto pero ya solo se modifica cantidad
                    String instruccionSql2 = "SELECT cantidad_sucursal FROM ControlAdministrativo.Producto_Sucursal WHERE id_sucursal=" + sucursalID + " AND codigo_producto='" + codigo.getText() + "';";
                    String instruccionSql3 = "SELECT cantidad_sucursal FROM ControlAdministrativo.Producto_Sucursal WHERE id_sucursal=" + empleado.getId_sucursal() + " AND codigo_producto='" + codigo.getText() + "';";
                    rS1 = sT1.executeQuery(instruccionSql2);
                    if (rS1.next()) {
                        if (rS1.getInt(1) < Integer.parseInt(cantidad.getText())) {
                            JOptionPane.showMessageDialog(null, "No hay suficiente stock de lo solicitado");
                        } else {
                            rS2 = sT2.executeQuery(instruccionSql3);
                            if (rS2.next()) {
                                pST = cnBD.prepareStatement("UPDATE ControlAdministrativo.Producto_Sucursal SET ubicacion=?,cantidad_sucursal=?"
                                        + " WHERE id_sucursal=? AND codigo_producto=?");
                                pST2 = cnBD.prepareStatement("UPDATE ControlAdministrativo.Producto_Sucursal SET cantidad_sucursal=?"
                                        + " WHERE id_sucursal=? AND codigo_producto=?");
                                operacion = Integer.parseInt(cantidad.getText()) + rS2.getInt(1);
                                operacion2 = rS1.getInt(1) - Integer.parseInt(cantidad.getText());
                                //resta
                                pST2.setInt(1, operacion2);
                                pST2.setInt(2, sucursalID);
                                pST2.setString(3, codigo.getText());
                                pST2.execute();
                                //suma
                                pST.setString(1, ubicacion.getText());
                                pST.setInt(2, operacion);
                                pST.setInt(3, empleado.getId_rol());
                                pST.setString(4, codigo.getText());
                                pST.execute();
                                JOptionPane.showMessageDialog(null, "Aumentado stock de " + codigo.getText() + " de sucursal " + sucursalID + " a " + empleado.getId_rol());
                            }
                        }
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ya estas en esa sucursal");
        }
    }
    public static void moverDesdeBodega(Connection cnBD,Statement sT,ResultSet rS,PreparedStatement pST,JComboBox bodega,JLabel codigo, JTextField ubicacion,JTextField cantidad) throws SQLException{
        Statement sT1;
        ResultSet rS1;
        Statement sT2;
        ResultSet rS2;
        Statement sT3;
        ResultSet rS3;
        Statement sT4;
        ResultSet rS4;
        PreparedStatement pST2;
        int operacion=0;
        int operacion2=0;
        int bodegaID=0;
        int cantidadSolicitud=0;
        int cantidadSolicitante=0;
        int cantidadTotal=0;
        sT = cnBD.createStatement();
        sT1 = cnBD.createStatement();
        sT2 = cnBD.createStatement();
        sT3 = cnBD.createStatement();
        sT4 = cnBD.createStatement();
        String instruccionSql="SELECT id_bodega FROM ControlAdministrativo.Bodega WHERE nombre='"+bodega.getSelectedItem().toString()+"';";
        rS = sT.executeQuery(instruccionSql);
        if (rS.next()) {
            bodegaID = rS.getInt(1);
        }
        String instruccionSql4 = "SELECT COUNT(*) FROM ControlAdministrativo.Producto_Bodega WHERE id_bodega=" + bodegaID + " AND codigo_producto='" + codigo.getText() + "';";
        String instruccionSql5 = "SELECT COUNT(*) FROM ControlAdministrativo.Producto_Sucursal WHERE id_sucursal=" + empleado.getId_sucursal() + " AND codigo_producto='" + codigo.getText() + "';";
        rS3 = sT3.executeQuery(instruccionSql4);
        rS4 = sT4.executeQuery(instruccionSql5);
        if (rS3.next()) {
            cantidadSolicitud = rS3.getInt(1);
        }
        if (rS4.next()) {
            cantidadSolicitante = rS4.getInt(1);
        }
        if (cantidadSolicitud == 0) {
            JOptionPane.showMessageDialog(null, "No hay stock de este producto en la bodega solicitada");
        } else {
            if (cantidadSolicitante == 0) {//existe producto pero se va a ingresar
                String instruccionSql2 = "SELECT cantidad_bodega FROM ControlAdministrativo.Producto_Bodega WHERE id_bodega=" + bodegaID + " AND codigo_producto='" + codigo.getText() + "';";
                rS1 = sT1.executeQuery(instruccionSql2);
                if (rS1.next()) {
                    cantidadTotal = rS1.getInt(1);
                }
                if (cantidadTotal < Integer.parseInt(cantidad.getText())) {
                    JOptionPane.showMessageDialog(null, "No hay suficiente stock de lo solicitado");
                } else {
                    //suma
                    pST = cnBD.prepareStatement("INSERT INTO ControlAdministrativo.Producto_Sucursal VALUES(?,?,?,?);");
                    pST.setInt(1, empleado.getId_rol());
                    pST.setString(2, codigo.getText());
                    pST.setString(3, ubicacion.getText());
                    pST.setInt(4, Integer.parseInt(cantidad.getText()));
                    pST.execute();
                    pST2 = cnBD.prepareStatement("UPDATE ControlAdministrativo.Producto_Bodega SET cantidad_bodega=?"
                            + " WHERE id_bodega=? AND codigo_producto=?");
                    operacion2 = cantidadTotal - Integer.parseInt(cantidad.getText());
                    //resta
                    pST2.setInt(1, operacion2);
                    pST2.setInt(2, bodegaID);
                    pST2.setString(3, codigo.getText());
                    pST2.execute();
                    JOptionPane.showMessageDialog(null, "Agregado stock de " + codigo.getText() + " de bodega " + bodegaID + " a " + empleado.getId_rol());
                }
            } else {//existe producto pero ya solo se modifica cantidad
                String instruccionSql2 = "SELECT cantidad_bodega FROM ControlAdministrativo.Producto_Bodega WHERE id_bodega=" + bodegaID + " AND codigo_producto='" + codigo.getText() + "';";
                String instruccionSql3 = "SELECT cantidad_sucursal FROM ControlAdministrativo.Producto_Sucursal WHERE id_sucursal=" + empleado.getId_sucursal() + " AND codigo_producto='" + codigo.getText() + "';";
                rS1 = sT1.executeQuery(instruccionSql2);
                if (rS1.next()) {
                    if (rS1.getInt(1) < Integer.parseInt(cantidad.getText())) {
                        JOptionPane.showMessageDialog(null, "No hay suficiente stock de lo solicitado");
                    } else {
                        rS2 = sT2.executeQuery(instruccionSql3);
                        if (rS2.next()) {
                            pST = cnBD.prepareStatement("UPDATE ControlAdministrativo.Producto_Sucursal SET ubicacion=?,cantidad_sucursal=?"
                                    + " WHERE id_sucursal=? AND codigo_producto=?");
                            pST2 = cnBD.prepareStatement("UPDATE ControlAdministrativo.Producto_Bodega SET cantidad_bodega=?"
                                    + " WHERE id_bodega=? AND codigo_producto=?");
                            operacion = Integer.parseInt(cantidad.getText()) + rS2.getInt(1);
                            operacion2 = rS1.getInt(1) - Integer.parseInt(cantidad.getText());
                            //resta
                            pST2.setInt(1, operacion2);
                            pST2.setInt(2, bodegaID);
                            pST2.setString(3, codigo.getText());
                            pST2.execute();
                            //suma
                            pST.setString(1, ubicacion.getText());
                            pST.setInt(2, operacion);
                            pST.setInt(3, empleado.getId_rol());
                            pST.setString(4, codigo.getText());
                            pST.execute();
                            JOptionPane.showMessageDialog(null, "Aumentado stock de " + codigo.getText() + " de bodega " + bodegaID + " a " + empleado.getId_rol());
                        }
                    }
                }
            }
        }

    }
}
