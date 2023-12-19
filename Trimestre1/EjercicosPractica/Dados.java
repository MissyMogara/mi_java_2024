package EjercicosPractica;

public class Dados {
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
            throw new Exception("El valor mínimo no puede ser mayor que el máximo");
        }
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static void main(String[] args) {
        int tirada1=0, tirada2=0, tirada3=0;
        try {
            do {
                tirada1 = generarNumero(1, 6);
                tirada2 = generarNumero(1, 6);
                tirada3 = generarNumero(1, 6);
            }
            while (!(tirada1 == tirada2 && tirada1 == tirada3 && tirada2 == tirada3));
               
            
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println(tirada1 + ", " + tirada2 + ", " + tirada3);
    }
}
