package EjerciciosProfesor2;

import java.util.Scanner;

public class propuesto13 {
    public static void main(String[] args) {
        //2.Pide una base y un exponente y mustra la potencia sin usa math.pow
        Scanner sc = new Scanner(System.in);
        int base, exponente, resultado=1;

        System.out.println("Dime la base:");
        base = sc.nextInt();

        System.out.println("Dime el exponente:");
        exponente = sc.nextInt();

        for (int i = 1; i <= exponente; ++i ) {

            resultado = resultado * base;
        }
        System.out.println("El resultado es " + resultado);
        sc.close();

    }
    
}
