package t25;

public class Main {
    public static void main(String arg[]){

        /*Lector */
        Lector lector = new Lector();
        
        System.out.println("Nombres:"+ lector.mostrarNombre());
 
        System.out.println("Direccion:"+ lector.mostrarDireccion());
 
        System.out.println("Telefono:"+ lector.mostrarTelefono());
    }
}
