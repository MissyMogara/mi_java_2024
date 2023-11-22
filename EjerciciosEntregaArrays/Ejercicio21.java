package EjerciciosEntregaArrays;

public class Ejercicio21 {
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
     * Realiza la matriz traspuesta de una matriz
     * 
     * @param matriz
     * @param matrizTraspuesta
     */
    public static void matrizTraspuesta(int[][] matriz, int[][] matrizTraspuesta) {
        /*
         * Para despreocuparnos del tamaño del array escogemos la mayor longitud de la
         * matriz (X o Y)
         */
        if (matriz.length > matriz[0].length) {
            int arrayX[] = new int[matriz.length];
            /* Eje Y, numero de filas, hay que pillar el cada fila entera */
            for (int i = 0; i < matriz.length; i++) {
                /* Este for rellena nuestro array auxiliar */
                for (int j = 0; j < matriz[0].length; j++) {
                    arrayX[j] = matriz[i][j];
                }
                /* Este for rellena la matrizTraspuesta con la ayuda del array auxiliar */
                for (int j = 0; j < matriz[0].length; j++) {
                    matrizTraspuesta[j][i] = arrayX[j];
                }

            }

        } else {
            int arrayY[] = new int[matriz[0].length];
            /* Eje X, numero de columnas, hay que pillar cada columna entera */
            for (int i = 0; i < matriz[0].length; i++) {
                /* Este for rellena nuestro array auxiliar */
                for (int j = 0; j < matriz.length; j++) {
                    arrayY[j] = matriz[j][i];
                }
                /* Este for rellena la matrizTraspuesta con la ayuda del array auxiliar */
                for (int j = 0; j < matriz.length; j++) {
                    matrizTraspuesta[i][j] = arrayY[j];
                }

            }

        }

    }

    public static void main(String[] args) {

        /*
         * Crea un método que dada una determinada matriz nxm devuelva su matriz
         * traspuesta
         */

        /* Declaramos tanto la matriz normal como el contenedor de la traspuesta */
        int matriz[][] = new int[3][4];
        int matrizTraspuesta[][] = new int[matriz[0].length][matriz.length];

        /* Rellenamos la matriz normal y la pintamos para que la vea el usuario */
        rellenarArrayBi(matriz);
        pintarArrayBidimensional(matriz);
        System.out.println();

        /*
         * Llamamos a el proceso matrizTraspuesta para que realice la matriz traspuesta
         * de nuestra matriz y pintamos el resultado
         */
        matrizTraspuesta(matriz, matrizTraspuesta);

        pintarArrayBidimensional(matrizTraspuesta);

    }
}
