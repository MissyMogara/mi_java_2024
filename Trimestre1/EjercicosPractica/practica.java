package EjercicosPractica;

import java.util.Scanner;

public class practica {

    /* Realizar un algoritmo que pida números (se pedirá por teclado la cantidad de números a
    introducir). El programa debe informar de cuantos números introducidos son mayores que
    0, menores que 0 e iguales a 0. */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int numIntroducir=2,mayorCero=0, menorCero=0, igualCero=0, num;
        
        System.out.println("Dime el número de números que deseas introduir:");
        numIntroducir = sc.nextInt();
        

        while (0 >= numIntroducir) {
            System.out.println("Inserta un número:");
            num = sc.nextInt();
            if ( num > 0) {
                mayorCero++;
            } else if ( num < 0) {
                menorCero++;
            } else {
                igualCero++;
            }
            System.out.println("De todos los número que me has dado " + mayorCero + "son mayor que 0, " + menorCero + " son menor que 0 y " + igualCero + " son igual a 0" );
        }
        sc.close();
    }
    
}
