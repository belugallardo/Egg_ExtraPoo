/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Meses;
import java.util.Scanner;

/**
 *
 * @author belugallardo
 */
public class MesesServicio {
    Meses me = new Meses();
    Scanner leer = new Scanner(System.in);
    
    public void adivinarMesSecreto(){
        String mes;
        
        do{
        System.out.println("Adivine el mes secreto. Introduzca el mes en minusculas");
        mes = leer.nextLine();
        if(mes.equals(me.getMesSecreto())){
            System.out.println("Ha acertado!");
        }else {
            System.out.println("No ha acertado. Intente nuevamente.");
        }
        
        } while (!mes.equals(me.getMesSecreto())); 
        
        
        
    }
}
