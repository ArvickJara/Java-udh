package t08;

public class Main8{
    public static void main(String args[])
    {
        Teclado teclado = new Teclado();
        System.out.println("\nteclados: \n");
        System.out.println("estas son los teclados ingresados:\n");
        System.out.println("la marca es: "+teclado.mostrarmarca());
        System.out.println("tipo: "+teclado.mostrartipo());
        System.out.println("modelo: "+teclado.mostrarmodelo());
    }
}
   