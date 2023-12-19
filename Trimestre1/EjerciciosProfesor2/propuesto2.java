package EjerciciosProfesor2;

import java.util.Scanner;

public class propuesto2 {
    public static void main(String[] args) {
        
        /*Leer dos colores por teclado y decir cual es la mezcla */
        String color1, color2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Elige un color (Rojo, Azul, Verde):");
        color1 = sc.nextLine();

        System.out.println("Elige otro color (Rojo, Azul, Verde):");
        color2 = sc.nextLine();

        color1 = color1.toLowerCase();
        color2 = color2.toLowerCase();

        if (color1.equals("rojo") && color2.equals("azul")) {
            System.out.println("La mezcla es magenta");
        } else if (color1.equals("rojo") && color2.equals("verde")) {
            System.out.println("La mezcla es amarillo");
        } else if (color1.equals("azul") && color2.equals("rojo")) {
            System.out.println("La mezcla es magenta");
        } else if (color1.equals("azul") && color2.equals("verde")) {
            System.out.println("La mezcla es cyan");
        } else if (color1.equals("verde") && color2.equals("rojo")) {
            System.out.println("La mezcla es amarilo"); 
        } else if (color1.equals("verde") && color2.equals("azul")) {
            System.out.println("La mezcla es cyan");
        } else if (color1.equals(color2)) {
            System.out.println("Los colores estan repetidos");
        } else {
            System.out.println("La mezcla es errónea");
        }
        
        sc.close();
    }
}
