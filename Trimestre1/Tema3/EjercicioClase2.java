package Trimestre1.Tema3;

import java.util.Arrays;

public class EjercicioClase2 {

    public static boolean comparadorString(String a, String b) {

        if (a == b) {
            return true;
        }

        return false;
    }

    /**
     * Función que genera un número aleatorio entre un valor mínimo y máximo
     * 
     * @param min
     * @param max
     * @return número aleatorio entre min y max, incluidos
     */
    public static int generarNumero(int min, int max) throws Exception {
        /* Sí min > max, lanzamos Exception "min debe ser menor que max" */

        if (min > max) {
            throw new Exception("El valor mínimo no puede ser mayor que el máximo");
        }
        return (int) (Math.random() * (max - min + 1) + min);
    }

    /*
     * Lanza 5 dados de póker (. , j, q, k, rojo, negro)
     * genera las tiradas > detecta si ha salido póker
     * cuando hay 4 iguales
     */
    public static void main(String[] args) {
        int numero = 0;
        String tiradas[] = new String[5];

        int nIguales = 0;
        try {

            for (int i = 0; i < tiradas.length; i++) {

                numero = generarNumero(1, 6);

                switch (numero) {
                    case 1:
                        tiradas[i] = ".";
                        break;

                    case 2:
                        tiradas[i] = "j";
                        break;

                    case 3:
                        tiradas[i] = "q";
                        break;

                    case 4:
                        tiradas[i] = "k";
                        break;

                    case 5:
                        tiradas[i] = "rojo";
                        break;

                    case 6:
                        tiradas[i] = "negro";
                        break;
                    default:

                        break;
                }
            }
        } catch (Exception e) {

        }
        Arrays.sort(tiradas);
        for (int i = 0; i < tiradas.length - 1; i++) {
            if (tiradas[i] == tiradas[i + 1]) {
                nIguales += 1;
            }
        }

        System.out.println(Arrays.toString(tiradas));
        if (nIguales >= 3) {
            System.out.println("Ha salido poker");
        } else {
            System.out.println("No ha salido poker");
        }

    }
}
