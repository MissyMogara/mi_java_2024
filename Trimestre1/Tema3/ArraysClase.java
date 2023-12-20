package Tema3;

import java.util.Arrays;

public class ArraysClase {
    public static void main(String[] args) {
        
        //BinarySearch -Tiene que estar ordenado
        System.out.println("Busqueda binaria");
        int contenedor1[] = {1,2,4,5,7};   
        System.out.println(Arrays.binarySearch(contenedor1, 7));
        //CopyofRange
        System.out.println("Copiar");
        int contenedorCopia[] = Arrays.copyOfRange(contenedor1, 2, 4);
        System.out.println(Arrays.toString(contenedorCopia));
        //equals
        System.out.println("Comparación");
        int contenedor2[] = {6,2,7,9,2};
        System.out.println(Arrays.equals(contenedor1, contenedor2));
        //fill
        System.out.println("Llenar");
        int[] contenedor4 = new int[5];
        Arrays.fill(contenedor4 ,5);
        System.out.println(Arrays.toString(contenedor4));
        //sort
        System.out.println("Ordenar");
        int contenedor5[]={1,3,5,7,9};
        Arrays.sort(contenedor5);
        
        //ToString
        
        System.out.println(Arrays.toString(contenedor5));
        /*Los Arrays se pasan a las funciones por referencia, es decir si tocas el array fuera del main, en una función por ejemplo, se queda cambiado fuera */
    }
}
