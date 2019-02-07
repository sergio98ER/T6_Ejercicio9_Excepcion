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
public class T6_Ejercicio9_Excepcion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Alumno a1 = new Alumno("PACO RODRIGUEZ");
       try{
         a1.pedirNotas();
         a1.modificarNota(0, 0);
         a1.imprimirCalificaciones();
       }
       catch(RangoException r){
           System.err.println("Se ha producido un error: "+r.toString());
       }catch(MisteriosaException r){
           System.err.println("Fuera de posicion"+r.toString());
       }
       
       }
    }   

