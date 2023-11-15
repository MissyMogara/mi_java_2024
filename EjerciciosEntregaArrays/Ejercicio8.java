package EjerciciosEntregaArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio8 {
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

                array[i] = generarNumero(1, 100);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    /**
     * Esta funcion crea un nuevo array apartir de otro sin la posicion del anterior
     * seleccionada
     * 
     * @param array
     * @param array2
     * @param posicion
     */
    public static void borraArray(int array[], int array2[], int posicion) {
        int numero = 0;
        array[posicion] = -1;
        for (int i = 0; i < array.length; i++) {

            if (array[i] != -1) {
                array2[numero] = array[i];
                numero += 1;
            }

        }

    }

    public static void main(String[] args) {
        /*
         * Genera aleatoriamente una tabla de 10 elementos numéricos enteros, guardalos
         * en una array. Luego pide por teclado una posición (entre 0 y 9). Eliminar el
         * elemento situado en la posición dada sin dejar huecos.
         */
        /* Creamos y rellenamos un array además de pintarlo para ver como es */
        Scanner sc = new Scanner(System.in);
        int posicion;
        int array[] = new int[10];
        rellenarArray(array);
        System.out.println("Array:");
        System.err.println(Arrays.toString(array));

        /*
         * Creamos un array secundario con una capacidad -1 al normal que guardara los
         * resultados menos el que queremos eliminar y pedimos por teclado la posición
         */
        int array2[] = new int[9];
        System.out.println("Inserta una posición del 0 al 9:");
        posicion = Integer.parseInt(sc.nextLine());

        /* Llamamos al a funcion que nos creara un nuevo array sin el numero */
        System.out.println("Nuevo Array:");
        borraArray(array, array2, posicion);
        System.out.println(Arrays.toString(array2));

        sc.close();
    }
}
