package EjerciciosEntregaArrays;

import java.util.Scanner;

public class Ejercicio13 {
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
     * Este proceso lo que hace es rellenar un array de forma manual, es decir se le
     * pide al usuario por teclado que lo rellene
     * 
     * @param array
     */
    public static void rellenarArrayManual(int[][] array) {
        Scanner sc = new Scanner(System.in);
        int fila = 0;
        int columna = 0;

        /* Usamos un for dentro de un for para rellenar el array manualmente */
        for (int i = 0; i < array.length; i++) {
            System.out.println("Fila " + (fila + 1));
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("columna " + (columna + 1));
                System.out.println("Escribe un número:");
                array[i][j] = Integer.parseInt(sc.nextLine());
                columna += 1;
            }
            columna = 0;
            fila += 1;
        }
        sc.close();
    }

    /**
     * Este proceso suma y muestra los valores de cada fila del arraybidimensional
     * @param array
     */
    public static void sumarArrayBidimensional(int[][] array) {
        
        /* Usamos un for dentro de un for para sumar los elementos de cada columna de el array */
        int fila=0;
        int sumaFila=0;
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                sumaFila = sumaFila + array[i][j];
            }
            System.out.println("La suma de la fila " + (fila+1) + " es " + sumaFila);
            sumaFila=0;
            fila+=1;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        /*
         * Crear una tabla bidimensional de tamaño 3x4 de números enteros (leídos desde
         * teclado). Mostrar la matriz y la suma de los valores de cada fila.
         */

        /*
         * Declaramos nuestro array y llamamos a la función para rellenarlo de forma
         * manual
         */

        int array[][] = new int[3][4];
        rellenarArrayManual(array);

        /* Pintamos el array con nuestra función */
        System.out.println("El array quedaría así:");
        pintarArrayBidimensional(array);

        /*Llamamos a la función de mostrar las sumas de cada fila */
        sumarArrayBidimensional(array);

    }
}
