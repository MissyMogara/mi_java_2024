package EjerciciosPropuestos1;

import java.util.Scanner;

class Ejercicio8 {
    public static void main(String[] args) {
        /*
        Pide al usuario dos números y muestra la “distancia” entre ellos (el valor absoluto de su
        diferencia, de modo que el resultado sea siempre positivo).
         */
        Scanner sc = new Scanner(System.in);
        //Primero inicializamos las variables que nos piden
        double num1, num2, distancia;

        System.out.println("Inserta un número: ");
        num1 = sc.nextDouble();

        System.out.println("Inserta otro número: ");
        num2 = sc.nextDouble();

        distancia = Math.abs(num1 - num2);

        System.out.println("La distancia entre esos dos números es: " + distancia);
        sc.close();

    }

}