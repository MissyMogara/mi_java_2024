package juegos;

import java.util.Scanner;

public class Juego1 {
    /*Función para tirar dados */
    public static int dado (){
       int resultado;
       resultado = (int) (Math.random() * (10 + 1 - 1)) + 1;
       return resultado;

    }
    /*Función para ver el ganador de la ronda */
    public static String ronda(int j1, int j2) {
        String resultado = "Error";
        if (j1 > j2) {
            resultado = "Gana Jugador 1";
        } else if (j2 > j1) {
            resultado = "Gana Jugador 2";
        } else if (j1 == j2) {
            resultado = "Empate";
        }
        return resultado;
    }

    public static void main(String[] args) {
        
        /*Marcus Cubitus y Julius Humerus son dos legionarios aficionados a los dados. hoy han pensado un nuevo juego.
         * Primero deciden el número de turnos a jugar, nosotros lo pediremos por teclado.
         * -En cada turno cada jugadoz lanza un dado de 10 caras.
         * -Si un jugados saca un valor mayor que el otro, se suman los puntos de los dos dados al jugador ganador.
         * -Si los dos jugadores sacan el mismo valor, la suma de los dos se acumula para la próxima tirada. Si es e último turno esos
         * puntos se pierden.
         * -Debéis mostrar la partida de los jugadores, detallando las puntuaciones de cada uno y quien gana cada turno.
         * -Podéis hacer funciones para hacer la tiradade dados, para calcular el ganador,...
         */
        int jugador1=0,jugador2=0,turnos,nturnos=0,j1Score=0,j2Score=0,empateScore=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ha comenzado la partida!");
        System.out.println("Escribe cuantos turnos quieres que dure la partida:");
        turnos = sc.nextInt();

        for (int i = 0; i < turnos; i++){
            nturnos += 1;
            System.out.println("-Comienza la ronda " + nturnos + "-");
            jugador1 = dado();
            System.out.println("Jugador 1 saca " + jugador1);
            jugador2 = dado();
            System.out.println("Jugador 2 saca " + jugador2);

            if (ronda(jugador1,jugador2).equalsIgnoreCase("Gana Jugador 1")) {
                j1Score = j1Score + jugador1 + jugador2 + empateScore;
                System.out.println("*" + ronda(jugador1, jugador2));
            } else if (ronda(jugador1,jugador2).equalsIgnoreCase("Gana Jugador 2")) {
                j2Score = j2Score + jugador1 + jugador2 + empateScore;
                System.out.println("*" + ronda(jugador1, jugador2));
            } else if (ronda(jugador1,jugador2).equalsIgnoreCase("Empate")) {
                empateScore = jugador1 + jugador2;
                System.out.println("*Empate, se guarda la puntuación");
            }
            if (i == (turnos-1) && empateScore != 0) {
                i = i - 1;
            } else if (empateScore != jugador1+jugador2) {
                empateScore=0;
            }
           
            System.out.println("-Fin de la ronda " + nturnos + "-");
            
            
        }
        System.out.println("La puntuación del jugador 1 es " + j1Score);
        System.out.println("La puntiación del jugador 2 es " + j2Score);
        if (j1Score > j2Score) {
            System.out.println("El ganador es el jugador 1! Enorabuena!");
        } else if (j2Score > j1Score) {
            System.out.println("El ganador es el jugador 2! Enorabuena!");   
        }

        sc.close();

    }
    
}
