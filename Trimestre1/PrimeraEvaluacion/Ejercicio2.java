package Trimestre1.PrimeraEvaluacion;

/*Craps. Es un juego de dados muy facil, y consiste en arrojar la suma de 2 dados,
y su suma es 7 u 11 ganas la partida. En cambio, si sacas un 2, 3 o 12 pierdes. Con cualquier
otro numero que saques, debes guardar ese número y tirar los dados repetidamente hasta
volver a sacar ese dado (ganas) o sacar el 7 (pierdes). Realiza el juego para dos jugadores
simulando las tiradas de forma aleatoria y que jueguen 10 partidas, indica cuántas partidas
gana jugador1 y cuántas jugador2. Ahora simula 1000 partidas e indica las partidas que
gana cada uno. */
public class Ejercicio2 {
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
     * Esta función devuelve un número en función de si gana(1) pierde(2) o tiene
     * que volver a tirar(3)
     * 
     * @param num suma de las dos tiradas
     * @return
     */
    public static int comprobacionCraps(int num) {
        /* Comprobamos la suma del jugador */
        if (num == 7 || num == 11) {

            return 1;

        } else if (num == 2 || num == 3 || num == 12) {

            return 2;

        } else {

            return 3;
        }
    }

    /**
     * Esta función devuelve un número en función de la tirada del juegador
     * comparandola
     * 
     * @param num     tirada del jugador
     * @param jugador suma de la anterior tirada del jugador
     * @return 1 gana, 2 pierde, 3 sigue tirando
     */
    public static int rondaExtraCraps(int num, int jugador) {
        if (num == jugador) {
            System.out.println("Su tirada es: " + num);
            System.out.println("*Gana la ronda.");
            return 1;
        } else if (num == 7) {
            System.out.println("Su tirada es: " + num);
            System.out.println("*Pierde la ronda.");
            return 2;
        }
        System.out.println("Su tirada es: " + num);
        return 3;
    }

    public static void main(String[] args) {

        // numero rondas
        int ronda = 0;

        // tirada del j1
        int jugador1 = 0;

        // tirada del j3
        int jugador2 = 0;

        // tirada secundaria que se hace si no se gana ni se pierde en la primera tirada
        int tirada = 0;

        // puntuacion del j1
        int jugador1Score = 0;

        // puntuacion del j2
        int jugador2Score = 0;

        // numero del resultado devuelto por la función
        int resultadoRonda = 0;

        try {
            System.out.println("-Jugador 1:");
            while (ronda < 10) {
                ronda += 1;
                // Jugador1
                System.out.println("--Ronda " + ronda + "--");
                System.out.println(">>Turno Jugador1 <<");
                /* El jugador1 lanza dos dados y hacemos la suma */
                jugador1 = generarNumero(1, 6) + generarNumero(1, 6);
                System.out.println("La suma del jugador 1 es: " + jugador1);

                /* Comprobamos con la función cual ha sido el resultado */
                if (comprobacionCraps(jugador1) == 1) {
                    /* Gana la ronda */
                    System.out.println("*Gana la ronda.");
                    jugador1Score += 1;

                } else if (comprobacionCraps(jugador1) == 3) {
                    /* Vuelve a tirar */
                    System.out.println("*Vuelve a tirar.");
                    do {

                        tirada = generarNumero(1, 6) + generarNumero(1, 6);

                        resultadoRonda = rondaExtraCraps(tirada, jugador1);

                        if (resultadoRonda == 1) {
                            jugador1Score += 1;
                        }
                    } while (resultadoRonda == 3);
                } else {
                    /* Pierde la ronda */
                    System.out.println("*Pierde la ronda.");
                }
                // Jugador1

                // Jugador2
                System.out.println(">>Turno Jugador2 <<");
                System.out.println("Ronda " + ronda);
                /* El jugador2 lanza dos dados y hacemos la suma */
                jugador2 = generarNumero(1, 6) + generarNumero(1, 6);
                System.out.println("La suma del jugador 2 es: " + jugador2);

                /* Comprobamos con la función cual ha sido el resultado */
                if (comprobacionCraps(jugador2) == 1) {
                    /* Gana la ronda */
                    System.out.println("*Gana la ronda.");
                    jugador2Score += 1;

                } else if (comprobacionCraps(jugador2) == 3) {
                    /* Vuelve a tirar */
                    System.out.println("*Vuelve a tirar.");
                    do {

                        tirada = generarNumero(1, 6) + generarNumero(1, 6);

                        resultadoRonda = rondaExtraCraps(tirada, jugador2);

                        if (resultadoRonda == 1) {
                            jugador2Score += 1;
                        }
                    } while (resultadoRonda == 3);
                } else {
                    /* Pierde la ronda */
                    System.out.println("*Pierde la ronda.");
                }
                // Jugador2
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("El número de rondas ganadas del jugador 1 es: " + jugador1Score);
        System.out.println("El número de rondas ganadas del jugador 2 es: " + jugador2Score);

        if (jugador1Score > jugador2Score) {

            System.out.println("***El jugador 1 gana la partida***");

        } else if (jugador1Score < jugador2Score) {

            System.out.println("***El jugador 2 gana la partida***");

        } else {
            System.out.println("***Empate***");
        }

    }

}
