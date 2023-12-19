package EjerciciosEntrega2;

public class prueba2 {
    public static void main(String[] args) {
        
        /*Escribe un programa en Java que encuentre el mayor y menor valor en un array de números enteros. */

        int [] numeros = {10,20,30,50,15} ;
        int numMayor=numeros[0], numMenor=numeros[0];


        for (int i = 0; i < numeros.length; i++) {
            if (numMayor < numeros[i]) {
                numMayor=numeros[i];
            } else if (numMenor > numeros[i]) {
                numMenor = numeros[i];
            }


        }

        System.out.println("El número mayor es " + numMayor + " y el número menor es " + numMenor);


    }
    
}
