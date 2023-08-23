/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Cancion;
import java.util.Scanner;

/**
 *
 * @author belugallardo
 */
public class CancionServicio {
    Cancion ca = new Cancion();
    Scanner leer = new Scanner(System.in);
    
    public Cancion creanCancion(){
        System.out.println("Ingrese la cancion");
        ca.setCancion(leer.nextLine());
        ca.setAutor(leer.nextLine());
        return ca;
    }
    public void mostrarCancion(){
        System.out.println("La cancion " + ca.getCancion() + " es del autor " + ca.getAutor());
    }
    
}
