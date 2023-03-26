/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camposeco.proyecto1archivos;

import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JOptionPane;
import org.apache.commons.codec.binary.Base64;

/**
 *
 * @author Mariano
 */
public class Encriptacion {
    //llave que usaremos para seguridad en la encriptacion
    String llaveEncriptacion="MarianoCamposeco";
    public String encriptarPassword(String password){
        //definimos el resultado de password desencriptado
        String passwordDesEncriptada = "";
        //si sucede algun error que se maneje
        try{
            //Instancia del metodo MD5, se transforma en arreglo de bytes la llave y la pasamos a base 24
            MessageDigest encriptacionMD5 = MessageDigest.getInstance("MD5");;
            byte[] keyPassword = encriptacionMD5.digest(llaveEncriptacion.getBytes("UTF-8"));
            byte[] baseKeyPassword = Arrays.copyOf(keyPassword, 24);
            //instancia de secretkey para nuestra llaveEncriptacion en base24 y cipher para dar el cifrado, usando algoritmo aes
            SecretKey llaveSecreta = new SecretKeySpec(baseKeyPassword,"DESede");
            Cipher cifrar = Cipher.getInstance("DESede");
            cifrar.init(Cipher.ENCRYPT_MODE, llaveSecreta);
            //Hacer la encriptacion transformando password en arreglo de byte y lo mandamos al cifradoFinal, y lo mandamos en arreglo de base 64
            byte[] textoPasswordByte = password.getBytes("UTF-8");
            byte[] cifradoFinal = cifrar.doFinal(textoPasswordByte);
            byte[] password64= Base64.encodeBase64(cifradoFinal);
            passwordDesEncriptada = new String(password64);
        }catch(Exception ex){
            //mensaje amigable indicando el fallo de desencriptacion
            JOptionPane.showMessageDialog(null, "Ocurrio un error en la encriptacion"+ex);
        }
        //regresamos nuestra contraseña
        return passwordDesEncriptada;        
    }
    public String desEncriptarPassword(String password){
        //definimos el resultado de password encriptado
        String passwordDesEncriptada = "";
        //si sucede algun error que se maneje
        try{
            //hacemos lo contrario
            byte[] passwordDes64=Base64.decodeBase64(password.getBytes("UTF-8"));
            //Hacemos todo practicamente igual hasta llegar a cipher, que ahora le mandamos que en lugar de encriptar desencripte 
            MessageDigest encriptacionMD5 = MessageDigest.getInstance("MD5");;
            byte[] keyPassword = encriptacionMD5.digest(llaveEncriptacion.getBytes("UTF-8"));
            byte[] baseKeyPassword = Arrays.copyOf(keyPassword, 24);
            SecretKey llaveSecreta = new SecretKeySpec(baseKeyPassword,"DESede");
            Cipher desCifrar = Cipher.getInstance("DESede");
            desCifrar.init(Cipher.DECRYPT_MODE, llaveSecreta);
            //Hacer la desencriptacion transformando password en arreglo de byte y lo mandamos al desCifradoFinal, y lo pasamos como string
            byte[] desCifradoFinal = desCifrar.doFinal(passwordDes64);
            passwordDesEncriptada = new String(desCifradoFinal,"UTF-8");
        }catch(Exception ex){
            //mensaje amigable indicando el fallo de encriptacion
            JOptionPane.showMessageDialog(null, "Ocurrio un error en la desEncriptacion"+ex);
        }
        //regresamos nuestra contraseña
        return passwordDesEncriptada;        
    }
}
