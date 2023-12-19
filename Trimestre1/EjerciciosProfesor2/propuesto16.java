package EjerciciosProfesor2;

import java.util.Scanner;

public class propuesto16 {
    public static void main(String[] args) {
        
        /*Crea una aplicación que permita adivinar un número. La aplicación genera un número
        aleatorio del 1 al 100. A continuación, va pidiendo números y va respondiendo si el número
        a adivinar es mayor o menor que el introducido, además de los intentos que te quedan
        (tienes 10 intentos para acertarlo). El programa termina cuando se acierta el número
        (además te dice en cuantos intentos lo has acertado), si se llega al límite de intentos te
        muestra el número que había generado */

        Scanner sc = new Scanner(System.in);

        int numAleatorio=1, numInsertar=2, intentos=0;
        numAleatorio = (int) (Math.random() * 100) - 1;

        System.out.println(numAleatorio);
       
        while ((numInsertar != numAleatorio) && (intentos < 10) ) {
            intentos++;
            System.out.println("Inserta un número:");
            numInsertar = sc.nextInt();

            /*ver si s más grande o mas pequeño */

            if (numInsertar < numAleatorio) {
                System.out.println("El número es mayor");
            } else if (numInsertar > numAleatorio) {
                System.out.println("El número es menor");
            } else {
                System.out.println("Acertaste");
            }

        }
        if (intentos == 10) {
            System.out.println("Has supero el número de intentos");
        }
        System.out.println("El número de intentos es " + intentos);
        sc.close();

    }
    
}
