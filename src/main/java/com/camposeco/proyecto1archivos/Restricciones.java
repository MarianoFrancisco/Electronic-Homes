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
    public static void restringirLetras(java.awt.event.KeyEvent evt){
        char comprobarSiEsLetra = evt.getKeyChar();//Creamos variable tipo caracter para que no pueda escribir letras
        if(Character.isLetter(comprobarSiEsLetra)){//Comprobamos si el usuario escribe letras
            evt.consume();//el evento no permite seguir escribiendo
            Toolkit.getDefaultToolkit().beep();//sonido de error
            JOptionPane.showMessageDialog(null, "No puedes escribir letras, unicamente digitos");//Mensaje condicional no escribir letras
        }
    }
}
