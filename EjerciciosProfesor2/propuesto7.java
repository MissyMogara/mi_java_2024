package EjerciciosProfesor2;

import java.util.Scanner;

public class propuesto7 {
    public static void main(String[] args) {
        /* Pide un número por teclado desde 1 al 5 y que diga, 1- nivel iniciado, 2- nivel amateur, 3- profesional, 4- experto, 5- nivel dios, 
        en otro caso nivel incorrecto */
       Scanner sc = new Scanner(System.in);
        int a;
        
        System.out.println("Elige un nivel de dificultad del 1 al 5");
        a = sc.nextInt();
        /* 
        if (a == 1) {
            System.out.println("Has elegido el nivel de dificultad iniciado");
        } else if (a == 2) {
            System.out.println("Has elegido el nivel de dificultad amateur");
        } else if (a == 3) {
            System.out.println("Has elegido el nivel de dificultad profesional");
        } else if (a == 4) {
            System.out.println("Has elegido el nivel de dificultad experto");
        } else if (a == 5) {
            System.out.println("Has elegido el nivel de dificultad dios");
        } else {
            System.out.println("Nivel incorrecto");
        } */

        switch (a) {
            case 1: System.out.println("Has elegido el nivel de dificultad iniiado");
                break;

            case 2: System.out.println("Has elegido el nivel de dificultad amateur");
                break;

            case 3: System.out.println("Has elegido el nivel de dificultad profesional");
                break; 
            
            case 4: System.out.println("Has elegido el nivel de dificultad experto");
                break;

            case 5: System.out.println("Has elegido el nivel de dificultad dios");
                break;

            default: System.out.println("Nivel incorrecto");
                break;
        }
        

        sc.close();
    }
    
}
