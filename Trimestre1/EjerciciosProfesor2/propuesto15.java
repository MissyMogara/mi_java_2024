package EjerciciosProfesor2;

public class propuesto15 {

    public static void main(String[] args) {
        
        //4.Simula lanzar dos dados por teclado y repitelos hasta que salga el mismo numero en las dos, muestra el número de intentos

        int dado1=1, dado2=2;
        int conta=0;

        while (dado1 != dado2) {
            dado1 = (int) (Math.random() * (6 + 1 - 1)) + 1;
            dado2 = (int) (Math.random() * (6 + 1 - 1)) + 1;
            conta = conta + 1;
            System.out.println("Su tirada ha sido: " + dado1 + " y " + dado2);
        }
        System.out.println("El número de tiradas ha sido " + conta);
    }
    
}
