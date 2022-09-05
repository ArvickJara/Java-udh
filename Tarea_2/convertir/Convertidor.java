package convertir;

public class Convertidor {
    
    double celsius;
    public void establecerCelsius(double gradosCelsius){
        celsius=gradosCelsius;
    }
    public double obtenerCelsius(){
        return celsius;
    }
    public double ConversionCelsiusFarenheit(){
     double farenheit=(obtenerCelsius()*1.8)+32;
     return farenheit;
    }
    public double ConversionCelsiusKelvin(){
        double kelvin=obtenerCelsius()+273;
        return kelvin;
       }
    public double ConversionCelsiusRankine(){
        double rankine=(1.8*obtenerCelsius())+492;
        return rankine;
       }

}
