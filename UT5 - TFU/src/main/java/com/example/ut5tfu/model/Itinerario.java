package com.example.ut5tfu.model;

import java.util.List;

public class Itinerario {

    public String id;

    public List<Encuentro> encuentros;

    public Itinerario(String id, List<Encuentro> encuentros) {
        this.id = id;
        this.encuentros = encuentros;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Encuentro> getEncuentros() {
        return this.encuentros;
    }

    public void setEncuentros(List<Encuentro> encuentros) {
        this.encuentros = encuentros;
    }

    public void agregarEncuentro(Encuentro encuentro) {
        this.encuentros.add(encuentro);
    }

    public void eliminarEncuentro(Encuentro encuentro) {
        this.encuentros.remove(encuentro);
    }

    public Encuentro obtenerEncuentroPorId(String id) {
        for (Encuentro encuentro : this.encuentros) {
            if (encuentro.getId().equals(id)) {
                return encuentro;
            }
        }
        return null;
    }
}
