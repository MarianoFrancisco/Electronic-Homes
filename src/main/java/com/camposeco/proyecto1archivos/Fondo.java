/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camposeco.proyecto1archivos;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Mariano
 */
public class Fondo extends JPanel {
    private Image imagen;//establecemos que sea tipo imagen
    private ImageIcon imagenIcono;
    private Icon icono;
    String direccionImagen;
    public void obtenerDireccion(String direccion){
        direccionImagen=direccion;
    }
    @Override//sobrescribimos la clase JPanel especificamente el metodo paint
    public void paint(Graphics g){ 
        imagen = new ImageIcon(getClass().getResource(direccionImagen)).getImage();//igualamos nuestra variable al fondo que queremos
        g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);//damos las dimensiones
        setOpaque(false);//Ponemos que el panel no sea visible
        super.paint(g);//llamos a la clase super para que cumpla con las funcionalidades del JPanel
    }

}
