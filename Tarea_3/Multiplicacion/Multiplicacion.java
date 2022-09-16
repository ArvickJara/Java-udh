package Multiplicacion;

public class Multiplicacion {
    
    int filas1;
    int columnas1;
    int filas2;
    int columnas2;

    public Multiplicacion(int f1, int c1, int f2, int c2)
    {
        filas1 = f1;
        columnas1 = c1;
        filas2 = f2;
        columnas2 = c2;
    }

    public void setFilas1(int f1)
    {
        filas1 = f1;
    }

    public int getFilas1()
    {
        return filas1;
    }

    public void setColumnas1(int c1)
    {
        columnas1 = c1;
    }

    public int getColumnas1()
    {
        return columnas1;
    }
    public void setFilas2(int f2)
    {
        filas2 = f2;
    }

    public int getFilas2()
    {
        return filas2;
    }

    public void setColumnas2(int c2)
    {
        columnas2 = c2;
    }

    public int getColumnas2()
    {
        return columnas2;
    }

    public int[][] llenarMatriz1()
    {
        int[][] matriz1 = new int[getFilas1()][getColumnas1()];
        for (int i = 0; i < getFilas1(); i++) {
            for (int j = 0; j < getColumnas1(); j ++) {
                matriz1[i][j] = (i *getFilas1()) + (j + 1);
            }
        }
        return matriz1;
    }

    public int[][] llenarMatriz2()
    {
        int[][] matriz2 = new int[getFilas2()][getColumnas2()];
        
        for (int i = 0; i < getFilas2(); i++) {
            for (int j = 0; j < getColumnas2(); j ++) {
                matriz2[i][j] = (i *getFilas2()) + (j + 1);
            }
        }
        return matriz2;
    }

    public int[][] multMatriz()
    {
        int[][] matriz3 = new int[getFilas1()][getColumnas2()];

        for (int a = 0; a < getColumnas2(); a++) {
            // Dentro recorremos las filas de la primera (A)
            for (int i = 0; i < getFilas1(); i++) {
                int suma = 0;
                // Y cada columna de la primera (A)
                for (int j = 0; j < getColumnas1(); j++) {
                    
                    suma += llenarMatriz1()[i][j] * llenarMatriz2()[j][a];
                }
                
                matriz3[i][a] = suma;
            }
        }

        return matriz3;
    }

    public void mostrandoProducto(){
        for(int i = 0; i < getFilas1(); i++) {
            for(int j = 0; j < getColumnas1(); j++) {
                System.out.print("Valor en la posicion ["+i+"]["+j+"]: " +multMatriz()[i][j] + " \n");
            }
        }
    }

   
}
