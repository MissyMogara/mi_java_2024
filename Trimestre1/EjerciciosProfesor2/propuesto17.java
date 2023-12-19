package EjerciciosProfesor2;

import java.util.Scanner;

public class propuesto17 {  
    public static void main(String[] args) {

        /*Realizar un algoritmo que pida números (se pedirá por teclado la cantidad de números a
        introducir). El programa debe informar de cuantos números introducidos son mayores que
        0, menores que 0 e iguales a 0. */
        Scanner sc = new Scanner(System.in);
        int numPedir, numMayor=0, numMenor=0, numIgual=0, num;

        System.out.println("Introduce la cantidad de números que quieres pedir:");
        numPedir = sc.nextInt();

        for (int i = numPedir; i > 0; i--) {
            System.out.println("Inserta un número");
            num = sc.nextInt();

            if (num>0) {
                numMayor++;
            } else if (num<0) {
                numMenor++;
            } else {
                numIgual++;
            }

        }

        System.out.println("La cantidad de números introducidos superior a 0 es " + numMayor + ", menor a 0 es " + numMenor + " y igual a 0 es " + numIgual);
        sc.close();
    }
    
}
