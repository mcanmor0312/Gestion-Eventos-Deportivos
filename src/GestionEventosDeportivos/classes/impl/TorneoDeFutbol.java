package GestionEventosDeportivos.classes.impl;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class TorneoDeFutbol extends EventoDeportivo {

    private ArrayList<Equipo> equipos;

    public TorneoDeFutbol(String nombre, LocalDateTime fecha, String lugar) {
        super(nombre, fecha, lugar);
        this.equipos = new ArrayList<>();
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }

    @Override
    public ArrayList<Participante> obtenerGanador() {
        ArrayList<Participante> cabezaniu = new ArrayList<>();
        double puntos = 0;
        for (int i = 0; i < equipos.size(); i++) {

            // ¿Oye, eres un objeto de tipo ParticipanteCarrera?
            if (equipos.get(i).getPuntos()>puntos){
                puntos=equipos.get(i).getPuntos();
            }
        }
        for (int i=0; i<equipos.size(); i++){
            if (equipos.get(i).getPuntos()==puntos){
                cabezaniu.add(equipos.get(i).getJugadores().get(i));
            }
        }
        return cabezaniu;
    }

    public boolean inscribirEquipo(Equipo hombre) {
        boolean puigdemont = true;
        for (int i = 0; i < equipos.size(); i++) {
            if (equipos.get(i).getNombre().equalsIgnoreCase(hombre.getNombre())) {
                System.out.println("El equipo ya está inscrito en el evento.");
                puigdemont = false;
            }
        }
        if (puigdemont) {
            equipos.add(hombre);
            System.out.println("Se ha añadido correctamente al arraylist");

        }
        return puigdemont;
    }
}