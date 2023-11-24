package PracticaStringAlgoritmos;

import java.util.Arrays;

public class EjercicioOrdenacion6 {

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

            array[i] = generarAleatorio(1, 100);

        }

    }

    /**
     * Proceso que ordena un array y le quita los repetidos
     * 
     * @param array
     * @param arrayAux
     */
    public static void ordenarArrayNoRep(int array[], int arrayAux[]) {
        Arrays.sort(array);
        boolean esRepe = false;
        int arrayGuardar[] = new int[array.length];

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < arrayAux.length; j++) {

                if (array[i] == arrayGuardar[j]) {
                    esRepe = true;
                    continue;
                }

            }
            
            if (esRepe != true) {
                arrayAux[i] = array[i];
                arrayGuardar[i] = array[i];
            }
            esRepe = false;
        }
        Arrays.sort(arrayAux);
    }

    public static void main(String[] args) {

        /*
         * Realiza un programa que cree un vector de 100 posiciones con números
         * aleatorios entre 1 y 100. Una
         * vez creado el vector, el programa deberá ordenarlo y mostrar los números
         * entre 1 y 100 que no han
         * sido almacenados. Ten en cuenta a la hora de buscar un número en un array que
         * no tienes que
         * comparar con todo el array puesto que ya está ordenado.
         */

        /* Declaramos los arrays y rellenamos uno */
        int array[] = new int[100];
        int arrayOrdenado[] = new int[array.length];
        rellenarArray(array);

        /* Pintamos el array para mostrarselo al usuario */
        System.out.println("Array sin ordenar");
        System.out.println(Arrays.toString(array));

        /* Usamos la funcion y la pintamos */
        System.out.println("Array ordenado");
        ordenarArrayNoRep(array, arrayOrdenado);
        System.out.println(Arrays.toString(arrayOrdenado));

    }
}
