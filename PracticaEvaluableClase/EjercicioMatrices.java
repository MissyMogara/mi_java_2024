package PracticaEvaluableClase;

public class EjercicioMatrices {
    /**
     * Proceso que se recorre una matriz y la pinta
     * 
     * @param array
     */
    public static void pintarMatriz(String[][] array) {
        // Recorre las filas del array bidimensional
        for (int i = 0; i < array.length; i++) {
            // Recorre las columnas de la fila actual
            for (int j = 0; j < array[i].length; j++) {
                // Imprime el valor del array
                System.out.print(array[i][j] + "  ");
            }
            // Nueva línea después de cada fila
            System.out.println();
        }
    }

    /**
     * Proceso que rellena la parte basica de un tablero de ajedrez
     * 
     * @param tablero
     */
    public static void rellenarAjedez(String[][] tablero) {

        for (int i = 0; i < tablero.length; i++) {
            /*
             * Pinta si blanca en las posiciones pares cuando la y es par o 0, sino pinta
             * negras en las posiciones pares
             */
            for (int j = 0; j < tablero[i].length; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        tablero[i][j] = "W";
                    } else {
                        tablero[i][j] = "B";
                    }
                } else {
                    if (j % 2 == 0) {
                        tablero[i][j] = "B";
                    } else {
                        tablero[i][j] = "W";
                    }
                }

            }

        }

    }

    /**
     * Este proceso rellena las fichas en el tablero de ajedrez
     * 
     * @param tablero
     */
    public static void rellenarFichasAjedrez(String[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {

            for (int j = 0; j < tablero[i].length; j++) {

                /* Pintamos las torres */
                if (i == 0 || i == 7) {
                    if (j == 0 || j == 7) {
                        tablero[i][j] = tablero[i][j] + "T";
                    }
                }
                /* Pintamos los caballos */
                if (i == 0 || i == 7) {
                    if (j == 1 || j == 6) {
                        tablero[i][j] = tablero[i][j] + "L";
                    }
                }
                /* Pintamos los alfiles */
                if (i == 0 || i == 7) {
                    if (j == 2 || j == 5) {
                        tablero[i][j] = tablero[i][j] + "X";
                    }
                }
                /* Pintamos la reina */
                if (i == 0 || i == 7) {
                    if (j == 3) {
                        tablero[i][j] = tablero[i][j] + "O";
                    }
                }
                /* Pintamos al rey */
                if (i == 0 || i == 7) {
                    if (j == 4) {
                        tablero[i][j] = tablero[i][j] + "+";
                    }
                }
                /* Pintamos a los peones */
                if (i == 1 || i == 6) {
                    tablero[i][j] = tablero[i][j] + "I";
                }
                /*
                 * Aquí pintamos un espacio en el resto para que no quede descuadrado el tablero
                 */
                if (i == 2 || i == 3 || i == 4 || i == 5) {
                    tablero[i][j] = tablero[i][j] + " ";
                }
            }

        }

    }

    /**
     * Este proceso realiza la comprobación de las posibilidades de movimientos que
     * tiene un caballo en el tablero de ajedrez
     * 
     * @param i
     * @param j
     * @param tablero
     */
    public static void pintarMovimientosCaballo(int i, int j, String tablero[][]) {

        /* Comprobamos si hay un caballo en esa posicion */
        if (tablero[i][j].equals("BL") || tablero[i][j].equals("WL")) {
            System.out.println("Hay un caballo.");
            
            /*
             * Si lo hay vamos a comprobar si se sale del tablero en alguno de los 8
             * movimientos que puede hacer
             */

            if (((j - 2) >= 0 && (j - 2) <= 7) && ((i + 1) >= 0 && (i + 1) <= 7)) {

                System.out.println("El caballo puede moverse a izquierda dos y abajo uno.");

            }
            if (((j - 2) >= 0 && (j - 2) <= 7) && ((i - 1) >= 0 && (i - 1) <= 7)) {

                System.out.println("El caballo puede moverse a izquierda dos y arriba uno.");

            }
            if (((j + 2) >= 0 && (j + 2) <= 7) && ((i + 1) >= 0 && (i + 1) <= 7)) {

                System.out.println("El caballo puede moverse a derecha dos y abajo uno.");

            }
            if (((j + 2) >= 0 && (j + 2) <= 7) && ((i + 1) >= 0 && (i + 1) <= 7)) {

                System.out.println("El caballo puede moverse a derecha dos y arriba uno.");

            }

            if (((j - 1) >= 0 && (j - 1) <= 7) && ((i + 2) >= 0 && (i + 2) <= 7)) {

                System.out.println("El caballo puede moverse abajo dos y izquierda uno.");

            }
            if (((j - 1) >= 0 && (j - 1) <= 7) && ((i - 2) >= 0 && (i - 2) <= 7)) {

                System.out.println("El caballo puede moverse arriba dos y izquierda uno.");

            }
            if (((j + 1) >= 0 && (j + 1) <= 7) && ((i + 2) >= 0 && (i + 2) <= 7)) {

                System.out.println("El caballo puede moverse abajo dos y derecha uno.");

            }
            if (((j + 1) >= 0 && (j + 1) <= 7) && ((i - 2) >= 0 && (i - 2) <= 7)) {

                System.out.println("El caballo puede moverse arriba dos y derecha uno.");

            }

        } else {
            System.out.println("No hay ningún caballo.");
        }

    }

    public static void coordenadasAjedrez(int i, int j) {

        /* j son las letras e i son los numeros */
        String array[] = new String[] { "a", "b", "c", "d", "e", "f", "g", "h" };

        if (i > 7 || i < 0 || j > 7 || j < 0) {
            System.out.println("Error: Las cordenadas son erróneas, estas fuera de los límites.");
        } else {
            System.out.println("Las cordeenadas en el tablero son: " + "(" + (i + 1) + "," + array[j] + ")");
        }

    }

    public static void main(String[] args) {

        /*
         * EJERCICIO MATRICES
         * Tablero de ajedrez
         * En este ejercicio tienes que dibujar un tablero de ajedrez y poner las piezas
         * en el tablero. Un
         * tablero de ajedrez es un tablero de 8x8 con 64 piezas. Tendréis que guardar
         * el tablero en un
         * array bidimensional.
         * Para inicializarlo lo rellenaremos inicialmente con B para las casillas
         * negras y W para las
         * blancas.
         */

        /* Creamos la matriz y llamamos al proceso para rellenarla y la pintamos */
        System.out.println("Parte uno pintar el tablero:");
        String tableroAjederez[][] = new String[8][8];
        rellenarAjedez(tableroAjederez);
        pintarMatriz(tableroAjederez);

        /*
         * A continuación, coloca las piezas como en el ajedrez teniendo en cuenta que:
         * - Peón > I
         * - Torre > T
         * - Alfil > X
         * - Caballo > L
         * - Reina > O
         * - Rey > +
         */

        /* Ahora llamamos al proceso de poner las fichas de ajedrez y lo pintamos */
        System.out.println();
        System.out.println("Parte dos pintar las fichas:");
        rellenarFichasAjedrez(tableroAjederez);
        pintarMatriz(tableroAjederez);

        /*
         * Realiza un método coordenadasAjedrez(int i, int j), que dada la coordenada de
         * una casilla, te
         * devuelva la coordenada como si fuera un tablero de ajedrez, las filas van de
         * la 1 a la 8, y las
         * columnas de la A a la H. Ej. La coordenada 5,5 es (3,G).
         * Realiza un método pintarMovimientosCaballo(int i, int j, String tablero[][]),
         * que se le pasen
         * unas coordenadas (i,j), donde se supone que hay un caballo, y debe pintar por
         * pantalla las
         * ocho posibilidades donde puede mover un caballo (mueve en L, dos casillas en
         * horizontal o
         * vertical y una casilla perpendicular al movimiento anterior). No pintes
         * aquellas posibilidades
         * que queden fuera de tablero, o donde haya ya una pieza, que no sea W o B.
         * Prueba ese
         * método para un caballo que se encontrara en la coordenada (5,5), teniendo en
         * cuenta que
         * (0,0) es donde está la torre izquierda negra.
         */

        /*
         * Ahora vamos a llamar a los procesos de las cordenadas y comprobacion del
         * movimiento del caballo
         */
        System.out.println();
        System.out.println("Parte tres:");

        coordenadasAjedrez(0, 3);

        pintarMovimientosCaballo(7, 6, tableroAjederez);

    }
}
