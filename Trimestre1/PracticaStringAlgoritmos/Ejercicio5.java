package PracticaStringAlgoritmos;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        /*
         * Diseña un programa en Java que solicite al usuario una cadena de caracteres y
         * muestre por pantalla un conteo de cuántas vocales, consonantes y espacios en
         * blanco contiene la cadena introducida.
         */

        Scanner sc = new Scanner(System.in);
        int vocal = 0;
        int consonantes = 0;
        int espacios = 0;
        String cadena;
        cadena = sc.nextLine();

        for (int i = 0; i < cadena.length(); i++) {

            if (cadena.toLowerCase().charAt(i) == 'a' || cadena.toLowerCase().charAt(i) == 'e'
                    || cadena.toLowerCase().charAt(i) == 'i' || cadena.toLowerCase().charAt(i) == 'o'
                    || cadena.toLowerCase().charAt(i) == 'u') {
                vocal += 1;
            } else if (cadena.charAt(i) == ' ') {
                espacios += 1;
            } else {
                consonantes += 1;
            }

        }
        System.out.println("El numero de vocales es " + vocal + ", y el numero de consonantes es " + consonantes
                + ", y el numero de espacios es " + espacios);
        sc.close();
    }
}
