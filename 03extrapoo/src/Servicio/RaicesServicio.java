/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Raices;
import java.util.Scanner;

/**
 *
 * @author belugallardo
 */
public class RaicesServicio {

    Raices ra = new Raices();
    Scanner leer = new Scanner(System.in);

    public Raices cargarcoeficientes() {
        System.out.println("Ingrese el primer coeficiente");
        ra.setA(leer.nextInt());

        System.out.println("Ingrese el segundo coeficiente");
        ra.setB(leer.nextInt());

        System.out.println("Ingrese el tercer coeficiente");
        ra.setC(leer.nextInt());

        return ra;
    }

    private double getDiscriminante() {
        double a = ra.getB() * ra.getB();

        return (a - 4 * ra.getA() * ra.getC());
    }

    private boolean tieneRaices() {
        return getDiscriminante() >= 0;
    }

    private boolean tieneRaiz() {
        return getDiscriminante() == 0;
    }

    private void obtenerRaices() {
        if (tieneRaices()) {
            double x1 = (-ra.getB() + Math.sqrt(getDiscriminante())) / (2 * ra.getA());
            double x2 = (-ra.getB() - Math.sqrt(getDiscriminante())) / (2 * ra.getA());
            System.out.println("Las raices son: " + x1 + " y " + x2);
        } 
    }

    private void obtenerRaiz() {
        if (tieneRaiz()) {
            double x = -ra.getB() / (2 * ra.getA());
            System.out.println("La única raíz es: x = " + x);
        } 
    }
    public void calcular(){
        if (tieneRaices()){
            obtenerRaices();
        }else if(tieneRaiz()){
            obtenerRaiz();
        }else{
            System.out.println("No existen soluciones reales");
        }
    }
}
