package t28;

public class Main {
    public static void main(String args[])
{
    Arbol cedro = new Arbol();

    System.out.println("Altura maxima: "+cedro.mostrarAlturaMax());
    System.out.println("Nombre: " + cedro.mostrarNombre());
    System.out.println("El " + cedro.mostrarNombre() + " es utilizado para hacer: " + cedro.mostrarUtilidad());
}
}
