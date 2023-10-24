package EjerciciosProfesor2;

import java.util.Scanner;

public class ejercicios2 {
    public static void main(String[] args) {

        //Escribe un programa que pida fecha (día, mes, año) y diga si es correcta.
        Scanner sc = new Scanner(System.in);

        int dia, mes, year;
        int dias_del_mes = 0;

        System.out.println("Escribe el día:");
        dia = sc.nextInt();

        System.out.println("Escribe el número del mes:");
        mes = sc.nextInt();

        System.out.println("Escribe el año:");
        year = sc.nextInt();


        //Hay que calcular cuando es un año bisiesto, son aquellos divisibles entre 4 o 400, pero no 100

        switch (mes) {
            case 1:
                dias_del_mes = 31;
                break;
            case 2:
                if ((year % 4 == 0 && !(year % 100 == 0)) || year % 400 == 0) {
                    dias_del_mes = 29;
                } else {
                    dias_del_mes = 28;
                }
                break;
            case 3:
                dias_del_mes = 31;
                break;
            case 4:
                dias_del_mes = 30;
                break;
            case 5:
                dias_del_mes = 31;
                break;
            case 6:
                dias_del_mes = 30;
                break;
            case 7:
        
            case 8:
                dias_del_mes = 31;
                break;
            case 9:
                dias_del_mes = 30;
                break;
            case 10:
                dias_del_mes = 31;
                break;
            case 11:
                dias_del_mes = 30;
                break;
            case 12:
                dias_del_mes = 31;
                break;
                
            default: System.out.println("Fecha incorrecta");
                break;
        }

        if (dia < 0 ||  dia > dias_del_mes) {

            System.out.println("Fecha incorrecta");

        } else {
            System.out.println("Fecha correcta");
        }

        sc.close();

    }
    
}
