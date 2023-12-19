package EntregaClase;

import java.util.Scanner;

/*Marcus Cubitus y Julius Humerus, legionarios apasionados por los juegos de dados,
aprovechan los días cada vez más largos del mes de Iunius para probar nuevos juegos. En
este juego, en cada turno un jugador lanza cuatro dados y se anota la suma de los valores
impares obtenidos, mientras que el otro jugador lanza tres dados y se anota la suma de
los valores pares obtenidos. Gana el turno el jugador que obtenga más puntos y gana la
partida el jugador que haya ganado más turnos. */

public class CubitusHumerus {
    /**
     * Función que genera un número aleatorio entre un valor mínimo y máximo
     * 
     * @param min
     * @param max
     * @return número aleatorio entre min y max, incluidos
     */
    public static int generarNumero(int min, int max) throws Exception {
        /* Sí min > max, lanzamos Exception "min debe ser menor que max" */

        if (min > max) {
            throw new Exception("El valor mínimo no puede ser mayor que el máximo.");
        }
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static void main(String[] args) {

        int marcusT1, juliusT1, nTurnos, scoreJ1 = 0, scoreJ2 = 0, turnoJ1 = 0, turnoJ2 = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Inserta el número de turnos:");
        try {
            nTurnos = Integer.parseInt(sc.nextLine());

            for (int i = 0; i < nTurnos; i++) {
                System.out.println("-Ronda " + (i+1) +"-");
                // Tiradas de Marcus
                System.out.println("Las tiradas de Marcus son: ");
                for (int j = 0; j < 4; j++) {
                    marcusT1 = generarNumero(1, 6);
                 
                    System.out.print(marcusT1 + " ");
                    if (marcusT1 % 2 != 0) {
                        scoreJ1 = scoreJ1 + marcusT1;
                    }
                }
                System.out.println("");
                // Tiradas de Julius
                System.out.println("Las tiradas de Julius son: ");
                for (int k = 0; k < 3; k++) {
                    juliusT1 = generarNumero(1, 6);
        
                    System.out.print(juliusT1 + " ");
                    if (juliusT1 % 2 == 0) {
                        scoreJ2 = scoreJ2 + juliusT1;
                    }
                }
                System.out.println("");
                //Comprobamos quien gana la ronda
                if (scoreJ1 > scoreJ2) {
                    turnoJ1 = turnoJ1 + 1;
                    System.out.println("*La ronda la gana Marcus*");
                } else if (scoreJ2 > scoreJ1) {
                    turnoJ2 = turnoJ2 + 1;
                    System.out.println("*La ronda la gana Julius*");
                } else {
                    System.out.println("*Empate en la ronda*");
                }

            }
            //Comprobamos quien gana la partida
            if (turnoJ1 > turnoJ2) {
                System.out.println("->Gana Marcus<-");
            } else if (turnoJ1 < turnoJ2) {
                System.out.println("->Gana Julius<-");
            } else {
                System.out.println("->Empate<-");
            }
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inserta un número válido");
        }
        sc.close();

    }
}
