package EjerciciosProfesor2;

public class prueba {
    public static void main(String[] args) {
        
        int i=0, j, k;
        Bucle:
        while (i<20) { 
            i++;
            for (j=1; j<(20-i); j+=2) {
                if (i%2 == 0) {continue Bucle;}
                System.out.println("_");
            }
            for (k=0; k<i; k++) {
                System.out.println("*");
            }
            System.out.println("");
            if (i==19) {break Bucle;}
        }   

    }
    
}
