package Trimestre1.Tema3;
import java.util.Arrays;

public class EjercicioClase1 {
    /*
     * Crea un array de 20 int y rellénalo con el número 0. Píntalo. Ahora consigue
     * que los elementos en posiciones pares tengan el valor -1
     */
    public static void main(String[] args) {
        
        int array[] = new int[20];

        Arrays.fill(array, 0);

        for (int i=0; i < array.length; i++) {
            if (i%2 == 0) {
                array[i]=-1;
            }
        }
        System.out.println(Arrays.toString(array));

    }
}
