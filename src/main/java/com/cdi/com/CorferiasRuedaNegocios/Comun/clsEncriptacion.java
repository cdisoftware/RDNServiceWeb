package com.cdi.com.CorferiasRuedaNegocios.Comun;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.util.Base64;

/**
 *
 * @author Juan José Gutiérrez // Metodos para encriptar y desencriptar en BASE64
 */
public class clsEncriptacion {

    public static String Encriptar(String texto) throws IllegalBlockSizeException, NoSuchPaddingException, BadPaddingException {

        String secretKey = "cdisoftware"; //llave para encriptar datos
        String base64EncryptedString = "";

        Base64.Encoder encoder = Base64.getEncoder();
        byte[] encoded = encoder.encode(texto.getBytes());
        return new String(encoded);

    }

    public static String Desencriptar(String texto) {

        String secretKey = "cdisoftware"; //llave para desencriptar datos
        String base64EncryptedString = "";
        Base64.Decoder decoder = Base64.getDecoder();
        byte[] decoded = decoder.decode(texto);
        return new String(decoded);

    }
}
