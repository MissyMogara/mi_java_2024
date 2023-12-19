package EjerciciosEntrega2;

import java.util.Scanner;

public class EjercicioEntrega5 {

    public static void main(String[] args) {
        
        /*Programa que pida al usuario un número repetidamente hasta que esté entre 1 y 10 */
        Scanner sc = new Scanner(System.in);
        int num=0;

        while (!(num >= 1 && num <= 10)) {
            System.out.println("Inserta un número");
            num=sc.nextInt();


        }

        sc.close();
    }
    
}
