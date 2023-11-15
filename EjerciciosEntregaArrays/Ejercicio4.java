package EjerciciosEntregaArrays;

import java.util.Scanner;

import java.util.Arrays;

public class Ejercicio4 {
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
         * Programa Java para leer la altura de N personas y calcular la altura media.
         * Calcular cuántas personas tienen una altura superior a la media y cuántas
         * tienen una altura inferior a la media. El valor de N se pide por teclado y
         * debe ser entero positivo.
         */
        /*
         * Declaramos el escaner junto a la variable número de personas para pedirle al
         * usuario que inserte el número y una variable que guarde la media
         */
        Scanner sc = new Scanner(System.in);
        int nPersonas = 0;
        double media = 0;
        int mayorMedia = 0;
        int menorMedia = 0;

        /* Pedimos al usuario que inserte el número de personas que quiere */
        System.out.println("Inserta el número de personas:");
        nPersonas = Integer.parseInt(sc.nextLine());

        /* Inicializamos el array que tendrá la cantidad de personas */
        double personas[] = new double[nPersonas];

        /*
         * Ahora procedemos a introducir alturas aleatorias entre 1,5 metros y 2 metros,
         * para ello el resultado sera entre 150 y 200, lo dividimos entre 100
         */
        System.out.println("Estas son las alturas:");
        for (int i = 0; i < personas.length; i++) {
            personas[i] = generarAleatorio(150, 200);
            personas[i] = personas[i] / 100;
        }
        System.out.println(Arrays.toString(personas));

        /*
         * Sumamos todas las alturas y hacemos la media meditan una funcion y la
         * pintamos
         */
        media = mediaArray(personas);
        System.out.println("La media es " + media);

        /*Ahora contamos la cantidad de personas superior e inferior a la media */
        for (int i = 0; i < personas.length; i++) {

            if(personas[i] > media) {
                mayorMedia += 1;
            } else if (personas[i] < media) {
                menorMedia += 1;
            }

        }

        /*Pintamos el resultado */
        System.out.println("La cantidad de personas mayor a la media es " + mayorMedia);
        System.out.println("La cantidad de personas menor a la media es " + menorMedia);
        sc.close();
    }
}
