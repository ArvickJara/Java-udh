package t05;
class Bodega{

    String producto="oreo";
    double prec=0.80;
    int canti=2;
    double pt;

    public String mostrarproducto(){
       return producto;
    }
    public double mostrarprec(){
       return prec;
    }
    public int mostrarcanti(){
       return canti;
    }
    public double mostrarpt(){
    pt=canti*prec;
    return pt;
    }
 

}