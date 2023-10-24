package EjerciciosProfesor2;

import java.util.Scanner;

public class propuesto1 {
    public static void main(String[] args) {
        /*Lee por telado un numero entero, dime si es par o impar */

        Scanner sc = new Scanner(System.in);

        int a;

        System.out.println("Dame un número:"); 
        a = sc.nextInt();

        if (a % 2 == 0) {
            System.out.println("Es par.");
        } else {
            System.out.println("Es impar.");
        }

        sc.close();
    }
}
