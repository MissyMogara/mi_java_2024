package PracticaStringAlgoritmos;

public class Ejercicio7 {
    public static void main(String[] args) {
        /*
         * Cuenta las vocales del texto “Me gusta programar en Java los sábados por la
         * mañana”
         */
        String cadena = "Me gusta programar en Java los sábados por la mañana";
        int vocal = 0;
        for (int i = 0; i < cadena.length(); i++) {

            if (cadena.toLowerCase().charAt(i) == 'a' || cadena.toLowerCase().charAt(i) == 'e'
                    || cadena.toLowerCase().charAt(i) == 'i' || cadena.toLowerCase().charAt(i) == 'o'
                    || cadena.toLowerCase().charAt(i) == 'u') {
                vocal += 1;
            }
        }
        System.out.println("El número de vocales es " + vocal);
    }
}