package transpuestaMatriz;

import java.util.Scanner;

public class Transpuesta {
    
    int matriz[][];

    int fila;

    int columna;

    int matrizT[][];

    public void setFila()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite el número de filas que tendra su matriz: ");
        fila = scanner.nextInt();
    }

    public int getFila()
    {
        return fila;
    }

    public void setColumnas()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite el númro de columnas que trndra su matriz: ");
        columna = scanner.nextInt();
    }

    public int getColumnas()
    {
        return columna;
    }

    public void setMatriz()
    {
        matriz = new int[getFila()][getColumnas()];
        Scanner scanner = new Scanner(System.in);
        

        for (int i=0; i<matriz.length; i++) {

            for (int j=0; j<matriz[0].length; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                
                matriz[i][j] =scanner.nextInt();
            }
        }
        System.out.println("\n");
    }

    public int[][] getMatriz()
    {
        return matriz;
    }

    public void transpocisionMatriz()
    {
        matrizT = new int[getColumnas()][getFila()];

        for (int i=0; i < matriz.length; i++) {
            for (int j=0; j < matriz[0].length; j++) {
              matrizT[j][i] = matriz[i][j];
            }
          }
    }
    
    public void mostrarMatrix()
    {

        System.out.println("La matriz A es : \n");

        for (int i=0; i<matriz.length; i++) {

            for (int j=0; j<matriz[0].length; j++) {

                System.out.print("[ " + matriz[i][j] + " ] ");
            }

            System.out.println();
        }
        System.out.println("\n");
    }

    public void mostrarTranpu()
    {
        System.out.println("La matriz transpuesta de A es: ");

        for (int i=0; i<matriz[0].length; i++) {

            for (int j=0; j<matrizT.length; j++) {

                System.out.print("[ " + matrizT[i][j] + " ] ");
            }
            System.out.println("");
            
        }
        System.out.println("\n");
    }
}

