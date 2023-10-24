package EjerciciosProfesor2;

import java.util.Scanner;

public class propuesto3 {
    public static void main(String[] args) {
        
        /*Pide un numero por teclado y dime si es par o impar y si es o no multiplo de 10 */

        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Inserta un número: ");
        a = sc.nextInt();

        if (a % 2 == 0) {
            if (a % 10 == 0) {
                System.out.println("Es multiplo de 10");
            } else {
                System.out.println("Es par");
            }
        } else {
            System.out.println("Es impar");
        }
        sc.close();
    }
    
}
