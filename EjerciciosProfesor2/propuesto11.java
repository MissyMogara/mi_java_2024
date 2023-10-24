package EjerciciosProfesor2;

import java.util.Scanner;

public class propuesto11 {
    public static void main(String[] args) {
        
        /*Algoritmo que pida números hasta que se introduzca un cero. Debe imprimir la suma y la media de todos los números introducidos */
        
        Scanner sc = new Scanner(System.in);

        int num=1000;
        int conta=0;
        int suma=0;
        
        
        while (num != 0) {
            System.out.println("Introduce un número:");
            num = sc.nextInt();
            if (num!=0) {
                conta = conta + 1;
                suma = suma + num;
            }
        }
        System.out.println("El total es " + suma + " y la media es " + suma/conta);
        sc.close();
    }
}
