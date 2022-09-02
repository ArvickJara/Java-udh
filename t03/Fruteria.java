package t03;
class Fruteria{

    String frut="platano";
    double prec=0.2;
    int canti=5;
    double pt;

    public String mostrarfrut(){
       return frut;
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