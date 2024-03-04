package GestionEventosDeportivos.classes.impl;

import java.util.ArrayList;

public class Equipo implements Comparable<Equipo> {
    //Declaramos las variables
    private String nombre;
    private ArrayList<Participante> jugadores;
    private int puntos = 0;

//-----------------------------------------------------------
//                  Constructor
//-----------------------------------------------------------

    public Equipo(String nombre, int puntos) {
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();
        this.puntos = puntos;

    }

    //-----------------------------------------------------------
//                      Métodos
//-----------------------------------------------------------
    public boolean anadirJugador(Participante jugador) {
        if (!jugadores.contains(jugador)) {
            jugadores.add(jugador);
            return true;
        }
        return false;
    }

    public boolean eliminarJugador(Participante jugador) {
        return jugadores.remove(jugador);
    }


    @Override
    public String toString() {
        String cadena = "";

        cadena += "Nombre: " + this.nombre + ".";
        cadena += " Goles: " + this.puntos + ".";

        return cadena;

    }

    public boolean equiposIguales(Equipo e) {
        if (getNombre().equals(e.nombre)) {

            return true;
        } else {
            return false;
        }
    }


    @Override
    public int compareTo(Equipo a) {
        if (this.puntos == a.puntos) {
            return 0;
        } else if (this.puntos > a.puntos) {
            return 1;
        } else {
            return -1;
        }
    }

    //-----------------------------------------------------------
//                  Getter & Setters
//-----------------------------------------------------------

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Participante> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Participante> jugadores) {
        this.jugadores = jugadores;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }


}
