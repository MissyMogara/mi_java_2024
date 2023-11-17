package EjercicioDeClaseArrays;

import java.util.Scanner;

public class Ejercicio6 {
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
                    array[i][j] = generarNumero(1, 20);
                }

            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    /**
     * Suma los valores de una fila de la matriz, la fila viene indicada por numero
     * 
     * @param args
     */
    public static int sumaFila(int numero, int array[][]) {
        int total = 0;

        for (int i = 0; i < array[i].length; i++) {
            total += array[numero][i];
        }

        return total;
    }

    public static void main(String[] args) {

        int array[][] = new int[5][5];
        rellenarArrayBi(array);
        pintarArrayBidimensional(array);
        // Menú
        Scanner sc = new Scanner(System.in);
        int opcion;
        try {
            do {
                System.out.println("1.Suma una fila quese pedirá al usuario");
                System.out.println("2.Suma una columna quese pedirá al usuario");
                System.out.println("3.Suma la diagonal principal");
                System.out.println("4.Devuelve la media de todos los valores de matriz");
                System.out.println("5.Salir");
                opcion = Integer.parseInt(sc.nextLine());

                switch (opcion) {
                    case 1:
                        System.out.println("Introduce número de fila a sumar");
                        int fila = Integer.parseInt(sc.nextLine());
                        System.out.println("La suma es " + sumaFila(fila, array));

                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:

                        break;
                    case 5:

                        break;

                    default:
                        System.out.println("Opción inválida");
                        break;
                }

            } while (opcion != 5);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
