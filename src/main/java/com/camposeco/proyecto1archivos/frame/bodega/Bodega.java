/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camposeco.proyecto1archivos.frame.bodega;

import com.camposeco.proyecto1archivos.bd.ConexionBD;
import com.camposeco.proyecto1archivos.Fondo;
import com.camposeco.proyecto1archivos.Restricciones;
import com.camposeco.proyecto1archivos.frame.Llamados;
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
public class Bodega extends javax.swing.JFrame {

    /**
     * Creates new form Start
     */
    Fondo inicio = new Fondo();//Creamos un nuevo fondo
    public Bodega() throws SQLException {
        inicio.obtenerDireccion("/images/bodega.jpg");
        this.setContentPane(inicio);//Realizamos la pintada de nuestro fondo
        initComponents();
        ConexionBD.listarProductosBodega(tablaProductosBodega);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductosBodega = new javax.swing.JTable();
        productosButton = new javax.swing.JButton();
        modificarProductoBodega = new javax.swing.JButton();
        textProveedor = new javax.swing.JTextField();
        textUbicacion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textCantidad = new javax.swing.JTextField();
        regresarOrden = new javax.swing.JButton();
        text2 = new javax.swing.JLabel();
        textNombreProducto = new javax.swing.JLabel();
        text3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        text1 = new javax.swing.JLabel();
        textID = new javax.swing.JLabel();
        textCodigoProducto = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaProductosBodega.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaProductosBodega.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProductosBodegaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaProductosBodega);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 100, 1000, 470));

        productosButton.setBackground(new java.awt.Color(0, 204, 255));
        productosButton.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        productosButton.setForeground(new java.awt.Color(0, 0, 0));
        productosButton.setText("Productos");
        productosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productosButtonActionPerformed(evt);
            }
        });
        getContentPane().add(productosButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 150, 70));

        modificarProductoBodega.setBackground(new java.awt.Color(255, 255, 0));
        modificarProductoBodega.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        modificarProductoBodega.setForeground(new java.awt.Color(0, 0, 0));
        modificarProductoBodega.setText("Modificar producto de bodega");
        modificarProductoBodega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarProductoBodegaActionPerformed(evt);
            }
        });
        getContentPane().add(modificarProductoBodega, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 740, 370, 25));

        textProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textProveedorActionPerformed(evt);
            }
        });
        getContentPane().add(textProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 690, 340, 30));

        textUbicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textUbicacionActionPerformed(evt);
            }
        });
        getContentPane().add(textUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 690, 390, 30));

        jLabel1.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Proveedor");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 660, -1, -1));

        jLabel2.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Ubicacion");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 660, -1, -1));

        textCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textCantidadKeyTyped(evt);
            }
        });
        getContentPane().add(textCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 690, 170, 30));

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

        text2.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        text2.setForeground(new java.awt.Color(0, 0, 0));
        text2.setText("Codigo: ");
        getContentPane().add(text2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 620, -1, -1));

        textNombreProducto.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        textNombreProducto.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(textNombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 620, 280, 20));

        text3.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        text3.setForeground(new java.awt.Color(0, 0, 0));
        text3.setText("Nombre de Producto:");
        getContentPane().add(text3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 620, -1, -1));

        jLabel4.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Cantidad");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 660, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/productosBodega.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, -1));

        text1.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        text1.setForeground(new java.awt.Color(0, 0, 0));
        text1.setText("Bodega:");
        getContentPane().add(text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 620, -1, -1));

        textID.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        textID.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(textID, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 620, 200, 20));

        textCodigoProducto.setFont(new java.awt.Font("Engravers MT", 0, 14)); // NOI18N
        textCodigoProducto.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(textCodigoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 620, 50, 20));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/modificacion.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 570, -1, 40));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 650, 980, 20));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 680, 90, 20));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 640, 70, 20));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 640, 70, 20));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 680, 100, 20));
        getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 680, 90, 20));
        getContentPane().add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 640, 200, 20));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ReportesFondo.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, 980, 120));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo.PNG"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 740, -1, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textProveedorActionPerformed

    private void regresarOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarOrdenActionPerformed
        this.dispose();
        Llamados.login();
    }//GEN-LAST:event_regresarOrdenActionPerformed

    private void tablaProductosBodegaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProductosBodegaMouseClicked
        try{
            int renglon = tablaProductosBodega.getSelectedRow();
            textID.setText(tablaProductosBodega.getValueAt(renglon, 0).toString());
            textCodigoProducto.setText(tablaProductosBodega.getValueAt(renglon, 1).toString());
            textNombreProducto.setText(tablaProductosBodega.getValueAt(renglon, 2).toString());
            textProveedor.setText(tablaProductosBodega.getValueAt(renglon, 3).toString());
            textUbicacion.setText(tablaProductosBodega.getValueAt(renglon, 4).toString());        
            textCantidad.setText(tablaProductosBodega.getValueAt(renglon, 5).toString());
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_tablaProductosBodegaMouseClicked

    private void productosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productosButtonActionPerformed
        this.dispose();
        Llamados.llamarProductoBodega();
    }//GEN-LAST:event_productosButtonActionPerformed

    private void modificarProductoBodegaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarProductoBodegaActionPerformed
        try {
            if (textProveedor.getText().isEmpty() || textUbicacion.getText().isEmpty() || textCantidad.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "No dejes casillas vacias");//Mensaje casilla vacia
            } else {
                String tmp = textCantidad.getText();
                if (Restricciones.verificarCantidad(tmp)) {
                    String id = textID.getText();
                    String codigoProducto = textCodigoProducto.getText();
                    String proveedor = textProveedor.getText();
                    String ubicacion = textUbicacion.getText();
                    int cantidad = Integer.parseInt(tmp);
                    ConexionBD.editarProductosBodega(id, codigoProducto, proveedor, ubicacion, cantidad);
                    ConexionBD.listarProductosBodega(tablaProductosBodega);
                } else {
                    JOptionPane.showMessageDialog(this, "Ingresa un numero entero en la cantidad");
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "No se pudo modificar el archivo" + ex);
        }
    }//GEN-LAST:event_modificarProductoBodegaActionPerformed

    private void textUbicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textUbicacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textUbicacionActionPerformed

    private void textCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textCantidadKeyTyped
        //metodo de restriccion de letras
        Restricciones.restringirLetras(evt);
    }//GEN-LAST:event_textCantidadKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JButton modificarProductoBodega;
    private javax.swing.JButton productosButton;
    private javax.swing.JButton regresarOrden;
    private javax.swing.JTable tablaProductosBodega;
    private javax.swing.JLabel text1;
    private javax.swing.JLabel text2;
    private javax.swing.JLabel text3;
    private javax.swing.JTextField textCantidad;
    private javax.swing.JLabel textCodigoProducto;
    private javax.swing.JLabel textID;
    private javax.swing.JLabel textNombreProducto;
    private javax.swing.JTextField textProveedor;
    private javax.swing.JTextField textUbicacion;
    // End of variables declaration//GEN-END:variables
}
