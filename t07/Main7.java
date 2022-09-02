package t07;

public class Main7{
    public static void main(String args[])
    {
        Cpu cpu = new Cpu();
        System.out.println("\nprocesadores: \n");
        System.out.println("estas son las caracteristicas:\n");
        System.out.println("la marca es: "+cpu.mostrarmarca());
        System.out.println("serie: "+cpu.mostrarcaract());
        System.out.println("cuenta con graficas: "+cpu.mostrargrafica());
    }
}
   