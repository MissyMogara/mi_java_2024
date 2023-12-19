package Trimestre1.PracticaStringAlgoritmos;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        /*
         * Crea un método que determine si una cadena es un palíndromo, o sea, se lee
         * igual en los dos sentidos.
         */

        /* Declaramos tanto los dos stringbuffers que usaremos como el scanner */
        Scanner sc = new Scanner(System.in);
        StringBuffer cadena = new StringBuffer();
        String cadenaInversa = "";
        String cadenaGuardar = "";

        /* Le pedimos al usuario que inserte la cadena que queremos comprobar */
        System.out.println("Inserta una cadena de texto:");
        cadena = cadena.append(sc.nextLine());
        cadenaGuardar = cadena.toString();
        cadenaInversa = cadena.reverse().toString();

        /* Comprobamos si es un palindromo comparando su inversa */
        if (cadenaGuardar.equals(cadenaInversa)) {
            System.out.println("Es un palíndromo.");
        } else {
            System.out.println("No es un palíndromo ):");
        }

        sc.close();
    }
}
