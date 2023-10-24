package EjerciciosEntrega;

public class EjercicioEntrega18 {
    public static void main(String[] args) {
        
        /*
         ¿Qué resultados se obtienen al realizar las operaciones siguientes? Si hay errores en la compilación,
        corríjalos y dé una explicación de por qué suceden.
        
        int a = 10, b = 3 , e = 1, d, e;
        float x, y;
        x= a / b;
        c = a < b && c;
        d = a + b++;
        e = ++a – b;
        y = (float)a / b;

        -la variable "e" se repite, falta la variable c la cual es una comparacion por lo tanto tendria que ser boolean pero al ser boolean
        luego acaba comparandose consigo misma por lo tanto esa operacion esta mal y habria que quitar la comparacion.
        */

        int a = 10, b = 3 , e = 1, d;
        boolean c;
        float x, y;
        x= a / b;
        c = a < b;
        d = a + b++;
        e = ++a - b;
        y = (float)a / b;

        System.out.println("El valor de x es: " + x);
        System.out.println("El valor de c es: " + c);
        System.out.println("El valor de d es: " + d);
        System.out.println("El valor de e es: " + e);
        System.out.println("El valor de y es: " + y);

        /*
         por lo tanto x es 3,0
         c false
         d 13
         e 7
         y 2,75
         */


    }
    
}
