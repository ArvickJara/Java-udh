package t29;

public class Convercion {
    int soles = 30;
   
    double TipoDeCambio = 0.26;
        
    double resultado = 0;
   
    public double convertirMoneda(){
        resultado = soles*TipoDeCambio;
   
        return resultado;
   
        }

}
