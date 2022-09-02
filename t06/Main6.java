package t06;

public class Main6{
        public static void main(String args[])
    {
        Monitor monitor = new Monitor();
        System.out.println("\nmonitores: \n");
        System.out.println("estas son las caracteristicas:\n");
        System.out.println("la marca es: "+monitor.mostrarmarca());
        System.out.println("es de "+monitor.mostrarpulgadas()+" pulgadas");
        System.out.println("cuenta con una resolucion de: "+monitor.mostrarresolucion());
    }


}
   