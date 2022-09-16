package CambioDeBase;

public class ConversionNumeral {

    int numero;

    int base ;

    public ConversionNumeral (int num, int bas)
    {
        
        numero = num;
        base = bas;
    }

    public void setNumero(int num)
    {
      numero = num;
    }

    public int getNumero()
    {
        return numero;
    }

    public void setBase(int bas)
    {
        base= bas;
    }

    public int getBase()
    {
        return base;
    }

    public String convertir()
    {
        String numComver = "";
        int temporal = getNumero();
        int residuo;

        while (temporal > 0)
        {
            residuo = temporal % getBase();
            temporal = temporal/getBase();
            numComver = residuo + numComver;
        }

        return numComver;
    }

    public void mostrarDatos()
    {
        System.out.println("La comversión de " + getNumero() + " a base " + getBase() + " es: ");
        System.out.println(convertir());
    }

}