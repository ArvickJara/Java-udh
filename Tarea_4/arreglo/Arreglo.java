package arreglo;

import java.util.Scanner;

public class Arreglo {

    int arreglo[];
    int elemento;
    int cont;
    int n;
    

    public int agregarArreglo()
    {
      Scanner scanner= new Scanner(System.in);
      System.out.print("Cantidad de numeros que tendrá el arreglo:");
      n = scanner.nextInt();
      
      return n;
    }

    public void ingresarArreglo()
    {

      arreglo = new int [agregarArreglo()];

        for(int i=0; i<agregarArreglo(); i++){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingresar valor al Arreglo:");
            
            arreglo[i] = scanner.nextInt();

        }
    }

    public void mostrarArreglo()
    {
        for(int i=0; i<agregarArreglo(); i++){

            System.out.println("Dato ["+ i +"] = " +arreglo[i]);
        }
    }

    public void buscarDato()
    {
      Scanner scanner= new Scanner(System.in);

      System.out.print("ingrese el dato Buscar:");

      int dato = scanner.nextInt();
      int bandera = 0;
      int captura;

      for(int i=0; i<agregarArreglo(); i++){
         if(arreglo[i]==dato){
            captura=i;
            bandera = bandera + 1;

            if(bandera==1){

                System.out.println("Dato Encontrado");
                System.out.print("ingrese el dato a Remplazar:");
                
                arreglo[captura] = scanner.nextInt();;
            } else{

                System.out.println("Dato NO encontrado");
            
                }
            }
        } 
    }

    public void arregloNuevo()
    {
        for(int i=0; i<agregarArreglo(); i++){

            System.out.println("Dato ["+ i +"]=" +arreglo[i]);

        }
        
    }  
    public void eliminarDato()
    {
        Scanner scanner= new Scanner(System.in);
        System.out.print("ingrese el dato a Eliminar:");
      
      int eliminar = scanner.nextInt();
      int bandera = 0;
      int captura=0;
      cont =0;

      for(int i=0; i<agregarArreglo(); i++){

         if(arreglo[i]==eliminar){
            captura=i;
            bandera = bandera+1;
        
            if(bandera==1){
                if( captura == (n-1)){
                    n=n-1;
                    cont=n;
                }
                else{

                    for(i=captura;i<n-1;i++){
                        arreglo[i]=arreglo[i+1];
                    }
                    n=n-1;
                    cont=n;

                }
            } else{

                System.out.println("Dato no Encontrado");

            }  
        }
    }   
}
public void arregloEliminado()
{
    for(int i=0; i<agregarArreglo(); i++){
        System.out.println("Dato ["+ i +"]=" +arreglo[i]);
    }
    
}
}
