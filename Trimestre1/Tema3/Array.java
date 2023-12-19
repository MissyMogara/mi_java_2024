package Trimestre1.Tema3;

public class Array {
        /**
     * Función que genera un número aleatorio entre un valor mínimo y máximo
     * 
     * @param min
     * @param max
     * @return número aleatorio entre min y max, incluidos
     */
    public static int generarNumero(int min, int max) {
        /* Sí min > max, lanzamos Exception "min debe ser menor que max" */

        return (int) (Math.random() * (max - min + 1) + min);
    }
    public static void main(String[] args) {
        
    int notas[] = new int[10]; //Declaración de array e inicialización de tamaño
        notas[2]=5;
        System.out.println(notas[2]);

        int tam = 20;
        double preios[]= new double[tam];

        String nombres[] = new String[10];
        //rellenar el array
        for (int i = 0; i < notas.length; i++) {
            notas[i]=generarNumero(1, 10);
            System.out.print(notas[i] + " ");
        }
        System.out.println();
        //recorrer al revés
        for (int i=notas.length-1; i>=0; i--) {
            System.out.print(notas[i] + " ");
        }
        System.out.println();
        String diasSemana[] = {"lunes","martes","miercoles","jueves","viernes","sabado","domingo"};
        for (int i = 0; i<diasSemana.length;i++) {
            System.out.println(diasSemana[i]);
        }



    }

}
