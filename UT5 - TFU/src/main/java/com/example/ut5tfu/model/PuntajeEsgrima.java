package com.example.ut5tfu.model;

import com.example.ut5tfu.model.interfaces.IPuntaje;

public class PuntajeEsgrima implements IPuntaje {

    private Integer id;
    private Integer puntajeTotal;
    private Deportista deportista;

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public Integer getPuntajeTotal() {
        return puntajeTotal;
    }

    @Override
    public void setPuntajeTotal(Integer puntajeTotal) {
        this.puntajeTotal = puntajeTotal;
    }

    public Deportista getDeportista() {
        return deportista;
    }

    public void setDeportista(Deportista deportista) {
        this.deportista = deportista;
    }
}
