/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camposeco.proyecto1archivos;

/**
 *
 * @author Mariano
 */
public class Restricciones {
    public static boolean verificarNumero(String numero) {
        //puede venir o no el +talNumero, puede haber espacio y tiene que ir 1 o mas numeros, por ejemplo +50231840649,+502 31840649, 31840649
        return numero.matches("(\\+[0-9]*)?( )?[0-9]+");
    }
}
