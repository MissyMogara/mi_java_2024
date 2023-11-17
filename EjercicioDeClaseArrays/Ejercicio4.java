package EjercicioDeClaseArrays;

public class Ejercicio4 {
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

        int tabla[][] = new int[5][5];

        rellenarArrayBi(tabla);

        pintarArrayBidimensional(tabla);
        /* Llamamos a la función para que nos pinte la media del array */
        System.out.println("La media del array es de " + mediaArrayBi(tabla));

    }
}
