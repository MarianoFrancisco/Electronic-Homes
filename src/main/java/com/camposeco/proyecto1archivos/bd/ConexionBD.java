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
        String usuario="postgres";
        String password= "Lis!1941";
        try {
            Class.forName(driver);
            conexionBD=DriverManager.getConnection(link,usuario,password);
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error db: "+e.getMessage());
            return false;
        }
    }
    //roles
    public static int verificarLogin(JTextField usuario,JTextField password){
        return ManejoEncriptacionBD.encriptarPassword(conexionBD,sT,rS, usuario,password);
    }
    //Vendedor
    //Inventario
    //Bodega
    public static void listarProductosBodega(JTable tablaProductosBodega) throws SQLException{
        AccionesBodegaBD.verProductosBodega(conexionBD,sT,rS, tablaProductosBodega);
    }
    public static void editarProductosBodega(JLabel bodega,JLabel codigo,JTextField proveedor,JTextField ubicacion,JTextField cantidad) throws SQLException{
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
    
}