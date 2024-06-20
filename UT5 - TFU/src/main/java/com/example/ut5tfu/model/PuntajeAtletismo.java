package com.example.ut5tfu.model;

import com.example.ut5tfu.model.interfaces.IPuntaje;

public class PuntajeAtletismo implements IPuntaje {

    private Integer id;
    private Integer puntajeTotal;
    private Deportista deportista;
    private Integer TiempoTotal;
    private Integer DistanciaTotal;
    private Integer Velocidad;
    private Integer ReaccionDeSalida;

    public PuntajeAtletismo(Integer id) {
        this.id = id;
        this.puntajeTotal = 0;
        this.TiempoTotal = 0;
        this.DistanciaTotal = 0;
        this.Velocidad = 0;
        this.ReaccionDeSalida = 0;
    }

    public Integer getId() {
        return this.id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTiempoTotal() {
        return this.TiempoTotal;
    }

    public Integer getDistanciaTotal() {
        return this.DistanciaTotal;
    }

    public Integer getVelocidad() {
        return this.Velocidad;
    }

    public Integer getReaccionDeSalida() {
        return this.ReaccionDeSalida;
    }
    public void setTiempoTotal(Integer tiempoTotal) {
        this.TiempoTotal = tiempoTotal;
    }

    public void setDistanciaTotal(Integer distanciaTotal) {
        this.DistanciaTotal = distanciaTotal;
    }

    public void setVelocidad(Integer velocidad) {
        this.Velocidad = velocidad;
    }

    public void setReaccionDeSalida(Integer reaccionDeSalida) {
        this.ReaccionDeSalida = reaccionDeSalida;
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

}
