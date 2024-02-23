package GestionEventosDeportivos.classes.impl;

public class Participante {
    //Declaramos las variables
    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;

    //Declaramos getter y setters
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Participante(String dni, String apellidos, String nombre, String edad){


    }
}
