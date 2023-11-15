package EjerciciosEntregaArrays;

import java.util.Arrays;

public class Ejercicio10 {

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
     * Proceso que rellena automaticamente un array con números aleatorios, ha sido
     * modificado para no poder repetirse ningún número
     * 
     * @param array
     */
    public static void rellenarArrayNoRep(int array[]) {
        try {
            int arrayRepetidos[] = new int[array.length];
            for (int i = 0; i < array.length; i++) {

                array[i] = generarNumero(1, 49);

                for (int j = 0; j < array.length; j++) {
                    if (array[i] == arrayRepetidos[j]) {
                        i--;
                    }
                }
                arrayRepetidos[i] = array[i];
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    public static void main(String[] args) {

        /*
         * Realiza una función que devuelva un array con una combinación de la Lotería
         * Primitiva (6 números entre 1 y 49).
         * La particularidad es que los números no deben estar repetidos.
         */

        /*
         * Creamos el array con la primitiva y usamos la funcion modificada de rellenar
         * el array pero esta vez que no se repitan
         */
        int primitiva[] = new int[6];
        rellenarArrayNoRep(primitiva);

        /* pintamos el resultado */
        System.out.println(Arrays.toString(primitiva));

    }
}
