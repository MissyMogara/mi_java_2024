package EjerciciosEntregaArrays;

import java.util.Arrays;

public class Ejercicio17 {
    /**
     * Proceso que se recorre una matriz y la pinta
     * 
     * @param array
     */
    public static void pintarArrayBidimensional(int[][] array) {
        // Recorre las filas del array bidimensional
        for (int i = 0; i < array.length; i++) {
            // Recorre las columnas de la fila actual
            for (int j = 0; j < array[i].length; j++) {
                // Imprime el valor del array
                System.out.print(array[i][j] + "\t");
            }
            // Nueva línea después de cada fila
            System.out.println();
        }
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
    public static void rellenarArrayBi(int array[][]) {
        try {

            for (int i = 0; i < array.length; i++) {

                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = generarNumero(1, 500);
                }

            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    /**
     * Proceso que ordena las filas de una matriz mediante la ayuda de
     * un array auxiliar para la matriz, va guardando los valores y luego
     * los ordena y los sustituye en la fila correspondiente
     * 
     * @param matriz
     */
    public static void ordenarFilasMatriz(int[][] matriz) {

        // Recorre las filas del array bidimensional
        int matrizAux[] = new int[matriz[0].length];

        for (int r = 0; r < matriz.length; r++) {

            for (int i = 0; i < matriz.length; i++) {
                // Recorre las columnas de la fila actual
                matrizAux[i] = matriz[i][r];

            }

            Arrays.sort(matrizAux);

            for (int i = 0; i < matriz.length; i++) {
                // Recorre las columnas de la fila actual
                matriz[i][r] = matrizAux[i];

            }

        }
    }

    public static void main(String[] args) {
        /*
         * Ordenar matrices. Crea una matriz de enteros de dos dimensiones de 50x50
         * elementos, rellénala con números
         * aleatorios entre 1 y 500. A continuación, realiza dos funciones:
         * -a. ordenaFilas(matriz): que ordene la matriz por filas, cada fila de la
         * matriz quedará ordenada de menor a
         * mayor.
         * -b. ordenaColumnas(matriz): que ordene la matriz por columnas, cada columna
         * quedará ordenada de
         * menor a mayor, independientemente de las demás.
         */

        // De claramos la matriz
        // La he declarado de 20x20 porque 50x50 es visualmente lioso pero funciona
        int matriz[][] = new int[20][20];
        // Rellenamos la matriz
        rellenarArrayBi(matriz);
        // Llamamos al proceso para que lo ordene
        ordenarFilasMatriz(matriz);
        // Pintamos el resultado
        pintarArrayBidimensional(matriz);

    }
}
