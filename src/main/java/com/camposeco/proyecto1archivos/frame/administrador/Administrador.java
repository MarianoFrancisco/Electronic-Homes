/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camposeco.proyecto1archivos.frame.administrador;

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
public class Administrador extends javax.swing.JFrame {

    /**
     * Creates new form Start
     */
    Fondo inicio = new Fondo();//Creamos un nuevo fondo
    public Administrador() throws SQLException {
        inicio.obtenerDireccion("/images/administrador.jpg");
        this.setContentPane(inicio);//Realizamos la pintada de nuestro fondo
        initComponents();
        ConexionBD.listarEmpleados(tablaEmpleados);
        ConexionBD.cargarSucursalesRoles(textSucursal, textRol);
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

        generarReporte = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEmpleados = new javax.swing.JTable();
        regresarOrden = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        textCui = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        textNombre = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        textRol = new javax.swing.JComboBox<>();
        textSucursal = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        textEdad = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        textTelefono = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        textUsuario = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        textPassword = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        registrarEmpleados = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        generarReporte.setBackground(new java.awt.Color(0, 204, 255));
        generarReporte.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        generarReporte.setForeground(new java.awt.Color(0, 0, 0));
        generarReporte.setText("Generar reportes");
        generarReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarReporteActionPerformed(evt);
            }
        });
        getContentPane().add(generarReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 690, 260, 40));

        tablaEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaEmpleados);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 680, 670));

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

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo.PNG"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 740, -1, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/textEmpleados.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 480, 60));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/crearText.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 50, -1, -1));

        textCui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCuiActionPerformed(evt);
            }
        });
        textCui.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textCuiKeyTyped(evt);
            }
        });
        getContentPane().add(textCui, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 270, 240, 30));

        jLabel10.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("sUCURSAL");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 110, -1, -1));

        textNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNombreActionPerformed(evt);
            }
        });
        getContentPane().add(textNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 340, 240, 30));

        jLabel11.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("nOMBRE");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 310, -1, -1));

        getContentPane().add(textRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 210, 240, 30));

        getContentPane().add(textSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 140, 240, 30));

        jLabel12.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("rOL");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 180, -1, -1));

        jLabel13.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("cui");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 250, -1, -1));

        textEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textEdadActionPerformed(evt);
            }
        });
        textEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textEdadKeyTyped(evt);
            }
        });
        getContentPane().add(textEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 410, 50, 30));

        jLabel14.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("eDAD");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 380, -1, -1));

        textTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTelefonoActionPerformed(evt);
            }
        });
        textTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textTelefonoKeyTyped(evt);
            }
        });
        getContentPane().add(textTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 410, 170, 30));

        jLabel15.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("TELEFONO");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 380, -1, -1));

        textUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(textUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 480, 240, 30));

        jLabel16.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("USUARIO");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 450, -1, -1));

        jLabel17.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("PASSWORD");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 520, -1, -1));

        textPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(textPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 550, 240, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ReportesFondo.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 90, 280, 500));

        registrarEmpleados.setBackground(new java.awt.Color(255, 255, 51));
        registrarEmpleados.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        registrarEmpleados.setForeground(new java.awt.Color(0, 0, 0));
        registrarEmpleados.setText("Registrar Empleados");
        registrarEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarEmpleadosActionPerformed(evt);
            }
        });
        getContentPane().add(registrarEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 620, 260, 40));

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

    private void textCuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCuiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCuiActionPerformed

    private void textNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNombreActionPerformed

    private void textEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textEdadActionPerformed

    private void textTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textTelefonoActionPerformed

    private void textUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textUsuarioActionPerformed

    private void textPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPasswordActionPerformed

    private void textCuiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textCuiKeyTyped
        Restricciones.restringCui(evt, textCui.getText());
        Restricciones.restringirLetras(evt);
    }//GEN-LAST:event_textCuiKeyTyped

    private void textTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textTelefonoKeyTyped
        Restricciones.restringirLetras(evt);
    }//GEN-LAST:event_textTelefonoKeyTyped

    private void textEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textEdadKeyTyped
        Restricciones.restringirLetras(evt);
    }//GEN-LAST:event_textEdadKeyTyped

    private void registrarEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarEmpleadosActionPerformed
        if (textCui.getText().isEmpty() || textNombre.getText().isEmpty() || textTelefono.getText().isEmpty()||
                textEdad.getText().isEmpty()||textUsuario.getText().isEmpty()||textPassword.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No dejes casillas vacias");//Mensaje casilla vacia
        }else{
            if(textCui.getText().length()<13){
                JOptionPane.showMessageDialog(null, "El cui debe de ser de 13 numeros");//Mensaje casilla vacia
            } else {
                try {
                    ConexionBD.ingresarEmpleado(textSucursal, textRol, textCui, textNombre, textTelefono, textEdad, textUsuario, textPassword);
                    ConexionBD.listarEmpleados(tablaEmpleados);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error al ingresar empleado");
                }
            }
        }
    }//GEN-LAST:event_registrarEmpleadosActionPerformed

    private void generarReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarReporteActionPerformed
        this.dispose();
        Llamados.llamarAdministradorReportes();
    }//GEN-LAST:event_generarReporteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton generarReporte;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton registrarEmpleados;
    private javax.swing.JButton regresarOrden;
    private javax.swing.JTable tablaEmpleados;
    private javax.swing.JTextField textCui;
    private javax.swing.JTextField textEdad;
    private javax.swing.JTextField textNombre;
    private javax.swing.JTextField textPassword;
    private javax.swing.JComboBox<String> textRol;
    private javax.swing.JComboBox<String> textSucursal;
    private javax.swing.JTextField textTelefono;
    private javax.swing.JTextField textUsuario;
    // End of variables declaration//GEN-END:variables
}
