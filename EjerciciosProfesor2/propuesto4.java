package EjerciciosProfesor2;

import java.util.Scanner;

public class propuesto4 {

    public static void main(String[] args) {
        
        /*Pedir por teclado la edad, entre 1 y 5 pinta niño, entre 6 y 12 chaval, entre 13 y 18 adolescente, entre 19 y 25 lo mejor, de 26 a 45 un hombre
         * de 46 a 65 un carroza, mayor 66 viejo
        */

        Scanner sc = new Scanner(System.in);
        int edad = 0;

        System.out.println("Inserta tu edad:");
        edad = sc.nextInt();

        if (edad > 0 && edad <= 5 ) {
            System.out.println("Eres un niño");
        } else if (edad >= 6 && edad <= 12 ) {
            System.out.println("Eres un chaval");
        } else if (edad >= 13 && edad <=18 ) {
            System.out.println("Eres un adolescente");
        } else if (edad >= 19 && edad <= 25) {
            System.out.println("Estas en lo mejor");
        } else if (edad >= 26 && edad <= 45) {
            System.out.println("Eres todo un hombre");
        } else if (edad >= 46 && edad <= 65) {
            System.out.println("Eres un carroza");
        } else {
            System.out.println("Estas viejisimo");
        }
        
        sc.close();
    }
    
}
