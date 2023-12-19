package EjerciciosEntrega2;

import java.util.Scanner;

public class EjercicioEntrega2 {
    
    public static void main(String[] args) {

        /*Programa que lea un número por teclado e indique si es múltiplo de 2, 3, 5 o 7. */

        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("Inserta un número:");
        num = sc.nextInt();

        if(num % 2 == 0) {
            System.out.println("Es múltiplo de 2");
        } if (num % 3 == 0) {
            System.out.println("Es mútiplo de 3");
        } if (num % 5 == 0) {
            System.out.println("Es múltiplo de 5");
        } if (num % 7 == 0) {
            System.out.println("Es múltiplo de 7");
        } else {
            if (num % 2 != 0 && num % 3 != 0 && num % 5 != 0 && num % 7 != 0)
            System.out.println("No es núltiplo ni de 2, ni de 3, ni de 5, ni de 7");
        }
        sc.close();  
    }
    
}
