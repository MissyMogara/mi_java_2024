package EjerciciosEntregaArrays;

public class Ejercicio16 {
    /**
     * Proceso que rellena automaticamente una matriz con -1
     * 
     * @param array
     */
    public static void rellenarMatrizNeg(int array[][]) {
        try {

            for (int i = 0; i < array.length; i++) {

                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = -1;
                }

            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
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
     * Proceso que rellena automaticamente un array con números aleatorios no
     * repetidos
     * 
     * @param array
     */
    public static void rellenarMatrizNoRep(int matriz[][]) {
        try {
            int copia[][] = new int[matriz.length][matriz[0].length];
            /*
             * Vamos a rellenar la copia con -1 para que asi mientras creamos la matriz
             * cuando comparemos no sean los dos 0
             */
            rellenarMatrizNeg(copia);
            for (int i = 0; i < matriz.length; i++) {

                for (int j = 0; j < matriz[i].length; j++) {

                    for (int k = 0; k < matriz[i].length; k++) {
                        if (matriz[i][j] == copia[i][k]) {
                            j--;

                        }
                    }
                    matriz[i][j] = generarNumero(1, 100);
                    copia[i][j] = matriz[i][j];
                }

            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    public static void main(String[] args) {

        /* Crea una matriz de 3x6 números enteros aleatorios no repetidos. */

        int matriz[][] = new int[3][6];

        rellenarMatrizNoRep(matriz);

        pintarArrayBidimensional(matriz);

    }
}
