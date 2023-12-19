package EjerciciosEntrega2;

import java.util.Scanner;

public class EjercicioEntrega11 { 
    public static void main(String[] args) {
        
        /*Programa (utilizando bucles) que muestre por pantalla la siguiente figura. Debe funcionar para n =
        número de líneas, que se pida por teclado. (Inversa)*/
        Scanner sc = new Scanner(System.in);
        int numColumnas=1;

        System.out.println("Inserta el número de columnas:");
        numColumnas = sc.nextInt();

        for (int i = 1; i <= numColumnas; i++) {

            for(int j = numColumnas; j > 0; j--) {
                if (j - i > 0) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    sc.close();
    }
    
}
