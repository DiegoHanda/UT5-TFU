package com.example.ut5tfu.model;

import java.util.List;

public class Encuentro {

    private Integer id;
    private List<Equipo> equipos;
    private List<Integer> puntajes;

    public Encuentro(Integer id, List<Equipo> equipos, List<Integer> puntajes) {
        this.id = id;
        this.equipos = equipos;
        this.puntajes = puntajes;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
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
