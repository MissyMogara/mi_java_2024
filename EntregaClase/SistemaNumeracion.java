package EntregaClase;

import java.util.Scanner;

/*Esta función recibe un parámetro de entrada de tipo entero e imprime por pantalla una
cadena de caracteres con la conversión del número n al sistema de palotes.
Por ejemplo:
El número 470213 (en decimal) se convierte en:
| | | | - | | | | | | | - - | | - | - | | |
en el sistema de palotes.
Fíjate en la representación del número 0 y realiza diferentes pruebas con el 0 situado en
la primera posición, en una posición intermedia y en la posición final del número.
El número 2130 (en decimal) se convierte en:
| | - | - | | | - -
en el sistema de palotes.
Utiliza esta función en un programa para comprobar que funciona correctamente. */

public class SistemaNumeracion {
    
    public static void convierteEnPalotes(int n) {
        int nDigitos = 0;
        int sacarDecimal = 10;
        int resto = n;
        int sobrante = n;
        int nPalotes = 0;
        int digitosRestantes = 0;
        while (resto != 0) {
            nDigitos = nDigitos + 1;
            resto = resto / 10;
        }
        sacarDecimal = (int) Math.pow(sacarDecimal, (nDigitos - 1));
        // System.out.println("Numero de digitos es " + nDigitos);
        digitosRestantes = nDigitos;
        for (int i = 0; i < nDigitos; i++) {

            if (digitosRestantes == 1) {
                nPalotes = sobrante;
            } else {
                nPalotes = sobrante / sacarDecimal;
                sobrante = sobrante % sacarDecimal;
            }
            if (nPalotes == 0) {
                System.out.print(" ");
            }
            for (int j = 0; j < nPalotes; j++) {
                System.out.print("|");
            }

            if (i != (nDigitos - 1)) {
                System.out.print("-");
            }

            sacarDecimal = sacarDecimal / 10;
            digitosRestantes = digitosRestantes - 1;
            if ( digitosRestantes == 0 && nPalotes == 0) {
                System.out.print("-" );
            }
        }

    }

    public static void main(String[] args) {

        int numero = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserta un número:");
        try {
            numero = Integer.parseInt(sc.nextLine());
        } catch (Exception e) {
            System.out.println("Error inserta un número válido.");
        }

        convierteEnPalotes(numero);

        sc.close();
    }
}
