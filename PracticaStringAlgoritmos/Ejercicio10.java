package PracticaStringAlgoritmos;

public class Ejercicio10 {
    public static void main(String[] args) {

        /*
         * Compara estos dos Strings sin tener en cuenta mayúsculas “Esta tarde no voy”,
         * “esta tarde no VOY”.
         */

        String string1 = "Esta tarde no voy";
        String string2 = "esta tarde no VOY";
        boolean esIgual = false;

        if (string1.toLowerCase().equals(string2.toLowerCase())) {
            esIgual = true;
        }

        System.out.println(esIgual);
    }
}
