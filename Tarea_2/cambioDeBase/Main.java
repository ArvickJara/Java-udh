package cambioDeBase;

public class Main {

    public static void main(String args[])
    {
        conversionNumeral bases = new conversionNumeral();

        bases.establcerNumero(34);
        bases.establcerBase(2);

        /*System.out.println("La conversion es:"+bases.convertir());
        System.out.println("La inversion es:"+bases.invertir());*/

        System.out.println("La comversión de " + bases.obtenerNumero() + " a base " + bases.obtenerBase() + " es: ");

        bases.convertir();

        System.out.println(bases.invertir());



    }
}