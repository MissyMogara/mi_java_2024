package EjerciciosEntrega3;

import java.util.Arrays;
import java.util.Scanner;

public class EjercicioArray7 {
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
    public static void rellenarArray(int array[]) {
        try {
            for (int i = 0; i < array.length; i++) {

                array[i] = generarNumero(1, 100);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    /**
     * Este proceso va desplazando los valores de un array hacia la derecha
     * 
     * @param array
     * @param numeroIteraciones
     */
    public static void desplazarArrayDerecha(int array[], int numeroIteraciones) {
        for (int i = 0; i < numeroIteraciones; i++) {
            int nAxuliar = array[array.length - 1];
            for (int j = array.length - 1; j > 0; j--) {
                array[j] = array[j - 1];
            }
            array[0] = nAxuliar;
        }
    }

    public static void main(String[] args) {

        /*
         * Crear un programa que lea por teclado una tabla de 5 números enteros y la
         * desplace una posición hacia la
         * derecha: el primero pasa a ser el segundo, el segundo pasa a ser el tercero y
         * así sucesivamente. Igual que el
         * anterior, pero desplazando N posiciones (N es un número introducido por el
         * usuario).
         */

        /* Rellenamos el array */
        int array[] = new int[5];
        rellenarArray(array);

        System.out.println(Arrays.toString(array));

        /* Le pedimos al usuario que inserte el numero de iteraciones */
        Scanner sc = new Scanner(System.in);
        int numeroIteraciones = 0;
        numeroIteraciones = Integer.parseInt(sc.nextLine());

        /* Con este proceso se desplaza hacia la derecha */
        desplazarArrayDerecha(array, numeroIteraciones);

        /* Pintamos el resultado */
        System.out.println(Arrays.toString(array));

        sc.close();
    }
}
