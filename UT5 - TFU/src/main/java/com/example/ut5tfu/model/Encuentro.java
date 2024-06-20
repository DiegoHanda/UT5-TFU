package com.example.ut5tfu.model;

import java.util.List;
import java.util.HashMap;

import com.example.ut5tfu.model.interfaces.IPuntaje;

public class Encuentro {

    private Integer id;
    private List<Equipo> equipos;
    private HashMap <Juez, IPuntaje> puntajes;
    private List<Juez> jueces;

    private String tipo;

    public Encuentro(Integer id, List<Equipo> equipos, List<Integer> puntajes, List<Juez> jueces) {
        this.id = id;
        this.equipos = equipos;
        this.puntajes = new HashMap<Juez, IPuntaje>();
        this.jueces = jueces;
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

    public HashMap <Juez, IPuntaje> getPuntajes() {
        return this.puntajes;
    }

    public void setPuntajes(HashMap <Juez, IPuntaje> puntajes) {
        this.puntajes = puntajes;
    }

    public List<Juez> getJueces() {
        return this.jueces;
    }

    public void setJueces(List<Juez> jueces) {
        this.jueces = jueces;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
