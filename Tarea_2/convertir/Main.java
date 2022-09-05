package convertir;

public class Main {
    
    public static void main(String args []){

        Convertidor conversion=new Convertidor();

        conversion.establecerCelsius(65);

        System.out.println("La conversion de C a F es:"+conversion.ConversionCelsiusFarenheit());
        System.out.println("La conversion de C a K es:"+conversion.ConversionCelsiusKelvin());
        System.out.println("La conversion de C a R es:"+conversion.ConversionCelsiusRankine());

    }
}
