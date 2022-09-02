package t18;

public class Paciente {
    
    public String nombre ="Juan";

    public String apellidos = "Gonzales";

    public int edad = 55;

    public String enfermedad = "Fractura de Hueso";

    public String estado = "Estable";


    public String mostrarNombre(){
        return nombre;
    }
    public String mostrarApellido(){
        return apellidos;
    }
    public int mostrarEdad(){
        return edad;
    }
    public String mostrarEnfermedad(){
        return enfermedad;
    }
    public String mostrarEstado(){
        return estado;
    }
}
