package EjercicioDeClaseArrays;

import java.util.Scanner;

/**
 * Crear una matriz de 5x5 elementos int aleatorios entre 1 y 20
 * Opciones de menú:
 * - 1. Suma una fila que se pedirá al usuario
 * - 2. Suma una columna que se pedirá al usuario
 * - 3. Suma la diagonal principal
 * - 4. Devuelve la media de todos los valores de la matriz
 * - 5. Salir
 */

public class Ejercicio6 {

    /**
     * Función que genera un número aleatorio entre un valor mínimo y máximo
     * 
     * @param min
     * @param max
     * @return número aleatorio entre min y max, incluidos
     */
    public static int generarNumero(int min, int max) {
        return (int) ((Math.random() * (max - min + 1) + min));
    }

    /**
     * Función para pintar por consola los valores de una matriz de enteros
     * 
     * @param matriz
     */
    public static void pintarMatriz(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
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

    /**
     * Esta función suma la las diagonales de una matriz con la ayuda de las
     * variables de los ejes X e Y
     * 
     * @param tabla
     * @return
     */
    public static int sumaDiagonal(int tabla[][]) {

        int total = 0;


        for (int i = 0; i < tabla.length; i++) {

            for (int j = 0; j < tabla.length; j++) {

                if (i == j) {

                    total = total + tabla[i][j];
                    
                }

            }
          
        }

        return total;

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
     * Suma la diagonal inversa de la matriz con la ayuda de
     * las variables X e Y
     * 
     * @param tabla
     * @return
     */
    public static int sumaDiagonalInv(int tabla[][]) {

        int total = 0;


        for (int i = 0; i < tabla.length; i++) {

            for (int j = 0; j < tabla.length; j++) {

                if (j + i == tabla[i].length-1) {

                    total = total + tabla[i][j];
                    
                }
               
            }
          
        }

        return total;

    }

    /**
     * Esta función suma y devuelve la media de un array bidimensional
     * 
     * @param array
     * @return
     */
    public static void main(String[] args) {

        int tabla[][] = new int[5][5];

        for (int i = 0; i < tabla.length; i++) { // FILAS
            for (int j = 0; j < tabla[0].length; j++) { // COLUMNAS
                tabla[i][j] = generarNumero(1, 20);
            }
        }

        pintarMatriz(tabla);

        // MENÚ
        int opcion;
        Scanner sc = new Scanner(System.in);

        try {
            do {
                System.out.println("1. Suma una fila que se pedirá al usuario");
                System.out.println("2. Suma una columna que se pedirá al usuario");
                System.out.println("3. Suma la diagonal principal");
                System.out.println("4. Devuelve la media de todos los valores de la matriz");
                System.out.println("5. Suma la diagonal inversa");
                System.out.println("6. Salir");
                System.out.println("Introduce opción");
                opcion = Integer.parseInt(sc.nextLine());

                // Según la opción hacemos lo que corresponde
                switch (opcion) {
                    case 1:
                        System.out.println("-Introduce número de fila a sumar [0 - " + (tabla.length - 1) + "]");
                        int fila = Integer.parseInt(sc.nextLine());
                        System.out.println("-La suma es " + sumaFila(fila, tabla));

                        break;
                    case 2:
                        System.out.println("-Introduce número de columna a sumar [0 - " + (tabla[0].length - 1) + "]");
                        int columna = Integer.parseInt(sc.nextLine());
                        System.out.println("-La suma es " + sumaColumna(columna, tabla));
                        break;
                    case 3:
                        System.out.println("-La suma de la diagonal principal de la matriz es: " + sumaDiagonal(tabla));
                        break;
                    case 4:
                        System.out.println("-La media de los valores de la matriz es: " + mediaArrayBi(tabla));
                        break;
                    case 5:
                        System.out.println("-La suma de la diagonal inversa de la matriz es: " + sumaDiagonalInv(tabla));
                        break;
                    case 6:
                        System.out.println("-Adiós");
                        break;

                    default:
                        System.out.println("-Invalid option");
                        break;
                }
            } while (opcion != 6);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}