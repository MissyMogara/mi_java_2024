package EjerciciosEntregaArrays;

import java.util.Arrays;

public class Ejercicio18 {
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
                    array[i][j] = generarNumero(0, 9);
                }

            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    /**
     * Este proceso copia una matriz a otra matriz realizando su versión de hoja de
     * cálculo
     * 
     * @param matriz
     * @param matrizAux
     */
    public static void hojaCalculo(int[][] matriz, int matrizAux[][]) {

        System.out.println(matrizAux.length);
        System.out.println(matrizAux[0].length);

        // Recorre las filas del array bidimensional
        for (int i = 0; i < matrizAux.length; i++) {

            for (int j = 0; j < (matrizAux[i].length); j++) {
                // Si llega al final de la columna pintará la suma de la columna excepto en la
                // esquina inferior derecha
                if (i == (matrizAux.length - 1) && j != (matrizAux[i].length - 1)) {
                    matrizAux[i][j] = sumaColumna(j, matriz);
                    // Si llega al final de la fila pintara la suma de las filas anteriores excepto
                    // Si llega a la esquina inferior derecha
                } else if (j == (matrizAux[i].length - 1) && (i != matrizAux.length - 1)) {
                    matrizAux[i][j] = sumaFila(i, matriz);
                    // Si llega a la esquina inferior derecha pintará tanto la suma de la suma de
                    // todas las filas como de las columnas
                } else if (i == (matrizAux.length - 1) && j == (matrizAux[i].length - 1)) {
                    matrizAux[i][j] = sumaColumna(j, matrizAux) + sumaFila(i, matrizAux);
                } else {
                    // Sino entonces seguirá copiando la matriz como hace normalmente
                    matrizAux[i][j] = matriz[i][j];
                }
            }

        }
    }

    /**
     * Suma los valores de una fila de la matriz, la fila viene indicada por numero
     * 
     * @param args
     */
    public static int sumaFila(int numero, int tabla[][]) {

        int total = 0;

        for (int j = 0; j < tabla[0].length; j++) {
            total += tabla[numero][j];
        }

        return total;
    }

    /**
     * Función que suma los valores de una columna de una matriz, dada por el numero
     * de columna
     * 
     * @param numero
     * @param tabla
     * @return
     */
    public static int sumaColumna(int numero, int tabla[][]) {
        int total = 0;

        for (int i = 0; i < tabla.length; i++) {
            total += tabla[i][numero];
        }

        return total;
    }

    public static void main(String[] args) {

        /*
         * Escribe un programa que genere al azar 20 números enteros comprendidos entre
         * 0 y 9. Estos números se deben
         * introducir en un array de 4 filas por 5 columnas.
         * El programa mostrará las sumas parciales de filas y columnas igual que si de
         * una hoja de cálculo se tratara. La
         * suma total debe aparecer en la esquina inferior derecha
         */
        int matriz[][] = new int[4][5];
        rellenarArrayBi(matriz);
        pintarArrayBidimensional(matriz);

        System.out.println();
        int hojaCalculo[][] = new int[matriz.length + 1][matriz[0].length + 1];
        hojaCalculo(matriz, hojaCalculo);

        pintarArrayBidimensional(hojaCalculo);

    }
}
