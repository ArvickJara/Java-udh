package Tienda;

public class Main {
    public static void main(String[] args) {
        Tienda tienda = new Tienda();
        tienda.setNombre("La pituca");
        tienda.setDireccion("Jiron San Juan Crd 12");
        tienda.agregarCliente(new Cliente("Esmeralda", "Hilario Molla", 72675498));
        tienda.agregarCliente(new Cliente("Arvic", "Jara Herrera", 5464645));
        tienda.agregarCliente(new Cliente("Victor", "Arevalo Bazan", 4645678));
        tienda.agregarCliente(new Cliente("Kenedi", "Carry Tomsom", 4568697));
        System.out.println("Nombre: " + tienda.getNombre() + ", Dirección: " + tienda.getDireccion());


        for (Cliente cli: tienda.mostrarCiente()){
            System.out.println(" : " + cli.getNombres() + " " + cli.getApellidos() + ", " + cli.getDni());
        }
    }
}
