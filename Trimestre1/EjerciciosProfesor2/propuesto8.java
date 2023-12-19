package EjerciciosProfesor2;

import java.util.Scanner;

public class propuesto8 {
    public static void main(String[] args) {
        
        /*Pide por teclado un numero indicando el mes del 1 al 12, debe mostrar la estación, primavera, verano, otoño e invierno, hacerlo con switch, 
         * si no es valido que muestre mensaje de error
         */
        Scanner sc = new Scanner(System.in);
        int mes;

        System.out.println("Inserta un número del 1 al 12 para indicar el mes:");
        mes = sc.nextInt();

        switch (mes) {
            case 3,4,5: System.out.println("Primavera");

                break;
            case 6,7,8: System.out.println("Verano");

                break;

            case 9,10,11: System.out.println("Otoño");

                break;
            case 12,1,2: System.out.println("Verano");

                break;    
            default:

                break;
        }
        sc.close();


    }
    
}
