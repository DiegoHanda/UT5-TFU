package com.example.ut5tfu.model;

public class PuntajeKitesurf implements IPuntaje {
    private Integer id;
    private Integer puntajeTotal;
    private Deportista deportista;
    private Integer AlturaAmplitud;
    private Integer Tecnica;
    private Integer Dificultad;
    private Integer Variedad;
    private Integer ImpresionGeneral;

    public PuntajeKitesurf(Integer id) {
        this.id = id;
        this.puntajeTotal = 0;
        this.AlturaAmplitud = 0;
        this.Tecnica = 0;
        this.Dificultad = 0;
        this.Variedad = 0;
        this.ImpresionGeneral = 0;
    }

    public Integer getId() {
        return this.id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public void setAlturaAmplitud(Integer alturaAmplitud) {
        this.AlturaAmplitud = alturaAmplitud;
    }

    public void setTecnica(Integer tecnica) {
        this.Tecnica = tecnica;
    }

    public void setDificultad(Integer dificultad) {
        this.Dificultad = dificultad;
    }

    public void setVariedad(Integer variedad) {
        this.Variedad = variedad;
    }

    public void setImpresionGeneral(Integer impresionGeneral) {
        this.ImpresionGeneral = impresionGeneral;
    }

    public Integer getPuntajeTotal() {
        return this.puntajeTotal;
    }

    public void setPuntajeTotal(Integer puntajeTotal) {
        this.puntajeTotal = puntajeTotal;
    }

    public Deportista getDeportista() {
        return this.deportista;
    }

    public void setDeportista(Deportista deportista) {
        this.deportista = deportista;
    }

    public Integer getAlturaAmplitud() {
        return this.AlturaAmplitud;
    }

    public Integer getTecnica() {
        return this.Tecnica;
    }

    public Integer getDificultad() {
        return this.Dificultad;
    }

    public Integer getVariedad() {
        return this.Variedad;
    }

    public Integer getImpresionGeneral() {
        return this.ImpresionGeneral;
    }
}
