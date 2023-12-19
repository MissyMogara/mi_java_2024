

import java.util.Scanner;

public class ejercicios3 {
    public static void main(String[] args) {
        //Calcular la nota final de la materia de programación
        //Se compone de la nota de las tres parciales (55% entre las tres), la clasificación del examen final (30%) y la nota del trabajo (15%)
        Scanner sc = new Scanner(System.in);
        double par1, par2, par3, notaEx, notaTr, clasiFinal;

        //Pedimos todos los datos
        System.out.println("Inserta la nota del parcial 1:");
        par1 = sc.nextDouble();
        System.out.println("Inserta la nota del parcial 2:");
        par2 = sc.nextDouble();
        System.out.println("Inserta la nota del parcial 3:");
        par3 = sc.nextDouble();
        System.out.println("Inserta la nota del examen final:");
        notaEx = sc.nextDouble();
        System.out.println("Inserta la nota del trabajo:");
        notaTr = sc.nextDouble();

        //Calculamos el porcentaje de todas las notas
        clasiFinal = ((((par1 + par2 + par3)/3)*0.55) + (notaEx * 0.3) + (notaTr * 0.15));
        System.out.println(clasiFinal);
        sc.close();
    }
}
