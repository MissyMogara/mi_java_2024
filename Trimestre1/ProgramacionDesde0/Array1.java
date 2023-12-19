package Trimestre1.ProgramacionDesde0;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {

        /*
         * Crear un vector de 5 elementos de cadenas de caracteres, inicializa el vector
         * con datos
         * leídos por el teclado. Copia los elementos del vector en otro vector, pero en
         * orden inverso, y
         * muéstralo por la pantalla
         */
        // Declaramos los 2 contenedores junto a un contador que nos servira para
        // cambiar la posición del contenedor 1
        Scanner sc = new Scanner(System.in);
        String contenedor1[] = new String[5];
        String contenedor2[] = new String[5];
        int conta = 0;
        // Pedimos al usuario que inserte los valores del contenedor 1
        System.out.println("Inserta 5 cadenas de texto para el contenedor1:");
        for (int j = 0; j < contenedor1.length; j++) {

            contenedor1[j] = sc.nextLine();

        }
        System.out.println("Contenedor 1:");
        // Le mostramos el resultado del contenedor 1
        System.out.print(contenedor1[0] + " ");
        System.out.print(contenedor1[1] + " ");
        System.out.print(contenedor1[2] + " ");
        System.out.print(contenedor1[3] + " ");
        System.out.print(contenedor1[4] + " ");
        // Invertimos el resultado para el contenedor 2 mediante el uso de un for
        // inverso con la ayuda de un contador
        for (int k = contenedor2.length; k > 0; k--) {

            contenedor2[k - 1] = contenedor1[conta];
            conta += 1;

        }
        System.out.println();
        System.out.println("Contenedor 2:");
        // Pintamos el resultado del contenedor 2
        System.out.print(contenedor2[0] + " ");
        System.out.print(contenedor2[1] + " ");
        System.out.print(contenedor2[2] + " ");
        System.out.print(contenedor2[3] + " ");
        System.out.print(contenedor2[4] + " ");
        sc.close();
    }
}
