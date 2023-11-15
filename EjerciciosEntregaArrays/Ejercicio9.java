package EjerciciosEntregaArrays;

import java.util.Arrays;

public class Ejercicio9 {
    /**
     * Función que realiza la media de los valores de un array
     * 
     * @param array
     * @return
     */
    public static double mediaArray(int array[]) {
        double media = 0;
        for (int i = 0; i < array.length; i++) {

            media = media + array[i];

        }
        media = media / array.length;
        return media;

    }

    /**
     * Función que genera un número aleatorio entre un valor mínimo y máximo
     * 
     * @param min
     * @param max
     * @return número aleatorio entre min y max, incluidos
     */
    public static int generarNumero(int min, int max) throws Exception {
        /* Sí min > max, lanzamos Exception "min debe ser menor que max" */

        if (min > max) {
            throw new Exception("El valor mínimo no puede ser mayor que el máximo");
        }
        return (int) (Math.random() * (max - min + 1) + min);
    }

    /**
     * Proceso que rellena automaticamente un array con números aleatorios
     * 
     * @param array
     */
    public static void rellenarArray(int array[]) {
        try {
            for (int i = 0; i < array.length; i++) {

                array[i] = generarNumero(180, 360);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    public static void main(String[] args) {

        /*
         * Realizar un programa que lea los tiempos en los que de 10 corredores han
         * acabado una carrera. El programa debe
         * determinar qué corredores tienen el primer, segundo y último puesto, así como
         * cuál es el tiempo medio en que
         * se ha corrido la carrera. Pista: ordénalo antes.
         */
        /*
         * Rellenaremos el array con tiempos medidos en segundos, entre 180 y 360
         * segundos
         */

        int corredores[] = new int[10];
        rellenarArray(corredores);
        System.out.println("Sin ordenar:");
        System.out.println(Arrays.toString(corredores));

        /* Debemos ordenarlos primero */
        Arrays.sort(corredores);
        System.out.println("Ordenado:");
        System.out.println(Arrays.toString(corredores));

        /* Pintamos cual ha sido el primer, segundo y último junto a su tiempo */
        System.out.println("El primer corredor ha tardado " + corredores[1] + " segundos,"
                + " el segundo corredor ha tardado " + corredores[2] + " segundos, y el último corredor ha tardado "
                + corredores[corredores.length - 1] + " segundos.");

        /* Pintamos la media con la ayuda de la funcion que hemos hecho */
        System.out.println("La media ha sido de " + mediaArray(corredores) + " segundos.");
    }
}
