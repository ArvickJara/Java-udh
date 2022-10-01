package Tienda;

public class Tienda {

    private Cliente cliente[];
    private int contadorPost;
    private String nombre;
    private String direccion;

    public Tienda() {
        this.cliente = new Cliente[4];
        this.contadorPost = 0;
    }

    public void agregarCliente(Cliente cliente){
        this.cliente[contadorPost++] = cliente;
    }

    public Cliente[] mostrarCiente(){
        return this.cliente;
    }

    public Tienda(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
