package GestionEventosDeportivos.classes.impl;

import GestionEventosDeportivos.classes.api.Ganador;

import java.time.LocalDateTime;
import java.util.ArrayList;

public abstract class EventoDeportivo implements Ganador {

    protected String nombre;
    protected LocalDateTime fecha;
    protected String lugar;
    protected ArrayList<Participante> participantes;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public ArrayList<Participante> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(ArrayList<Participante> participantes) {
        this.participantes = participantes;
    }

    public EventoDeportivo(String nombre, LocalDateTime fecha, String lugar) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.lugar = lugar;

    }

    public boolean inscribirParticipante(Participante participante) {
        for (int i =   0; i < participantes.size(); i++) {
            Participante p = participantes.get(i);
            if (p.getNombre().equalsIgnoreCase(participante.getNombre())) {
                System.out.println("El participante " + participante.getNombre() + " ya está inscrito en el evento.");
                return false;
            }
        }
        participantes.add(participante);
        System.out.println("El participante " + participante.getNombre() + " ha sido inscrito con éxito.");
        return true;
    }

    @Override
    public abstract Participante obtenerGanador();
}











