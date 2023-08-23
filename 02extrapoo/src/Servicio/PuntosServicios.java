/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Puntos;
import java.util.Scanner;

/**
 *
 * @author belugallardo
 */
public class PuntosServicios {
    Puntos punto = new Puntos();
    Scanner leer = new Scanner(System.in);
    
    public Puntos crearPuntos(){
        System.out.println("Ingrese las coordenadas del punto x1");
        punto.setX1(leer.nextDouble());
        
        System.out.println("Ingrese las coordenadas del punto y1");
        punto.setY1(leer.nextDouble());
        
        System.out.println("Ingrese las coordenadas del punto x2");
        punto.setX2(leer.nextDouble());
        
        System.out.println("Ingrese las coordenadas del punto y2");
        punto.setY2(leer.nextDouble());
        
        return punto;
    }
    
    public void calcularPuntos(){
        double x = (punto.getX2() - punto.getX1());
        double y = (punto.getY2() - punto.getY1());
        double distancia = Math.sqrt((x*x) + (y*y));
        
        System.out.println("La distancia entre ambos puntos es de " + distancia);
    }
}
