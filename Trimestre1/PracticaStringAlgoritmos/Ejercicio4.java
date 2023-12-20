package PracticaStringAlgoritmos;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        /*
         * Crea un programa en Java que solicite al usuario dos cadenas de caracteres y
         * que devuelva la primera cadena, pero transformando en mayúsculas la parte que
         * coincide con la segunda cadena introducida. Por ejemplo, si se introducen las
         * cadenas “Esta es mi amiga Ana” y “amiga” devolverá “Esta es mi AMIGA Ana”.
         */
        Scanner sc = new Scanner(System.in);
        /*
         * Declaramos el stringbuffer junto con la otra cadena, ademas de una variable
         * que nos ayudara a llevar la posicion
         */
        StringBuffer cadena = new StringBuffer();
        String cadena2;
        int posicion;

        System.out.println("Inserta la primera cadena:");
        cadena = cadena.append(sc.nextLine());
        System.out.println("Inserta la segunda cadena:");
        cadena2 = sc.nextLine();
        posicion = cadena.indexOf(cadena2);

        /*
         * Borramos la parte que queremos con delete y luego la volvemos a insertar con
         * cadena2.toUpperCase
         */
        cadena.delete(cadena.indexOf(cadena2), posicion + (cadena2.length()));
        cadena.insert(posicion, (cadena2.toUpperCase()));

        System.out.println(cadena);
        sc.close();

    }
}
