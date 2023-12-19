package juegos;

import java.util.Scanner;

public class potencia {
    /**
     * Función que devuelve la potencia de un número
     * @param base decimal
     * @param exponente entero
     * @return base elevado a exponente
     */
    public static double potencia(double base, int exponente) {
        double resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado = resultado * base; // resultado *= base
        }
        return resultado;


    }

    public static void main(String[] args) {

        /*
         * Pedirle al usuario una base y un exponente y devolver la potencia resultando,
         * sin usar Math.pow
         */

        Scanner sc = new Scanner(System.in);

        double base=1;
        int exponente=1;

        try {
            /*Pedimos por teclado la base y el exponente */
            System.out.println("Dime la base:");
            base = Double.parseDouble(sc.nextLine());
            System.out.println("Dime el exponente");
            exponente = Integer.parseInt(sc.nextLine());

            
            /*Llama a una función que calcula la potencia de una base elevada a exponente */
            System.out.println("La potencia de " + base + " elevado a " + exponente + " es: " + potencia(base, exponente));

        } catch (Exception e) {
            System.out.println("La base tiene que ser un double y el exponente un entero");
        }
        sc.close();
    
    }

}
