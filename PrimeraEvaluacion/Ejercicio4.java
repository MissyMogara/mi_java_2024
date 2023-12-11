package PrimeraEvaluacion;

/*Nos piden crear una matriz 10×10 de caracteres, que inicialmente rellenaremos
con la letra ‘a’ (agua). Vamos, ha simular el juego “Batalla Naval”. Tienes que implementar:
8. Un método pintarTablero(char[][] tablero): que pinte toda la matriz.
9. Un método colocarBarco(int x, int y, String dirección, int longitudBarco, char letra,
char[][] tablero): este método pintará la letra indicada en la posición (x,y) del
tablero indicada. Además, en la dirección que se le pase (“Izquierda”, “Derecha”,
“Arriba”, “Abajo”), continuará pintando esa misma letra, tantas posiciones como
indique longitudBarco. Importante: debes comprobar que el barco se puede colocar
y no se sale del tablero, llamando al siguiente método.
10. Un método comprobarBarco(int x, int y, String direccion, int longitudBarco, char[][]
tablero): comprobará si el barco se puede poner, cabe, en la posición y dirección
indicada. Devuelve false si no se puede poner, y true si se puede colocar.
11. Un método disparar(int x, int y, char[][] tablero): devolverá false si en esa posición
hay agua, y true si en esa posición hay un barco. Pondrá una ‘x’ en esa posición.
Haz un main, donde se coloque un barco de longitud 2 con la letra ‘l’ (lancha), uno de
longitud 3 con la letra ‘s’ (submarino), uno de longitud 4 con la letra ‘c’ (crucero) y uno de
longitud 4 con la letra ‘p’ (portaaviones). Dispara a un barco. Pinta el tablero. */

public class Ejercicio4 {

    /**
     * Proceso que rellena una matriz
     * 
     * @param matriz
     */
    public static void rellenarTablero(char matriz[][]) {
        try {

            for (int i = 0; i < matriz.length; i++) {

                for (int j = 0; j < matriz[i].length; j++) {

                    matriz[i][j] = 'a';

                }

            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    /**
     * Proceso para pintar una matriz
     * 
     * @param matriz
     */
    public static void pintarMatriz(char[][] matriz) {
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
     * Esta funcion pone un barco en el tablero a tu eleccion y comprueba si se puede poner
     * @param x cordenada x
     * @param y cordenada y
     * @param direccion
     * @param longitud
     * @param letra tipo barco
     * @param tablero
     * @throws Exception
     */
    public static void colocarBarco(int x, int y, String direccion, int longitud, char letra, char[][] tablero)
            throws Exception {

        int acumulador = 0;

        for (int i = 0; i < longitud; i++) {
            /*Comprobamos la direccion y si se sale */
            if (direccion.equals("Izquierda")) {

                if (x - longitud >= 0) {
                    tablero[y][x - acumulador] = letra;
                } else {
                    throw new Exception("Error: El barco esta fuera de los límites.");
                }

            }

            if (direccion.equals("Derecha")) {

                if (x - longitud < 10) {

                    tablero[y][x + acumulador] = letra;

                } else {
                    throw new Exception("Error: El barco esta fuera de los límites.");
                }

            }
            if (direccion.equals("Arriba")) {

                if (x - longitud >= 0) {

                    tablero[y - acumulador][x] = letra;

                } else {
                    throw new Exception("Error: El barco esta fuera de los límites.");
                }

            }
            if (direccion.equals("Abajo")) {

                if (x + longitud > 10) {

                    tablero[y + acumulador][x] = letra;

                } else {
                    throw new Exception("Error: El barco esta fuera de los límites.");
                }

            }
            /*Sumamos al acumulador que indica la longitud del barco */
            acumulador += 1;
        }

    }

    public static void main(String[] args) {

        try {

            /*Pintamos tablero y lo rellenamos */
            char tablero[][] = new char[10][10];
            rellenarTablero(tablero);

            pintarMatriz(tablero);
            System.out.println();

            /*Colocamos el barco */
            colocarBarco(3, 3, "Arriba", 2, 'l', tablero);

            pintarMatriz(tablero);

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }

    }

}
