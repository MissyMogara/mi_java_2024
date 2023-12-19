package EjerciciosEntregaArrays;

import java.util.Scanner;

public class Ejercicio20 {
    /**
     * Proceso que se recorre una matriz y la pinta
     * 
     * @param array
     */
    public static void pintarArrayBidimensional(char[][] array) {
        // Recorre las filas del array bidimensional
        for (int i = 0; i < array.length; i++) {
            // Recorre las columnas de la fila actual
            for (int j = 0; j < array[i].length; j++) {
                // Imprime el valor del array
                System.out.print(array[i][j] + "\t");
            }
            // Nueva línea después de cada fila
            System.out.println();
        }
    }

    /**
     * Rellena una matriz con el caracter '-'
     * 
     * @param array
     */
    public static void rellenarArrayBi(char array[][]) {

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = '-';
            }

        }

    }

    /**
     * Esta funcion devuelve un valor true o false en funcion de si el movimiento es
     * erroneo o no, si devuelve true aplica el movimiento
     * 
     * @param tablero
     * @param posicionX
     * @param posicionY
     * @param caracter
     * @return
     */
    public static boolean insertarXO(char tablero[][], int posicionX, int posicionY, char caracter) {

        if (!(posicionX >= tablero.length) || !(posicionY >= tablero[0].length)) {
            if (tablero[posicionY][posicionX] == '-') {
                if (caracter == 'x' || caracter == 'o') {
                    tablero[posicionY][posicionX] = caracter;
                    return true;
                } else {
                    System.out.println("Error: Inserta 'x' u 'o'.");
                    return false;
                }
            } else {
                System.out.println("Error: La posición ya esta ocupada.");
                return false;
            }
        }
        return false;
    }

    /**
     * Función que ayuda a la funcion finPartida a comprobar si algun jugador ha
     * ganado
     * 
     * @param x
     * @param o
     * @return
     */
    public static int victoriaJugador(int x, int o) {
        if (x == 3) {
            return 1;
        } else if (o == 3) {
            return 2;
        }
        return 0;
    }

    /**
     * funcion que devuelve un entero en funcion del jugador que gane, si es de es
     * empate
     * 
     * @param tablero
     * @return
     */
    public static int finPartida(char[][] tablero) {

        int x = 0;
        int o = 0;
        int vacio = 0;
        /* Comprueba las columnas */
        for (int i = 0; i < tablero.length; i++) {

            for (int j = 0; j < tablero.length; j++) {
                if (tablero[j][i] == 'x') {
                    x += 1;
                } else if (tablero[j][i] == 'o') {
                    o += 1;
                }

            }

            /* Acaba la partida cuando alguien hace un 3 en raya */

            if (victoriaJugador(x, o) == 0) {
                x = 0;
                o = 0;
            } else if (victoriaJugador(x, o) != 0) {
                return victoriaJugador(x, o);
            }

        }

        for (int i = 0; i < tablero.length; i++) {
            /* Comprueba las filas */
            for (int j = 0; j < tablero.length; j++) {
                if (tablero[i][j] == 'x') {
                    x += 1;
                } else if (tablero[i][j] == 'o') {
                    o += 1;
                }

            }
            /* Acaba la partida cuando alguien hace un 3 en raya */
            if (victoriaJugador(x, o) == 0) {
                x = 0;
                o = 0;
            } else if (victoriaJugador(x, o) != 0) {
                return victoriaJugador(x, o);
            }
        }
        /* Comprueba la diagonal */
        for (int i = 0; i < tablero.length; i++) {

            for (int j = 0; j < tablero.length; j++) {

                if (j == i) {

                    if (tablero[i][j] == 'x') {
                        x += 1;
                    } else if (tablero[i][j] == 'o') {
                        o += 1;
                    }

                }

            }

        }
        /* Acaba la partida cuando alguien hace un 3 en raya */
        if (victoriaJugador(x, o) == 0) {
            x = 0;
            o = 0;
        } else if (victoriaJugador(x, o) != 0) {
            return victoriaJugador(x, o);
        }
        /* Comprueba la diagonal inversa */
        for (int i = 0; i < tablero.length; i++) {

            for (int j = 0; j < tablero.length; j++) {

                if (j + i == tablero[i].length - 1) {

                    if (tablero[i][j] == 'x') {
                        x += 1;
                    } else if (tablero[i][j] == 'o') {
                        o += 1;
                    }

                }

            }

        }
        /* Acaba la partida cuando alguien hace un 3 en raya */
        if (victoriaJugador(x, o) == 0) {
            x = 0;
            o = 0;
        } else if (victoriaJugador(x, o) != 0) {
            return victoriaJugador(x, o);
        }
        /* Comprobamos si esta lleno todo el campo */
        for (int i = 0; i < tablero.length; i++) {

            for (int j = 0; j < tablero.length; j++) {
                /* Comprobamos si hay algun hueco vacio */
                if (tablero[i][j] == '-') {
                    vacio += 1;

                }
            }
        }
        /*Si no hay ningún hueco es un empate */
        if (vacio == 0) {
            return 0;
        }
        /* Reiniciamos el contador */
        vacio = 0;
        return -1;
    }

    public static void main(String[] args) {

        /*
         * Vamos a realizar el típico juego del 3 en raya, donde habrá dos jugadores que
         * tengan que hacer el 3 en raya, los signos serán el X y el O, cuando haya una
         * posición vacía habrá un –
         * El tablero de juego, será una matriz de 3×3 de char.
         * El juego termina cuando uno de los jugadores hace 3 en raya o si no hay más
         * posiciones que poner.
         * Primero juega una posición un jugador y luego el otro.
         * El juego debe pedir las posiciones donde el jugador actual quiera poner su
         * marca ( [0,0], [0,1], [0,2], [1,0], [1,1], [1,2], [2,0], [2,1], [2,2] ), esta
         * debe ser validada y por supuesto que no haya una marca ya puesta.
         */

        /* Declaramos y rellenamos el tablero */
        Scanner sc = new Scanner(System.in);
        char tablero3enRaya[][] = new char[3][3];
        rellenarArrayBi(tablero3enRaya);
        pintarArrayBidimensional(tablero3enRaya);
        /* Declaramos una variable booleana para comprobar cuando se acaba la partida */
        boolean acabaPartida = false;
        int posicionX = 0;
        int posicionY = 0;
        int turnos = 0;
        int turnojugador = 1;
        boolean comprobacion = false;
        System.out.println("¡Bienvenido a el tres en raya edición ULTIMATE!");

        while (acabaPartida == false) {
            turnos += 1;
            switch (turnojugador) {
                case 1:
                    /* Turno del jugador 1 */
                    System.out.println("Turno " + turnos + " del jugador 1 'x':");

                    /* Le pedimos que inserte la posición X */
                    System.out.println("Inserta la posición del eje X que quieres ocupar:");
                    posicionX = Integer.parseInt(sc.nextLine());

                    /* Le pedimos que inserte la posición Y */
                    System.out.println("Inserta la posición del eje Y que quieres ocupar:");
                    posicionY = Integer.parseInt(sc.nextLine());

                    /* Pintar resultado */
                    comprobacion = insertarXO(tablero3enRaya, posicionX, posicionY, 'x');
                    pintarArrayBidimensional(tablero3enRaya);

                    /* Pasamos el turno al jugador 2 */
                    if (comprobacion == true) {
                        turnojugador = 2;
                    } else {
                        turnos -= 1;
                    }
                    /* Comprobamos si se acabo la partida */
                    if (finPartida(tablero3enRaya) != -1) {
                        acabaPartida = true;
                    }
                    break;
                case 2:
                    /* Turno del jugador 2 */
                    System.out.println("Turno " + turnos + " del jugador 2'o':");

                    /* Le pedimos que inserte la posición X */
                    System.out.println("Inserta la posición del eje X que quieres ocupar:");
                    posicionX = Integer.parseInt(sc.nextLine());

                    /* Le pedimos que inserte la posición Y */
                    System.out.println("Inserta la posición del eje Y que quieres ocupar:");
                    posicionY = Integer.parseInt(sc.nextLine());

                    /* Pintar resultado */
                    comprobacion = insertarXO(tablero3enRaya, posicionX, posicionY, 'o');
                    pintarArrayBidimensional(tablero3enRaya);

                    /* Pasamos el turno al jugador 1 */
                    if (comprobacion == true) {
                        turnojugador = 1;
                    } else {
                        turnos -= 1;
                    }
                    /* Comprobamos si se acabo la partida */
                    if (finPartida(tablero3enRaya) != -1) {
                        acabaPartida = true;
                    }
                    break;

                default:
                    System.out.println("Se acabó la partida");
                    break;

            }

        }
        /* Comprobación del resultado de victoria */
        if (acabaPartida == true && finPartida(tablero3enRaya) == 1) {
            System.out.println("*Gana el jugador 1*");
        } else if (acabaPartida == true && finPartida(tablero3enRaya) == 2) {
            System.out.println("*Gana el jugador 2*");
        } else if (acabaPartida == true && finPartida(tablero3enRaya) == 0) {
            System.out.println("*Empate*");
        }
        sc.close();
    }
}
