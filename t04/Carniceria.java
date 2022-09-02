package t04;
class Carniceria{

    String carne="res";
    double prec=12;
    int canti=2;
    double pt;

    public String mostrartipocarne(){
       return carne;
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