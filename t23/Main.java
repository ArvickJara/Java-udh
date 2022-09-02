package t23;

public class Main {
    public static void main(String arg[]){

        /*Taxi */
        Taxi taxi = new Taxi();
        
        System.out.println("Nombre del Conductor:"+ taxi.mostrarNombreConductor());
 
        System.out.println("Modelo:"+ taxi.mostrarModelo());
 
        System.out.println("Placa del Taxi:"+ taxi.mostrarPlaca());
 
        System.out.println("Capacidad del Taxi:"+ taxi.mostrarCapacidad());
 
        System.out.println("Pasaje :"+ taxi.mostrarPasaje());
    }
}
