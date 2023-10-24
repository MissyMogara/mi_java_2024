package EjerciciosEntrega2;

import java.util.Scanner;

public class prueba {
    public static double sumaTres (double num1, double num2, double num3) {
       
        return num1 + num2 + num3;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        /*Funcion llamada suma que reciba 3 numeros double y devuelva la suma de los 3 números */
        double a, b ,c;
        System.out.println("Inserta un número:");
        a = scanner.nextDouble();
        System.out.println("Inserta otro número:");
        b = scanner.nextDouble();
        System.out.println("Inserta el último número:");
        c = scanner.nextDouble();

        System.out.println("La suma de los tres números proporcionados es: " + sumaTres(a, b, c));
        
        scanner.close();
    }
}