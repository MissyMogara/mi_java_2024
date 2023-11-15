package EjerciciosEntregaArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {
    /**
     * función que genera un número aleatorio entre el mínimo y el máximo
     * 
     * @param min mínimo
     * @param max máximo
     * @return
     */
    public static int generarAleatorio(int min, int max) {
        int n;
        n = (int) (Math.random() * (max + 1 - min)) + min;
        return n;
    }

    public static void main(String[] args) {
        /*
         * Crea un array de números de un tamaño pasado por teclado, el array contendrá
         * números aleatorios entre 1 y 300 y mostrar aquellos números que acaben en un
         * dígito que nosotros le indiquemos por teclado (debes controlar que se
         * introduce un numero correcto), estos deben guardarse en un nuevo array. Por
         * ejemplo, en un array de 10 posiciones e indicamos mostrar los números
         * acabados en 5, podría salir 155, 25, etc. Cuando llene el segundo array
         * finalizamos.
         */
        /*
         * Inicializamos el escaner y la variable que contendrá el digito y la variable
         * que tendrá el límite del array2 y la variable numero que nos ayudará a
         * posicionar los valores dentro del array2
         */
        Scanner sc = new Scanner(System.in);
        int digito;
        int limite = 0;
        int numero = 0;

        /* Le pedimos al usuario que inserte el tamaño que quiere para el array */
        System.out.println("Elige un tamaño para el array:");
        int array[] = new int[Integer.parseInt(sc.nextLine())];

        /* Le pedimos al usuario que inserte el dígito */
        System.out.println("Inserta el último dígito que quieres que guarde el array");
        digito = Integer.parseInt(sc.nextLine());

        /*
         * Pedimos al usuario que inserte número máximo de elementos para el segundo
         * array y ponemos el limite
         */
        System.out.println("Inserta el tamaño del array que guardará los números");
        int array2[] = new int[Integer.parseInt(sc.nextLine())];
        limite = array2.length;

        /*
         * Ahora lo vamos a rellenar con un for y comprobamos si el último digito
         * coincide con el que pidió el usuario
         */
        for (int i = 0; i < array.length; i++) {
            array[i] = generarAleatorio(1, 300);
            if (array[i] % digito == 0 && limite != 0) {
                array2[numero] = array[i];
                numero += 1;
                limite -= 1;
            }
        }

        /*Pintamos los resultados */
        System.out.println("El array uno es: ");
        System.out.println(Arrays.toString(array));
        System.out.println("El array dos es: ");
        System.out.println(Arrays.toString(array2));
        sc.close();
    }
}
