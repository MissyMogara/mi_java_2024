

import java.util.Scanner;

public class ejercicios4 {
    public static void main(String[] args) {
        //Dadas dos variables numéricas A y B intercambiar el valor de las mismas
        Scanner sc = new Scanner(System.in);
        int a, b, auxiliar;

        System.out.println("Dame un valor para la variable A:");
        a = sc.nextInt();

        System.out.println("Dame un valor para la variable B:");
        b = sc.nextInt();

        //Guardamos el valor de A en un auxiliar para luego cambiar el valor A a B
        auxiliar = a;
        a = b;
        b = auxiliar;


        System.out.println("A invertido con B es: " + a);
        System.out.println("B invertido con A es: " + b);
        sc.close();
    }
}
