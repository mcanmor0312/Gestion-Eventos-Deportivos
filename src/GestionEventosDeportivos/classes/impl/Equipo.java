package GestionEventosDeportivos.classes.impl;

import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private ArrayList<Participante> jugadores;
    private int puntos = 0;

//-----------------------------------------------------------
//                  Constructor
//-----------------------------------------------------------

    public Equipo(String nombre, ArrayList<Participante> jugadores) {
        this.nombre = nombre;
        this.jugadores = jugadores;

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


    public boolean eliminarJugador(Participante j){
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
