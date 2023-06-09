/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camposeco.proyecto1archivos.frame;

import com.camposeco.proyecto1archivos.bd.ConexionBD;
import com.camposeco.proyecto1archivos.Fondo;
import com.camposeco.proyecto1archivos.controladores.Empleado;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Mariano
 */
public class Start extends javax.swing.JFrame {

    /**
     * Creates new form Start
     */
    public static Empleado empleado=new Empleado();
    Fondo inicio = new Fondo();//Creamos un nuevo fondo
    public Start() {
        inicio.obtenerDireccion("/images/fondoOscuro.jpg");
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

        jLabel1 = new javax.swing.JLabel();
        salirButton = new javax.swing.JButton();
        textUser = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        textPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Electronic-Homes: LOGIN");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 72, -1, -1));

        salirButton.setBackground(new java.awt.Color(255, 0, 0));
        salirButton.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        salirButton.setForeground(new java.awt.Color(0, 0, 0));
        salirButton.setText("sALIR");
        salirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirButtonActionPerformed(evt);
            }
        });
        getContentPane().add(salirButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 90, 40));
        getContentPane().add(textUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 250, 33));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/HOMES.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ELECTRONIC.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        loginButton.setBackground(new java.awt.Color(0, 204, 204));
        loginButton.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        loginButton.setForeground(new java.awt.Color(0, 0, 0));
        loginButton.setText("LOGIN");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        getContentPane().add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 145, 54));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/candado.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo.PNG"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 460, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/usuario.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        textPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(textPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 250, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirButtonActionPerformed
        try {
            //finalizamos conexion y finalizamos
            ConexionBD.cerrarConexion();
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(Start.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_salirButtonActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        //pasamos a string los datos de jtextfield
        String usuario=textUser.getText();
        String password=textPassword.getText();
        //hacemos llamados a las pantallas segun su rol
        switch (ConexionBD.verificarLogin(usuario, password)) {
            case 1:
                this.dispose();
                Llamados.llamarVendedor();
                break;
            case 2:
                this.dispose();
                Llamados.llamarInventario();
                break;
            case 3:
                this.dispose();
                Llamados.llamarBodega();
                break;
            case 4:
                this.dispose();
                Llamados.llamarAdministrador();
                break;
            default:
                JOptionPane.showMessageDialog(null,"Usuario y password ingresados no coinciden, por favor verificar");
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void textPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPasswordActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton loginButton;
    private javax.swing.JButton salirButton;
    private javax.swing.JPasswordField textPassword;
    private javax.swing.JTextField textUser;
    // End of variables declaration//GEN-END:variables
}
