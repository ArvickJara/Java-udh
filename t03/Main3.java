package t03;

public class Main3{
    public static void main(String args[])
    {
    Fruteria fruteria = new Fruteria();
    System.out.println("\nBienvenidos a la Fruteria\n");
    System.out.println("estas son sus ordenes:\n");
    System.out.println("fruta: "+fruteria.mostrarfrut());
    System.out.println("cantidad: "+fruteria.mostrarcanti());
    System.out.println("precio: "+fruteria.mostrarprec()+" soles");
    System.out.println("su cuenta total es de: "+fruteria.mostrarpt()+" soles"); 
    }
}
   