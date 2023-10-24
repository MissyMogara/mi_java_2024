package MisEjercicios;
class ConteoAB {
   
    public static void main (String[] args) {

        String cadenatext = "Hola mundo de java";
        
        int nAB = 0;  



        for (int i = cadenatext.length() - 1; i >= 0 ; i--) {
            char letracom = cadenatext.charAt(i);
            if ( letracom != 32) {
                nAB ++;
            }
        

        }
        System.out.println(nAB);
    }
    
}   
