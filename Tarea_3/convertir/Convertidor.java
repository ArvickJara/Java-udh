package convertir;

public class Convertidor {

    
    double celsius;


    public Convertidor(double gradosCelsius)
    {
        celsius = gradosCelsius;
    }

    public void setCelsius(double gradosCelsius)
    {
        celsius=gradosCelsius;
    }

    public double getCelsius()
    {
        return celsius;
    }

    public double conversionCelsiusFarenheit()
    {

     double farenheit=(getCelsius()*1.8)+32;

     return farenheit;
    }

    public double conversionCelsiusKelvin(){

        double kelvin=getCelsius()+273;

        return kelvin;
    }
    public double conversionCelsiusRankine()
    {

        double rankine=(1.8*getCelsius())+492;

        return rankine;
    }

    public void mostrarCombercion()
    {
        System.out.println(getCelsius() + " en los diferentes sistemas de medición es: ");
        System.out.println("La conversion de C a F es:"+conversionCelsiusFarenheit());
        System.out.println("La conversion de C a K es:"+conversionCelsiusKelvin());
        System.out.println("La conversion de C a R es:"+conversionCelsiusRankine());
    }

}
