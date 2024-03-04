package GestionEventosDeportivos.classes.impl;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Carrera extends EventoDeportivo{
    //Declaramos las variables
    private double distancia;

    //Declaramos getters y setters
    public double getDistancia() {
        return distancia;
    }

    //Se setea la distancia si se puede
    public void setDistancia(double distancia) {
        if (distancia>0) {
            this.distancia = distancia;
        }
    }

    //Creamos el constructor y llamamos al setter anterior
    public Carrera(String nombre, LocalDateTime fecha, String lugar, double distancia) {
        super(nombre, fecha, lugar);
        setDistancia(distancia);
    }
    //Creamos el metodo para obtener ganador a traves del tiempo del corredor
    @Override
    public ArrayList<Participante> obtenerGanador() {
        ArrayList<Participante> cabezaniu = new ArrayList<>();
        double tiempo = 10000000;
        for (int i = 0; i < participantes.size(); i++) {

            // ¿Oye, eres un objeto de tipo ParticipanteCarrera?
            if (participantes.get(i) instanceof ParticipanteCarrera) {
                ParticipanteCarrera part = (ParticipanteCarrera) participantes.get(i);
                if (part.getTiempo()<tiempo){
                    tiempo=part.getTiempo();
                }

                // Si part tiene un tiempo menor al tiempo del ganador, entonces, el ganador es part, lo añades a la posicion 0 del arrayList

            }
        }
        //Esto es para hacer el arraylist final y meter en el los ganadores o el ganador
        for (int i=0; i<participantes.size(); i++){
            if (participantes.get(i) instanceof ParticipanteCarrera) {
                ParticipanteCarrera part = (ParticipanteCarrera) participantes.get(i);
                if (part.getTiempo()==tiempo){
                    cabezaniu.add(part);
                }
            }
        }
        return cabezaniu;
    }
}
