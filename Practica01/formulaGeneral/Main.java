package formulaGeneral;

public class Main {

    public static void main(String args[])
    {
        
        Ecuacion.setTerminoCuadra(4);
        Ecuacion.setTerminoLine(3);
        Ecuacion.setTerminoIdepen(0);
        System.out.println("Valor de la discriminante es: "+Ecuacion.discriminante());
        //Ecuacion.discriminante();
        //Ecuacion.primeraRaiz();
        //Ecuacion.segundaRaiz();
        Ecuacion.mostrarRaices();

    }
}
  