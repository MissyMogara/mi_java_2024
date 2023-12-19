package EjercicosPractica;

import java.util.Scanner;

public class practica3 {
    public static void main(String[] args) {
        
        /*Pide una contraseña por teclado mientras su longitud sea menor que 10
         * pintar la contraseña
         *
         * Usar String, cadena.length() -> tamaño
         */
        Scanner sc = new Scanner(System.in);
        String password;
        int longitud=0;

        
        password = sc.nextLine();

        while ( longitud <= 10 ) {
            System.out.println("Inserta una contraseña menor de 10 caracteres:");
            password = sc.nextLine();
            longitud = password.length();
        }
        
        sc.close();

    }
    
}
