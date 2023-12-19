package juegos;

import java.util.Scanner;

/*En este ejercicio vamos a implementar un juego de un laberinto. 
Para ello nos crearemos una matriz de 20 x 20 caracteres. 
La matriz será un eje de coordenadas donde la esquina superior izquierda será el inicio del 
laberinto y deberás llegar a la salida. Las casillas válidas irán de (0,0) a (19,19). */

/*Antes de jugar debes hacer lo siguiente:
- Deberás rellenar la matriz inicialmente con el carácter “.”.
- Los bordes superior e inferior los vas a rellenar con el carácter “-“.
- Los bordes derecho e izquierdo los vas a rellenar con el carácter “|”.
- Generar la salida del laberinto aleatoriamente. La salida debe estar en un borde y no 
debe coincidir con el inicio (0,0). Debes generar aleatoriamente esa casilla y marcarla 
con el carácter “#”.
- Genera una bomba, será una casilla aleatoria del tablero interior, no de los bordes. Ahí 
habrá una bomba oculta, solo se sabrá por sus coordenadas, si pasas por esa 
coordenada sin saberlo explotará y perderás. */

/*Jugar:
- El jugador aparece pintado con una “@” en la casilla (0,0).
- Implementa una función pintar que pinte el tablero tras cada movimiento.
- Te aparecerá un menú con cuatro opciones: 1 (derecha), 2 (izquierda), 3 (abajo), 4 
(derecha).
- Deberás mover la “@” una posición según la tecla pulsada.
- Si te sales de la matriz moviéndote habrás perdido el juego y este finalizará. Esto es lo 
más complicado del juego, pues dependiendo de dónde te encuentres un movimiento 
concreto podrá hacerte salir del tablero y debes comprobar todas las opciones 
posibles. Truco: si usas control de excepciones (IndexOutOfBoundException) no 
tendrías que comprobar con un if, sino que si sale esa excepción es que he intentado 
salir del tablero y el juego termina.
- Si consigues llegar al carácter marcado con “#” habrás ganado. Muestra un mensaje 
indicándolo y también indica el número de pasos que has dado desde el inicio hasta 
encontrar la salida. */

public class Laberinto {
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

    /**
     * Proceso para pintar una matriz
     * 
     * @param matriz
     */
    public static void pintarMatriz(String[][] matriz) {
        // Recorre las filas del array bidimensional
        for (int i = 0; i < matriz.length; i++) {
            // Recorre las columnas de la fila actual
            for (int j = 0; j < matriz[i].length; j++) {
                // Imprime el valor del array
                System.out.print(matriz[i][j] + " ");
            }
            // Nueva línea después de cada fila
            System.out.println();
        }
    }

    /**
     * Proceso que rellena una matriz
     * 
     * @param matriz
     */
    public static void rellenarTablero(String matriz[][], int y, int x) {
        try {

            for (int i = 0; i < matriz.length; i++) {

                for (int j = 0; j < matriz[i].length; j++) {
                    if (j == 0 || j == matriz[0].length - 1) {
                        matriz[i][j] = "|";
                    } else if ((i == 0 || i == (matriz.length - 1)) && j != 0) {
                        matriz[i][j] = "-";
                    } else {
                        matriz[i][j] = ".";
                    }

                }

            }
            /* Pintamos al personaje */
            matriz[y][x] = "@";
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    /**
     * Este proceso generará en un tablaro la salida en los bordes sin contar la
     * coordenada (0,0)
     * 
     * @param matriz tablero
     */
    public static void generarSalida(String matriz[][], int salida[]) {
        int y = generarAleatorio(0, matriz.length - 1);
        int x = 0;
        int aleatorio = -1;
        /* Comprobamos si el eje y esta en 0 o en su máxima longitud */
        if (y == 0 || y == matriz.length - 1) {
            if (y == 0) {

                /*
                 * Si es 0 la generación de número aleatorio irá de 1 a la máxima longitud del
                 * eje X
                 */
                x = generarAleatorio(1, matriz[0].length - 1);

            } else {
                /*
                 * Por otro lado si el eje Y es la longitud máxima el número aleatorio ira de 0
                 * a la máxima longitud del eje X
                 */
                x = generarAleatorio(0, matriz[0].length - 1);

            }
        } else {
            /*
             * Si el valor del eje Y no esta entre 0 o su longitud máxima entonces
             * generaremos un valor aleatorio entre 0 o 1, si es 0 el eje X será 0, si es 1,
             * el eje X será su longitud máxima
             */
            aleatorio = generarAleatorio(0, 1);
            if (aleatorio == 0) {
                x = 0;
            } else {
                x = matriz[0].length - 1;
            }
        }
        matriz[y][x] = "#";
        salida[0] = y;
        salida[1] = x;

    }

    /**
     * Este proceso mueve al personaje
     * 
     * @param y      posicion "y" del personaje
     * @param x      posicion "x" del personaje
     * @param matriz tablero
     * @param num    movimiento
     */
    public static void moverPersonaje(int y, int x, String matriz[][], int num) throws Exception {

        if (num < 5 && num > 0) {

            if (x == 0 || x == matriz[0].length - 1) {
                matriz[y][x] = "|";
            } else if ((y == 0 || y == (matriz.length - 1)) && x != 0) {
                matriz[y][x] = "-";
            } else {
                matriz[y][x] = ".";
            }
        }

        switch (num) {
            case 1: // Derecha

                if (x + 1 > 19) {
                    throw new Exception("Te has salido de la pantalla, has perdido.");
                }

                matriz[y][x + 1] = "@";

                break;

            case 2: // Izquierda

                if (x - 1 < 0) {
                    throw new Exception("Te has salido de la pantalla, has perdido.");
                }

                matriz[y][x - 1] = "@";

                break;

            case 3: // Abajo

                if (y + 1 > 19) {
                    throw new Exception("Te has salido de la pantalla, has perdido.");
                }

                matriz[y + 1][x] = "@";

                break;

            case 4: // Arriba

                if (y - 1 < 0) {
                    throw new Exception("Te has salido de la pantalla, has perdido.");
                }

                matriz[y - 1][x] = "@";

                break;

            default:
                System.out.println("Error inserta un número entre 1 o 4.");
                break;
        }

    }

    /**
     * Función que devuelte si la partida ha terminado (true) o aun sigue (false)
     * 
     * @param y      posicion "y" del personaje
     * @param x      posicion "x" del personaje
     * @param salida array salida
     * @param bomba  array bomba
     * @return
     */
    public static boolean condicionAcabaPartida(String tablero[][], int y, int x, int salida[], int bomba[]) {
        if (y == salida[0] && x == salida[1]) {
            System.out.println("Has llegado a la meta!");
            return true;
        } else if (y == bomba[0] && x == bomba[1]) {
            tablero[bomba[0]][bomba[1]] = "x";
            System.out.println();
            pintarMatriz(tablero);
            System.out.println("Te ha explotado una bomba! has perdido.");
            return true;
        }
        return false;
    }

    /**
     * Proceso que genera una bomba en el tablero
     * 
     * @param tablero
     * @param bomba
     * @param salida
     */
    public static void generarBomba(String tablero[][], int bomba[], int salida[]) {

        boolean generacionBuena = false;

        while (generacionBuena == false) {

            bomba[0] = generarAleatorio(0, tablero.length - 1);

            bomba[1] = generarAleatorio(0, tablero[0].length - 1);

            if (!(bomba[0] == salida[0] && bomba[1] == salida[1]) && !(bomba[0] == 0 && bomba[1] == 0)) {

                generacionBuena = true;

            }

        }

    }

    public static void main(String[] args) {

        /* Scanner que nos pedirá el movimiento y el movimiento */
        Scanner sc = new Scanner(System.in);
        int movimiento = 0;

        /* Posición del personaje */
        int posicionX = 0;
        int posicionY = 0;

        /* Condicion de final de partida */
        boolean finalDePartida = false;

        /* Salida, tablero, rellenar tablero y pintarlo */
        String tablero[][] = new String[20][20];
        int salida[] = new int[2];
        int bomba[] = new int[2];

        rellenarTablero(tablero, posicionY, posicionX);

        generarSalida(tablero, salida);

        generarBomba(tablero, bomba, salida);

        pintarMatriz(tablero);

        System.out.println(bomba[0]);
        System.out.println(bomba[1]);
        try {
            /* Bucle para que podamos jugar hasta que se acabe la partida */
            while (finalDePartida == false) {

                /* Opciones de movimiento */
                System.out.println("Inserta el movimiento:");
                System.out.println("1.Derecha");
                System.out.println("2.Izquierda");
                System.out.println("3.Abajo");
                System.out.println("4.Arriba");

                /* Pedir movimiento al usuario en formato número */
                movimiento = Integer.parseInt(sc.nextLine());

                moverPersonaje(posicionY, posicionX, tablero, movimiento);

                /* Cambiamos los valores de la posición del personaje */
                if (movimiento == 1) {
                    posicionX += 1;
                } else if (movimiento == 2) {
                    posicionX -= 1;
                } else if (movimiento == 3) {
                    posicionY += 1;
                } else if (movimiento == 4) {
                    posicionY -= 1;
                } else {

                }

                /* Pintamos los cambios */
                pintarMatriz(tablero);
                finalDePartida = condicionAcabaPartida(tablero, posicionY, posicionX, salida, bomba);

            }
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }
        sc.close();
    }

}
