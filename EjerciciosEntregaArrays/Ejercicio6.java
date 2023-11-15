package EjerciciosEntregaArrays;

import java.util.Arrays;

public class Ejercicio6 {
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

    /* Proceso que rellena el array de forma automática */
    public static void rellenarArray(int array[]) {
        try {
            for (int i = 0; i < array.length; i++) {

                array[i] = generarNumero(1, 100);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    public static void main(String[] args) {

        /*
         * Generar 10 números enteros aleatorios. Debemos mostrarlos en el siguiente
         * orden: el primero, el último, el
         * segundo, el penúltimo, el tercero, etc… Pista: primero los guardas en un
         * array y luego lo recorres como indica.
         */
        /* Declaramos y rellenamos el array */

        int array1[] = new int[10];
        rellenarArray(array1);
        System.out.println(Arrays.toString(array1));

        /*
         * Declaramos dos arrays que guardaran la mitad del original y el array que se
         * leera como queremos y ademas una variable para ayudarnos a meter los numeros
         * desde atras
         */
        int arrayMitad1[] = new int[5];
        int arrayMitad2[] = new int[5];
        int arrayCambiado[] = new int[10];
        int numero = 4;

        /* Guardamos una mitad del original en cada uno */
        arrayMitad1 = Arrays.copyOfRange(array1, 0, 5);
        arrayMitad2 = Arrays.copyOfRange(array1, 5, 10);

        /* Ahora con la ayuda de un for vamos insertando los numeros */
        for (int i = 0; i < array1.length; i++) {

            if (i % 2 == 0) {
                /*Aqui pintaremos la primera mitad cuando sea par o 0*/
                arrayCambiado[i] = arrayMitad1[i / 2];
            } else {
                /*Aqui la segunda cuando sea impar */
                arrayCambiado[i] = arrayMitad2[numero];
                numero = numero - 1;
            }
        }

        System.out.println(Arrays.toString(arrayCambiado));

    }
}
