package Trimestre1.PracticaStringAlgoritmos;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        /*
         * Diseña un programa en Java que solicite al usuario una cadena en la que
         * buscará y otra que será la cadena buscada. El programa indicará cuántas veces
         * aparece la segunda cadena en la primera.
         */
        /* Declaramos las dos cadenas de texto y el escaner */
        String cadenaBuscar = "La miqota es una y por encima de todo es miqota.";
        String cadenaInsertar;
        Scanner sc = new Scanner(System.in);
        int posicion = -1;
        int contador = 0;

        System.out.println("Inserta una cadena de texto que deseas buscar:");
        cadenaInsertar = sc.nextLine();

        posicion = cadenaBuscar.indexOf(cadenaInsertar);
        if (posicion != -1) {
            contador += 1;
        }

        for (int i = 0; i <= cadenaBuscar.length(); i++) {
            if (posicion != -1) {
                posicion = cadenaBuscar.indexOf(cadenaInsertar + 1);
                contador += 1;
            }

        }
        System.out.println("La cadena sale " + contador + " veces en el texto.");
        sc.close();
    }

}
