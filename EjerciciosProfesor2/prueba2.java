package EjerciciosProfesor2;

import java.util.Scanner;

public class prueba2 {

    public static int sumar (int a, int b) {
        int resultado = a + b;
        return resultado;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1=0, num2=0, resultado1=0;

        System.out.println("Inserta un número:");
        num1 = sc.nextInt();

        System.out.println("Inserta otro número:");
        num2 = sc.nextInt();

        resultado1 = sumar(num1,num2);
        System.out.println("El resultado es: " + resultado1);
        sc.close();
    }
}
