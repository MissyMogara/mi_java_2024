package PracticaStringAlgoritmos;

import java.util.Arrays;

public class EjercicioOrdenacion2 {
    /**
     * Este proceso ordena el array por el método burbuja
     * 
     * @param array
     */
    public static void burbuja(int[] array) {
        int vuelta = 0;
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
            vuelta +=1;
            if (intercambios != 0) {
                System.out.println("Número de intercambios: " + intercambios + " vuelva " + vuelta);
                intercambios = 0;
            } else {
                System.out.println("No hay mas intercambios.");
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

    public static void main(String[] args) {

        /*
         * Mejora el método de la burbuja explicado anteriormente y utiliza una variable
         * a modo de centinela o
         * flag, de tal manera que ésta se active cuando hay algún intercambio. En el
         * momento que no haya
         * ningún intercambio, el algoritmo debería parar puesto que el vector ya está
         * ordenado.
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
