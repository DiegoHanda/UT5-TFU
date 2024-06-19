package com.example.ut5tfu.model;

import java.util.List;

public class Encuentro {

    private List<Equipo> equipos;
    private List<Integer> puntajes;

    public Encuentro(List<Equipo> equipos, List<Integer> puntajes) {
        this.equipos = equipos;
        this.puntajes = puntajes;
    }

    public List<Equipo> getEquipos() {
        return this.equipos;
    }

    public void setEquipos(List<Equipo> equipos) {
        this.equipos = equipos;
    }

    public List<Integer> getPuntajes() {
        return this.puntajes;
    }

    public void setPuntajes(List<Integer> puntajes) {
        this.puntajes = puntajes;
    }
}
