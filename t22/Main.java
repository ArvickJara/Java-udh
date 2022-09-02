package t22;

public class Main {
    public static void main(String arg[]){
        /*Prodcutos */
        Productos  productos= new Productos();
 
        System.out.println("Nombre del Producto:"+ productos.mostrarNombreProducto());
 
        System.out.println("N° Productos:"+ productos.mostrarNumeroProductos());
 
        System.out.println("Codigo de Productos:"+ productos.mostrarCodigo());
    }
}
