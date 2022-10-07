package Tarea;


public class Main {
    public static void main(String[] args) {
        Tienda tienda = new Tienda();
        tienda.setNombre("Tienda fast marquet");
        tienda.setDireccion("Jr.Abtao N° 1205");
        tienda.agregarCliente(new Cliente("Patricio","Vasques",37));
        tienda.agregarCliente(new Cliente("Julio","Alvares",63));
        tienda.agregarCliente(new Cliente("Maicarmen","Hernandez",10));
        tienda.agregarCliente(new Cliente("kevin","Rios",75));
        tienda.agregarCliente(new Cliente("Almendra","Fuentes",21));
        tienda.agregarCliente(new Cliente("Leydi","Nieto",43));
        tienda.agregarCliente(new Cliente("Victor","Toscano",91));
        tienda.agregarCliente(new Cliente("Lebrom","James",12));
        tienda.agregarCliente(new Cliente("Marta","Aguilar",81));          
        System.out.println("Nombre de tienda: " + tienda.getNombre() + ", Direccion: " + tienda.getDireccion());

        for (Cliente clien: tienda.getCliente()){
            System.out.println(" " + clien.getNombre() + "," + clien.getApellido() + ", " + clien.getCodigo());
        }
        tienda.ordenarCodigo();
    }
}
