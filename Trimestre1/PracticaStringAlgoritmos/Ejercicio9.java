package PracticaStringAlgoritmos;

public class Ejercicio9 {
    public static void main(String[] args) {

        /*
         * Crear una cadena de texto formada por tres cadenas “una”, “dos” y “tres”
         * usando StringBuilder
         */
        StringBuilder cadena = new StringBuilder();
        String string1 = "una ";
        String string2 = "dos ";
        String string3 = "tres";

        cadena.append(string1);
        cadena.append(string2);
        cadena.append(string3);

        System.out.println(cadena);


    }
}
