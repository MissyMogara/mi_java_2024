package Trimestre1.PracticaStringAlgoritmos;

import java.util.Arrays;

public class EjercicioOrdenacion4 {
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
     * Proceso que va acompañado de la función de generar aleatorio, rellena el
     * array automaticamente, no tiene que devolver nada porque guarda los cambios
     * en el array
     * 
     * @param array
     */
    public static void rellenarArray(int array[]) {

        for (int i = 0; i < array.length; i++) {

            array[i] = generarAleatorio(1, 50);

        }

    }
    /**
     * Función que realiza la media de los valores de un array
     * 
     * @param array
     * @return
     */
    public static double mediaArray(int array[]) {
        double media = 0;
        for (int i = 0; i < array.length; i++) {

            media = media + array[i];

        }
        media = media / array.length;
        return media;

    }

    /**
     * Función que devuelve el número mayor de un array
     * 
     * @param array
     * @return
     */
    public static int mayorArray(int array[]) {
        int mayor = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i] > mayor) {
                mayor = array[i];
            }

        }

        return mayor;

    }

    /**
     * Devuelve el número menor de un array
     * 
     * @param array
     * @return
     */
    public static int menorArray(int array[]) {
        int menor = 100;
        for (int i = 0; i < array.length; i++) {

            if (array[i] < menor) {
                menor = array[i];
            }

        }

        return menor;

    }

    public static void main(String[] args) {

        /*
         * Realiza un programa que cree un vector de 50 posiciones con número aleatorios
         * entre 1 y 50. Una vez
         * creado el vector, el programa deberá mostrar el mayor, el menor y la media de
         * los valores almacenados
         * en el array.
         */

        int array[] = new int [50];
        int mayor;
        int menor;
        double media;


        rellenarArray(array);

        System.out.println("El array es:");
        System.out.println(Arrays.toString(array));

        mayor = mayorArray(array);
        menor = menorArray(array);
        media = mediaArray(array);

        System.out.println("La media del array es " + media + " el mayor es " + mayor + " y el menor es " + menor);


    }
}
