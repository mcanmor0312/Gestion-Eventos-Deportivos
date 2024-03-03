package GestionEventosDeportivos.classes.impl;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Carrera extends EventoDeportivo{
    private double distancia;

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        if (distancia>0) {
            this.distancia = distancia;
        }
    }

    public Carrera(String nombre, LocalDateTime fecha, String lugar, double distancia) {
        super(nombre, fecha, lugar);
        setDistancia(distancia);
    }
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
        for (int i=0; i<participantes.size(); i++){
            if (participantes.get(i) instanceof ParticipanteCarrera) {
                ParticipanteCarrera part = (ParticipanteCarrera) participantes.get(i);
                if (part.getTiempo()==tiempo){
                    cabezaniu.add(part);
                }
            }
        }
        return null;
    }
}
