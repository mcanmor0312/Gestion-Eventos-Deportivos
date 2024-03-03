package GestionEventosDeportivos.classes.impl;

import java.util.ArrayList;

public class Equipo implements Comparable<Equipo> {
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
    public boolean anadirJugador(Participante j) {
        for (int i = 0; i < jugadores.size(); i++) {
            if (getJugadores().get(i) != null) {
                jugadores.add(j);
                return true;

            } else {
                return false;
            }
        }
        return false;

    }


    public boolean eliminarJugador(Participante j) {
        for (int i = 0; i < jugadores.size(); i++) {
            if (getJugadores().get(i).equals(j)) {
                jugadores.remove(i);
                return true;

            } else {
                return false;
            }
        }
        return false;

    }

    @Override
    public String toString() {
        String cadena = "";

        cadena += "Nombre: " + this.nombre + ".";
        cadena += "Goles: " + this.puntos + ".";

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
