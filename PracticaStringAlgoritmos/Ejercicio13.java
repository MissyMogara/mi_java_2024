package PracticaStringAlgoritmos;

public class Ejercicio13 {
    /**
     * Esta funcion devuelve cuales la palabra mas larga de una cadena
     * 
     * @param cadena
     * @return
     */
    public static String laPalabraMasLarga(String cadena) {
        String palabra = "";
        String auxiliar = "";
        /*
         * Este for recorre la cadena entera y cada vez que haya un espacio en blanco
         * terminara de contar la palabra
         */
        for (int i = 0; i < (cadena.length()); i++) {
            if (cadena.charAt(i) != ' ') {
                auxiliar = auxiliar + cadena.charAt(i);
            } else {
                if (palabra.length() < auxiliar.length()) {
                    palabra = auxiliar;
                }
                auxiliar = "";
            }
        }
        return palabra;
    }

    public static void main(String[] args) {

        /*
         * Encontrar la palabra de mayor longitud de este texto: “No se me ocurre
         * ninguna frase larga”.
         */

        String texto = "No se me ocurre ninguna frase larga";
        String palabraMasLarga = "";

        palabraMasLarga = laPalabraMasLarga(texto);

        System.out.println(palabraMasLarga);

    }
}
