package t31;

public class Main {
    
        public static void main(String args[])
        {
            Amigo amigo = new Amigo();
    
            System.out.println("Su nombre es: " + amigo.mostrarNombre() );
            System.out.println("Reside en " + amigo.mostrarDireccion());
            System.out.println("Tiene " + amigo.mostrarEdad() + " años.");
        }
        
    
}
