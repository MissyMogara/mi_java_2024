package juegos;

import java.util.Scanner;

public class Juego2 {
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
            throw new Exception("El valor mínimo no puede ser mayor que el máximo.");
        }
        return (int) (Math.random() * (max - min + 1) + min);
    }


    public static void main(String[] args) {

        /*
         * Cubitus y Humerus juegan a los dados:
         * 1-Piden por teclado el número de turnos a jugar.
         * 2-Cubitus tira 4 dados del 1 al 6.
         * 3-Humerus tira 1 dado del 1 al 6.
         * 4-Si el valor de la tirada de Humerus no esta en ninguno de los dados de
         * Cubitus gana 1 punto Humerus
         * sino gana un punto Cubitus.
         * 5-Muestra todas las tiradas, la puntuación en cada turno, y el resultado
         * final.
         */

        Scanner sc = new Scanner(System.in);
        int tirada1_j2, tirada2_j2, tirada3_j2, tirada4_j2, tirada_j1, nRondas = 0, ronda=0, scoreJ1=0,scoreJ2=0;
        /*Cubitus J2, Humerus J1 */
        System.out.println("Bienvenido al juego.");
        System.out.println("Inserta el número de rondas:");

        try {
            nRondas = Integer.parseInt(sc.nextLine());

            for (int i = 0; i < nRondas; i++) {
                ronda++;
                System.out.println("-Ronda " + ronda);
                /*Tiradas de Cubitus */
                tirada1_j2 = generarNumero(1, 6);
                System.out.println("La primera tirada de Cubitus es " + tirada1_j2);
                tirada2_j2 = generarNumero(1, 6);
                System.out.println("La segunda tirada de Cubitus es " + tirada2_j2);
                tirada3_j2 = generarNumero(1, 6);
                System.out.println("La tercera tirada de Cubitus es " + tirada3_j2);
                tirada4_j2 = generarNumero(1, 6);
                System.out.println("La cuarta tirada de Cubitus es " + tirada4_j2);
                /*Tiradas de Humerus */
                tirada_j1 = generarNumero(1, 6);
                System.out.println("La tirada de Humerus es " + tirada_j1);

                if (tirada1_j2 == tirada_j1 || tirada2_j2 == tirada_j1 || tirada3_j2 == tirada_j1 || tirada4_j2 == tirada_j1) {
                    scoreJ1 += 1;
                    System.out.println("*Gana Humerus.");
                } else {
                    scoreJ2 += 1;
                    System.out.println("*Gana Cubitus.");
                }
                System.out.println("La puntuación de Cubitus es " + scoreJ2);
                System.out.println("La puntuación de Humerus es " + scoreJ1);
                System.out.println("-Fin de la ronda " + ronda);
                sc.close();
            }

            System.out.println("El resultado final es:");
            System.out.println("Cubitus tiene " + scoreJ2 + " puntos");
            System.out.println("Humerus tiene " + scoreJ1 + " puntos");
            if ( scoreJ1 > scoreJ2) {
                System.out.println("-Gana Humerus-");
            } else if (scoreJ2 > scoreJ1) {
                System.out.println("-Gana Cubitus-");
            } else {
                System.out.println("-Han empatado-");
            }
        } catch (Exception e) {
            System.out.println("Error inserta un número.");
        }

    }
}
