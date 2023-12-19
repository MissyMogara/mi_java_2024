package EjerciciosEntregaArrays;

import java.util.Arrays;

public class Ejercicio1 {
    /**
     * función que genera un número aleatorio entre el mínimo y el máximo
     * 
     * @param min mínimo
     * @param max máximo
     * @return
     */
    public static int generarAleatorio(int min, int max) {
        int n;
        n = (int) (Math.random() * (max + 1 - min)) + min;
        return n;
    }

    public static void main(String[] args) {

        /*
         * Programa Java que guarda en un array 20 números enteros que se generen
         * aleatoriamente entre -100 y 100. A continuación, se recorre el array y
         * calcula cuántos números son positivos y cuántos negativos.
         */
        int positivo = 0;
        int negativo = 0;
        int array[] = new int[20];
        /* Rellenamos el Array con un for */
        for (int i = 0; i < array.length; i++) {
            array[i] = generarAleatorio(-100, 100);

        }
        /* Pintamos el resultado para comprobar que funciona */
        System.out.println(Arrays.toString(array));
        /* Ahora vamos a contar los positivos y negativos */
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                negativo += 1;
            } else {
                positivo += 1;
            }
        }
        /* Y ahora pintamos el número de positivos y negativos */
        System.out.println("La cantidad de números positivos es de " + positivo
                + " y la cantidad de números negativos es de " + negativo);

    }
}
