package Tema3;

import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        /*
         * En una empresa hay 10 trabajadores, pide por teclado el salario de cada uno y
         * guardalos en un array
         * muestra todos los salarios de los trabajadores y dime el salario medio de tus
         * trabajadores
         */
        Scanner sc = new Scanner(System.in);
        int salario[] = new int[10];
        double media = 0;
        //Pedimos el salario de cada trabajador y sumamos la media
        for (int i = 0; i < salario.length; i++) {
            System.out.println("Inserta el salario:");
            salario[i] = Integer.parseInt(sc.nextLine());
            media = media + salario[i];
        }
        //Pintamos el salario de todos los trabajadores
        System.out.println("El salario de los trabajadores es:");
        for (int i = 0; i < salario.length; i++) {
            System.out.print(salario[i] + " ");

        }
        //Hacemos la media del salario de los trabajadores
        System.out.println("La media de los salarios es " + (media / salario.length));
        sc.close();
    }

}
