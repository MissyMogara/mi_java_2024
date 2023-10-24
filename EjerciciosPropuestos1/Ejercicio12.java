package EjerciciosPropuestos1;

import java.util.Scanner;

public class Ejercicio12 {
    
    public static void main(String[] args) {
        
        /*Dos vehículos viajan a diferentes velocidades (v1 y v2) y están distanciados por una distancia
        d. El que está detrás viaja a una velocidad mayor. Se pide hacer un algoritmo para ingresar
        la distancia entre los dos vehículos (km) y sus respectivas velocidades (km/h) y con esto
        determinar y mostrar en que tiempo (minutos) alcanzará el vehículo más rápido al otro */
        Scanner sc = new Scanner(System.in);

        double d, velocV1, velocV2, t;

        System.out.println("Inserta la distancia entre vehículo a y b en metros:");
        d = sc.nextDouble();

        System.out.println("Inserta la velocidad del vehículo a en km/h:");
        velocV1 = sc.nextDouble() / 6;

        System.out.println("Inserta la veloccidad del vehículo b en km/h");
        velocV2 = sc.nextDouble() / 6;
        
        t = (d / (velocV1 - velocV2)) / 60;

        System.out.println("Tardara en alcanzar al otro vehículo " + (int)t + "minutos");
        sc.close();

    }

}
