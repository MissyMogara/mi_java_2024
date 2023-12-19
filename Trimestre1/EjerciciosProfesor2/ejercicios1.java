package EjerciciosProfesor2;

import java.util.Scanner;

public class ejercicios1 {
    public static void main(String[] args) {
        //Escribe un programa que pida un nombre y una contrasenia y si se ha introducido "pepe" y "12345678" se indica "Has entrado al sistema", sino da error

        Scanner sc = new Scanner(System.in);
        String name, pass;

        //Le pedimos el usuario y contrasenia

        System.out.println("Por favor inserte el usuario: ");
        name = sc.nextLine();

        System.out.println("Por favor inserte la contrasenia: ");
        pass = sc.nextLine();

        //Le pedimos al programa que analice si son correctos esos datos

        if ( name.equals("pepe") && pass.equals("12345678") ) {
            System.out.println("Has entrado al sistema");
        } else {
            System.out.println("Usuario o contrasenia incorrectos");
        }
        sc.close();
    }
}
