package EjerciciosEntregaArrays;

import java.util.Arrays;

public class Ejercicio2 {
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
    /**
     * Esta función intercambia la posición del primer y último elemento de un array
     * con la ayuda de una variable auxiliar
     * 
     * @param array
     */
    public static void intercambiarArray(int array[]) {
        int auxiliar;
        auxiliar = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = auxiliar;
    }

    public static void main(String[] args) {
        /*
         * Crea una función que reciba como parámetro un array de 10 enteros, debe
         * devolver el mismo array donde se hayan intercambiado el primer elemento y el
         * último elemento.
         */
        /*Rellenamos el array con un for */
        int array[] = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = generarAleatorio(-100, 100);

        }
        /*Mostramos el array sin intercambiar las posiciones */
        System.out.println("Array sin intercambiar:");
        System.out.println(Arrays.toString(array));

        /*Intercambiamos las posiciones y lo mostramos */
        intercambiarArray(array);
        System.out.println("Array intercambiado:");
        System.out.println(Arrays.toString(array));
    }
}
