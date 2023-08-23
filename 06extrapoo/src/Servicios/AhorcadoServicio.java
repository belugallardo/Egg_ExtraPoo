/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidad.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author belugallardo
 */
public class AhorcadoServicio {

    Ahorcado ah = new Ahorcado();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Ahorcado crearJuego() {
        System.out.println("Ingrese la palabra a buscar");
        String palabra = leer.nextLine();
        String[] palabraADescubrir = new String[palabra.length()];

        for (int i = 0; i < palabra.length(); i++) {
            palabraADescubrir[i] = palabra.substring(i, i + 1);
        }
        ah.setPalabra(palabraADescubrir);
        longitud();

        System.out.println("Ingrese la cantidad de jugadas máximas");
        ah.setJugadasMaximas(leer.nextInt());
        leer.nextLine();
        return ah;
    }

    public void juego() {
        int restantes = ah.getJugadasMaximas();
        longitud();
        int faltantes = ah.getLongitudPalabra();
        int encontradas = 0;

        do {
            System.out.println("Ingrese una letra");
            String letra = leer.nextLine();
            buscar(letra);
            int nuevasEncontradas = contarLetrasEncontradas(letra);
            

            if (nuevasEncontradas > 0) {
                encontradas += nuevasEncontradas;
            } else {
                restantes--;
            }
            
            faltantes = ah.getLongitudPalabra() - encontradas;
            
            System.out.println("Numero de letras (encontradas, faltantes): (" + encontradas + "," + faltantes + ")");
            System.out.println("Numero de oportunidades restantes: " + restantes);

        } while (encontradas < ah.getLongitudPalabra() && restantes > 0);

        if (encontradas == ah.getLongitudPalabra()) {
            System.out.println("¡Felicidades! Has ganado el juego.");
        } else {
            System.out.println("Has agotado todas las oportunidades. ¡Has perdido!");
        }
    }

    private void longitud() {
        int tamano = ah.getPalabra().length;
        ah.setLongitudPalabra(tamano);
    }

    private void buscar(String letra) {
        String[] palabra = ah.getPalabra();

        int estaLaLetra = 0;

        for (int i = 0; i < ah.getLongitudPalabra(); i++) {
            if (palabra[i].equals(letra)) {
                estaLaLetra++;
            }

        }

        if (estaLaLetra > 0) {
            System.out.println("Se encontro la letra");
        } else {
            System.out.println("No se encontro la letra");
        }
    }

    private boolean encontradas(String letra, int encontradas, int faltantes, int restantes) {

        String[] palabra = ah.getPalabra();

        for (int i = 0; i < ah.getLongitudPalabra(); i++) {
            if (palabra[i].equals(letra)) {
                encontradas++;
                faltantes--;

                System.out.println("Numero de letras (encontradas, faltantes): (" + encontradas + "," + faltantes + ")");
                return true;
            } else {

                restantes--;
            }
        }
        intentos(restantes);
        return false;

    }

    private int contarLetrasEncontradas(String letra) {
        String[] palabra = ah.getPalabra();
        int encontradas = 0;

        for (int i = 0; i < ah.getLongitudPalabra(); i++) {
            if (palabra[i].equals(letra)) {
                encontradas++;
            }
        }

        return encontradas;
    }

    private void intentos(int restantes) {
        int resultado = ah.getJugadasMaximas() - restantes;
        System.out.println("Numero de oportunidades restantes: " + resultado);
    }
}
