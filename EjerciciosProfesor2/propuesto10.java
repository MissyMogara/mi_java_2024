package EjerciciosProfesor2;

import java.util.Scanner;

public class propuesto10 {
    public static void main(String[] args) {
        
        //Factorial de un número
        Scanner sc = new Scanner(System.in);
        int num = 7;

        //Acumulador de multiplicación, se inicializa con 1
        double factorial = 1;
        num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;

        }

        System.out.println(factorial);
        sc.close();
    }
    
}
