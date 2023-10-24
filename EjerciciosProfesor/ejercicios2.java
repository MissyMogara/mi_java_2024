

import java.util.Scanner;
public class ejercicios2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Cálculo de la hipotenusa de un triángulo
        double cateto1, cateto2, hipotenusa;

        //La hipotenusa al cuadrado es igual a la suma de los catetos al cuadrado
        System.out.println("Inserta el cateto número 1:");
        cateto1 = sc.nextDouble();
        System.out.println("Ahora inserta el cateto número 2:");
        cateto2 = sc.nextDouble();
        
        hipotenusa = Math.sqrt((Math.pow(cateto1, 2)+(Math.pow(cateto2, 2))));
        
        System.out.println("La hipotenusa es :" + hipotenusa);
        sc.close();
}
}