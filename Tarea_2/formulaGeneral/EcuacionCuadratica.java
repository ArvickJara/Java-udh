package formulaGeneral;

import java.lang.Math;

public class EcuacionCuadratica {

    double a;

    double b;

    double c;

    double x0;

    double x1;

    public void establecerA(double numA)
    {
        a = numA;
    }

    public double obtenerA()
    {
        return a;
    }

    public void establecerB(double numB)
    {
        b = numB;
    }

    public double obtenerB()
    {
        return b;
    }

    public void establecarC(double numC)
    {
        c = numC;
    }

    public double obtenerC()
    {
        return c;
    }

    public double discriminante()
    {
        
        double expresion;

        expresion = Math.pow(obtenerB(), 2) - 4*obtenerA()*obtenerC();

        return expresion;
    }

    public double raicesEcuacion()
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
    }
}
