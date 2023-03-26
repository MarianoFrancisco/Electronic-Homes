/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camposeco.proyecto1archivos.frame.bodega;

import com.camposeco.proyecto1archivos.frame.inventario.*;
import com.camposeco.proyecto1archivos.Fondo;
import com.camposeco.proyecto1archivos.bd.ConexionBD;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Mariano
 */
public class Producto_Bodega extends javax.swing.JFrame {

    /**
     * Creates new form Start
     */
    Fondo inicio = new Fondo();//Creamos un nuevo fondo
    public Producto_Bodega() throws SQLException {
        inicio.obtenerDireccion("/images/productos.jpeg");
        this.setContentPane(inicio);//Realizamos la pintada de nuestro fondo
        initComponents();
        ConexionBD.listarProductos(tablaProductos);
        ConexionBD.cargarBodegas(bodegaLista);
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        ingresarBodega = new javax.swing.JButton();
        modificarProducto = new javax.swing.JButton();
        crearNuevoProducto = new javax.swing.JButton();
        textCodigoCrear = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        textNombreCrear = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textMarcaCrear = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        textPrecioCrear = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        textCodigoIngresar = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textUbicacionIngresar = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        textCodigoModificar = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        textNombreModificar = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        textMarcaModificar = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        textPrecioModificar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        textCantidadIngresar = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        textProveedorIngresar = new javax.swing.JTextField();
        bodegaLista = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/productos.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/crear.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 10, -1, -1));

        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaProductos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 710, 420));

        ingresarBodega.setBackground(new java.awt.Color(255, 255, 0));
        ingresarBodega.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        ingresarBodega.setForeground(new java.awt.Color(0, 0, 0));
        ingresarBodega.setText("ingresar a bodega");
        ingresarBodega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarBodegaActionPerformed(evt);
            }
        });
        getContentPane().add(ingresarBodega, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 740, 220, 25));

        modificarProducto.setBackground(new java.awt.Color(255, 255, 0));
        modificarProducto.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        modificarProducto.setForeground(new java.awt.Color(0, 0, 0));
        modificarProducto.setText("Modificar producto");
        modificarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarProductoActionPerformed(evt);
            }
        });
        getContentPane().add(modificarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 740, 250, 20));

        crearNuevoProducto.setBackground(new java.awt.Color(255, 255, 0));
        crearNuevoProducto.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        crearNuevoProducto.setForeground(new java.awt.Color(0, 0, 0));
        crearNuevoProducto.setText("Crear nuevo producto");
        crearNuevoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearNuevoProductoActionPerformed(evt);
            }
        });
        getContentPane().add(crearNuevoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 410, 260, 25));

        textCodigoCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCodigoCrearActionPerformed(evt);
            }
        });
        getContentPane().add(textCodigoCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 100, 220, 30));

        jLabel1.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Codigo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 510, -1, -1));

        textNombreCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNombreCrearActionPerformed(evt);
            }
        });
        getContentPane().add(textNombreCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 170, 220, 30));

        jLabel2.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 140, -1, -1));

        textMarcaCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textMarcaCrearActionPerformed(evt);
            }
        });
        getContentPane().add(textMarcaCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 250, 220, 30));

        jLabel8.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("marca");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 220, -1, -1));

        textPrecioCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPrecioCrearActionPerformed(evt);
            }
        });
        textPrecioCrear.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textPrecioCrearKeyTyped(evt);
            }
        });
        getContentPane().add(textPrecioCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 330, 220, 30));

        jLabel9.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("precio");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 300, -1, -1));

        textCodigoIngresar.setFont(new java.awt.Font("Engravers MT", 0, 18)); // NOI18N
        textCodigoIngresar.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(textCodigoIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 510, 70, 20));

        jLabel10.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Codigo");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 70, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ReportesFondo.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 60, 240, 330));

        textUbicacionIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textUbicacionIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(textUbicacionIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 630, 220, 30));

        jLabel11.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("ubicacion");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 600, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo.PNG"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 740, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/modificar.png"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 550, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ingresar.png"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 460, -1, -1));

        jLabel15.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Codigo");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 610, -1, -1));

        textCodigoModificar.setFont(new java.awt.Font("Engravers MT", 0, 18)); // NOI18N
        textCodigoModificar.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(textCodigoModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 610, 90, 20));

        jLabel16.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("nombre");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 650, -1, -1));

        textNombreModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNombreModificarActionPerformed(evt);
            }
        });
        getContentPane().add(textNombreModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 680, 180, 30));

        jLabel17.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("marca");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 650, -1, -1));

        textMarcaModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textMarcaModificarActionPerformed(evt);
            }
        });
        getContentPane().add(textMarcaModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 680, 220, 30));

        jLabel18.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("precio");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 650, -1, -1));

        textPrecioModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPrecioModificarActionPerformed(evt);
            }
        });
        textPrecioModificar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textPrecioModificarKeyTyped(evt);
            }
        });
        getContentPane().add(textPrecioModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 680, 160, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ReportesFondo.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, 710, 130));

        jLabel19.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Cantidad");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 670, -1, -1));

        textCantidadIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCantidadIngresarActionPerformed(evt);
            }
        });
        textCantidadIngresar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textCantidadIngresarKeyTyped(evt);
            }
        });
        getContentPane().add(textCantidadIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 690, 220, 30));

        jLabel20.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("proveedor");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 540, -1, -1));

        textProveedorIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textProveedorIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(textProveedorIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 560, 220, 30));

        getContentPane().add(bodegaLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 470, 140, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ReportesFondo.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 500, 240, 230));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarOrdenActionPerformed
        this.dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    //iniciamos frame inicio
                    new Bodega().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Producto_Bodega.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }//GEN-LAST:event_regresarOrdenActionPerformed

    private void tablaProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProductosMouseClicked
        try{
            int renglon = tablaProductos.getSelectedRow();
            textCodigoModificar.setText(tablaProductos.getValueAt(renglon, 0).toString());
            textCodigoIngresar.setText(tablaProductos.getValueAt(renglon, 0).toString());
            textNombreModificar.setText(tablaProductos.getValueAt(renglon, 1).toString());
            textMarcaModificar.setText(tablaProductos.getValueAt(renglon, 2).toString());
            textPrecioModificar.setText(tablaProductos.getValueAt(renglon, 3).toString());
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_tablaProductosMouseClicked

    private void ingresarBodegaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarBodegaActionPerformed
        if (textProveedorIngresar.getText().isEmpty() || textUbicacionIngresar.getText().isEmpty() || textCantidadIngresar.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No dejes casillas vacias");//Mensaje casilla vacia
        }else{
            try {
                ConexionBD.ingresarBodega(bodegaLista,textCodigoIngresar, textProveedorIngresar, textUbicacionIngresar, textCantidadIngresar);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al ingresar producto a bodega");
            }
        }
    }//GEN-LAST:event_ingresarBodegaActionPerformed

    private void crearNuevoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearNuevoProductoActionPerformed
        if (textCodigoCrear.getText().isEmpty()||textNombreCrear.getText().isEmpty() || textMarcaCrear.getText().isEmpty() || textPrecioCrear.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No dejes casillas vacias");//Mensaje casilla vacia
        }else{
            ConexionBD.crearProducto(textCodigoCrear, textNombreCrear, textMarcaCrear, textPrecioCrear);
            try {
                ConexionBD.listarProductos(tablaProductos);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error acutalizar tabla");
            }
        }
    }//GEN-LAST:event_crearNuevoProductoActionPerformed

    private void textCodigoCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCodigoCrearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCodigoCrearActionPerformed

    private void textNombreCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNombreCrearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNombreCrearActionPerformed

    private void textMarcaCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textMarcaCrearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textMarcaCrearActionPerformed

    private void textPrecioCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPrecioCrearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPrecioCrearActionPerformed

    private void textUbicacionIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textUbicacionIngresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textUbicacionIngresarActionPerformed

    private void textNombreModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNombreModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNombreModificarActionPerformed

    private void textMarcaModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textMarcaModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textMarcaModificarActionPerformed

    private void textPrecioModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPrecioModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPrecioModificarActionPerformed

    private void modificarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarProductoActionPerformed
        try {
            if(textNombreModificar.getText().isEmpty()||textMarcaModificar.getText().isEmpty()||textPrecioModificar.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "No dejes casillas vacias");//Mensaje casilla vacia
            }else{
            ConexionBD.editarProductos(textCodigoIngresar,textNombreModificar,textMarcaModificar,textPrecioModificar);
            ConexionBD.listarProductos(tablaProductos);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "No se pudo modificar el archivo"+ex);
        }
    }//GEN-LAST:event_modificarProductoActionPerformed

    private void textCantidadIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCantidadIngresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCantidadIngresarActionPerformed

    private void textProveedorIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textProveedorIngresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textProveedorIngresarActionPerformed

    private void textPrecioModificarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textPrecioModificarKeyTyped
        char comprobarSiEsLetra = evt.getKeyChar();//Creamos variable tipo caracter para que no pueda escribir letras
        if(Character.isLetter(comprobarSiEsLetra)){//Comprobamos si el usuario escribe letras
            evt.consume();//el evento no permite seguir escribiendo
            Toolkit.getDefaultToolkit().beep();//sonido de error
            JOptionPane.showMessageDialog(null, "No puedes escribir letras, unicamente digitos");//Mensaje condicional no escribir letras
        }
    }//GEN-LAST:event_textPrecioModificarKeyTyped

    private void textPrecioCrearKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textPrecioCrearKeyTyped
        char comprobarSiEsLetra = evt.getKeyChar();//Creamos variable tipo caracter para que no pueda escribir letras
        if(Character.isLetter(comprobarSiEsLetra)){//Comprobamos si el usuario escribe letras
            evt.consume();//el evento no permite seguir escribiendo
            Toolkit.getDefaultToolkit().beep();//sonido de error
            JOptionPane.showMessageDialog(null, "No puedes escribir letras, unicamente digitos");//Mensaje condicional no escribir letras
        }
    }//GEN-LAST:event_textPrecioCrearKeyTyped

    private void textCantidadIngresarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textCantidadIngresarKeyTyped
        char comprobarSiEsLetra = evt.getKeyChar();//Creamos variable tipo caracter para que no pueda escribir letras
        if(Character.isLetter(comprobarSiEsLetra)){//Comprobamos si el usuario escribe letras
            evt.consume();//el evento no permite seguir escribiendo
            Toolkit.getDefaultToolkit().beep();//sonido de error
            JOptionPane.showMessageDialog(null, "No puedes escribir letras, unicamente digitos");//Mensaje condicional no escribir letras
        }
    }//GEN-LAST:event_textCantidadIngresarKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> bodegaLista;
    private javax.swing.JButton crearNuevoProducto;
    private javax.swing.JButton ingresarBodega;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modificarProducto;
    private javax.swing.JButton regresarOrden;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JTextField textCantidadIngresar;
    private javax.swing.JTextField textCodigoCrear;
    private javax.swing.JLabel textCodigoIngresar;
    private javax.swing.JLabel textCodigoModificar;
    private javax.swing.JTextField textMarcaCrear;
    private javax.swing.JTextField textMarcaModificar;
    private javax.swing.JTextField textNombreCrear;
    private javax.swing.JTextField textNombreModificar;
    private javax.swing.JTextField textPrecioCrear;
    private javax.swing.JTextField textPrecioModificar;
    private javax.swing.JTextField textProveedorIngresar;
    private javax.swing.JTextField textUbicacionIngresar;
    // End of variables declaration//GEN-END:variables
}
