package EjercicosPractica;

import java.util.Scanner;

public class Practica1 {    
    public static void main(String[] args) {
        
        /*Algoritmo que pida caracteres e imprima ‘VOCAL’ si son vocales y ‘NO VOCAL’ en caso
        contrario, el programa termina cuando se introduce un espacio. */
        Scanner sc = new Scanner(System.in);
        String a=".";
        
        while ( !a.equals(" ")) {
            System.out.println("Dime un carácter");
            a = sc.nextLine();

            if (a.equals("a") || a.equals("e") || a.equals("i") || a.equals("o") || a.equals("u")) {
                System.out.println("Vocal");
            } else {
                System.out.println("No vocal");
            }
            
        }   
        sc.close();
        

    }   
}
