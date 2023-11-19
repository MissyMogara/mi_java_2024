package EjerciciosEntregaArrays;

public class Ejercicio15 {
    public static void sumarMatrices(int[][] matriz1, int[][] matriz2, int[][] matrizSuma) {

        for (int i = 0; i < matriz1.length; i++) {

            for (int j = 0; j < matriz1[i].length; j++) {

                matrizSuma[i][j] = matriz1[i][j] + matriz2[i][j];

            }

        }

    }

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
                    array[i][j] = generarNumero(1, 100);
                }

            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    public static void main(String[] args) {

        /*
         * Crear dos matrices 3x3 de números enteros (generadas aleatoriamente),
         * pintarlas, sumarlas y mostrar su suma. El resultado será también una matriz
         * (suma) donde cada elemento será la suma de los elementos de las otras
         * matrices en la misma posición.
         */

        /* Rellenamos y pintamos las dos matrices */
        System.out.println("Matriz nº1:");
        int matriz1[][] = new int[3][3];
        rellenarArrayBi(matriz1);
        pintarArrayBidimensional(matriz1);
        System.out.println("Matriz nº2:");
        int matriz2[][] = new int[3][3];
        rellenarArrayBi(matriz2);
        pintarArrayBidimensional(matriz2);

        /* Llamamos a la función y mostramos la suma */
        System.out.println("La suma de las dos matrices es:");
        int matrizSuma[][] = new int[3][3];
        sumarMatrices(matriz1, matriz2, matrizSuma);
        pintarArrayBidimensional(matrizSuma);

    }
}
