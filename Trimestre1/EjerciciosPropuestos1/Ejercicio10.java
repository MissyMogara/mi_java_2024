package EjerciciosPropuestos1;

import java.util.Scanner;;

public class Ejercicio10 {
    public static void main(String[] args) {
        
        /*Realizar un algoritmo que lea un número y que muestre su raíz cuadrada y su raíz cúbica. */
        Scanner sc = new Scanner(System.in);
        double num1, raiz2, raiz3;

        //Primero pedimos al usuario dos números:

        System.out.println("Inserta un número:");
        num1 = sc.nextDouble();
         
        //Para la raiz cuadrada usaremos el metodo de java Math.sqrt

        raiz2 = Math.sqrt(num1);

        //Para la raiz cuadrada usaremos el metodo Marh.pow ya que si elevamos cualquier numero a 1/3 obtenemos su raiz cubica

        raiz3 = Math.pow(num1, (double)1/3);

        System.out.println("La raíz cuadrada de el número es: " + raiz2);
        System.out.println("La raíz cúbica de el número es: " + raiz3);
        
        
        sc.close();
    }
}
