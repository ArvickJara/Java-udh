package Matriz;

public class Matriz {

    int filas;
    int columnas;

    public Matriz(int f, int c)
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
                matriz1[i][j] = (int) (Math.random()  * 9);
            }
        }
        return matriz1;
    }

    public void mostrarDatos()
    {

             for ( int i = 0; i < getFilas(); i++) {
            for (int j = 0; j < getColumnas(); j++){
                System.out.print("[ " + llenarMatriz1()[i][j] + " ]");
            }
            System.out.println("");
            }
    }
    
}
