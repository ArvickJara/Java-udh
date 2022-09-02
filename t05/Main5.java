package t05;

public class Main5{
        public static void main(String args[])
    {
        Bodega bodega = new Bodega();
        System.out.println("\nBienvenidos a la bodega\n");
        System.out.println("estas son sus ordenes:\n");
        System.out.println("su pedido es: "+bodega.mostrarproducto());
        System.out.println("cantidad: "+bodega.mostrarcanti());
        System.out.println("precio: "+bodega.mostrarprec()+" soles");
        System.out.println("su cuenta total es de: "+bodega.mostrarpt()+" soles");
    }


}
   