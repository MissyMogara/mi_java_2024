package EjerciciosPropuestos1;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        
        /*
         Dado un número de dos cifras, diseñe un algoritmo que permita obtener el número
        invertido. Ejemplo, si se introduce 23 que muestre 32.
         */
        Scanner sc= new Scanner(System.in);

        int numero, aux, aux2;
        //Pedimos al usuario un numero
        System.out.println("Inserte un numero de dos dígitos:");
        numero = sc.nextInt();

        //Ahora nos ayudamos de dos variables que guardaran cada número del numero de dos digitos.

        aux = numero/10;
        aux2 = numero%10;

        System.out.println("El número invertido es: " + aux2 + aux);
        sc.close();
    }

}
