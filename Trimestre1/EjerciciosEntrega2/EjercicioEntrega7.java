package EjerciciosEntrega2;

public class EjercicioEntrega7 {

    public static void main(String[] args) {
        
        /*Función que calcule el factorial de un número entero positivo pasado como parámetro */

        int numfactorial=5, resultado=1;

        for (int i = 1; i <= numfactorial; i++) {

            resultado = resultado * i;
            
        }
        System.out.println("El factorial del número es " + resultado);
    }
    
}
