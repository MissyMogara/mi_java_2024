package EjerciciosEntregaArrays;

import java.util.Arrays;
import java.util.Scanner;

public class prueba {
    public static void main(String[] args) {
        int array[] = new int[5];
        Scanner sc = new Scanner(System.in);

        // Leer el número de posiciones a desplazar desde el usuario
        System.out.print("Introduce el número de posiciones a desplazar hacia la derecha: ");
        int numeroIteraciones = Integer.parseInt(sc.nextLine());

        // Rellenar el array con números aleatorios
        rellenarArray(array);
        System.out.println("Array original: " + Arrays.toString(array));

        // Realizar el desplazamiento hacia la derecha
        desplazarArrayDerecha(array, numeroIteraciones);

        // Imprimir el array después del desplazamiento
        System.out.println("Array después del desplazamiento hacia la derecha: " + Arrays.toString(array));

        sc.close();
    }

    public static void rellenarArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            array[i] = generarNumero(1, 100);
        }
    }

    public static void desplazarArrayDerecha(int array[], int posiciones) {
        // Realizar el desplazamiento hacia la derecha
        for (int j = 0; j < posiciones; j++) {
            int temp = array[array.length - 1];
            for (int i = array.length - 1; i > 0; i--) {
                array[i] = array[i - 1];
            }
            array[0] = temp;
        }
    }

    public static int generarNumero(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
}