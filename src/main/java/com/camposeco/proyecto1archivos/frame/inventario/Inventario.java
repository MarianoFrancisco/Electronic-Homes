/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camposeco.proyecto1archivos.frame.inventario;

import com.camposeco.proyecto1archivos.Fondo;
import com.camposeco.proyecto1archivos.Restricciones;
import com.camposeco.proyecto1archivos.bd.ConexionBD;
import com.camposeco.proyecto1archivos.frame.Start;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Mariano
 */
public class Inventario extends javax.swing.JFrame {

    /**
     * Creates new form Start
     */
    Fondo inicio = new Fondo();//Creamos un nuevo fondo
    public Inventario() throws SQLException {
        inicio.obtenerDireccion("/images/inventario.PNG");
        this.setContentPane(inicio);//Realizamos la pintada de nuestro fondo
        initComponents();
        ConexionBD.listarProductos(tablaSolicitudes);
        ConexionBD.listarProductoSucursal(tablaSucursal);
        ConexionBD.cargarBodegas(textIngresarBodega);
        ConexionBD.cargarSucursal(textIngresarSucursal);
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

        regresarOrden = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaSucursal = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        textIngresarSucursal = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaSolicitudes = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        textCantidadIngresarSucursal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        textCodigoIngresarBodega = new javax.swing.JLabel();
        text2 = new javax.swing.JLabel();
        textCodigoIngresarSucursal = new javax.swing.JLabel();
        text3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        textIngresarBodega = new javax.swing.JComboBox<>();
        textCantidadIngresarBodega = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        textUbicacionIngresarBodega = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        textUbicacionIngresarSucursal = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        regresarOrden.setBackground(new java.awt.Color(255, 0, 0));
        regresarOrden.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        regresarOrden.setForeground(new java.awt.Color(0, 0, 0));
        regresarOrden.setText("CERRAR SESIÓN");
        regresarOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarOrdenActionPerformed(evt);
            }
        });
        getContentPane().add(regresarOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, 170, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/textSolicitar.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, -1, 60));

        tablaSucursal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaSucursal);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 480, 430));

        jButton1.setBackground(new java.awt.Color(255, 255, 51));
        jButton1.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Ingresar desde otra sucursal");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 740, -1, 20));

        jButton2.setBackground(new java.awt.Color(255, 255, 51));
        jButton2.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Ingresar desde bodega");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 740, -1, -1));

        getContentPane().add(textIngresarSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 660, 230, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo.PNG"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 740, -1, 40));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/productos.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, 60));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/textSucursal.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, 60));

        tablaSolicitudes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaSolicitudes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaSolicitudesMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablaSolicitudes);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, 480, 430));

        jLabel4.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Cantidad");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 710, -1, -1));

        textCantidadIngresarSucursal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textCantidadIngresarSucursalKeyTyped(evt);
            }
        });
        getContentPane().add(textCantidadIngresarSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 700, 60, 30));

        jLabel5.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Cantidad");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 710, -1, -1));

        textCodigoIngresarBodega.setFont(new java.awt.Font("Engravers MT", 0, 14)); // NOI18N
        textCodigoIngresarBodega.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(textCodigoIngresarBodega, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 710, 50, 20));

        text2.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        text2.setForeground(new java.awt.Color(0, 0, 0));
        text2.setText("Codigo: ");
        getContentPane().add(text2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 710, -1, -1));

        textCodigoIngresarSucursal.setFont(new java.awt.Font("Engravers MT", 0, 14)); // NOI18N
        textCodigoIngresarSucursal.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(textCodigoIngresarSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 710, 50, 20));

        text3.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        text3.setForeground(new java.awt.Color(0, 0, 0));
        text3.setText("Codigo: ");
        getContentPane().add(text3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 710, -1, -1));

        jLabel11.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Sucursal");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 630, 90, 20));

        jLabel13.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("bODEGA");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 630, 70, 20));

        getContentPane().add(textIngresarBodega, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 660, 240, 30));

        textCantidadIngresarBodega.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textCantidadIngresarBodegaKeyTyped(evt);
            }
        });
        getContentPane().add(textCantidadIngresarBodega, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 700, 60, 30));

        jLabel14.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Ubicacion");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 630, -1, -1));

        textUbicacionIngresarBodega.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textUbicacionIngresarBodegaKeyTyped(evt);
            }
        });
        getContentPane().add(textUbicacionIngresarBodega, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 660, 160, 30));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ReportesFondo.jpg"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 630, 470, 140));

        textUbicacionIngresarSucursal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textUbicacionIngresarSucursalKeyTyped(evt);
            }
        });
        getContentPane().add(textUbicacionIngresarSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 660, 170, 30));

        jLabel15.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Ubicacion");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 630, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ReportesFondo.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 630, 470, 140));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarOrdenActionPerformed
        this.dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //iniciamos frame inicio
                new Start().setVisible(true);
            }
        });
    }//GEN-LAST:event_regresarOrdenActionPerformed

    private void textCantidadIngresarSucursalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textCantidadIngresarSucursalKeyTyped
        Restricciones.restringirLetras(evt);
    }//GEN-LAST:event_textCantidadIngresarSucursalKeyTyped

    private void textCantidadIngresarBodegaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textCantidadIngresarBodegaKeyTyped
        Restricciones.restringirLetras(evt);
    }//GEN-LAST:event_textCantidadIngresarBodegaKeyTyped

    private void tablaSolicitudesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaSolicitudesMouseClicked
        try{
            int renglon = tablaSolicitudes.getSelectedRow();
            textCodigoIngresarBodega.setText(tablaSolicitudes.getValueAt(renglon, 0).toString());
            textCodigoIngresarSucursal.setText(tablaSolicitudes.getValueAt(renglon, 0).toString());
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_tablaSolicitudesMouseClicked

    private void textUbicacionIngresarBodegaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textUbicacionIngresarBodegaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_textUbicacionIngresarBodegaKeyTyped

    private void textUbicacionIngresarSucursalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textUbicacionIngresarSucursalKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_textUbicacionIngresarSucursalKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(textUbicacionIngresarSucursal.getText().isEmpty()||textCantidadIngresarSucursal.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor llena la ubicacion y la cantidad");
        }else{
            try {
                if (Restricciones.verificarCantidad(textCantidadIngresarSucursal.getText())) {
                    ConexionBD.ingresoSucursal(textIngresarSucursal, textCodigoIngresarSucursal, textUbicacionIngresarSucursal, textCantidadIngresarSucursal);
                    ConexionBD.listarProductoSucursal(tablaSucursal);
                } else {
                    JOptionPane.showMessageDialog(null, "Ingreso un numero entero en la cantidad");
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error"+ex);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(textUbicacionIngresarBodega.getText().isEmpty()||textCantidadIngresarBodega.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor llena la ubicacion y la cantidad");
        }else{
            try {
                if (Restricciones.verificarCantidad(textCantidadIngresarBodega.getText())) {
                    ConexionBD.ingresoBodega(textIngresarBodega, textCodigoIngresarBodega, textUbicacionIngresarBodega, textCantidadIngresarBodega);
                    ConexionBD.listarProductoSucursal(tablaSucursal);
                }else{
                    JOptionPane.showMessageDialog(null, "Ingreso un numero entero en la cantidad");
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error"+ex);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton regresarOrden;
    private javax.swing.JTable tablaSolicitudes;
    private javax.swing.JTable tablaSucursal;
    private javax.swing.JLabel text2;
    private javax.swing.JLabel text3;
    private javax.swing.JTextField textCantidadIngresarBodega;
    private javax.swing.JTextField textCantidadIngresarSucursal;
    private javax.swing.JLabel textCodigoIngresarBodega;
    private javax.swing.JLabel textCodigoIngresarSucursal;
    private javax.swing.JComboBox<String> textIngresarBodega;
    private javax.swing.JComboBox<String> textIngresarSucursal;
    private javax.swing.JTextField textUbicacionIngresarBodega;
    private javax.swing.JTextField textUbicacionIngresarSucursal;
    // End of variables declaration//GEN-END:variables
}
