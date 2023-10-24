package EjerciciosEntrega2;

public class EjercicioEntrega6 {

    public static void main(String[] args) {
        
        /*Programa que sume los 100 primeros números enteros impares. */

        int acumulador=0;

        for (int i = 0; i <= 100; i++) {
            if (!(i%2==0)) {
                acumulador = acumulador + i;
                System.out.println(acumulador);
            }
        }

    }
    
}
