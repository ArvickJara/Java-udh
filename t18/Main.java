package t18;

public class Main {
    public static void main(String arg[]){

        /**Paciente**/
        Paciente paciente = new Paciente();
 
        System.out.println("Nombre: "+ paciente.mostrarNombre());
 
        System.out.println("Apellido: "+ paciente.mostrarApellido());
 
        System.out.println("Edad: "+ paciente.mostrarEdad());
 
        System.out.println("Enfermedad: "+ paciente.mostrarEnfermedad());
 
        System.out.println("Estado: "+ paciente.mostrarEstado());
    }
}
