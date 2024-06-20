package com.example.ut5tfu.model;

import com.example.ut5tfu.model.IPuntaje;
import com.example.ut5tfu.model.Deportista;

public class PuntajeSurf implements IPuntaje {
    private Integer id;
    private Integer puntajeTotal;
    private Deportista deportista;

    private Integer Ola;
    private Integer Maniobras;
    private Integer Variedad;
    private Integer PotenciaRadicalidad;
    private Integer Progresión;



    public PuntajeSurf(Integer id) {
        this.id = id;
        this.puntajeTotal = 0;
        this.Ola = 0;
        this.Maniobras = 0;
        this.Variedad = 0;
        this.PotenciaRadicalidad = 0;
        this.Progresión = 0;
    }

    public Integer getId() {
        return this.id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }
    public void setOla(Integer ola) {
        this.Ola = ola;
    }

    public void setManiobras(Integer maniobras) {
        this.Maniobras = maniobras;
    }

    public void setVariedad(Integer variedad) {
        this.Variedad = variedad;
    }

    public void setPotenciaRadicalidad(Integer potenciaRadicalidad) {
        this.PotenciaRadicalidad = potenciaRadicalidad;
    }

    public void setProgresión(Integer progresión) {
        this.Progresión = progresión;
    }

    public Integer getPuntajeTotal() {
        return this.puntajeTotal;
    }

    public void setPuntajeTotal(Integer puntajeTotal) {
        this.puntajeTotal = puntajeTotal;
    }

    public void setDeportista(Deportista deportista) {
        this.deportista = deportista;
    }

    public Deportista getDeportista() {
        return this.deportista;
    }
}