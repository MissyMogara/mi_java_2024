package EjerciciosEntrega2;

import java.util.Scanner;

public class EjercicioEntrega9 {

    public static int nDigitos (int num) {
        int digitos=1;
         while (num / 10 != 0) {
            digitos++;
            num = num/10;
        }
        return digitos;
    }

    public static void main(String[] args) {
        
        /*Crea un método que, dado un número entero pasado como parámetro, devuelva cuántos dígitos lo
        forman. P.ej.: el número 54326 consta de 5 dígitos. Pista: cuántas veces se puede dividir entre 10. */
        int insertNumb;
        Scanner sc = new Scanner (System.in);

        System.out.println("Inserta un número:");
        insertNumb = sc.nextInt();

        System.out.println("El número de dígitos es " + nDigitos(insertNumb));
        sc.close();

    }
}
