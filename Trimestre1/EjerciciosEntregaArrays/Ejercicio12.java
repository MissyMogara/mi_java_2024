package EjerciciosEntregaArrays;

public class Ejercicio12 {
    // Función para pintar un array bidimensional
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

    public static void main(String[] args) {

        /*
         * Crear una matriz “marco” de tamaño 8x6. Una matriz “marco” es aquella que
         * todos sus elementos son 0 salvo los
         * de los bordes que deben ser 1. Mostrarla.
         */

        int ejeX = 0;
        int ejeY = 0;
        int arrayBidimensional[][] = new int[8][6];

        for (int i = 0; i < arrayBidimensional.length; i++) {
            /* Vamos a recorrer el arraybidimensional, para ello necesitamos 2 fors */
            for (int j = 0; j < arrayBidimensional[i].length; j++) {
                /*
                 * el ejex y siempre pintara 1 cuando este sea 0 o el final al igual que el
                 * ejey, el ejey se pondrá a 0 por cada iteración del primer for
                 */
                arrayBidimensional[i][j] = 0;
                if (ejeX == 0 || ejeX == arrayBidimensional.length - 1) {
                    arrayBidimensional[i][j] = 1;
                } else if (ejeY == 0 || ejeY == arrayBidimensional[i].length - 1) {
                    arrayBidimensional[i][j] = 1;
                }
                ejeY += 1;
            }
            ejeY = 0;
            ejeX += 1;
        }

        pintarArrayBidimensional(arrayBidimensional);

    }

}
