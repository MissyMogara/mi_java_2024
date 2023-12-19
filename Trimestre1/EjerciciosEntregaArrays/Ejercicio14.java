package EjerciciosEntregaArrays;

public class Ejercicio14 {
    /**
     * Función que devuelva el valor mínimo de una matríz
     * 
     * @param array
     * @return
     */
    public static int devolverMinimoMatriz(int[][] array) {
        int minimo = 1000;
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < minimo) {
                    minimo = array[i][j];
                }
            }

        }
        return minimo;
    }

    /**
     * Función que devuelva el valor máximo de una matríz
     * 
     * @param array
     * @return
     */
    public static int devolverMaximoMatriz(int[][] array) {
        int maximo = -1;
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > maximo) {
                    maximo = array[i][j];
                }
            }

        }
        return maximo;
    }

    /**
     * Esta función suma y devuelve la media de un array bidimensional
     * 
     * @param array
     * @return
     */
    public static double mediaArrayBi(int[][] array) {

        /*
         * Usamos un for dentro de un for para sumar los elementos de cada columna de el
         * array
         */
        double media;
        double sumaTotal = 0;
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                sumaTotal = sumaTotal + array[i][j];
            }

        }
        media = (sumaTotal / (array.length * array[0].length));
        return media;
    }

    /**
     * Proceso para pintar un arraybidimensional
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
                    array[i][j] = generarNumero(1, 100);
                }

            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    public static void main(String[] args) {

        /*
         * Crear una matriz 5x3 de números enteros (aleatorios) y mostrar el menor, el
         * mayor y la media de los elementos.
         */
        /* Declaramos las variables necesarias para guardar los datos */
        int mayor;
        double media;
        int menor;

        /* Creamos, rellenamos y pintamos el array */
        int array[][] = new int[5][3];
        rellenarArrayBi(array);
        pintarArrayBidimensional(array);

        /* Guardamos los datos */
        mayor = devolverMaximoMatriz(array);
        media = mediaArrayBi(array);
        menor = devolverMinimoMatriz(array);

        /* Mostramos los resultados */
        System.out.println("El número mayor de la matriz es " + mayor + " y el número menor de la matríz es " + menor
                + " y la media es " + media);

    }
}
