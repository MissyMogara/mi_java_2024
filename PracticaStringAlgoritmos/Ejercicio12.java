package PracticaStringAlgoritmos;

public class Ejercicio12 {
    /**
     * Devuelve la mitad de una cadena de texto
     * 
     * @param cadena
     * @return
     */
    public static String mitadString(String cadena) {
        String mitad = "";
        for (int i = 0; i < (cadena.length() / 2); i++) {
            mitad = mitad + cadena.charAt(i);
        }
        return mitad;
    }

    public static void main(String[] args) {

        /* Escribe un método que te devuelva la mitad de una cadena. */

        String cadenaTexto = "Hola soy una cadena de texto normal y corriente";
        String mitadCadena = "";

        mitadCadena = mitadString(cadenaTexto);
        System.out.println(mitadCadena);

    }

}
