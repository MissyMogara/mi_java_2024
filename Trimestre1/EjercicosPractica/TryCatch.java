package EjercicosPractica;

import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        
        /*Menú que pide una opción numérica y comprobamos que lo introducido es correcto */
        Scanner sc = new Scanner(System.in);
        int opcion=0;
        String nombre ="";
        System.out.println("Bienvenido al sistema inserte una opción:");
    

        while (opcion != 3) {
    
            try {
                System.out.println("1. Saludo anónimo");
                System.out.println("2. Saludo con tu nombre");
                System.out.println("3. Salir");
                opcion = Integer.parseInt(sc.nextLine());

                switch (opcion) {
                    case 1:
                        System.out.println("Buenas tardes");
                        break;
                    case 2:
                        //System.out.println("dime tu nombre");
                        
                        //sc.nextLine();
                        System.out.println("Buenas tardes " + nombre);
                        break;
                
                    default:
                    System.out.println("Adiós, que tenga un buen día");
                        break;
                    }
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                System.out.println("Error por favor elige 1,2,3.");
                
            }
            



        }
        sc.close();
    }
}
