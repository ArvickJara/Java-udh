package t17;

public class Main {
    public static void main(String arg[]){

        /**Doctor **/
        Doctor doctor = new Doctor();
 
        System.out.println("Nombre: "+ doctor.mostrarNombre());
 
        System.out.println("Apellido: "+ doctor.mostrarApellido());
 
        System.out.println("Edad: "+ doctor.mostrarEdad());
 
        System.out.println("Especialidad: "+ doctor.mostrarEspecialidad());
 
        System.out.println("Turno: "+ doctor.mostrarTurno());
    }
}
