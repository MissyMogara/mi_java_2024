package EjerciciosEntrega2;



public class Fecha {

    private int day,month,year;

    public Fecha (int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String mostrarFecha() {
        String fechaPrint="";
        /*Comprobamos si el día es mayor a 9 para saber si le ponemos un cero al dígito */
        if (day > 9) {
            fechaPrint = fechaPrint + day;
        } else if (day < 10) {
            fechaPrint = fechaPrint + "0" + day + "/";
        } else if (day > 31) {
            
            return "Error";
        }
        /*Ahora lo mismo con el mes */
        if (month > 9) {
            fechaPrint = fechaPrint + month;
        } else if (month < 10) {
            fechaPrint = fechaPrint + "0" + month +"/";
        } else if (month > 12) { 
            return "Error";
        }
        /*Comprobamos si el año es correcto */
        if (year <= 9999 && year > 0) {
            fechaPrint = fechaPrint + year;
        } else {
            return "Error";
        }
        
        return fechaPrint;
    }

    public void main(String[] args) {
        /*Crea una clase llamada Fecha que tenga los siguientes atributos: dia, mes y año. 
        La clase debe tener un constructor que permita inicializar estos atributos al crear una instancia.
        Además, la clase debe tener un método llamado mostrarFecha() que imprima la fecha en el formato "dd/mm/aaaa". */
        /*Creamos el obejto de la clase */
        Fecha miFecha = new Fecha(12, 6, 2020);
        String fechaPintar = miFecha.mostrarFecha();
        /*Llamamos al método para imprimir la fecha */
        System.out.println(fechaPintar);

    }

}
