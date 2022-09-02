package t04;

public class Main5{
    public static void main(String args[])
    {
        Carniceria carniceria = new Carniceria();
        System.out.println("\nBienvenidos a la carniceria\n");
        System.out.println("estas son sus ordenes:\n");
        System.out.println("carne: "+carniceria.mostrartipocarne());
        System.out.println("cantidad: "+carniceria.mostrarcanti()+" kilos");
        System.out.println("precio: "+carniceria.mostrarprec()+" soles");
        System.out.println("su cuenta total es de: "+carniceria.mostrarpt()+" soles");
    }


}
   