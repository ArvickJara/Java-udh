package formulaGeneral;

import java.lang.Math;

public class Ecuacion {

    double terminoCuadra;

    double terminoLine;

    double terminoIdepen;

    //double x0;

    //double x1;

    public Ecuacion(double numA, double numB, double numC)
    {
        terminoCuadra = numA;
        terminoLine  = numB;
        terminoIdepen = numC;
    }

   public void setTerminoCuadra(double numA)
    {
        terminoCuadra = numA;
    }

    public double getTerminoCuadra()
    {
        return terminoCuadra;
    }

    public void setTerminoLine(double numB)
    {
        terminoLine = numB;
    }

    public double getTerminoLine()
    {
        return terminoLine;
    }

    public void setTerminoIdepen(double numC)
    {
        terminoIdepen = numC;
    }

    public double getTerminoIdepen()
    {
        return terminoIdepen;
    }

    public double discriminante()
    {
        
        double expresion;

        expresion = Math.pow(getTerminoLine(), 2) - 4*getTerminoCuadra()*getTerminoIdepen();

        return expresion;
    }

    public double primeraRaiz()
    {
        double x0;

        x0 = ((-1)*getTerminoLine() + Math.sqrt(discriminante())) / (2*getTerminoCuadra());

        return x0;
    }

    public double segundaRaiz()
    {
        double x1;

        x1 = ((-1)*getTerminoLine() - Math.sqrt(discriminante())) / (2*getTerminoCuadra());

        return x1;

    }

    public void mostrarRaices()
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

   /*public double raicesEcuacion()
    {
        if(discriminante() > 0){
            x0 = ((-1)*obtenerB() + Math.sqrt(discriminante())) / (2*obtenerA());
            x1 = ((-1)*obtenerB() - Math.sqrt(discriminante())) / (2*obtenerA());

            System.out.println("La primera raiz es: " + x0);
            System.out.println("La segunda raiz es: " + x1);

        }else{
            if(discriminante() == 0){
                x0 = ((-1)*obtenerB()) / (2*obtenerA());

                System.out.println("Su raiz es unica y es: " + x0);

            }else{
                    System.out.println("No tiene raices reales");

            }
        }
        return 0;
    }*/
}
