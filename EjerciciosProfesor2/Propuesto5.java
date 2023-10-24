package EjerciciosProfesor2;

import java.util.Scanner;

public class Propuesto5 {
    public static void main(String[] args) {
        
        /* pide dos numero por teclado y hacer la division pero antes de hacer la division comprueba que el segundo numero no sea 0 */

        double a, b, resultado;
        Scanner sc = new Scanner(System.in);

        System.out.println("Inserta un número:");
        a = sc.nextDouble();

        System.out.println("Inserta otro número:");
        b = sc.nextDouble();

        if (b != 0) {
            resultado = a / b;
            System.out.println("El resultado de la división es: " + resultado);
        } else {
            System.out.println("0 es el numero de neuronas que tienes copon");
        }
        sc.close();
    }
    
}
