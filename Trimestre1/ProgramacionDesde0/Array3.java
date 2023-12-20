package ProgramacionDesde0;

import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {

        /*
         * Programa que declare tres vectores ‘vector1’, ‘vector2’ y ‘vector3’ de cinco
         * enteros cada
         * uno, pida valores para ‘vector1’ y ‘vector2’ y calcule
         * vector3=vector1+vector2
         */
        // Declaramos los 3 contadores y un contador para llevar el numero de huecos e
        // indicarle al usuario por cual va insertando
        int contenedor1[] = new int[5];
        int contenedor2[] = new int[5];
        int contenedor3[] = new int[5];
        int conta = 0;
        // Pedimos al usuario que inserte los valores del contenedor 1
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < contenedor1.length; i++) {
            conta += 1;
            System.out.println("Inserta un valor en el espacio " + conta + " del contenedor 1");
            contenedor1[i] = Integer.parseInt(sc.nextLine());

        }
        // Reiniciamos el contador a 0 para asi poder utilizarlo en el siguiente for
        conta = 0;
        // Ahora le pedimos que inserte valores para el contenedor 2
        for (int i = 0; i < contenedor2.length; i++) {
            conta += 1;
            System.out.println("Inserta un valor en el espacio " + conta + " del contenedor 2");
            contenedor2[i] = Integer.parseInt(sc.nextLine());

        }
        // Le pintamos los 2 contenedores para que vea cuales son los valores que
        // insertó
        System.out.println("El primer contenedor es:");
        System.out.print(contenedor1[0] + " ");
        System.out.print(contenedor1[1] + " ");
        System.out.print(contenedor1[2] + " ");
        System.out.print(contenedor1[3] + " ");
        System.out.print(contenedor1[4] + " ");

        System.out.println();

        System.out.println("El segundo contenedor es:");
        System.out.print(contenedor2[0] + " ");
        System.out.print(contenedor2[1] + " ");
        System.out.print(contenedor2[2] + " ");
        System.out.print(contenedor2[3] + " ");
        System.out.print(contenedor2[4] + " ");
        System.out.println();

        // Ahora le mostramos la suma de ambos contenedores
        System.out.println("El contenedor número 3 vale:");
        for (int i = 0; i < contenedor3.length; i++) {

            contenedor3[i] = contenedor1[i] + contenedor2[i];

        }

        System.out.print(contenedor3[0] + " ");
        System.out.print(contenedor3[1] + " ");
        System.out.print(contenedor3[2] + " ");
        System.out.print(contenedor3[3] + " ");
        System.out.print(contenedor3[4] + " ");
        System.out.println();
        sc.close();
    }
}
