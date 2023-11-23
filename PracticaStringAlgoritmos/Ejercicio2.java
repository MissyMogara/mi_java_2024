package PracticaStringAlgoritmos;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        /*
         * Crea un programa que reciba una cadena de caracteres y la devuelva invertida
         * con efecto espejo, este es, se concatena a la palabra original su inversa,
         * compartiendo la última letra, que hará de espejo, por lo que la palabra
         * obtenida se lee igual hacia adelante que hacia atrás. Por ejemplo, al
         * introducir “teclado” devolverá “tecladodalcet” y al introducir “hola”
         * devolverá “holaloh”. Haz dos versiones, una con String y otra con
         * StringBuffer
         * 
         */
        StringBuffer cadena = new StringBuffer();

        Scanner sc = new Scanner(System.in);

        String frase = sc.nextLine();

        cadena = cadena.append(frase);

        cadena.reverse();

        /*A diferencia del anterior ejercicio aqui sumamos las dos */
        System.out.println(frase+cadena);
        /* Con un String normal tenemos que usar un for y otro String mas */
        String cadenaNormal;
        String cadenaInvertida="";
        
        cadenaNormal = sc.nextLine();

        for (int i = (cadenaNormal.length()-1); i >= 0; i--) {
            cadenaInvertida += cadenaNormal.charAt(i);
        }
        System.out.println(cadenaNormal + cadenaInvertida);
        sc.close();
    }
}
