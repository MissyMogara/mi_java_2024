package EjerciciosEntrega;

public class EjerciciosEntrega20 {
    public static void main(String[] args) {
        
        /*
         Escriba usando variables las siguientes expresiones:
         */
        int a = 0, b = 0, d = 0;
        double ejer1, ejer2, ejer3;

        //1. 5a²b³ + raíz cuadrada de a² + b²
        ejer1 = 5 * Math.pow(a, 2) * Math.pow(b, 3) + Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        //2. raíz cuadrada de 4ab² + ( a + b )² 
        ejer2 = Math.sqrt( 4 * a * Math.pow(b, 2)) + Math.pow(a + b, 2);
        
        //3. (a³b/2ab²) - raíz cuadrada de 12d⁴
        ejer3 = ((Math.pow(a, 3) * b) / (2 * a * Math.pow(b, 2))) - Math.sqrt(12 * Math.pow(d, 4));

    }

}