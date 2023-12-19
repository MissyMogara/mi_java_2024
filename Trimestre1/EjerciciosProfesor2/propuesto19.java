package EjerciciosProfesor2;

import java.util.Scanner;

public class propuesto19 {
    public static void main(String[] args) {
        
        /*Realizar un programa que pida el número de filas a mostrar y comience por la mayor fila
        mostrando tantos asteriscos como la fila actual hasta llegar a cero */
        Scanner sc = new Scanner(System.in);

        int numFilas;

        System.out.println("Inserta el número de filas");
        numFilas = sc.nextInt();

        for (int i = numFilas; i > 0; i-- ) {
            for (int j=1 ; j <= i; j++){
                System.out.print("*");
            }
           System.out.println("");
        }
        sc.close();
    }
}
