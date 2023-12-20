package PracticaStringAlgoritmos;

public class Ejercicio11 {

    public static void main(String[] args) {

        /* Elimina los espacios (intermedios también) de una cadena de texto. */
        String miqota = " La Miqotilla miqotea sin parar tan feliz de la vida ";
        StringBuffer purr = new StringBuffer();

        int posicion = 0;

        /*
         * Habiendo declarado una variable posicion que me ayuda a llevar la ultima
         * posicion procedere a usar un for para ir recorriendo y comprobando cuando
         * haya un espacio, entonces ire metiendo esa cadena dentro del string buffer y
         * quitandole los espacios
         */
        for (int i = 0; i < miqota.length(); i++) {

            if (miqota.charAt(i) == ' ') {
                purr.append(miqota.substring(posicion, i).trim());
                posicion = i;
            }

        }

        System.out.println(purr);
    }

}
