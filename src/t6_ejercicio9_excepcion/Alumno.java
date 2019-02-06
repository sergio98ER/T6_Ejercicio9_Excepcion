/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t6_ejercicio9_excepcion;

import java.util.ArrayList;

/**
 *
 * @author Sergio
 */
public class Alumno {

    private final static int num_asignaturas = 5;
    private String nombre;
    private ArrayList notas;

    public Alumno() {
        nombre = "";
    }

    public Alumno(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void pedirNotas()throws RangoException{
        
    }
}
