package formulaGeneral;

import java.lang.Math;

public class Ecuacion {

    private static double terminoCuadra;

    private static double terminoLine;

    private static double terminoIdepen;

    public Ecuacion(double numA, double numB, double numC)
    {
        terminoCuadra = numA;
        terminoLine  = numB;
        terminoIdepen = numC;
    }

   public static void setTerminoCuadra(double numA)
    {
        terminoCuadra = numA;
    }

    public static double getTerminoCuadra()
    {
        return terminoCuadra;
    }

    public static void setTerminoLine(double numB)
    {
        terminoLine = numB;
    }

    public static double getTerminoLine()
    {
        return terminoLine;
    }

    public static void setTerminoIdepen(double numC)
    {
        terminoIdepen = numC;
    }

    public static double getTerminoIdepen()
    {
        return terminoIdepen;
    }

    public static double discriminante()
    {
        
        double expresion;

        expresion = Math.pow(getTerminoLine(), 2) - 4*getTerminoCuadra()*getTerminoIdepen();

        return expresion;
    }

    public static double primeraRaiz()
    {
        double x0;

        x0 = ((-1)*getTerminoLine() + Math.sqrt(discriminante())) / (2*getTerminoCuadra());

        return x0;
    }

    public static double segundaRaiz()
    {
        double x1;

        x1 = ((-1)*getTerminoLine() - Math.sqrt(discriminante())) / (2*getTerminoCuadra());

        return x1;

    }

    public static void mostrarRaices()
    {

        if(discriminante() > 0) {

            System.out.println("La primera raiz es: " + primeraRaiz());
            System.out.println("La segunda raiz es: " + segundaRaiz());

        }else{

            if(discriminante() == 0){

                System.out.println("Su raiz es unica y es: " + primeraRaiz());

            }else{
                System.out.println("No tiene raices reales");

            }

        }

    }

   
}
