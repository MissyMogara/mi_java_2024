package EjerciciosProfesor2;

import java.util.Scanner;

public class propuesto12 {
    public static void main(String[] args) {
        
        //1.Pide un numero por teclado. Muestra sus divisores y muestra cuantos son
    
        Scanner sc = new Scanner(System.in);

        int num, numdiv=0;

        System.out.println("Dime un número:");
        num = sc.nextInt();

        for (int i = num; i > 0; i-- ) {

            if (num%i == 0) {
                System.out.println(i);
                numdiv = numdiv + 1;
            }

        }
        System.out.println("La cantidad de divisores de ese número son " + numdiv);
        sc.close();
    }
    
}
