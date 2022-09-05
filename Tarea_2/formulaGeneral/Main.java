package formulaGeneral;

public class Main {

    public static void main(String args[])
    {
        

        EcuacionCuadratica ecuacion = new EcuacionCuadratica();
        ecuacion.establecerA(4);
        ecuacion.establecerB((-3));
        ecuacion.establecarC(0);

        System.out.println("Valor A: "+ecuacion.obtenerA());
        System.out.println("Valor B: "+ecuacion.obtenerB());
        System.out.println("Valor C: "+ecuacion.obtenerC());

        System.out.println("Valor de la discriminante es: "+ecuacion.discriminante());
        ecuacion.raicesEcuacion();

    }
}
