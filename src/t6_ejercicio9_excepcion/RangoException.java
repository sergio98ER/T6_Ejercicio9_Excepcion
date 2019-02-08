/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t6_ejercicio9_excepcion;

/**
 *
 * @author Sergio
 */
public class RangoException extends Exception{
/**
 * Se crea el mensaje de la excepcion que va a salir.
 * @param message: Se muestra la informacion que se le ha dado al mensaje.
 */
    public RangoException(String message) {
        super(message);
    }
    
}
