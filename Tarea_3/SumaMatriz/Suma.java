package SumaMatriz;

public class Suma {

    int filas;
    int columnas;

    public Suma(int f, int c)
    {
        filas = f;
        columnas = c;
    }

    public void setFilas(int f)
    {
        filas = f;
    }

    public int getFilas()
    {
        return filas;
    }

    public void setColumnas(int c)
    {
        columnas = c;
    }

    public int getColumnas()
    {
        return columnas;
    }

    public int[][] llenarMatriz1()
    {
        int[][] matriz1 = new int[getFilas()][getColumnas()];
        
        for (int i = 0; i < getFilas(); i++) {
            for (int j = 0; j < getColumnas(); j ++) {
                matriz1[i][j] = (i *getFilas()) + (j + 1);
            }
        }
        return matriz1;
    }

    public int[][] llenarMatriz2()
    {
        int[][] matriz2 = new int[getFilas()][getColumnas()];
        
        for (int i = 0; i < getFilas(); i++) {
            for (int j = 0; j < getColumnas(); j ++) {
                matriz2[i][j] = (i *getFilas()) + (j + 1);
            }
        }
        return matriz2;
    }

    private int[][] matrizResul()
    {
        int[][] matriz3 = new int[getFilas()][getColumnas()];
        
        for (int i = 0; i < getFilas(); i++) {
            for (int j = 0; j < getColumnas(); j++){
                matriz3[i][j] = llenarMatriz1()[i][j] + llenarMatriz2()[i][j]; 
            }
        }

        return matriz3;
    }

    public void mostrarDatos()
    {
        for (int i = 0; i < getFilas(); i++) {
            for (int j = 0; j < getColumnas(); j++){
                System.out.print("[ " + llenarMatriz1()[i][j] + " ]");
            }

            if (i == 1) {
                System.out.print("  +   ");
            } else{
                System.out.print("      ");
            }

            for (int j = 0; j < getColumnas(); j++){
                System.out.print("[ " + llenarMatriz2()[i][j] + " ]");
            }

            if (i == 1) {
                System.out.print("  =   ");
            } else{
                System.out.print("      ");
            }

            for (int j = 0; j < getColumnas(); j++){
                System.out.print("[ " + matrizResul()[i][j] + " ]");
            }
            System.out.println("");
        }

 } 

}
