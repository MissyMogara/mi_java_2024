package EjerciciosPropuestos1;

import java.util.Scanner;

class Ejercicio5 {
    public static void main(String[] args) {
        
            /*
             Calcular la media de tres números pedidos por teclado.
             */
            Scanner sc = new Scanner(System.in);
            double num1, num2, num3, resultado;

            System.out.println("Dame el primer número: ");
            num1 = sc.nextDouble();

            System.out.println("Dame el segundo número: ");
            num2 = sc.nextDouble();

            System.out.println("Dame el tercer número: ");
            num3 = sc.nextDouble();

            resultado = (num1 + num2 + num3) / 3;
            System.out.println("La media de los 3 números que me has pasado es: " + resultado);
            
            
        sc.close();
    }
}