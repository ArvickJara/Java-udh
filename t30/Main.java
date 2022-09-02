package t30;

public class Main {

    public static void main(String args[])
    {
        Celular celular = new Celular();

        System.out.println("La marca es: " + celular.mostrarMarca());
        System.out.println("El color es " + celular.mostrarColor());
        System.out.println("La fecha de lanzamiento fue en el: " + celular.mostrarFechaLanzami());
    }
    
}
