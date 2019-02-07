/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t6_ejercicio9_excepcion;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sergio
 */
public class Alumno {
   
    final static int num_asignaturas = 5;
    private String nombre;
    private ArrayList<Double> notas = new ArrayList<>();
    
    /**
     * Constructor por defecto
     */
    public Alumno() {
        nombre = "";
    }
    /**
     * Constructor con parametros.
     * @param nombre: nuevo parametro que va a recibir el nombre. 
     */
    public Alumno(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Muestra el nombre.
     * @return: devuelve el nombre.
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Modifica el nombre en caso de que se llame al metodo.
     * @param nombre: El nombre es modificado.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Se piden las notas y en caso de que no sea valida la nota, salta el error.
     * @throws RangoException: Lanza el mensaje de error.
     */
    public void pedirNotas()throws RangoException{
        Scanner teclado = new Scanner (System.in);
        double nota;
        for (int i = 0; i < num_asignaturas; i++) {
            System.out.println("Introduza 5 notas validas.");
            nota = teclado.nextDouble();
            if(nota >=0 && nota<=10){
                notas.add(nota);
            }else{
                throw new RangoException("Error. Nota no valida");
            }
            
        }
    }
    /**
     * Modificacion de la nota.
     * @param posicion: para senialar la posicion que vamos a querer modificar.
     * @param nnota: nuevo valor que se le va a dar a la nota que esta en al posicion anterior.
     * @throws RangoException: en caso de que haya error, se lanzara esta excepcion.
     * @throws MisteriosaException: en caso de que la posicion no sea valida se lanzara este otro error.
     */
    public void modificarNota(int posicion, double nnota)
            throws RangoException, MisteriosaException{
            Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < num_asignaturas; i++) {
            System.out.println("Introduce posicion de la nota que quiere modificar. POSICION ACTUAL:"+posicion);
            posicion = teclado.nextInt();
            if(posicion >4 && posicion>0){
                throw new MisteriosaException("(ArrayIndexOutOfBoundsException)Posicion fuera de rango.");
            }else{
                notas.get(posicion);
            }       
            System.out.println("Introduce la nueva nota.");
            nnota=teclado.nextDouble();
             if(nnota <0 && nnota>10){
                throw new RangoException("Error.Nota no valida");
            }else{
                notas.set(posicion, nnota);
            }
        }
    }
    /**
     * Se muestra el nombre del alumno y sus notas.
     */
    public void imprimirCalificaciones(){
        System.out.println(nombre);
        System.out.println(notas);
        }
    }

