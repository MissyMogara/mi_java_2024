package EjerciciosEntregaArrays;


public class Ejercicio11 {
    public static void pintarArrayBidimensional(int arrayBidimensional[][]) {

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < arrayBidimensional.length; i++) {
            for (int j = 0; j < arrayBidimensional[i].length; j++) {
                stringBuilder.append(arrayBidimensional[i][j]).append("\t");
            }
            stringBuilder.append("\n");
        } 
        System.out.println(stringBuilder.toString());
    }
    public static void main(String[] args) {
        /*
         * Crear una tabla bidimensional de tamaño 5x5 y rellenarla de forma que los
         * elementos de la diagonal principal
         * sean 1 y el resto 0. Mostrarla.
         */
        int arrayBidimensional[][] = new int[5][5];
         int ejeX=0;
        int ejeY=0;
        for (int i = 0; i < arrayBidimensional.length; i++) {
           
            for (int j = 0; j < arrayBidimensional[i].length; j++) {
                arrayBidimensional[i][j]=0;
                arrayBidimensional[ejeX][ejeY]=1;
            }
            ejeX+=1;
            ejeY+=1;
        }
        pintarArrayBidimensional(arrayBidimensional);
    }
}
