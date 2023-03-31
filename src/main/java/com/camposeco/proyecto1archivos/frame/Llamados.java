/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camposeco.proyecto1archivos.frame;

import com.camposeco.proyecto1archivos.frame.administrador.Administrador;
import com.camposeco.proyecto1archivos.frame.bodega.Bodega;
import com.camposeco.proyecto1archivos.frame.inventario.Inventario;
import com.camposeco.proyecto1archivos.frame.vendedor.Vendedor;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mariano
 */
public class Llamados {
    public static void llamarVendedor(){
        java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        try {
                            //iniciamos frame inicio
                            new Vendedor().setVisible(true);
                        } catch (SQLException ex) {
                            Logger.getLogger(Start.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                });
    }
    public static void llamarInventario(){
        java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        try {
                            //iniciamos frame inicio
                            new Inventario().setVisible(true);
                        } catch (SQLException ex) {
                            Logger.getLogger(Start.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                });
    }
    public static void llamarBodega() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    //iniciamos frame inicio
                    new Bodega().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Start.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    public static void llamarAdministrador(){
        java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        try {
                            //iniciamos frame inicio
                            new Administrador().setVisible(true);
                        } catch (SQLException ex) {
                            Logger.getLogger(Start.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                });
    }
}
