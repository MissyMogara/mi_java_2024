package EjerciciosEntrega2;

import java.util.Scanner;
public class prueba1_1 {
    public static double calculadora (double a, double b, String c) {

        if (c.equalsIgnoreCase("resta")) {
            return a - b;
        }   else if (c.equalsIgnoreCase("suma")) {
            return a + b;
        }   else if (c.equalsIgnoreCase("multiplicación")) {
            return a * b;
        }   else if (c.equalsIgnoreCase("división")) {
            return a / b;
        } else {
            System.out.println("Error inserta dos números y una operación");
            return 0;
        }

    }

    public static void main(String[] args) {
        
        /*Funcion llamada calculadora que recibe 3 parametros, double num1, double num2, String operación y return double con el resultado */
        double num1,num2;
        String operacion = "";
        Scanner sc= new Scanner(System.in);
        


        System.out.println("Inserta un número:");
        num1 = Double.parseDouble(sc.nextLine());
        System.out.println("Inserta un número a realizar la operación:");
        num2 = Double.parseDouble(sc.nextLine());
        System.out.println("Inserta una operación:");
        operacion = sc.nextLine();

        System.out.println("El resultado es: " + calculadora(num1, num2, operacion));        

        sc.close();

    }
}
