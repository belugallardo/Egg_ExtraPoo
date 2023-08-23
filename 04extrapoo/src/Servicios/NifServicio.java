/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidad.Nif;
import java.util.Scanner;

/**
 *
 * @author belugallardo
 */
public class NifServicio {
    Nif ni = new Nif();
    Scanner leer = new Scanner(System.in);
    
    public Nif crearNif(){
        System.out.println("Ingrese su DNI");
        ni.setDni(leer.nextLong());
        ni.setLetra(calcularLetra());
        return ni;
    }
    private String calcularLetra(){
      int resto = (int) ni.getDni() % 23;
      String[] letras = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
      return letras[resto];
    }
    
    public void mostrar(){
        System.out.println("NIF: " + ni.getDni() + "-" + ni.getLetra() );
    }
}
