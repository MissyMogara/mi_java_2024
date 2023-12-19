package EjerciciosEntrega2;

import java.util.Scanner;

public class prueba5 {

    public static boolean esMultiplo(int a, int b) {
        if (a > b) {
            if (a%b==0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero1, numero2;
        boolean esUnMultiplo;

        System.out.println("Dame un número:");
        numero1 = sc.nextInt();
        System.out.println("Dame otro número:");
        numero2 = sc.nextInt();
        esUnMultiplo = esMultiplo(numero1,numero2);
        
        if (esUnMultiplo == true) {
            System.out.println("Es múltiplo");
        } else {
            System.out.println("No es múltiplo");
        }
        sc.close();
    }

}
