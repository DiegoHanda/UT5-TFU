package com.example.ut5tfu.model;

import com.example.ut5tfu.utils.Pais;

import java.util.List;

public class Equipo {

    private String id;
    private String nombre;
    private Pais pais;
    private String deporte;
    private List<Deportista> integrantes;

    public Equipo(String id, String nombre, Pais pais, String deporte, List<Deportista> integrantes) {
        this.id = id;
        this.nombre = nombre;
        this.pais = pais;
        this.deporte = deporte;
        this.integrantes = integrantes;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPais() {
        return this.pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public String getDeporte() {
        return this.deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public List<Deportista> getIntegrantes() {
        return this.integrantes;
    }

    public void setIntegrantes(List<Deportista> integrantes) {
        this.integrantes = integrantes;
    }
}
