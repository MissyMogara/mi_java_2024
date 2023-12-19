package Trimestre1.PrimeraEvaluacion;

import java.util.Scanner;

/* Vamos a implementar funciones para usar Morse. En primer lugar, te pongo la
equivalencia de las letras a caracteres Morse.
Tienes que implementar una función convertirAMorse que reciba como
parámetro una cadena de texto en español y devolver un String con la
misma cadena, pero traducida a Morse. Los espacios entre palabras ponlos
con el carácter “#”. Cada letra Morse la separaremos por un espacio.
Pruébala. Ej: “hola mundo”  “…. --- .-.. .-#-- ..- -. -.. ---“
Ahora vas a realizar una función que haga lo contrario convertirDeMorse
que reciba una cadena con un texto en Morse, las palabras separadas por el
carácter “#” y debes pintar el texto original en español. Además, para leer
bien cada letra Morse, irá separada por un espacio.
Recuerda que puedes usar indexOf pasándole un segundo parámetro que te
diga a partir de donde buscar. Intenta hacer el ejercicio al principio solo con
una palabra, y cuando lo tengas prueba a hacerlo con más de una palabra.
>>Pista: para la equivalencia construye dos arrays de Strings, uno con las letras
y otro con las traducciones a Morse. Al estar en la misma posición, tienes la
traducción. Como un diccionario. */

public class Ejercicio3 {

    /**
     * Funcion que convierte a morse
     * @param palabra palabra a convertir
     * @return
     * @throws Exception
     */
    public static String codigoMorse(String palabra) throws Exception {
        char letra;
        char letraComparar;
        StringBuffer codMorse = new StringBuffer();
        /*Codigo morse junto al español */
        String spanish[] = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
                "s", "t", "u", "v", "w", "x", "y", "z", " " };
        String morse[] = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
                "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", "#" };
        int numero = -1;
        for (int j = 0; j < palabra.length(); j++) {

            letra = palabra.charAt(j);

            for (int i = 0; i < spanish.length; i++) {
                letraComparar = spanish[i].charAt(0);
                if (letra == letraComparar) {
                    numero = i;
                    break;
                }
            }

            codMorse.append(" ");
            codMorse.append(morse[numero]);
        }
        return codMorse.toString();
    }

    // No he conseguido hacer que funcione el descifrar morse, se niega a entrar en
    // el sengundo for por alguna razon
    public static String descifrarCodigoMorse(String palabra) {

        int contador = 0;
        int espacios = 0;
        StringBuffer palabraCompleta = new StringBuffer();
        String stringSecunadrio = "";
        int posicion = 0;

        String spanish[] = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
                "s", "t", "u", "v", "w", "x", "y", "z", " " };
        String morse[] = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
                "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", "#" };

        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == ' ') {
                espacios += 1;
            }
        }

        for (int j = 0; j <= espacios + 1; j++) {

            posicion = palabra.indexOf(" ", contador);

            stringSecunadrio = palabra.substring(contador, posicion - 1);

            contador = posicion + 1;

            for (int i = 0; i < morse.length; i++) {

                if (morse[i].equals(stringSecunadrio)) {

                    palabraCompleta.append(spanish[i]);
                    break;

                }

            }

        }
        return palabraCompleta.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String palabra = "";
        String palabraMorse = "";
        String palabraDescifrada = "";

        try {
            System.out.println("Inserta un texto a pasar a morse:");
            palabra = sc.nextLine();
            palabraMorse = codigoMorse(palabra);

            System.out.println("La palabra en morse es:");
            System.out.println(palabraMorse);

            System.out.println("Haciendolo al revés es:");
            palabraDescifrada = descifrarCodigoMorse(palabraMorse);
            System.out.println(palabraDescifrada);

        } catch (Exception e) {
            // TODO: handle exception
        }
        sc.close();
    }

}
