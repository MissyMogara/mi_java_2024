package Trimestre1.PracticaStringAlgoritmos;

import java.util.Arrays;

public class EjercicioOrdenacion5 {

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

            array[i] = generarAleatorio(1, 50);

        }

    }

    /**
     * Este proceso ordena y saca los 10 mayores numeros del array otorgado
     * 
     * @param array
     */
    public static void mostrar10Primeros(int[] array) {

        int arrayMostrar[] = new int[10];
        int poscionArray = 0;
        burbuja(array);

        for (int i = (array.length - 1); i > 0; i--) {

            if (poscionArray < arrayMostrar.length) {
                arrayMostrar[poscionArray] = array[i];
                poscionArray += 1;
            } else {
                break;
            }

        }
        System.out.println("Array ordenado:");
        System.out.println(Arrays.toString(array));

        System.out.println("Los 10 mayores numeros:");
        System.out.println(Arrays.toString(arrayMostrar));
    }

    public static void main(String[] args) {

        /*
         * Realiza un programa que cree 100 números aleatorios entre 1 y 1000 y que
         * muestre los 10 mayores.
         */
        int array[] = new int[100];

        rellenarArray(array);

        System.out.println("Array normal:");
        System.out.println(Arrays.toString(array));
        mostrar10Primeros(array);

    }
}
