package EjerciciosEntrega2;

import java.util.Scanner;

public class EjercicioEntrega8 {

    public static void main(String[] args) {
        
        /*Programa que imprima la tabla de multiplicar de cualquier número entre el 1 y el 10 introducido por teclado. (Hecho)*/

        int num=1,multiplicacion;
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserta un número:");

        num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            multiplicacion = i * num;
            System.out.println( i + " x " + num + " = " + multiplicacion);

        }
        sc.close();
    }
    
}
