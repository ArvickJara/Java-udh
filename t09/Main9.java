package t09;

public class Main9{
    public static void main(String args[])
    {
        Mouse mouse = new Mouse();
        System.out.println("\nmouses: \n");
        System.out.println("estas son los mouses ingresados:\n");
        System.out.println("la marca es: "+mouse.mostrarmarca());
        System.out.println("tipo: "+mouse.mostrartipo());
        System.out.println("modelo: "+mouse.mostrarmodelo());
    }
}
   