/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg06extrapoo;

import Servicios.AhorcadoServicio;

/**
 *
 * @author belugallardo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AhorcadoServicio as = new AhorcadoServicio();
        as.crearJuego();
        as.juego();
        
    }
    
}
