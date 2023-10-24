package EjerciciosProfesor2;

import java.util.Scanner;

public class propuesto18 {
    public static void main(String[] args) {
            
        /*1.Pide por teclado un número del 1 al 10
         * 2.Muestra la tabla de multiplicar de ese número
         */
        Scanner sc = new Scanner(System.in);
        int numMultiplicar, resultado;


        System.out.println("Inserta un número");
        numMultiplicar = sc.nextInt();
        System.out.println("La tabla de multiplicar de " + numMultiplicar + " es:");
        for (int i = 1; i <= 10; i++) {
            
            resultado = numMultiplicar * i;
            System.out.println(numMultiplicar + " * " + i + " = " + resultado);
        }
        sc.close();
        }
}
