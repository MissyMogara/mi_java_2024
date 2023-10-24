package EjerciciosProfesor2;

import java.util.Scanner;

public class ejercicios3 {

    public static void main(String[] args) {
        
        /*El director de una escuela está organizando un viaje de estudios, y requiere determinar cuánto debe cobrar a cada alumno y cuánto 
         * debe pagar a la compañia de viajes por el servicio. La forma de cobrar es la siguiente:
         * -si son 100 alumnos o más, el costo por cada alumno es de 65 euros.
         * -de 50 a 99 alumnos, el costo es de 70 euros.
         * -de 30 a 49, de 95 euros.
         * -si son menos de 30, el costo de la renta del autobús es de 4000 euros, sin importar el número de alumnos.
         * 
         * Realice un algoritmo que permita determinar el pago a la compañía de autobuses y lo que debe pagar cada alumno por el viaje.
         */
        int pagoCompania, numAlumnos, pagoAlumnos;

        Scanner sc = new Scanner(System.in);

        System.out.println("Inserta el número de alumnos:");
        numAlumnos = sc.nextInt();

        if (numAlumnos >= 100) {
            pagoAlumnos = 65;
        } else if (numAlumnos >= 50 && numAlumnos <= 99) {
            pagoAlumnos = 70;
        } else if (numAlumnos >= 30 && numAlumnos <= 49) {
            pagoAlumnos = 95;
        } else {
            pagoAlumnos = (4000 / numAlumnos);
        }
        if (numAlumnos >= 30) {
            pagoCompania = numAlumnos * pagoAlumnos;
        } else {
            pagoCompania = 4000;
        }
        System.out.println("El coste de la compañia es " + pagoCompania + " euros y el coste para cada alumno es " + pagoAlumnos + " euros");
        sc.close();
    }
    
}
