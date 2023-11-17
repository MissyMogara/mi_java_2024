package EjercicioDeClaseArrays;

public class Ejercicio5 {
    /**
     * Te devuelve la fila o columna indicada por número de la tabla.
     * Si el caracter c es 'f' te devuelve esa fila
     * Si el caracter c es 'c' te devuelve la columna
     * 
     * @param numero
     * @param c
     * @param array
     * @return
     */
    public int[] devuelveParte(int numero, char c, int array[][]) throws Exception {

        // Check numero is valid
        if (numero >= array.length && c == 'f') {
            throw new Exception("Número de filas no válido");
        }

        if (numero >= array[0].length && c == 'c') {
            throw new Exception("Número de columnas no válido");
        }

        if (numero < 0) {
            throw new Exception("Número negativo no es válido");
        }

        // Return row column with numero
        if (c == 'f') {
            return array[numero];
        }

        // Return column with numero
        if (c == 'c') {
            // Create array aux
            int aux[] = new int[array[0].length];

            for (int j = 0; j < array[0].length; j++) {
                aux[j] = array[j][numero];
            }
            return aux;
        }
        return null;
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

        

        try {

            int array[][] = new int[5][5];
            rellenarArrayBi(array);
            int aux[] = new int[array[0].length];

            aux[] = devuelveParte(1,'f', array[][]);
            

        } catch (Exception e) {
          System.out.println(e.getMessage());
            
        }

    }
}
