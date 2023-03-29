/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camposeco.proyecto1archivos.bd;

import com.camposeco.proyecto1archivos.Encriptacion;
import static com.camposeco.proyecto1archivos.frame.Start.empleado;
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
    public static void verProductoSucursal(Connection cnBD,Statement sT,ResultSet rS,JTable productos) throws SQLException{
        Statement sT1;
        ResultSet rS1;
        DefaultTableModel modeloProducto = new DefaultTableModel() {
            //True para hacer celdas editables, como no queremos eso, false
            @Override public boolean isCellEditable(int row, int column) 
            {
                return false; 
            } 
        };
        modeloProducto.addColumn("Codigo Producto");
        modeloProducto.addColumn("Nombre");
        modeloProducto.addColumn("Ubicacion");
        modeloProducto.addColumn("Cantidad Sucursal");
        String instruccionSql="SELECT * FROM ControlAdministrativo.Producto_Sucursal WHERE id_sucursal="+empleado.getId_sucursal()+" ;";
        String[] elementosProducto = new String[6];
        sT = cnBD.createStatement();
        sT1 = cnBD.createStatement();
        rS = sT.executeQuery(instruccionSql);
        while (rS.next()) {
            elementosProducto[0] = rS.getString(2);
            String instruccionSql2="SELECT nombre FROM ControlAdministrativo.Producto WHERE codigo_producto='"+rS.getString(2)+"' ;";
            rS1 = sT1.executeQuery(instruccionSql2);
            if(rS1.next()){
                elementosProducto[1] = rS1.getString(1);
            }
            elementosProducto[2] = rS.getString(3);
            elementosProducto[3] = rS.getString(4);
            modeloProducto.addRow(elementosProducto);
        }
        productos.setModel(modeloProducto);
    }
    public static void agregarBoxSucursal(Connection cnBD,Statement sT,ResultSet rS,JComboBox sucursal) throws SQLException{
        String instruccionSql="SELECT nombre FROM ControlAdministrativo.Sucursal;";
        sT = cnBD.createStatement();
        rS = sT.executeQuery(instruccionSql);
        while(rS.next()){
            sucursal.addItem(rS.getString(1));
        }
    }
    public static void generarReporte(Connection cnBD, Statement sT, ResultSet rS,JTable tablaReporte, int tipoReporte,JComboBox sucursal) throws SQLException{
        String instruccionSql;
        String instruccionSql2;
        Statement sT1;
        ResultSet rS1;
        String[] elementosReporte;
        sT = cnBD.createStatement();
        sT1 = cnBD.createStatement();
        DefaultTableModel modeloReporte = new DefaultTableModel(){
            //True para hacer celdas editables, como no queremos eso, false
            @Override public boolean isCellEditable(int row, int column) 
            {
                return false; 
            } 
        };
        
        switch(tipoReporte){
            case 1:
                modeloReporte.addColumn("Codigo");
                //modeloReporte.addColumn("Nombre");//agregar
                modeloReporte.addColumn("Cantidad vendida");
                instruccionSql="SELECT distinct codigo_producto,sum(cantidad_compra) FROM ControlVenta.Producto_Factura GROUP BY codigo_producto ORDER BY sum DESC LIMIT 10;";
                rS = sT.executeQuery(instruccionSql);
                elementosReporte = new String[3];
                while (rS.next()) {
                    elementosReporte[0] = rS.getString(1);
                    elementosReporte[1] = rS.getString(2);
                    modeloReporte.addRow(elementosReporte);
                }
                break;
            case 2:
                modeloReporte.addColumn("Nit");
                //modeloReporte.addColumn("Nombre");//agregar
                modeloReporte.addColumn("Total gastado");
                instruccionSql="SELECT nit,total_gasto FROM ControlPersona.Cliente ORDER BY total_gasto DESC LIMIT 10;";
                rS = sT.executeQuery(instruccionSql);
                elementosReporte = new String[3];
                while (rS.next()) {
                    elementosReporte[0] = rS.getString(1);
                    elementosReporte[1] = rS.getString(2);
                    modeloReporte.addRow(elementosReporte);
                }
                break;
            case 3:
                modeloReporte.addColumn("Sucursal");
                //modeloReporte.addColumn("Nombre");//agregar
                modeloReporte.addColumn("Cantidad de ventas");
                instruccionSql="SELECT distinct id_sucursal,COUNT(*) FROM ControlVenta.Factura GROUP BY id_sucursal ORDER BY count DESC LIMIT 3;";
                rS = sT.executeQuery(instruccionSql);
                elementosReporte = new String[3];
                while (rS.next()) {
                    elementosReporte[0] = rS.getString(1);
                    elementosReporte[1] = rS.getString(2);
                    modeloReporte.addRow(elementosReporte);
                }
                break;
            case 4:
                modeloReporte.addColumn("Sucursal");
                //modeloReporte.addColumn("Nombre");//agregar
                modeloReporte.addColumn("Cantidad de ingresos");
                instruccionSql="SELECT distinct id_sucursal,sum(total_venta) FROM ControlVenta.Factura GROUP BY id_sucursal ORDER BY sum DESC LIMIT 3;";
                rS = sT.executeQuery(instruccionSql);
                elementosReporte = new String[3];
                while (rS.next()) {
                    elementosReporte[0] = rS.getString(1);
                    elementosReporte[1] = rS.getString(2);
                    modeloReporte.addRow(elementosReporte);
                }
                break;
            case 5:
                modeloReporte.addColumn("Cui");
                //modeloReporte.addColumn("Nombre");//agregar
                modeloReporte.addColumn("Cantidad de ventas");
                instruccionSql="SELECT distinct cui,COUNT(*) FROM ControlVenta.Factura GROUP BY cui ORDER BY count DESC LIMIT 3;";
                rS = sT.executeQuery(instruccionSql);
                elementosReporte = new String[3];
                while (rS.next()) {
                    elementosReporte[0] = rS.getString(1);
                    elementosReporte[1] = rS.getString(2);
                    modeloReporte.addRow(elementosReporte);
                }
                break;
                
            case 6:
                modeloReporte.addColumn("Cui");
                //modeloReporte.addColumn("Nombre");//agregar
                modeloReporte.addColumn("Cantidad de ingresos");
                instruccionSql="SELECT distinct cui,sum(total_venta) FROM ControlVenta.Factura GROUP BY cui ORDER BY sum DESC LIMIT 3;";
                rS = sT.executeQuery(instruccionSql);
                elementosReporte = new String[3];
                while (rS.next()) {
                    elementosReporte[0] = rS.getString(1);
                    elementosReporte[1] = rS.getString(2);
                    modeloReporte.addRow(elementosReporte);
                }
                break;
                
            case 7:
                modeloReporte.addColumn("Codigo");
                //modeloReporte.addColumn("Nombre");//agregar
                modeloReporte.addColumn("Cantidad de ingresos");
                instruccionSql="SELECT distinct codigo_producto,sum(total_producto_factura) FROM ControlVenta.Producto_Factura GROUP BY codigo_producto ORDER BY sum DESC LIMIT 10;";
                rS = sT.executeQuery(instruccionSql);
                elementosReporte = new String[3];
                while (rS.next()) {
                    elementosReporte[0] = rS.getString(1);
                    elementosReporte[1] = rS.getString(2);
                    modeloReporte.addRow(elementosReporte);
                }
                break;
            case 8:
                modeloReporte.addColumn("Sucursal");
                modeloReporte.addColumn("Codigo");//agregar
                modeloReporte.addColumn("Cantidad vendidos");
                instruccionSql="SELECT id_sucursal FROM ControlAdministrativo.Sucursal WHERE nombre='"+sucursal.getSelectedItem().toString()+"';";
                rS1 = sT.executeQuery(instruccionSql);
                if (rS1.next()) {
                    instruccionSql2 = "SELECT id_sucursal, codigo_producto,sum(cantidad_compra) FROM ControlVenta.Producto_Factura WHERE id_sucursal=" + rS1.getString(1) + " GROUP BY id_sucursal, codigo_producto ORDER BY sum DESC LIMIT 5;";
                    rS = sT.executeQuery(instruccionSql2);
                    elementosReporte = new String[3];
                    while (rS.next()) {
                        elementosReporte[0] = rS.getString(1);
                        elementosReporte[1] = rS.getString(2);
                        elementosReporte[2] = rS.getString(3);
                        modeloReporte.addRow(elementosReporte);
                    }
                }
                break;
            case 9:
                modeloReporte.addColumn("Sucursal");
                modeloReporte.addColumn("Codigo");//agregar
                modeloReporte.addColumn("Cantidad ingresos");
                instruccionSql="SELECT id_sucursal FROM ControlAdministrativo.Sucursal WHERE nombre='"+sucursal.getSelectedItem().toString()+"';";
                rS1 = sT.executeQuery(instruccionSql);
                if (rS1.next()) {
                    instruccionSql2 = "SELECT id_sucursal, codigo_producto,sum(total_producto_factura) FROM ControlVenta.Producto_Factura WHERE id_sucursal=" + rS1.getString(1) + " GROUP BY id_sucursal, codigo_producto ORDER BY sum DESC LIMIT 5;";
                    rS = sT.executeQuery(instruccionSql2);
                    elementosReporte = new String[3];
                    while (rS.next()) {
                        elementosReporte[0] = rS.getString(1);
                        elementosReporte[1] = rS.getString(2);
                        elementosReporte[2] = rS.getString(3);
                        modeloReporte.addRow(elementosReporte);
                    }
                }
                break;
        }
        tablaReporte.setModel(modeloReporte);
    }
}
