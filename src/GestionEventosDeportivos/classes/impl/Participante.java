package GestionEventosDeportivos.classes.impl;

import GestionEventosDeportivos.classes.Utils.GestionEventosDeportivosUtils;

public class Participante {
    //Declaramos las variables
    protected String dni;
    protected String nombre;
    protected String apellidos;
    protected int edad;

    //Declaramos getter y setters
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        if (GestionEventosDeportivosUtils.checkDniFormat(dni)){
            this.dni=dni;
        }
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
        if (edad>0) {
            this.edad = edad;
        }
    }
    //Creamos el constructor y llamamos a los setters anteriores
    public Participante(String dni, String apellidos, String nombre, int edad){
        setDni(dni);
        setEdad(edad);
        this.nombre=nombre;
        this.apellidos=apellidos;


    }
    //Creamos el toString
    public String toString(){
        String cadenaAMostrar="";

        cadenaAMostrar+="Participante llamado: "+this.nombre+" "+this.apellidos+"\n";
        cadenaAMostrar+="DNI: "+this.dni+"\n";
        cadenaAMostrar+="Edad: "+this.edad;

        return cadenaAMostrar;
    }
    //Creamos el equals
    public boolean equals(Object art){
        if (art instanceof Participante) {
            Participante  participante= (Participante) art;
            if (this.dni.equalsIgnoreCase(participante.dni)){
                return true;
            }else {
                return false;
            }
        }else {
            return false;
        }
    }
}
