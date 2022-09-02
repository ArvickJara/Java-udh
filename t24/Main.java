package t24;

public class Main {
    public static void main(String arg[]){
        /*Pasajero */
        Pasajero pasajero = new Pasajero();
        
        System.out.println("Nombre del Pasajero:"+ pasajero.mostrarNombrePasajero());
 
        System.out.println("Origen:"+ pasajero.mostrarOrigen());
 
        System.out.println("Destino:"+ pasajero.mostrarDestino());
    }
}
