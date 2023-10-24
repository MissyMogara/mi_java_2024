package EjerciciosEntrega2;

public class prueba3 {
    public static void main(String[] args) {
        
        /*Escribe un programa en Java que calcule la suma de todos los elementos pares de un array de números enteros. */

        int [] numeros = {1,6,8,12,4,9,5,21,30,10};
        int suma=0;

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i]%2==0) {
                suma = suma + numeros[i];
            }

        }
        System.out.println("La suma de todos los números pares es " + suma);
    }
    
}
