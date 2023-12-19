package Trimestre1.PracticaStringAlgoritmos;

public class Ejercicio8 {

    public static void main(String[] args) {

        /*
         * Divide la cadena “http://www.iesjaroso.es/noticias” en “http”,
         * “www.iesjaroso.es”, “noticias”.
         */
        String cadena = "http://www.iesjaroso.es/noticias";
        String string1 = cadena.substring(0, 4);
        String string2 = cadena.substring(7, 23);
        String string3 = cadena.substring(24, 32);

        System.out.println(string1);
        System.out.println(string2);
        System.out.println(string3);



    }

}
