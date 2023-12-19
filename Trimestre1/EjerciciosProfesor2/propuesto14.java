package EjerciciosProfesor2;

import java.util.Scanner;

public class propuesto14 {
    public static void main(String[] args) {
        
        //3.Programa que pinte tantos asteriscos como indique un número pedido por teclado
        Scanner sc = new Scanner(System.in);
        
        int num;

        System.out.println("Dime un número:");
        num = sc.nextInt();

        for (int i = 1; i <= num; ++i ) {

            System.out.print("*");

        }
        sc.close();

    }

}
