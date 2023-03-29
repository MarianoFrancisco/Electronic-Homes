/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camposeco.proyecto1archivos.bd;

import static com.camposeco.proyecto1archivos.frame.Start.empleado;
import com.camposeco.proyecto1archivos.frame.vendedor.Vendedor;
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
    public static void registrarCliente(Connection cnBD,PreparedStatement pST,JTextField nit, JTextField nombre, JTextField telefono) throws SQLException{
        try {
            pST = cnBD.prepareStatement("INSERT INTO ControlPersona.Cliente VALUES(?,?,?,?,?)");
            pST.setString(1, nit.getText());
            pST.setString(2, nombre.getText());
            pST.setString(3, telefono.getText());
            pST.setDouble(4, 0);
            pST.setDouble(5, 0);
            pST.execute();
            JOptionPane.showMessageDialog(null, "Cliente ingresado exitosamente "+nit.getText());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ya esta registrado el cliente "+nit.getText());
        }
    }
    public static void inicioVenta(Connection cnBD,Statement sT, ResultSet rS,PreparedStatement pST,JTextField nit) throws SQLException{
        String instruccionSql="SELECT COUNT(*) FROM ControlPersona.Cliente WHERE nit='"+nit.getText()+"';";
        Statement sT1;
        ResultSet rS1;
        PreparedStatement pST2;
        sT = cnBD.createStatement();
        sT1 = cnBD.createStatement();
        rS = sT.executeQuery(instruccionSql);
        if (rS.next()) {
            if (rS.getInt(1) == 0) {//no existe
                pST = cnBD.prepareStatement("INSERT INTO ControlPersona.Cliente VALUES(?,?,?,?,?)");
                pST.setString(1, nit.getText());
                pST.setString(2, "");
                pST.setString(3, "");
                pST.setDouble(4, 0);
                pST.setDouble(5, 0);
                pST.execute();
                String instruccionSql2="SELECT COUNT(*) FROM ControlVenta.Factura;";
                pST2 = cnBD.prepareStatement("INSERT INTO ControlVenta.Factura (id_sucursal,cui,nit,subtotal_venta,descuento,total_venta) VALUES(?,?,?,?,?,?)");
                pST2.setInt(1, empleado.getId_sucursal());
                pST2.setString(2, empleado.getCui());
                pST2.setString(3, nit.getText());
                pST2.setInt(4, 0);
                pST2.setInt(5, 0);
                pST2.setInt(6, 0);
                pST2.execute();
                rS1 = sT1.executeQuery(instruccionSql2);
                if(rS1.next()){
                    Vendedor.valorVenta=rS1.getInt(1);
                }
                Vendedor.valorNit=nit.getText();
                JOptionPane.showMessageDialog(null, "El cliente no existia, se registro automaticamente " + nit.getText()+", ingrese los productos comprados");
            }else{//ya existe
                String instruccionSql2="SELECT COUNT(*) FROM ControlVenta.Factura;";
                pST = cnBD.prepareStatement("INSERT INTO ControlVenta.Factura (id_sucursal,cui,nit,subtotal_venta,descuento,total_venta) VALUES(?,?,?,?,?,?)");
                pST.setInt(1, empleado.getId_sucursal());
                pST.setString(2, empleado.getCui());
                pST.setString(3, nit.getText());
                pST.setInt(4, 0);
                pST.setInt(5, 0);
                pST.setInt(6, 0);
                pST.execute();
                rS1 = sT1.executeQuery(instruccionSql2);
                if(rS1.next()){
                    Vendedor.valorVenta=rS1.getInt(1);
                }
                Vendedor.valorNit=nit.getText();
                JOptionPane.showMessageDialog(null, "Ingrese los productos comprados por "+nit.getText());
            }
        }
    }
    public static void adicionarFacturaProducto(Connection cnBD, Statement sT, ResultSet rS, PreparedStatement pST, JLabel codigo, JTextField cantidad) throws SQLException {
        Statement sT1;
        ResultSet rS1;
        Statement sT2;
        ResultSet rS2;
        Statement sT3;
        ResultSet rS3;
        PreparedStatement pST2;
        double operacion=0;
        int suma=0;
        int reduccionSucursal=0;
        //verificar si hay repitencia
        sT = cnBD.createStatement();
        sT1 = cnBD.createStatement();
        sT2 = cnBD.createStatement();
        sT3 = cnBD.createStatement();
        String instruccionSql4="SELECT cantidad_sucursal FROM ControlAdministrativo.Producto_Sucursal WHERE codigo_producto='"+codigo.getText()+"' AND id_sucursal="+empleado.getId_sucursal()+";";
        rS3 = sT3.executeQuery(instruccionSql4);
        String instruccionSql2 = "SELECT COUNT(*) FROM ControlVenta.Producto_Factura WHERE codigo_producto='" + codigo.getText() + "' AND id_venta=" + Vendedor.valorVenta + ";";
        rS1 = sT1.executeQuery(instruccionSql2);
        if (rS3.next()) {
            if (rS3.getInt(1) < Integer.parseInt(cantidad.getText())) {
                JOptionPane.showMessageDialog(null, "No se posee la cantidad necesaria para procesar el ingreso");
            } else {
                if (rS1.next()) {
                    reduccionSucursal=rS3.getInt(1)-Integer.parseInt(cantidad.getText());
                    if (rS1.getInt(1) == 0) {
                        String instruccionSql = "SELECT valor FROM ControlAdministrativo.Producto WHERE codigo_producto='" + codigo.getText() + "';";
                        rS = sT.executeQuery(instruccionSql);
                        pST = cnBD.prepareStatement("INSERT INTO ControlVenta.Producto_Factura VALUES(?,?,?,?,?)");
                        pST.setInt(1, Vendedor.valorVenta);
                        pST.setInt(2, empleado.getId_sucursal());
                        pST.setString(3, codigo.getText());
                        pST.setInt(4, Integer.parseInt(cantidad.getText()));
                        if (rS.next()) {
                            operacion = Integer.parseInt(cantidad.getText()) * rS.getDouble(1);
                        }
                        pST.setDouble(5, operacion);
                        pST.execute();
                        pST2 = cnBD.prepareStatement("UPDATE ControlAdministrativo.Producto_Sucursal SET cantidad_sucursal=? WHERE codigo_producto=? AND id_sucursal=?;");
                        pST2.setInt(1, reduccionSucursal);
                        pST2.setString(2, codigo.getText());
                        pST2.setInt(3, empleado.getId_sucursal());
                        pST2.execute();
                        JOptionPane.showMessageDialog(null, "Se agrego el producto " + codigo.getText() + " a la compra " + Vendedor.valorVenta);
                    } else {
                        String instruccionSql = "SELECT cantidad_compra FROM ControlVenta.Producto_Factura WHERE codigo_producto='" + codigo.getText() + "' AND id_venta=" + Vendedor.valorVenta + ";";
                        rS = sT.executeQuery(instruccionSql);
                        String instruccionSql3 = "SELECT valor FROM ControlAdministrativo.Producto WHERE codigo_producto='" + codigo.getText() + "';";
                        rS2 = sT2.executeQuery(instruccionSql3);
                        pST = cnBD.prepareStatement("UPDATE ControlVenta.Producto_Factura SET cantidad_compra=?, total_producto_factura=? WHERE codigo_producto=? AND id_venta=?;");
                        if (rS.next()) {
                            suma = Integer.parseInt(cantidad.getText()) + rS.getInt(1);
                        }
                        if (rS2.next()) {
                            operacion = suma * rS2.getDouble(1);
                        }
                        pST.setInt(1, suma);
                        pST.setDouble(2, operacion);
                        pST.setString(3, codigo.getText());
                        pST.setInt(4, Vendedor.valorVenta);
                        pST.execute();
                        pST2 = cnBD.prepareStatement("UPDATE ControlAdministrativo.Producto_Sucursal SET cantidad_sucursal=? WHERE codigo_producto=? AND id_sucursal=?;");
                        pST2.setInt(1, reduccionSucursal);
                        pST2.setString(2, codigo.getText());
                        pST2.setInt(3, empleado.getId_sucursal());
                        pST2.execute();
                        JOptionPane.showMessageDialog(null, "Se aumento la cantidad de " + codigo.getText() + " a la compra " + Vendedor.valorVenta);
                    }
                }
            }
        }

        
    }
    public static void concluirVenta(Connection cnBD,Statement sT, ResultSet rS,PreparedStatement pST) throws SQLException{
        Statement sT1;
        ResultSet rS1;
        PreparedStatement pST2;
        double totalSinDescuento=0;
        double ultimaCompra=0;
        double gastoAcumuladoCliente=0;
        double descuento=0;
        double totalConDescuento=0;
        String instruccionSql="SELECT sum(total_producto_factura) FROM ControlVenta.Producto_Factura  WHERE id_venta="+Vendedor.valorVenta+";";
        String instruccionSql2="SELECT total_gasto,ultima_compra FROM ControlPersona.Cliente  WHERE nit='"+Vendedor.valorNit+"';";
        sT = cnBD.createStatement();
        sT1 = cnBD.createStatement();
        rS = sT.executeQuery(instruccionSql);
        rS1 = sT1.executeQuery(instruccionSql2);
        if(rS.next()){
            totalSinDescuento=rS.getDouble(1);
            if (Vendedor.valorNit.equals("C/F")) {
                descuento = 0;
            } else {
                if (rS1.next()) {
                    gastoAcumuladoCliente = rS1.getDouble(1);
                    ultimaCompra = rS1.getDouble(2);
                }
                if (ultimaCompra >= 1000 && ultimaCompra < 5000) {
                    descuento = 0.02;
                } else if (ultimaCompra >= 5000 && ultimaCompra < 10000) {
                    descuento = 0.05;
                } else if (ultimaCompra >= 10000) {
                    descuento = 0.10;
                }
            }
            totalConDescuento = totalSinDescuento * (1 - descuento);
            pST = cnBD.prepareStatement("UPDATE ControlVenta.Factura SET subtotal_venta=?, descuento=?, total_venta=? WHERE id_venta=?;");
            pST.setDouble(1, totalSinDescuento);
            pST.setDouble(2, descuento);
            pST.setDouble(3, totalConDescuento);
            pST.setInt(4, Vendedor.valorVenta);
            pST.execute();
            pST2 = cnBD.prepareStatement("UPDATE ControlPersona.Cliente SET total_gasto=?, ultima_compra=? WHERE nit=?;");
            gastoAcumuladoCliente=gastoAcumuladoCliente+totalConDescuento;
            pST2.setDouble(1, gastoAcumuladoCliente);
            pST2.setDouble(2, totalConDescuento);
            pST2.setString(3, Vendedor.valorNit);
            pST2.execute();
            JOptionPane.showMessageDialog(null, "Se finalizo la venta "+Vendedor.valorVenta+" solicitada por "+Vendedor.valorNit);
            Vendedor.valorVenta=0;
            Vendedor.valorNit="";
        }
    }
}
