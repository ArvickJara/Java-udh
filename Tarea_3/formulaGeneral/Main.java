package formulaGeneral;

public class Main {

    public static void main(String args[])
    {
        

        Ecuacion ecuacion = new Ecuacion(4, -3, 0);

        /*ecuacion.setA(1);
        ecuacion.setB(-4);
        ecuacion.setC(5); */

        /*System.out.println("Valor A: "+ecuacion.obtenerA());
        System.out.println("Valor B: "+ecuacion.obtenerB());
        System.out.println("Valor C: "+ecuacion.obtenerC());*/

        System.out.println("Valor de la discriminante es: "+ecuacion.discriminante());

        /*ecuacion.primeraRaiz();

        ecuacion.segundaRaiz();*/

        ecuacion.mostrarRaices();


    }
}
