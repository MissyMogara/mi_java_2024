package EjerciciosEntregaArrays;

import java.util.Arrays;

public class Ejercicio5 {
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
    public static void rellenarArray(double array[]) {

        for (int i = 0; i < array.length; i++) {

            array[i] = generarAleatorio(0, 100);

        }

    }

    /**
     * Función que realiza la media de los valores de un array
     * 
     * @param array
     * @return
     */
    public static double mediaArray(double array[]) {
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
    public static double mayorArray(double array[]) {
        double mayor = 0;
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
    public static double menorArray(double array[]) {
        double menor = 100;
        for (int i = 0; i < array.length; i++) {

            if (array[i] < menor) {
                menor = array[i];
            }

        }

        return menor;

    }

    public static void main(String[] args) {

        /*
         * Leer 10 números enteros y a continuación mostrar la media de los números
         * introducidos, el mayor valor y el menor valor. Usar un array para almacenar
         * los valores y sacar toda la información en una sola iteración del array. Si
         * puedes mejóralo implementando una función para cada tarea (media, mayor,
         * menor), pasando el array.
         */
        /*
         * Declaramos el array normal y el array donde guardaremos la información,
         * ademas de las variables para guardar la media, el mayor y el menor
         */
        double array[] = new double[10];
        double informacion[] = new double[3];
        double media = 0;
        double mayor = 0;
        double menor = 100;

        /* Rellenamos el array y lo pintamos */
        rellenarArray(array);
        System.out.println(Arrays.toString(array));

        /* Mediante las funciones calculamos tanto la media, como el mayor y el menor */
        media = mediaArray(array);
        mayor = mayorArray(array);
        menor = menorArray(array);

        /* Rellenamos el array de información con los elementos que queremos */
        informacion[0] = media;
        informacion[1] = mayor;
        informacion[2] = menor;

        /* Pintamos el resultado */
        System.out.println(Arrays.toString(informacion));

    }
}
