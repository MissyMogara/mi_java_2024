package Trimestre1.Tema3.EjerciciosExamen;

import java.util.Scanner;

public class Rombo {
    static void imprimirRombo(int size) {
        int espacios = size / 2;
        int asteriscos = 1;

        // Imprimir la mitad superior del rombo
        for (int i = 1; i <= size; i += 2) {
            imprimirEspacios(espacios);
            imprimirAsteriscos(asteriscos);
            System.out.println();
            espacios--;
            asteriscos += 2;
        }

        // Imprimir la mitad inferior del rombo
        espacios = 1;
        asteriscos = size - 2;

        for (int i = size - 2; i >= 1; i -= 2) {
            imprimirEspacios(espacios);
            imprimirAsteriscos(asteriscos);
            System.out.println();
            espacios++;
            asteriscos -= 2;
        }
    }

    static void imprimirEspacios(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(" ");
        }
    }

    static void imprimirAsteriscos(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del rombo (debe ser un número impar): ");
        int size = scanner.nextInt();

        if (size % 2 == 0) {
            System.out.println("El tamaño del rombo debe ser un número impar.");
        } else {
            imprimirRombo(size);
        }
        scanner.close();
    }

}
