package EjerciciosProfesor2;

import java.util.Scanner;

public class propuesto6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year;
        System.out.println("Inserta un año:");
        year = sc.nextInt();


        if ((year % 4 == 0 && !(year % 100 == 0)) || year % 400 == 0) {
            System.out.println("Es bisiesto.");
        } else  {
            System.out.println("No es bisiesto.");
        }

        sc.close();
    }
    
}
