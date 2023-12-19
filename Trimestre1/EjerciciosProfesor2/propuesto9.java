package EjerciciosProfesor2;

import java.util.Scanner;

public class propuesto9 {   
    public static void main(String[] args) {
        
        /*Pide un mes por teclado (1-12) y un dia del mes (1-31) y decir si la fecha es correcta */

        Scanner sc = new Scanner(System.in);
        int mes, dia;

        /*meses 30 dias abril agosto septiembre -> 4,8,9
         * meses 31 dias enero mayo julio octubre noviembre -> 1,5,7,10,11
         * mes 28,29 dias febrero marzo junio diciembre -> 2,3,6,12
         */ 
        
        
        switch (mes) {
            case 1,3,5,7,8,10,12:  //31 dias
                if ()
                break;

            //falta case para 30 y 28 dias

            default:
                break;
        }

    }
    
}
