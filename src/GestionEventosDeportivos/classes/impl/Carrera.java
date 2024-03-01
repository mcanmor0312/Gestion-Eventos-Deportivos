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

    public Carrera(String nombre, LocalDateTime fecha, String lugar, ArrayList<Participante> participantes, double distancia) {
        super(nombre, fecha, lugar, participantes);
        setDistancia(distancia);
    }
    @Override
    public ArrayList<Participante> obtenerGanador() {
        ArrayList<Participante> cabezaniu=new ArrayList<>();
        double tiempo=10000000;
        for (int i=0; i<participantes.size();i++){

            // ¿Oye, eres un objeto de tipo ParticipanteCarrera?
            if (participantes.get(i) instanceof ParticipanteCarrera){
                ParticipanteCarrera part = (ParticipanteCarrera) participantes.get(i);

                // Si part tiene un tiempo menor al tiempo del ganador, entonces, el ganador es part, lo añades a la posicion 0 del arrayList

            }
        }



        /* // Ordenar por tiempo
        Collections.sort(corredores, new Comparator<Corredor>() {
            @Override
            public int compare(Corredor c1, Corredor c2) {
                return Integer.compare(c1.getTiempo(), c2.getTiempo());
            }
        });

         */
    }
}
