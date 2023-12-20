package ProgramacionDesde0;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {

        /*
         * Crea un programa que pida un número al usuario un número de mes (por ejemplo,
         * el 4) y
         * diga cuántos días tiene (por ejemplo, 30) y el nombre del mes. Debes usar un
         * vector. Para
         * simplificarlo vamos a suponer que febrero tiene 28 días
         */

        Scanner sc = new Scanner(System.in);
        // Inicializamos el array con el número de días que tienen los meses, cada hueco
        // será un mes, y el resultado el número de días que tienes
        int mes[] = { 31, 28, 31, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        // Le pedimos al usuario que inserte el mes en número
        System.out.println("Inserta un número entre el 1 y 12 para elegir el mes.");
        // Usamos un Switch para pintar el resultado en función del número proporcionado
        try {
            int numeroMes = Integer.parseInt(sc.nextLine());
            switch (numeroMes) {
                case 1:
                    System.out.println("Enero");
                    System.out.println("Tiene " + mes[numeroMes - 1] + " días");
                    break;
                case 2:
                    System.out.println("Febrero");
                    System.out.println("Tiene " + mes[numeroMes - 1] + " días");
                    break;
                case 3:
                    System.out.println("Marzo");
                    System.out.println("Tiene " + mes[numeroMes - 1] + " días");
                    break;
                case 4:
                    System.out.println("Abril");
                    System.out.println("Tiene " + mes[numeroMes - 1] + " días");
                    break;
                case 5:
                    System.out.println("Mayo");
                    System.out.println("Tiene " + mes[numeroMes - 1] + " días");
                    break;
                case 6:
                    System.out.println("Junio");
                    System.out.println("Tiene " + mes[numeroMes - 1] + " días");
                    break;
                case 7:
                    System.out.println("Julio");
                    System.out.println("Tiene " + mes[numeroMes - 1] + " días");
                    break;
                case 8:
                    System.out.println("Agosto");
                    System.out.println("Tiene " + mes[numeroMes - 1] + " días");
                    break;
                case 9:
                    System.out.println("Septiembre");
                    System.out.println("Tiene " + mes[numeroMes - 1] + " días");
                    break;
                case 10:
                    System.out.println("Octubre");
                    System.out.println("Tiene " + mes[numeroMes - 1] + " días");
                    break;
                case 11:
                    System.out.println("Noviembre");
                    System.out.println("Tiene " + mes[numeroMes - 1] + " días");
                    break;
                case 12:
                    System.out.println("Diciembre");
                    System.out.println("Tiene " + mes[numeroMes - 1] + " días");
                    break;

                default:
                    System.out.println("Error, mes incorrecto. Inserta un número entre el 1 y 12 para elegir el mes.");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Error. Por favor inserta un número");
        }
        sc.close();
    }
}
