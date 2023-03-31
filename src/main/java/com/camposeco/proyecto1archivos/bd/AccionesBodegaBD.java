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
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mariano
 */
public class AccionesBodegaBD {
    //https://docs.oracle.com/javase/7/docs/api/javax/swing/table/DefaultTableModel.html
    public static void verProductosBodega(Connection cnBD,Statement sT,ResultSet rS,JTable productosBodega) throws SQLException{
        Statement sT1;
        ResultSet rS1;
        Statement sT2;
        ResultSet rS2;
        DefaultTableModel modeloProductoBodega = new DefaultTableModel() {
            //True para hacer celdas editables, como no queremos eso, false
            @Override public boolean isCellEditable(int row, int column) 
            {
                return false; 
            } 
        };
        modeloProductoBodega.addColumn("Bodega");
        modeloProductoBodega.addColumn("Codigo Producto");
        modeloProductoBodega.addColumn("Producto");
        modeloProductoBodega.addColumn("Proveedor");
        modeloProductoBodega.addColumn("Ubicacion");
        modeloProductoBodega.addColumn("Cantidad");
        String instruccionSql="SELECT * FROM ControlAdministrativo.Producto_Bodega;";
        String[] elementosProductoBodega = new String[6];
        sT = cnBD.createStatement();
        sT1 = cnBD.createStatement();
        sT2 = cnBD.createStatement();
        rS = sT.executeQuery(instruccionSql);
        while(rS.next()){
            rS1 = sT1.executeQuery("SELECT nombre FROM ControlAdministrativo.Bodega Where id_bodega='"+rS.getString(1)+"';");
            if (rS1.next()) {
                elementosProductoBodega[0] = rS1.getString(1);
            }
            elementosProductoBodega[1] = rS.getString(2);
            rS2 = sT2.executeQuery("SELECT nombre FROM ControlAdministrativo.Producto Where codigo_producto='"+rS.getString(2)+"';");
            if (rS2.next()) {
                elementosProductoBodega[2] = rS2.getString(1);
            }
            elementosProductoBodega[3]=rS.getString(3);
            elementosProductoBodega[4]=rS.getString(4);
            elementosProductoBodega[5]=rS.getString(5);
            modeloProductoBodega.addRow(elementosProductoBodega);
        }
        productosBodega.setModel(modeloProductoBodega);
    }
    public static void modificarProductosBodega(Connection cnBD,Statement sT,ResultSet rS,PreparedStatement pST, String bodega,String codigo,String proveedor,String ubicacion,int cantidad){
        try {
            String instruccionSql="SELECT id_bodega FROM ControlAdministrativo.Bodega WHERE nombre='"+bodega+"'";
            pST=cnBD.prepareStatement("UPDATE ControlAdministrativo.Producto_Bodega SET proveedor=?,ubicacion=?,"
                    + "cantidad_bodega=? WHERE id_bodega=? AND codigo_producto=?");
            sT = cnBD.createStatement();
            rS = sT.executeQuery(instruccionSql);
            pST.setString(1, proveedor);
            pST.setString(2, ubicacion);
            pST.setInt(3, cantidad);
            if (rS.next()) {
                pST.setInt(4,  Integer.parseInt(rS.getString(1)));
            }
            pST.setString(5, codigo);
            pST.execute();
            sT.close();
            rS.close();
            pST.close();
            JOptionPane.showMessageDialog(null, "Producto en bodega modificado correctamente "+codigo);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al modificar el producto en bodega "+codigo);
        }
    }
    public static void verProductos(Connection cnBD,Statement sT,ResultSet rS,JTable productos) throws SQLException{
        DefaultTableModel modeloProducto = new DefaultTableModel() {
            //True para hacer celdas editables, como no queremos eso, false
            @Override public boolean isCellEditable(int row, int column) 
            {
                return false; 
            } 
        };
        modeloProducto.addColumn("Codigo");
        modeloProducto.addColumn("Nombre");
        modeloProducto.addColumn("Marca");
        modeloProducto.addColumn("Precio");
        String instruccionSql="SELECT * FROM ControlAdministrativo.Producto;";
        String[] elementosProducto = new String[6];
        sT = cnBD.createStatement();
        rS = sT.executeQuery(instruccionSql);
        while (rS.next()) {
            elementosProducto[0] = rS.getString(1);
            elementosProducto[1] = rS.getString(2);
            elementosProducto[2] = rS.getString(3);
            elementosProducto[3] = rS.getString(4);
            modeloProducto.addRow(elementosProducto);
        }
        productos.setModel(modeloProducto);
    }
    public static void modificarProductos(Connection cnBD,ResultSet rS,PreparedStatement pST,JLabel codigo,JTextField nombre,JTextField marca,JTextField precio){
        try {
            pST = cnBD.prepareStatement("UPDATE ControlAdministrativo.Producto SET nombre=?,marca=?,"
                    + "valor=? WHERE codigo_producto=?");
            pST.setString(1, nombre.getText());
            pST.setString(2, marca.getText());
            pST.setDouble(3, Double.parseDouble(precio.getText()));
            pST.setString(4, codigo.getText());
            pST.execute();
            JOptionPane.showMessageDialog(null, "Producto modificado correctamente "+codigo.getText());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al modificar el producto "+codigo.getText());
        }
    }
    public static void registrarProductos(Connection cnBD,ResultSet rS,PreparedStatement pST,JTextField codigo,JTextField nombre,JTextField marca,JTextField valor){
        try {
            pST = cnBD.prepareStatement("INSERT INTO ControlAdministrativo.Producto VALUES(?,?,?,?)");
            pST.setString(1, codigo.getText());
            pST.setString(2, nombre.getText());
            pST.setString(3, marca.getText());
            pST.setDouble(4, Double.parseDouble(valor.getText()));
            pST.execute();
            JOptionPane.showMessageDialog(null, "Producto creado exitosamente "+codigo.getText());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ya existe el producto "+codigo.getText());
        }
    }
    public static void agregarBoxBodega(Connection cnBD,Statement sT,ResultSet rS,JComboBox cajaOpciones) throws SQLException{
        String instruccionSql="SELECT nombre FROM ControlAdministrativo.Bodega;";
        sT = cnBD.createStatement();
        rS = sT.executeQuery(instruccionSql);
        while(rS.next()){
            cajaOpciones.addItem(rS.getString(1));
        }
    }
    public static void agregarProductoBodega(Connection cnBD,Statement sT,ResultSet rS,PreparedStatement pST,JComboBox cajaOpciones,JLabel codigo,JTextField proveedor,JTextField ubicacion,JTextField cantidad) throws SQLException{
        //0 no existe, 1 ya existe
        int cantidadTotalBodega = 0;
        String bodegaID="";
        Statement sT1;
        ResultSet rS1;
        Statement sT2;
        ResultSet rS2;
        String solicitarBodegaID="SELECT id_bodega FROM ControlAdministrativo.Bodega WHERE nombre='"+cajaOpciones.getSelectedItem().toString()+"'";
        String instruccionSql = null;
        String verificarCantidadBodega;
        sT = cnBD.createStatement();
        sT1 = cnBD.createStatement();
        sT2 = cnBD.createStatement();
        rS1 = sT1.executeQuery(solicitarBodegaID);
        if(rS1.next()){
            bodegaID=rS1.getString(1);   
        }
        instruccionSql="SELECT COUNT(*) FROM ControlAdministrativo.Producto_Bodega WHERE codigo_producto='"+codigo.getText()+"' AND id_bodega="+bodegaID+";";
        rS = sT.executeQuery(instruccionSql);
        if(rS.next()){
            //no existe
            if(0==Integer.parseInt(rS.getString(1))){
                pST = cnBD.prepareStatement("INSERT INTO ControlAdministrativo.Producto_Bodega VALUES(?,?,?,?,?)");
                pST.setInt(1, Integer.parseInt(bodegaID));
                pST.setString(2, codigo.getText());
                pST.setString(3, proveedor.getText());
                pST.setString(4, ubicacion.getText());
                pST.setInt(5, Integer.parseInt(cantidad.getText()));
                pST.execute();
                JOptionPane.showMessageDialog(null, "Se agrego un nuevo producto a la bodega "+codigo.getText());
            } else {
                //si existe
                verificarCantidadBodega="SELECT cantidad_bodega FROM ControlAdministrativo.Producto_Bodega WHERE codigo_producto='"+codigo.getText()+"' AND id_bodega="+bodegaID+"";
                rS2 = sT2.executeQuery(verificarCantidadBodega);
                pST = cnBD.prepareStatement("UPDATE ControlAdministrativo.Producto_Bodega SET proveedor=?,ubicacion=?,"
                        + "cantidad_bodega=? WHERE id_bodega=? AND codigo_producto=?");
                pST.setString(1, proveedor.getText());
                pST.setString(2, ubicacion.getText());
                if(rS2.next()){
                    cantidadTotalBodega=Integer.parseInt(cantidad.getText())+Integer.parseInt(rS2.getString(1));
                }
                pST.setInt(3, cantidadTotalBodega);
                pST.setInt(4, Integer.parseInt(bodegaID));
                pST.setString(5, codigo.getText());
                pST.execute();
                JOptionPane.showMessageDialog(null, "Se agrego mas producto de uno ya existente en bodega "+codigo.getText());
            }
        }
        while(rS.next()){
            cajaOpciones.addItem(rS.getString(1));
        }
    }
}
