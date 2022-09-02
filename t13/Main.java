package t13;

public class Main {
    public static void main(String arg[]){
        /**AUTOBUS**/

        Autobus autobus = new Autobus();

        System.out.println(autobus);

        System.out.println("Placa: "+ autobus.mostrarPlaca());

        System.out.println("Modelo: "+ autobus.mostrarModelo());

        System.out.println("Capacidad "+ autobus.mostrarCapacidad());
    }
}
