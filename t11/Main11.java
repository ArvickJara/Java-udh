package t11;

public class Main11{
    public static void main(String args[])
    {
       Tv tv = new Tv();
        System.out.println("\ntv's : \n");
        System.out.println("estos son los tv ingresados:\n");
        System.out.println("la marca es: "+tv.mostrarmarca());
        System.out.println("pulgadas: "+tv.mostrarpulgadas());
        System.out.println(" es smart?: "+tv.mostrarsmart());
    }
}
   