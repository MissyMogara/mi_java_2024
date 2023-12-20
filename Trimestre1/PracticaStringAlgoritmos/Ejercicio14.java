package PracticaStringAlgoritmos;

import java.util.Scanner;

public class Ejercicio14 {
    /**
     * Esta funcion realiza el cifrado cesar de un string
     * 
     * @param texto
     * @param desplazamiento
     * @return
     */
    public static String cifradoCesar(String texto, int desplazamiento) {

        StringBuffer resultado = new StringBuffer();
        char caracter = 'a';

        for (int i = 0; i < (texto.length()); i++) {

            caracter = (char) (texto.charAt(i) + (desplazamiento));
            resultado = resultado.append(caracter);
        }
        return resultado.toString();
    }

    /**
     * Esta funcion realiza lo inverso a la funcion de cifrado cesar
     * 
     * @param texto
     * @param desplazamiento
     * @return
     */
    public static String descifradoCesar(String texto, int desplazamiento) {

        StringBuffer resultado = new StringBuffer();
        char caracter = 'a';

        for (int i = 0; i < (texto.length()); i++) {

            caracter = (char) (texto.charAt(i) - (desplazamiento));
            resultado = resultado.append(caracter);
        }
        return resultado.toString();
    }

    public static void main(String[] args) {

        /*
         * Cifrado César. Crea un algoritmo de encriptación que se le pase una frase y
         * una clave (numérica). Lo
         * que hará será sumar en ASCII esa clave a cada letra de la frase. Prueba a
         * realizar una función para
         * desencriptar.
         */

        /*
         * Declaramos tanto el escaner como dos strings, uno para guardar la palabra a
         * cifrar y el otro para guardar la palabra cifrada, y una variable que almacene
         * las posiciones que va a desplazarse cada palabra
         */
        Scanner sc = new Scanner(System.in);
        String palabraCrifrar = "";
        String textoCifrado = "";
        int poscion = 0;

        /* Pedimos al usuario que inserte una frase */
        System.out.println("Inserta una frase:");
        palabraCrifrar = sc.nextLine();

        /* Pedimos al usuario que inserte el numero de desplazamientos */
        System.out.println("Inserta el número de posiciones que quieres desplazar el texto:");
        poscion = Integer.parseInt(sc.nextLine());

        /* Mostramos al usuario el resultado del texto cifrado */
        System.out.println("El texto cifrado es:");
        textoCifrado = cifradoCesar(palabraCrifrar, poscion);
        System.out.println(textoCifrado);

        /* Le mostramos el texto descifrado */
        System.out.println("El texto descifrado es:");
        System.out.println(descifradoCesar(textoCifrado, poscion));
    }
}
