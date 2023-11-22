package EjerciciosEntregaArrays;

import java.util.Scanner;

import java.util.Arrays;

public class Ejercicio19 {
    /**
     * Función que crea un array y lo devuelve
     * 
     * @return
     */
    public static int[] pila() {
        int pila[] = new int[20];
        return pila;
    }

    /**
     * Proceso que inserta valores en un array pila
     * 
     * @param pila
     * @param valor
     * @param posicion
     */
    public static void insertarValorPila(int[] pila, int valor, int posicion) {
        for (int i = 0; i <= posicion; i++) {
            if (pila[i] == 0) {
                pila[i] = valor;
            }
        }
    }

    /**
     * Proceso que quita valores en un array pila
     * 
     * @param pila
     * @param valor
     * @param posicion
     */
    public static int quitarValorPila(int[] pila, int valor, int posicion) {
        int valorQuitado;
        if (pila[0] == 0) {
            System.out.println("Error: No se puede borrar ningún elemento de la pila porque no tiene elementos.");

        } else {
            valorQuitado = pila[posicion - 1];
            pila[posicion - 1] = 0;
            return valorQuitado;
        }
        return 0;
    }

    /*
     * Implementación de una Pila con un vector de 20 elementos. Una Pila se basa en
     * el concepto “Primero en entrar Último en salir”. De modo que se saca siempre
     * el último que se añadió. Implementa métodos para crear una pila vacía,
     * insertar elemento en la pila, sacar elemento de la pila (lo muestra y lo
     * quita), comprobar si la pila está llena.
     */
    public static void main(String[] args) {
        /*
         * Empezamos inicializando el scanner y el array llamando a la función de crear
         * pila, ademas inicializamos la variable opción del menú, y otra variable para
         * controlar la posición de los valores en la pila
         */
        Scanner sc = new Scanner(System.in);
        int array[] = pila();
        int opcion = 0;
        int valor = 0;
        int posicion = 0;

        /* Realizamos un menú */
        while (opcion != 4) {
            /* Enseñamos las opciones al usuario */
            System.out.println("Elige una opción:");
            System.out.println("1. Insertar elemento en la pila.");
            System.out.println("2. Borrar elemente en la pila.");
            System.out.println("3. Comprobar la capacidad de la pila.");
            System.out.println("4. Salir.");
            /* Le pedimos al usuario que inserte una opción */
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    /* Esta opcion llamara a un proceso para añadir un valor a la ultima posicion */
                    System.out.println("Inserta un valor que no sea '0':");
                    valor = Integer.parseInt(sc.nextLine());
                    if (valor == 0) {
                        /* Si es 0, no es válido puesto a que es un valor vacio */
                        System.out.println("Error: Por favor inserta un valor que no sea '0'.");
                    } else if (posicion == array.length) {
                        /*
                         * Si la posicion es igual a la longitud del array entonces ya estamos en el
                         * limite
                         */
                        System.out.println("Error: La pila esta llena.");
                    } else {
                        /* Sino ocurre ninguna de las anteriores entonces insertamos el valor */
                        insertarValorPila(array, valor, posicion);
                        posicion += 1;
                    }
                    break;
                case 2:
                    /*
                     * Llamamos a una funcion que borrara el ultimo valor añadido y ademas lo
                     * mostrará
                     */
                    System.out.println("El valor borrado es: " + quitarValorPila(array, valor, posicion));
                    posicion -= 1;
                    break;
                case 3:
                    /* Cuando se eliga esta opcion comprobaremos si esta llena o no la pila */
                    if (posicion == array.length) {

                        System.out.println("-La pila esta llena:");
                        System.out.println(Arrays.toString(array));
                    } else {

                        System.out.println("-La pilla aún no esta llena:");
                        System.out.println(Arrays.toString(array));
                    }

                    break;

                default:
                    if (opcion == 4) {
                        System.out.println("Adiós");
                    }
                    break;
            }

        }
        sc.close();
    }

}
