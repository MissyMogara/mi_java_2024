package PracticaStringAlgoritmos;

import java.util.Arrays;

public class EjercicioOrdenacion3 {
    /**
     * Este proceso ordena el array por el método burbuja
     * 
     * @param array
     */
    public static void burbuja(int[] array) {

        int auxiliar;
        int intercambios = 0;

        for (int i = array.length; i > 0; i--) {

            for (int j = 0; j < (i - 1); j++) {
                if (array[j] > array[j + 1]) {
                    /* Vamos a ir intercambiado las posiciones y llevando a los mayores al final */
                    auxiliar = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = auxiliar;
                    intercambios += 1;

                }
            }

            if (intercambios != 0) {

                intercambios = 0;
            } else {

                break;
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

    /**
     * Este proceso suma los dos arrays en uno y ademas realiza la ordenacion de la
     * suma llamando al proceso
     * 
     * @param array
     * @param array2
     * @param arraySuma
     */
    public static void sumaOrdenar2Arrays(int[] array, int[] array2, int[] arraySuma) {

        for (int i = 0; i < array.length; i++) {
            arraySuma[i] = array[i];

        }
        for (int i = 0; i < array2.length; i++) {
            arraySuma[i + (array.length)] = array2[i];

        }
        burbuja(arraySuma);
    }

    public static void main(String[] args) {

        /*
         * Realiza un método que tome como parámetros de entrada dos arrays de enteros y
         * devuelva como
         * salida un único array con los dos elementos de los anteriores arrays
         * ordenados de forma ascendente.
         */
        int array1[] = new int[20];
        int array2[] = new int[20];
        int arrayOrdenado[] = new int[array1.length + array2.length];

        rellenarArray(array1);
        rellenarArray(array2);

        System.out.println("El array1 es:");
        System.out.println(Arrays.toString(array1));

        System.out.println("El array2 es:");
        System.out.println(Arrays.toString(array2));

        System.out.println("La suma de los dos y la ordenación es:");
        sumaOrdenar2Arrays(array1, array2, arrayOrdenado);
        System.out.println(Arrays.toString(arrayOrdenado));
    }
}
