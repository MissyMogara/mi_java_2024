package PracticaStringAlgoritmos;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        /*
         * Crea un programa en Java que solicite al usuario la introducción de una
         * cadena de caracteres y
         * devuelva esta cadena invertida. Haz dos versiones, una con String y otra con
         * StringBuffer
         */

        /*
         * Con un StringBuffer es tan facil como de clarar el stringbuffer y
         * concatenarlo con un string, luego le aplicamos el reverse()
         */
        StringBuffer cadena = new StringBuffer();

        Scanner sc = new Scanner(System.in);

        String frase = sc.nextLine();

        cadena = cadena.append(frase);

        cadena.reverse();

        System.out.println(cadena);

        /* Con un String normal tenemos que usar un for y otro String mas */
        String cadenaNormal;
        String cadenaInvertida="";
        
        cadenaNormal = sc.nextLine();

        for (int i = (cadenaNormal.length()-1); i >= 0; i--) {
            cadenaInvertida += cadenaNormal.charAt(i);
        }
        System.out.println(cadenaInvertida);
        sc.close();
    }
}
