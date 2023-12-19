package Trimestre1.MisEjercicios;
class invcadena {
   
    public static void main (String[] args) {
                
        String textoOriginal = "Holaaa";

        String textoInvertido = "";

        StringBuilder resultado = new StringBuilder();

        for ( int n = textoOriginal.length()-1; n >= 0 ; n-- ) {
        
         resultado.append(textoOriginal.charAt(n));
        }
        
        textoInvertido = resultado.toString();

        System.out.println(textoInvertido);
        }
    
}
