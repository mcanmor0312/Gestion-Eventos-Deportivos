package GestionEventosDeportivos.classes.impl;

public class ParticipanteCarrera extends Participante{
    //declaramos las variables
    double tiempo;

    //Declaramos getters y setters
    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        if (tiempo>0) {
            this.tiempo = tiempo;
        }
    }

    public ParticipanteCarrera(String dni, String apellidos, String nombre, int edad, Double tiempo) {
        super(dni, apellidos, nombre, edad);
        setTiempo(tiempo);
    }
    //Creamos el toString
    @Override
    public String toString(){
        String cadenaAMostrar="";

        cadenaAMostrar+="Participante llamado: "+this.nombre+" "+this.apellidos+"\n";
        cadenaAMostrar+="DNI: "+this.dni+"\n";
        cadenaAMostrar+="Edad: " +this.edad + "\n";
        cadenaAMostrar+="El tiempo del participante es de "+this.tiempo +" segundos";

        return cadenaAMostrar;
    }
}
