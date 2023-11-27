package PracticaEvaluableClase;

import java.util.Scanner;

public class EjercicioString {
    /**
     * Esta funcion recibe una vocal y una cadena de texto, devuelve una cadena de
     * texto cambiado todas las vocales por la vocal seleccionada
     * 
     * @param vocal
     * @param cadena
     * @return
     */

    public static StringBuffer cadenaModificada(String vocal, String cadena) throws Exception {
        StringBuffer cadenaCambiada = new StringBuffer();

        if (vocal.toLowerCase() != "a" || vocal.toLowerCase() != "e" || vocal.toLowerCase() != "i"
                || vocal.toLowerCase() != "o" || vocal.toLowerCase() != "u") {
                    throw new Exception("Error: Debes insertar una vocal, no una consonante");
                }

            for (int i = 0; i < cadena.length(); i++) {

                /* Comprobamos si es minuscula o mayuscula */
                if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'e'
                        || cadena.charAt(i) == 'i' || cadena.charAt(i) == 'o'
                        || cadena.charAt(i) == 'u') {
                    vocal = vocal.toLowerCase();
                    cadenaCambiada = cadenaCambiada.append(vocal);

                } else if (cadena.charAt(i) == 'A' || cadena.charAt(i) == 'E'
                        || cadena.charAt(i) == 'I' || cadena.charAt(i) == 'O'
                        || cadena.charAt(i) == 'U') {
                    vocal = vocal.toUpperCase();
                    cadenaCambiada = cadenaCambiada.append(vocal);
                    /* Sino simplemente copiamos el caracter tal cual */
                } else {
                    cadenaCambiada = cadenaCambiada.append(cadena.charAt(i));
                }

            }
        return cadenaCambiada;
    }

    public static void main(String[] args) {

        /*
         * EJERCICIO STRINGS
         * Vocales
         * Realiza una función que reciba como parámetro una cadena y una vocal
         * (a,e,i,o,u) y devuelva
         * como resultado la cadena inicial sustituyendo todas las vocales por la vocal
         * introducida. Debe
         * funcionar con mayúsculas y minúsculas, es decir, si la vocal a sustituir es
         * la a, y encuentra una
         * E, el resultado de la sustitución será una A.
         * Ejemplo: “Mi amiga Ana es prima de Eva y de Irene”, le pasamos la ‘e’ y el
         * resultado sería:
         * “Me emege Ene es preme de Eve y de Erene”.
         * No se pueden usar los métodos replace ni replaceAll de String ni
         * StringBuffer.
         * Para sacar más nota se recomienda usar una estructura mutable (StringBuffer o
         * StringBuilder)
         * para hacer la sustitución.
         */

        /* Inicializamos las variables que necesitamos, ademas del escaner */

        Scanner sc = new Scanner(System.in);
        String vocal;
        String cadena;
        StringBuffer resultado = new StringBuffer();

        /* Pedimos al usuario por teclado una cadena de texto y una vocal */
        try {
            System.out.println("Inserta una cadena de texto:");
            cadena = sc.nextLine();

            System.out.println("Inserta una vocal");
            vocal = sc.nextLine();

            /* Llamamos a la funcion y guardamos el resultado para luego pintarlo */
            resultado = cadenaModificada(vocal, cadena);

            System.out.println(resultado);
        } catch (Exception e) {
          System.out.println(e.getMessage());
        }

        sc.close();

    }

}
