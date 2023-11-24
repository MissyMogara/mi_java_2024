package PracticaStringAlgoritmos;

import java.util.Arrays;

public class EjercicioOrdenacion1 {

    /**
     * Este proceso ordena el array por el método burbuja
     * 
     * @param array
     */
    public static void burbuja(int[] array) {

        int auxiliar;

        for (int i = array.length; i > 0; i--) {

            for (int j = 0; j < (i - 1); j++) {
                if (array[j] > array[j + 1]) {
                    /* Vamos a ir intercambiado las posiciones y llevando a los mayores al final */
                    auxiliar = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = auxiliar;

                }
            }
        }

    }

    /**
     * función que genera un número aleatorio entre el mínimo y el máximo
     * 
     * @param min mínimo
     * @param max máximo
     * @return
     */
    public static int generarAleatorio(int min, int max) {
        int n;
        n = (int) (Math.random() * (max + 1 - min)) + min;
        return n;
    }

    /**
     * Proceso que va acompañado de la función de generar aleatorio, rellena el
     * array automaticamente, no tiene que devolver nada porque guarda los cambios
     * en el array
     * 
     * @param array
     */
    public static void rellenarArray(int array[]) {

        for (int i = 0; i < array.length; i++) {

            array[i] = generarAleatorio(0, 100);

        }

    }

    public static void main(String[] args) {

        /*
         * Realiza un programa que cree un array de 50 posiciones cargado con valores
         * aleatorios. Los valores
         * aleatorios deberán estar entre el 1 y el 100. Una vez cargado el vector,
         * deberá ordenarlo mediante el
         * método de la burbuja y mostrarlo ordenado por pantalla. Para el método de la
         * burbuja deberás crear
         * una función que reciba un array de números y lo devuelva ordenado.
         */

        /* Declaramos y rellenamos el array */
        int array[] = new int[50];

        rellenarArray(array);

        /* Se lo mostramos al usuario */
        System.out.println("Array sin ordenar:");
        System.out.println(Arrays.toString(array));

        /* Lo ordenamos llamando al a funcion y se lo volvemos a mostrar */
        burbuja(array);
        System.out.println("Array ordenado:");
        System.out.println(Arrays.toString(array));

    }
}
