/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camposeco.proyecto1archivos.bd;
import com.camposeco.proyecto1archivos.Encriptacion;
import java.sql.*;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
/**
 *
 * @author Mariano
 */

public class ConexionBD{
    public static Connection conexionBD;
    public static PreparedStatement pST;
    public static Statement sT;
    public static ResultSet rS;
    public static Encriptacion manejoEncriptaciones=new Encriptacion();
    public boolean empezarConexion() throws Exception{
        String driver= "org.postgresql.Driver";
        String link= "jdbc:postgresql://localhost:5432/electronic_homes";
        //String usuario="postgres";
        //String password= "Lis!1941";
        String usuario="electronic";
        String password= "Elec!5923*home!";
        try {
            Class.forName(driver);
            conexionBD=DriverManager.getConnection(link,usuario,password);
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error db: "+e.getMessage());
            return false;
        }
    }
    public static void cerrarConexion() throws SQLException{
        conexionBD.close();
    }
    //roles
    public static int verificarLogin(String usuario,String password){
        return ManejoEncriptacionBD.encriptarPassword(conexionBD,sT,rS, usuario,password);
    }
    //Vendedor
    public static void listarClientes(JTable tablaClientes) throws SQLException{
        AccionesVendedorBD.verClientes(conexionBD,sT,rS, tablaClientes);
    }
    public static void listarProductosFactura(JTable tablaProductosFactura) throws SQLException{
        AccionesVendedorBD.verProductosFactura(conexionBD,sT,rS, tablaProductosFactura);
    }
    public static void modificarCliente(JLabel nit, JTextField nombre,JTextField telefono,JTextField totalGasto,JTextField ultimoGasto) throws SQLException{
        AccionesVendedorBD.modificarCliente(conexionBD, rS, pST, nit,nombre,telefono,totalGasto,ultimoGasto);
    }
    public static void ingresarCliente(JTextField nit, JTextField nombre, JTextField telefono) throws SQLException{
        AccionesVendedorBD.registrarCliente(conexionBD,pST,nit,nombre,telefono);
    }
    public static void empezarVenta(JTextField nit) throws SQLException{
        AccionesVendedorBD.inicioVenta(conexionBD,sT,rS,pST, nit);
    }
    public static void agregarProductoVenta(JLabel codigo,JTextField cantidad) throws SQLException{
        AccionesVendedorBD.adicionarFacturaProducto(conexionBD,sT,rS,pST,codigo,cantidad);
    }
    public static void finalizarVenta() throws SQLException{
        AccionesVendedorBD.concluirVenta(conexionBD,sT,rS,pST);
    }
    //Inventario
    public static void ingresoSucursal(JComboBox sucursal,JLabel codigo, JTextField ubicacion,JTextField cantidad) throws SQLException{
        AccionesInventarioBD.moverDesdeSucursal(conexionBD, sT, rS, pST, sucursal, codigo, ubicacion, cantidad);
    }
    public static void ingresoBodega(JComboBox bodega,JLabel codigo, JTextField ubicacion,JTextField cantidad) throws SQLException{
        AccionesInventarioBD.moverDesdeBodega(conexionBD, sT, rS, pST, bodega, codigo, ubicacion, cantidad);
    }
    //Bodega
    public static void listarProductosBodega(JTable tablaProductosBodega) throws SQLException{
        AccionesBodegaBD.verProductosBodega(conexionBD,sT,rS, tablaProductosBodega);
    }
    public static void editarProductosBodega(String bodega,String codigo,String proveedor,String ubicacion,int cantidad) throws SQLException{
        AccionesBodegaBD.modificarProductosBodega(conexionBD,sT,rS,pST,bodega,codigo,proveedor,ubicacion,cantidad);
    }
    public static void listarProductos(JTable tablaProductos) throws SQLException{
        AccionesBodegaBD.verProductos(conexionBD,sT,rS, tablaProductos);
    }
    public static void editarProductos(JLabel codigo,JTextField nombre,JTextField marca,JTextField precio) throws SQLException{
        AccionesBodegaBD.modificarProductos(conexionBD,rS,pST,codigo,nombre,marca,precio);
    }
    public static void crearProducto(JTextField codigo,JTextField nombre,JTextField marca,JTextField valor){
        AccionesBodegaBD.registrarProductos(conexionBD,rS,pST,codigo,nombre,marca,valor);
    }
    public static void cargarBodegas(JComboBox cajaOpciones) throws SQLException{
        AccionesBodegaBD.agregarBoxBodega(conexionBD,sT,rS,cajaOpciones);
    }
    public static void ingresarBodega(JComboBox cajaOpciones,JLabel codigo,JTextField proveedor,JTextField ubicacion,JTextField cantidad) throws SQLException{
        AccionesBodegaBD.agregarProductoBodega(conexionBD,sT,rS,pST,cajaOpciones,codigo,proveedor,ubicacion,cantidad);
    }
    //Administrador
    public static void listarEmpleados(JTable tablaEmpleados) throws SQLException{
        AccionesAdministradorBD.verEmpleados(conexionBD,sT,rS, tablaEmpleados);
    }
    public static void ingresarEmpleado(JComboBox sucursales,JComboBox roles,JTextField textCui,JTextField textNombre,JTextField textTelefono,
            JTextField textEdad,JTextField textUsuario,JTextField textPassword) throws SQLException{
        AccionesAdministradorBD.registrarEmpleado(conexionBD,sT,rS,pST,sucursales,roles,textCui,textNombre,textTelefono,textEdad,textUsuario,textPassword,manejoEncriptaciones);
    }
    public static void cargarSucursalesRoles(JComboBox sucursales,JComboBox roles) throws SQLException{
        AccionesAdministradorBD.agregarBoxSucursalRol(conexionBD,sT,rS,sucursales,roles);
    }
    public static void listarProductoSucursal(JTable tablaProductoSucursal) throws SQLException{
        AccionesAdministradorBD.verProductoSucursal(conexionBD,sT,rS, tablaProductoSucursal);
    }
    public static void cargarSucursal(JComboBox sucursales) throws SQLException{
        AccionesAdministradorBD.agregarBoxSucursal(conexionBD,sT,rS,sucursales);
    }
    public static void generarReporte(JTable tablaReporte,int generarReporte,JComboBox sucursal) throws SQLException{
        AccionesAdministradorBD.generarReporte(conexionBD,sT,rS,tablaReporte,generarReporte,sucursal);
    }
}