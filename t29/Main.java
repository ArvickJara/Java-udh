package t29;

public class Main {
    public static void main(String args[])
{
    Libro libro = new Libro();

    System.out.println("El autor del libro es: " + libro.mostrarAutor());
    System.out.println("Nombre del libro: " + libro.mostrarNombreLibro());
    System.out.println("La fecha de publicación es: " + libro.mostrarFechaPublica());
}
}
