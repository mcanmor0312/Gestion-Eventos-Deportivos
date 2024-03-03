package GestionEventosDeportivos;

import GestionEventosDeportivos.classes.impl.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Instanciar eventos deportivos
        Carrera carrera = new Carrera("Carrera de 10K", LocalDateTime.now(), "Parque Central", 12);
        TorneoDeFutbol torneo = new TorneoDeFutbol("Torneo de Fútbol", LocalDateTime.now(), "Estadio Municipal");

        // Añadir participantes a las carreras
        ParticipanteCarrera participante1 = new ParticipanteCarrera("12345678A", "Juan", "Pérez", 30, 3600.0);
        ParticipanteCarrera participante2 = new ParticipanteCarrera("23456789B", "Ana", "Gómez", 25, 3700.0);
        carrera.inscribirParticipante(participante1);
        System.out.println(" ");
        carrera.inscribirParticipante(participante2);
        System.out.println(" ");
        // Inscribir equipos en torneos de fútbol
        Equipo equipo1 = new Equipo("Equipo Rojo", 1);
        Equipo equipo2 = new Equipo("Equipo Azul", 4);
        torneo.inscribirEquipo(equipo1);
        System.out.println(" ");
        torneo.inscribirEquipo(equipo2);
        System.out.println(" ");

        // Añadir y eliminar jugadores de equipos
        Participante jugador1 = new Participante("12345678A", "Juan", "Pérez", 30);
        Participante jugador2 = new Participante("23456789B", "Ana", "Gómez", 25);
        if (equipo1.anadirJugador(jugador1)) {
            System.out.println("Jugador añadido correctamente al equipo 1.");
        } else {
            System.out.println("No se pudo añadir el jugador al equipo 1.");
        }
        System.out.println(" ");
        if (equipo2.anadirJugador(jugador2)) {
            System.out.println("Jugador añadido correctamente al equipo 2.");
        } else {
            System.out.println("No se pudo añadir el jugador al equipo 2.");
        }
        System.out.println(" ");
        if (equipo1.eliminarJugador(jugador1)) {
            System.out.println("Jugador eliminado correctamente del equipo 1.");
        } else {
            System.out.println("No se pudo eliminar el jugador del equipo 1.");
        }
        System.out.println(" ");

        // Mostrar información de eventos, participantes, equipos y jugadores
        System.out.println("Informacion de los participantes de la carrera : ");
        for (int i=0; i<carrera.getParticipantes().size(); i++){
            System.out.println(carrera.getParticipantes().get(i).toString());
        }
        System.out.println(" ");
        System.out.println("Informacion del torneo: " + torneo.toString());
        System.out.println(" ");
        System.out.println("Información del equipo 1: " + equipo1.toString());
        System.out.println(" ");
        System.out.println("Información del equipo 2: " + equipo2.toString());
        System.out.println(" ");

        // Determinar y mostrar el ganador de cada evento
        System.out.println("Ganador de la carrera: " + carrera.obtenerGanador());
        System.out.println(" ");
        System.out.println("Ganadores del torneo: " + torneo.obtenerGanador());
        System.out.println(" ");

        // Mostrar la lista de equipos de mayor a menor puntuación
        ArrayList<Equipo> equipos = torneo.getEquipos();
        Collections.sort(equipos);
        System.out.println("Equipos ordenados por puntuación:");
        for (int i = equipos.size()-1; i >= 0; i--) {
            System.out.println(equipos.get(i).toString());
        }
    }
}

