package Trimestre1.PracticaEvaluableClase;

import java.util.Arrays;

public class EjercicioArrays {
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

    /**
     * Esta funcion lo que va a hacer es guardar en un array el porcentaje de cada
     * una de las posibilidades en n numero de tiradas
     * 
     * @param n
     * @return
     */
    public static double[] estadisticas(int n) {

        /* Declaramos las variables junto al array */
        double tiradas[] = new double[6];
        int dado;
        double n1 = 0;
        double n2 = 0;
        double n3 = 0;
        double n4 = 0;
        double n5 = 0;
        double n6 = 0;
        try {
            for (int i = 0; i < n; i++) {
                /* En cada iteración guardaremos que numero sale */
                dado = generarNumero(1, 6);

                if (dado == 1) {
                    n1 += 1;
                } else if (dado == 2) {
                    n2 += 1;
                } else if (dado == 3) {
                    n3 += 1;
                } else if (dado == 4) {
                    n4 += 1;
                } else if (dado == 5) {
                    n5 += 1;
                } else if (dado == 6) {
                    n6 += 1;
                }

            }
            /*
             * Para realizar el porcentaje hay que dividir el numero entre las n veces que
             * hemos tirado los dados y multiplicarlo por 100
             */
            tiradas[0] = (n1 / n) * 100;
            tiradas[1] = (n2 / n) * 100;
            tiradas[2] = (n3 / n) * 100;
            tiradas[3] = (n4 / n) * 100;
            tiradas[4] = (n5 / n) * 100;
            tiradas[5] = (n6 / n) * 100;

        } catch (Exception e) {

        }
        return tiradas;
    }

    public static void main(String[] args) {

        /*
         * EJERCICIO ARRAYS
         * Dados
         * Escriba un programa que genere la tirada de 2 dados (de 6 lados) y genere
         * tiradas
         * aleatorias y vaya sumando sus resultados hasta que ambos saquen un 6. Se
         * deben
         * mostrar todas las tiradas, el número de tiradas realizadas y la suma de ambos
         * dados
         * hasta que sacaron ambos un 6. Escribe después una función llamada double[]
         * estadisticas(int n) que lance un dado aleatoriamente un número n de veces
         * recibido
         * como parámetro y debes retornar el porcentaje de apariciones de cada número
         * del
         * dado en las n tiradas (double[]). Pruébalo con n = 100 y n = 1000.
         */

        /* Declaramos la variables que vamos a necesitar */

        int tirada1 = -1;
        int tirada2 = -2;
        int ronda = 0;
        int resultadoT1 = 0;
        int resultadoT2 = 0;

        try {
            /*
             * Usamos un while que mientras ambas tiradas no sean 6 y 6 seguira ejecutandose
             */
            while (!(tirada1 == 6 && tirada2 == 6)) {
                /* Contamos las rondas */
                ronda += 1;
                System.out.println("-Ronda " + ronda + "-");

                /* hacemos las tiradas del primer lado */
                tirada1 = generarNumero(1, 6);
                resultadoT1 += tirada1;
                System.out.println("La tirada 1 de la ronda " + ronda + " es:" + tirada1);

                /* hacemos las tiradas del segundo lado */
                tirada2 = generarNumero(1, 6);
                resultadoT2 += tirada2;
                System.out.println("La tirada 1 de la ronda " + ronda + " es:" + tirada2);

            }
            /*
             * Pintamos el resultado total tanto del lado 1 como del lado 2, asi como el
             * numero de tiradas de cada lado que sera el numero de rondas
             */
            System.out.println("El resultado total de las tiradas del lado 1 es: " + resultadoT1);

            System.out.println("El resultado total de las tiradas del lado 2 es: " + resultadoT2);

            System.out.println("El número de tiradas de cada lado son " + ronda);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        /* Llamamos a la función para comprobar la segunda parte del ejercicio */
        System.out.println("Segunda parte del ejercico:");
        System.out.println(Arrays.toString(estadisticas(100)));

    }
}
