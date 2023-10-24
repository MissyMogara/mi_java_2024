package EjerciciosProfesor2;

import java.util.Scanner;

public class propuesto20 {
    public static void main(String[] args) {
        /*Realizar un ejemplo de menú, donde podemos escoger las distintas opciones (Opción A,
        Opción B, Salir) hasta que seleccionamos la opción de “Salir” */
        Scanner sc = new Scanner(System.in);
        int opcion=0;

        System.out.println("Bienvenido al programa");
        

        while (opcion != 4) {
        
        System.out.println("Eliga una opción: 1.Añadir Usuario 2.Eliminar Usuario 3.Borrar todo 4.Salir");
        opcion = sc.nextInt();

            switch (opcion) {

                case 1: System.out.println("Añadiendo...");
                    break;
                case 2: System.out.println("Eliminando...");
                    break;
                case 3: System.out.println("Limpiando...");
                    break;
                case 4: System.out.println("Adiós");
                    break;
                default: System.out.println("Opción no valida");
                    break;
            }
        }
        
        sc.close();        

    }
    
}
