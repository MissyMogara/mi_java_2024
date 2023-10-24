package EjerciciosEntrega2;

import java.util.Scanner;

/*Crea una función (método) que reciba como parámetros tres números enteros y devuelva el mayor de
los tres números. Utilizar esa función para el calcular el mayor de tres números enteros. */


public class EjercicioEntrega1 {
    public static int mayor(int a, int b, int c) { 

    if (a > b) {
        if (a > c) {
        return a;
        } else {
        return c;
        }

    } else if (b > c) {
        return b;
    } else {
        return c;
    }
    
    
}
    public static void main(String[] args) {
        int num1, num2, num3, resultado;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número:");
        num1 = sc.nextInt();

        System.out.println("Introduce otro número:");
        num2 = sc.nextInt();

        System.out.println("Introduce el último número:");
        num3 = sc.nextInt();

        resultado = mayor(num1, num2, num3);

        System.out.println("El número mayor de los 3 números que me has pasado es: " + resultado);

        sc.close();

    }
    
}
