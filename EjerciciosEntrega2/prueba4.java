package EjerciciosEntrega2;

public class prueba4 {
    public static void main(String[] args) {

        /*
         * Escribe un programa en Java que sume dos matrices de enteros y almacene el
         * resultado en una tercera matriz.
         */

        int[][] matriz1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] matriz2 = { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } };
        int[][] sumaMatriz = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        for (int u = 0; u < 9; u++) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    sumaMatriz[i][j] = matriz1[i][j] + matriz2[i][j];
                     
                }
                
            }
           
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(sumaMatriz[i][j] + " ");
            }
            System.out.println();
        }


    }

}
