package MisEjercicios;

class circunferencia {
   
    public static void main (String[] args) {

        //1. Definir la variable
        double radio, longitud, superficie;

        //2. Definir radio
        radio = 7;

        //3. Operaciones
        superficie = Math.PI * Math.pow(radio, 2);

        longitud = 2 * Math.PI * radio;

        System.out.println("La superficie es: " + superficie);
        System.out.println("La longitud es: " + longitud);
    }
    
}
