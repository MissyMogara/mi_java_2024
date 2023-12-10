package juegos;

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
     * Proceso para pintar un arraybidimensional
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
    public static void rellenarTablero(String matriz[][]) {
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
    public static void generarSalida(String matriz[][]) {
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
    }

    public static void main(String[] args) {

        String tablero[][] = new String[20][20];
        rellenarTablero(tablero);

        generarSalida(tablero);

        pintarMatriz(tablero);

    }

}
