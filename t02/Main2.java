package t02;

public class Main2{
   public static void main(String args[])
   {
      Laptop laptop = new Laptop();
        
      System.out.println("\nesta es la clase Laptop\n");
      System.out.println("la cual posee las siguientes caracteristicas\n");
      System.out.println("marca: "+laptop.mostrarmarca());
      System.out.println("ram: "+laptop.mostrarram()+"gb");
      System.out.println("almacenamiento: "+laptop.mostraralmac()+"tb");
      System.out.println("procesador: "+laptop.mostrarprocs());
    }
}
   