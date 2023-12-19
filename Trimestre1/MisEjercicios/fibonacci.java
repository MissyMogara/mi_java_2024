package Trimestre1.MisEjercicios;
class fibonacci {
   
    public static void main (String[] args) {
                
        int numero0 = 0;

        int numero1 = 1;
        
        for (int i = 0; i <= 5; i++) {
            numero0 = numero1 + numero0;
            numero1 = numero0 + numero1;
            
            System.out.println(numero0);
            System.out.println(numero1);
    
        }
    
}
}
