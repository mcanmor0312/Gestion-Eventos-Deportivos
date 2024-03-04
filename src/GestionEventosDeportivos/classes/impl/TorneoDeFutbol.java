package GestionEventosDeportivos.classes.impl;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class TorneoDeFutbol extends EventoDeportivo {

    //Declaramos el arraylist de los equipos
    private ArrayList<Equipo> equipos;

    //Hacemos el constructor que hereda de eventodeportivo
    public TorneoDeFutbol(String nombre, LocalDateTime fecha, String lugar) {
        super(nombre, fecha, lugar);
        this.equipos = new ArrayList<>();
    }
    //getters y setters
    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }

    //Obtenemos el equipo ganador a traves de los puntos del equipo
    @Override
    public ArrayList<Participante> obtenerGanador() {
        ArrayList<Participante> cabezaniu = new ArrayList<>();
        int puntosMaximos = 0;
        Equipo ganador = null;

        // Buscar el equipo con los puntos más altos utilizando un bucle for tradicional
        for (int i = 0; i < equipos.size(); i++) {
            Equipo equipo = equipos.get(i);
            if (equipo.getPuntos() > puntosMaximos) {
                puntosMaximos = equipo.getPuntos();
                ganador = equipo;
            }
        }

        // Verificar si se encontró un ganador
        if (ganador != null) {
            // Añadir todos los jugadores del equipo ganador a la lista de ganadores
            ArrayList<Participante> jugadoresGanador = ganador.getJugadores();
            if (!jugadoresGanador.isEmpty()) {
                cabezaniu.addAll(jugadoresGanador);
            }
        }

        return cabezaniu;
    }

    //Para meter un equipo en el torneo el equipo no puede estar ya inscrito
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

    //Creamos el toString y damos la informacion necesaria
    @Override
    public String toString() {
        String cadena = "";

        cadena += "Nombre del torneo: " + this.nombre + ".\n";
        cadena += "Fecha: " + this.fecha + ".\n";
        cadena += "Lugar: " + this.lugar + ".\n";
        cadena += "Equipos participantes:\n";
        for (int i = 0; i < equipos.size(); i++) {
            cadena += equipos.get(i).toString() + "\n";
        }

        return cadena;
    }
}
