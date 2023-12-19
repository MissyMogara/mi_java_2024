package Trimestre1.PrimeraEvaluacion;

import java.util.Arrays;
import java.util.Scanner;

/*Nos piden crear una matriz 20×20 de números enteros que inicialmente
rellenamos de valores aleatorios (1-100), nos piden hacer un menú con estas opciones:
1. Intercambiar fila. Te pedirá dos números de fila e intercambiará los valores de la
primera por los valores de la segunda.
2. Suma de una columna que se pedirá al usuario (controlar que elija una correcta)
3. Sumar la diagonal principal y la diagonal inversa, y mostrar las dos sumas
4. Pintar las coordenadas i,j donde se encuentra el mayor elemento de la matriz.
5. Pinta la matriz traspuesta
6. Muestra la matriz con las filas ordenadas de mayor a menor
7. Salir */

public class Ejercicio1 {
    /**
     * Proceso que se recorre una matriz y la pinta
     * 
     * @param array
     */
    public static void pintarMatriz(int[][] array) {
        // Recorre las filas de la matriz
        for (int i = 0; i < array.length; i++) {
            // Recorre las columnas de la fila actual
            for (int j = 0; j < array[i].length; j++) {
                // Imprime el valor de la matriz
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
    public static void rellenarMatriz(int array[][]) {
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

    /**
     * Proceso que intercambia dos filas de la matriz
     * 
     * @param matriz
     * @param nF1    fila 1
     * @param nF2    fila 2
     */
    public static void intercambiarFila(int matriz[][], int nF1, int nF2) throws Exception {

        if (nF1 > 19 || nF1 < 0 || nF2 > 19 || nF2 < 0) {
            throw new Exception("Error: Has insertado un número mayor o menor al pedido en las filas.");
        }

        int arrayAux[] = new int[matriz.length];

        /* Guardamos la primera fila en un array auxiliar */
        for (int j = 0; j < matriz.length; j++) {

            arrayAux[j] = matriz[nF1][j];

        }

        /* Cambiamos la primera fila por la segunda */
        for (int i = 0; i < matriz.length; i++) {

            matriz[nF1][i] = matriz[nF2][i];

        }

        /* Cambiamos la segunda fila por el array auxiliar */
        for (int k = 0; k < matriz.length; k++) {

            matriz[nF2][k] = arrayAux[k];

        }

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

                if (j + i == tabla[i].length - 1) {

                    total = total + tabla[i][j];

                }

            }

        }

        return total;

    }

    /**
     * Función que pinta las coordenadas del número mayor de una matriz
     * 
     * @param array
     */
    public static void mayorMatriz(int[][] matriz) {
        int mayor = -1;
        int coordenadaY = 0;
        int coordenadaX = 0;
        // Recorre las filas de la matriz
        for (int i = 0; i < matriz.length; i++) {
            // Recorre las columnas de la fila actual
            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j] > mayor) {

                    mayor = matriz[i][j];
                }
            }

        }
        /*
         * Ahora buscamos la posición del número mayor y guardamos su posicion en las
         * variables coordenadas
         */
        for (int i = 0; i < matriz.length; i++) {
            // Recorre las columnas de la fila actual
            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j] == mayor) {

                    coordenadaY = i;

                    coordenadaX = j;
                }
            }

        }

        System.out.println("Las coordenadas de valor más alto son: " + "[" + coordenadaY + "," + coordenadaX + "]");
    }

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

    /**
     * Proceso que ordena las filas de una matriz mediante la ayuda de
     * un array auxiliar para la matriz, va guardando los valores y luego
     * los ordena y los sustituye en la fila correspondiente
     * 
     * @param matriz
     */
    public static void ordenarFilasMatriz(int[][] matriz) {

        // Recorre las filas de la matriz
        int matrizAux[] = new int[matriz[0].length];

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz.length; j++) {
                // Recorre las columnas de la fila actual
                matrizAux[j] = matriz[i][j];

            }

            Arrays.sort(matrizAux);

            for (int j = 0; j < matriz.length; j++) {
                // Recorre las columnas de la fila actual
                matriz[i][j] = matrizAux[j];

            }

        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int matriz[][] = new int[20][20];

        rellenarMatriz(matriz);
        pintarMatriz(matriz);
        int opcion = 0;
        /* Opcion 1 */
        int fila1 = 0;
        int fila2 = 0;

        /* Opcion 2 */
        int num = 0;
        /* Opcion 3 no necesita variables */
        /* Opcion 4 no necesita variables */
        /* Opcion 5 */
        int traspuesta[][] = new int[matriz.length][matriz[0].length];
        /* Opcion 6 no necesita variables */

        try {
            while (opcion != 7) {

                System.out.println("Inserta una opción:");
                System.out.println("1. Intercambiar filas.");
                System.out.println("2. Sumar columnas.");
                System.out.println("3. Sumas de la diagonal principal e inversa.");
                System.out.println("4. Pintar coordenadas donde se encuentra el valor mayor de la matriz.");
                System.out.println("5. Pintar la matriz traspuesta.");
                System.out.println("6. Ordenar filas de menor a mayor.");
                System.out.println("7. Intercambiar filas.");
                opcion = Integer.parseInt(sc.nextLine());

                switch (opcion) {
                    case 1:
                        /* Intercambiar filas */
                        System.out.println("Inserta el número de la primera fila, del 1 al 20:");
                        fila1 = Integer.parseInt(sc.nextLine());

                        System.out.println("Inserta el número de la segunda fila, del 1 al 20:");
                        fila2 = Integer.parseInt(sc.nextLine());

                        intercambiarFila(matriz, fila1 - 1, fila2 - 1);
                        pintarMatriz(matriz);

                        break;

                    case 2:
                        /* Suma de una columna */
                        System.out.println("Inserta el número de la columna del 1 al 20:");
                        num = Integer.parseInt(sc.nextLine());

                        System.out.println("El total de la columna es : " + sumaColumna(num - 1, matriz));

                        break;

                    case 3:
                        /* Sumas de la diagonal y diagonal inversa */

                        System.out.println("La suma de la diagonal es: " + sumaDiagonal(matriz));
                        System.out.println("La suma de la diagonal inversa es: " + sumaDiagonalInv(matriz));

                        break;

                    case 4:
                        /* Pintar coordenadas donde se encuentra el valor mayor de la matriz */
                        mayorMatriz(matriz);

                        break;

                    case 5:
                        /* Realiza la traspuesta de una matriz */

                        matrizTraspuesta(matriz, traspuesta);
                        pintarMatriz(traspuesta);

                        break;

                    case 6:
                        /* Ordena las filas de menor a mayor */
                        ordenarFilasMatriz(matriz);
                        pintarMatriz(matriz);

                        break;

                    case 7:
                        /* Salir del programa */
                        System.out.println("Adiós.");
                        break;

                    default:
                        break;
                }

            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
