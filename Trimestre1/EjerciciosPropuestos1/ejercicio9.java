package EjerciciosPropuestos1;
import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
    //Dado un punto (x1,y1) y otro punto (x2,y2), calcular la distancia
    
    //1. Declaración de variables
    double x1,x2,y1,y2;
    double distanciaX,distanciaY,distancia=0;

    //2. Pedir datos por teclado
    Scanner sc = new Scanner(System.in);
    System.out.println("Dime la cordenada x del primer punto");
    x1 = sc.nextDouble();

    System.out.println("Dime la cordenada x del segundo punto");
    x2 = sc.nextDouble();

    System.out.println("Dime la cordenada y del primer punto");
    y1 = sc.nextDouble();

    System.out.println("Dime la cordenada y del segundo punto");
    y2 = sc.nextDouble();

    //3. Calcular la distancia -> Raíz cuadrada de (x2-x1)2 + (y2-y1)2
    distanciaX = Math.pow(x2-x1, 2);
    distanciaY = Math.pow(y2-y1, 2);
    distancia = Math.sqrt(distanciaX + distanciaY);

    //4. Pintar el resultado
    System.out.println("El resultado es " + distancia);
    sc.close();

    }
}
