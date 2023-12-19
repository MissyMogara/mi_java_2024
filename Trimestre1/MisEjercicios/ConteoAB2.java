package Trimestre1.MisEjercicios;
class ConteoAB2 {
   
    public static void main (String[] args) {

        String cadenatext = "Hola m";
        
        int nv = 0;  
        
        int nc = 0;

        cadenatext = cadenatext.toLowerCase();

        for (int i = 0; i < cadenatext.length(); i++) {
          
            char caracter = cadenatext.charAt(i);
                if (Character.isLetter(caracter)) {
                    if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u' ) {
                        nv ++;
                    } else { nc ++; }
                }
            }
        System.out.println(nv);
        System.out.println(nc);

        }
        
    }
    
   
