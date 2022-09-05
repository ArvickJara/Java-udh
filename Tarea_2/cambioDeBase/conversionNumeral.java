package cambioDeBase;

public class conversionNumeral {

    int n;

    int base ;

    int inverso;

    public void establcerNumero(int numero){
      n= numero;
    }
    public int obtenerNumero(){
        return n;
    }
    public void establcerBase(int Base){
        base= Base;
      }
      public int obtenerBase(){
          return base;
      }
    public int convertir()
    {
        while (n > 0) {

            inverso = 10*inverso + n%base;

            n = n/base;
        }

        return inverso;
    }

    public int invertir()
    {
        while (inverso> 0) {    
        n=10*n+inverso%10;
        inverso=inverso/10;
        }
     return n;
    }

}