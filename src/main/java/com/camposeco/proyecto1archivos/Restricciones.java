/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camposeco.proyecto1archivos;

import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author Mariano
 */
public class Restricciones {
    public static boolean verificarNumero(String numero) {
        //puede venir o no el +talNumero, puede haber espacio y tiene que ir 1 o mas numeros, por ejemplo +50231840649,+502 31840649, 31840649
        return numero.matches("(\\+[0-9]*)?( )?[0-9]+");
    }
    public static boolean verificarPrecio(String precio) {
        //1.3 o 1 o 11.3
        return precio.matches("[0-9]+(\\.[0-9]+)?");
    }
    public static boolean verificarCantidad(String cantidad) {
        //1.3 o 1 o 11.3
        return cantidad.matches("[0-9]+");
    }
    public static void restringirLetras(java.awt.event.KeyEvent evt){
        char comprobarSiEsLetra = evt.getKeyChar();//Creamos variable tipo caracter para que no pueda escribir letras
        if(Character.isLetter(comprobarSiEsLetra)){//Comprobamos si el usuario escribe letras
            evt.consume();//el evento no permite seguir escribiendo
            Toolkit.getDefaultToolkit().beep();//sonido de error
            JOptionPane.showMessageDialog(null, "No puedes escribir letras, unicamente digitos");//Mensaje condicional no escribir letras
        }
    }
    public static void restringCui(java.awt.event.KeyEvent evt,String cui){
        if(cui.length()>12){//restringimos que no puede escribir mas de 13 digitos
            evt.consume();//el evento no permite seguir escribiendo
            Toolkit.getDefaultToolkit().beep();//sonido de error
            JOptionPane.showMessageDialog(null, "El cui unicamente tiene 13 digitos");//Mensaje condicional digitos cui
        }
    }
    public static void restringCodigoProducto(java.awt.event.KeyEvent evt,String codigo){
        if(codigo.length()>3){//restringimos que no puede escribir mas de 4 digitos
            evt.consume();//el evento no permite seguir escribiendo
            Toolkit.getDefaultToolkit().beep();//sonido de error
            JOptionPane.showMessageDialog(null, "El codigo de producto solo tiene 4 caracteres");//Mensaje condicional digitos codigo
        }
    }
}
