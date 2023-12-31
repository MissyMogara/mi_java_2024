package Tema3;

import java.util.Scanner;
import java.util.Arrays;

public class EjercicioClase3 {

      public static String translate(String palabra) {

        
        String spanish[]={"Hola","Perro","Gato","Insecto","Zorro","Pez","Esperanza","Sol","Luna","Amor","Orgullo","Planta","Agua","Tierra","Roca","Fuego","Luz","Oscuridad","Arriba","Abajo" };
        String english[]={"Hello","Dog","Cat","Insect","Fox","Fish","Hope","Sun","Moon","Love","Pride","Plant","Water","Earth","Rock","Fire","Light","Darkness","Up","Down"};
        int numero=-1;

         for (int i = 0; i < spanish.length; i++) {
            if (english[i].equalsIgnoreCase(palabra)) {
                numero=i;
                break;
            }
        }
        if (numero == -1) {
            return "Not found";
        } else {
            return spanish[numero];
        }
        
        }

    public static void main(String[] args) {

        /*
         * Crea un array con 20 palabras en español, crea otro array con las mismas
         * palabras en inglés.
         * Haz una función que se le pase una palabra en inglés y te devuelva la
         * traducción al español.
        */
        String palabra ="";
      


        Scanner sc = new Scanner(System.in);
        
        System.out.println("Inserta una palabra dentro del rango en inglés");
        palabra = translate(sc.nextLine());

       
        System.out.println("La palabra en español es "  + palabra);
        sc.close();
    }
}
