/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camposeco.proyecto1archivos.frame.vendedor;

import com.camposeco.proyecto1archivos.Fondo;
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
public class Vendedor_Clientes extends javax.swing.JFrame {

    /**
     * Creates new form Start
     */
    Fondo inicio = new Fondo();//Creamos un nuevo fondo
    public Vendedor_Clientes() throws SQLException {
        inicio.obtenerDireccion("/images/ventas.jpg");
        this.setContentPane(inicio);//Realizamos la pintada de nuestro fondo
        initComponents();
        ConexionBD.listarClientes(tablaClientes);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        regresarOrden = new javax.swing.JButton();
        textNombre = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        textTelefono = new javax.swing.JTextField();
        textTotalGasto = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        textUltimaCompra = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        NIT = new javax.swing.JLabel();
        textNit = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clientes.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, 70));

        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaClientes);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 990, 500));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo.PNG"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 740, -1, 40));

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

        textNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textNombreKeyTyped(evt);
            }
        });
        getContentPane().add(textNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 680, 220, 30));

        jLabel14.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Nombre");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 660, -1, -1));

        jLabel15.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("tELEFONO");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 660, -1, -1));

        textTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textTelefonoKeyTyped(evt);
            }
        });
        getContentPane().add(textTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 680, 160, 30));

        textTotalGasto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textTotalGastoKeyTyped(evt);
            }
        });
        getContentPane().add(textTotalGasto, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 680, 150, 30));

        jLabel16.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("tOTAL gASTO");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 660, -1, -1));

        textUltimaCompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textUltimaCompraKeyTyped(evt);
            }
        });
        getContentPane().add(textUltimaCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 680, 130, 30));

        jLabel17.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("uLTIMA cOMPRA");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 660, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 51));
        jButton1.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Modificar cliente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 750, -1, -1));

        NIT.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        NIT.setForeground(new java.awt.Color(0, 0, 0));
        NIT.setText("nit");
        getContentPane().add(NIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 680, -1, -1));

        textNit.setFont(new java.awt.Font("Engravers MT", 0, 14)); // NOI18N
        textNit.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(textNit, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 680, 160, 20));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ReportesFondo.jpg"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 650, 990, 80));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/modificar.png"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 610, -1, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarOrdenActionPerformed
        this.dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    //iniciamos frame inicio
                    new Vendedor().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Vendedor_Clientes.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }//GEN-LAST:event_regresarOrdenActionPerformed

    private void tablaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaClientesMouseClicked
        try{
            int renglon = tablaClientes.getSelectedRow();
            textNit.setText(tablaClientes.getValueAt(renglon, 0).toString());
            textNombre.setText(tablaClientes.getValueAt(renglon, 1).toString());
            textTelefono.setText(tablaClientes.getValueAt(renglon, 2).toString());
            textTotalGasto.setText(tablaClientes.getValueAt(renglon, 3).toString());
            textUltimaCompra.setText(tablaClientes.getValueAt(renglon, 4).toString());
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_tablaClientesMouseClicked

    private void textNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textNombreKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_textNombreKeyTyped

    private void textTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textTelefonoKeyTyped
        char comprobarSiEsLetra = evt.getKeyChar();//Creamos variable tipo caracter para que no pueda escribir letras
        if(Character.isLetter(comprobarSiEsLetra)){//Comprobamos si el usuario escribe letras
            evt.consume();//el evento no permite seguir escribiendo
            Toolkit.getDefaultToolkit().beep();//sonido de error
            JOptionPane.showMessageDialog(null, "No puedes escribir letras, unicamente digitos");//Mensaje condicional no escribir letras
        }
    }//GEN-LAST:event_textTelefonoKeyTyped

    private void textTotalGastoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textTotalGastoKeyTyped
        char comprobarSiEsLetra = evt.getKeyChar();//Creamos variable tipo caracter para que no pueda escribir letras
        if(Character.isLetter(comprobarSiEsLetra)){//Comprobamos si el usuario escribe letras
            evt.consume();//el evento no permite seguir escribiendo
            Toolkit.getDefaultToolkit().beep();//sonido de error
            JOptionPane.showMessageDialog(null, "No puedes escribir letras, unicamente digitos");//Mensaje condicional no escribir letras
        }
    }//GEN-LAST:event_textTotalGastoKeyTyped

    private void textUltimaCompraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textUltimaCompraKeyTyped
        char comprobarSiEsLetra = evt.getKeyChar();//Creamos variable tipo caracter para que no pueda escribir letras
        if(Character.isLetter(comprobarSiEsLetra)){//Comprobamos si el usuario escribe letras
            evt.consume();//el evento no permite seguir escribiendo
            Toolkit.getDefaultToolkit().beep();//sonido de error
            JOptionPane.showMessageDialog(null, "No puedes escribir letras, unicamente digitos");//Mensaje condicional no escribir letras
        }
    }//GEN-LAST:event_textUltimaCompraKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(textTotalGasto.getText().isEmpty()||textUltimaCompra.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor llena el total de gasto y la ultima compra");
        }else{
            try {
                ConexionBD.modificarCliente(textNit, textNombre, textTelefono, textTotalGasto, textTotalGasto);
                ConexionBD.listarClientes(tablaClientes);
            } catch (SQLException ex) {
                JOptionPane.showConfirmDialog(null, "Error"+ex);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NIT;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton regresarOrden;
    private javax.swing.JTable tablaClientes;
    private javax.swing.JLabel textNit;
    private javax.swing.JTextField textNombre;
    private javax.swing.JTextField textTelefono;
    private javax.swing.JTextField textTotalGasto;
    private javax.swing.JTextField textUltimaCompra;
    // End of variables declaration//GEN-END:variables
}
