package EntregaClase;

public class PruebaChatGPT {
    /*El ejercicio Sistema de Numeración ChatGPT lo ha hecho de la siguiente manera */
    
    public static void decimalAPalotes(int n) {
        int numero = Math.abs(n);

        if (numero == 0) {
            System.out.println("|");
            return;
        }

        String resultado = "";

        while (numero > 0) {
            int digito = numero % 10;

            for (int i = 0; i < digito; i++) {
                resultado += "|";
            }

            if (numero >= 10) {
                resultado += " - ";
            }

            numero /= 10;
        }

        // Imprimir la cadena al revés
        for (int i = resultado.length() - 1; i >= 0; i--) {
            System.out.print(resultado.charAt(i));
        }

        System.out.println();
    }

    public static void main(String[] args) {
        int numero1 = 47023;
        System.out.printf("El número %d se convierte en:\n", numero1);
        decimalAPalotes(numero1);

        int numero2 = 2130;
        System.out.printf("El número %d se convierte en:\n", numero2);
        decimalAPalotes(numero2);
    }
}


