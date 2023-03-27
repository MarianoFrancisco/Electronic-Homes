/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camposeco.proyecto1archivos.frame.administrador;

import com.camposeco.proyecto1archivos.Fondo;
import com.camposeco.proyecto1archivos.bd.ConexionBD;
import com.camposeco.proyecto1archivos.frame.Start;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author Mariano
 */
public class Administrador_Reportes extends javax.swing.JFrame {

    /**
     * Creates new form Start
     */
    Fondo inicio = new Fondo();//Creamos un nuevo fondo
    public Administrador_Reportes() {
        inicio.obtenerDireccion("/images/administrador.jpg");
        this.setContentPane(inicio);//Realizamos la pintada de nuestro fondo
        initComponents();
        this.setLocationRelativeTo(null);//Centramos nuestro frame
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        regresarOrden = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        top5 = new javax.swing.JTable();
        productoMasIngresoSucursal = new javax.swing.JButton();
        productoMasIngreso = new javax.swing.JButton();
        clienteMasGanancia = new javax.swing.JButton();
        productoMasVendido = new javax.swing.JButton();
        sucursalMasVenta = new javax.swing.JButton();
        sucursalMasIngreso = new javax.swing.JButton();
        empleadoMasVenta = new javax.swing.JButton();
        empleadoMasIngreso = new javax.swing.JButton();
        productoMasVenididoSucursal = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        top10 = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        top3 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/5.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, -1, 40));

        regresarOrden.setBackground(new java.awt.Color(255, 0, 0));
        regresarOrden.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        regresarOrden.setForeground(new java.awt.Color(0, 0, 0));
        regresarOrden.setText("Regresar");
        regresarOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarOrdenActionPerformed(evt);
            }
        });
        getContentPane().add(regresarOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        top5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {""},
                {""}
            },
            new String [] {
                "SELECCIONA UN TOP 5 PARA VISUALIZAR EL REPORTE"
            }
        ));
        jScrollPane5.setViewportView(top5);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 870, 250));

        productoMasIngresoSucursal.setBackground(new java.awt.Color(255, 255, 51));
        productoMasIngresoSucursal.setForeground(new java.awt.Color(0, 0, 0));
        productoMasIngresoSucursal.setText("PRODUCTOS CON MÁS INGRESOS POR SUCURSAL");
        productoMasIngresoSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productoMasIngresoSucursalActionPerformed(evt);
            }
        });
        getContentPane().add(productoMasIngresoSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 300, -1, -1));

        productoMasIngreso.setBackground(new java.awt.Color(255, 255, 51));
        productoMasIngreso.setForeground(new java.awt.Color(0, 0, 0));
        productoMasIngreso.setText("PRODUCTOS CON MÁS INGRESOS");
        productoMasIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productoMasIngresoActionPerformed(evt);
            }
        });
        getContentPane().add(productoMasIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, -1, -1));

        clienteMasGanancia.setBackground(new java.awt.Color(255, 255, 51));
        clienteMasGanancia.setForeground(new java.awt.Color(0, 0, 0));
        clienteMasGanancia.setText("CLIENTES QUE MÁS GANANCIAS GENERAN");
        clienteMasGanancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteMasGananciaActionPerformed(evt);
            }
        });
        getContentPane().add(clienteMasGanancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, -1, -1));

        productoMasVendido.setBackground(new java.awt.Color(255, 255, 51));
        productoMasVendido.setForeground(new java.awt.Color(0, 0, 0));
        productoMasVendido.setText("PRODUCTOS MÁS VENDIDOS");
        productoMasVendido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productoMasVendidoActionPerformed(evt);
            }
        });
        getContentPane().add(productoMasVendido, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        sucursalMasVenta.setBackground(new java.awt.Color(255, 255, 51));
        sucursalMasVenta.setForeground(new java.awt.Color(0, 0, 0));
        sucursalMasVenta.setText("SUCURSALES CON MÁS VENTAS");
        sucursalMasVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sucursalMasVentaActionPerformed(evt);
            }
        });
        getContentPane().add(sucursalMasVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 600, -1, -1));

        sucursalMasIngreso.setBackground(new java.awt.Color(255, 255, 51));
        sucursalMasIngreso.setForeground(new java.awt.Color(0, 0, 0));
        sucursalMasIngreso.setText("SUCURSALES CON MÁS INGRESOS");
        sucursalMasIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sucursalMasIngresoActionPerformed(evt);
            }
        });
        getContentPane().add(sucursalMasIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 600, -1, -1));

        empleadoMasVenta.setBackground(new java.awt.Color(255, 255, 51));
        empleadoMasVenta.setForeground(new java.awt.Color(0, 0, 0));
        empleadoMasVenta.setText("EMPLEADOS CON MÁS VENTAS");
        empleadoMasVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empleadoMasVentaActionPerformed(evt);
            }
        });
        getContentPane().add(empleadoMasVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 600, -1, -1));

        empleadoMasIngreso.setBackground(new java.awt.Color(255, 255, 51));
        empleadoMasIngreso.setForeground(new java.awt.Color(0, 0, 0));
        empleadoMasIngreso.setText("EMPLEADOS CON MÁS INGRESOS");
        empleadoMasIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empleadoMasIngresoActionPerformed(evt);
            }
        });
        getContentPane().add(empleadoMasIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 600, -1, -1));

        productoMasVenididoSucursal.setBackground(new java.awt.Color(255, 255, 51));
        productoMasVenididoSucursal.setForeground(new java.awt.Color(0, 0, 0));
        productoMasVenididoSucursal.setText("PRODUCTOS MÁS VENDIDOS POR SUCURSAL");
        productoMasVenididoSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productoMasVenididoSucursalActionPerformed(evt);
            }
        });
        getContentPane().add(productoMasVenididoSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, -1, -1));

        top10.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {""}
            },
            new String [] {
                "SELECCIONA UN TOP 10 PARA VISUALIZAR EL REPORTE"
            }
        ));
        jScrollPane6.setViewportView(top10);

        getContentPane().add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 870, 230));

        top3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {""}
            },
            new String [] {
                "SELECCIONA UN TOP 3 PARA VISUALIZAR EL REPORTE"
            }
        ));
        jScrollPane7.setViewportView(top3);

        getContentPane().add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 640, 870, 90));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo.PNG"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 740, -1, 40));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/10.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, 40));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Top.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, 40));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/3.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 670, -1, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarOrdenActionPerformed
        this.dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    //iniciamos frame inicio
                    new Administrador().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Administrador_Reportes.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }//GEN-LAST:event_regresarOrdenActionPerformed

    private void clienteMasGananciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteMasGananciaActionPerformed
        try {
            ConexionBD.generarReporte(top10, 2);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al generar reporte");
        }
    }//GEN-LAST:event_clienteMasGananciaActionPerformed

    private void sucursalMasVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sucursalMasVentaActionPerformed
        try {
            ConexionBD.generarReporte(top3, 3);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al generar reporte");
        }
    }//GEN-LAST:event_sucursalMasVentaActionPerformed

    private void productoMasVendidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productoMasVendidoActionPerformed
        try {
            ConexionBD.generarReporte(top10, 1);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al generar reporte");
        }
    }//GEN-LAST:event_productoMasVendidoActionPerformed

    private void productoMasVenididoSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productoMasVenididoSucursalActionPerformed
        try {
            ConexionBD.generarReporte(top5, 8);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al generar reporte");
        }
    }//GEN-LAST:event_productoMasVenididoSucursalActionPerformed

    private void productoMasIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productoMasIngresoActionPerformed
        try {
            ConexionBD.generarReporte(top10, 7);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al generar reporte");
        }
    }//GEN-LAST:event_productoMasIngresoActionPerformed

    private void productoMasIngresoSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productoMasIngresoSucursalActionPerformed
        try {
            ConexionBD.generarReporte(top5, 9);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al generar reporte"+ex);
        }
    }//GEN-LAST:event_productoMasIngresoSucursalActionPerformed

    private void sucursalMasIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sucursalMasIngresoActionPerformed
        try {
            ConexionBD.generarReporte(top3, 4);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al generar reporte");
        }
    }//GEN-LAST:event_sucursalMasIngresoActionPerformed

    private void empleadoMasVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empleadoMasVentaActionPerformed
        try {
            ConexionBD.generarReporte(top3, 5);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al generar reporte");
        }
    }//GEN-LAST:event_empleadoMasVentaActionPerformed

    private void empleadoMasIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empleadoMasIngresoActionPerformed
        try {
            ConexionBD.generarReporte(top3, 6);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al generar reporte");
        }
    }//GEN-LAST:event_empleadoMasIngresoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clienteMasGanancia;
    private javax.swing.JButton empleadoMasIngreso;
    private javax.swing.JButton empleadoMasVenta;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JButton productoMasIngreso;
    private javax.swing.JButton productoMasIngresoSucursal;
    private javax.swing.JButton productoMasVendido;
    private javax.swing.JButton productoMasVenididoSucursal;
    private javax.swing.JButton regresarOrden;
    private javax.swing.JButton sucursalMasIngreso;
    private javax.swing.JButton sucursalMasVenta;
    private javax.swing.JTable top10;
    private javax.swing.JTable top3;
    private javax.swing.JTable top5;
    // End of variables declaration//GEN-END:variables
}
