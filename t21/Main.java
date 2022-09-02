package t21;

public class Main {
    public static void main(String arg[]){

        /*Cliente */
        Cliente cliente = new Cliente();
 
        System.out.println("Nombre del Cliente:"+ cliente.mostrarNombre());
 
        System.out.println("Apellido del cliente:"+ cliente.mostrarApellido());
 
        System.out.println("Dni del Cliente:"+ cliente.mostrarDni());
        
        System.out.println("N° Productos:"+ cliente.mostrarProductos());
    }
}
