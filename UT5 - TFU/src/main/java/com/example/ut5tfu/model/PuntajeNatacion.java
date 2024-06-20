package com.example.ut5tfu.model;

import com.example.ut5tfu.model.interfaces.IPuntaje;

public class PuntajeNatacion implements IPuntaje {

    private Integer id;
    private Integer puntajeTotal;
    private Deportista deportista;
    private Integer TiempoTotal;
    private Integer ReaccionDeSalida;
    private Integer VelocidadMedia;
    private Integer TiempoVuelta;
    private Integer TecnicaDeNado;

    public PuntajeNatacion(Integer id) {
        this.id = id;
        this.puntajeTotal = 0;
        this.TiempoTotal = 0;
        this.ReaccionDeSalida = 0;
        this.VelocidadMedia = 0;
        this.TiempoVuelta = 0;
        this.TecnicaDeNado = 0;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public Deportista getDeportista() {
        return deportista;
    }

    @Override
    public void setDeportista(Deportista deportista) {
        this.deportista = deportista;
    }

    @Override
    public Integer getPuntajeTotal() {
        return puntajeTotal;
    }

    @Override
    public void setPuntajeTotal(Integer puntajeTotal) {
        this.puntajeTotal = puntajeTotal;
    }

    public Integer getTiempoTotal() {
        return TiempoTotal;
    }

    public void setTiempoTotal(Integer tiempoTotal) {
        this.TiempoTotal = tiempoTotal;
    }

    public Integer getReaccionDeSalida() {
        return ReaccionDeSalida;
    }

    public void setReaccionDeSalida(Integer reaccionDeSalida) {
        this.ReaccionDeSalida = reaccionDeSalida;
    }

    public Integer getVelocidadMedia() {
        return VelocidadMedia;
    }

    public void setVelocidadMedia(Integer velocidadMedia) {
        this.VelocidadMedia = velocidadMedia;
    }

    public Integer getTiempoVuelta() {
        return TiempoVuelta;
    }

    public void setTiempoVuelta(Integer tiempoVuelta) {
        this.TiempoVuelta = tiempoVuelta;
    }

    public Integer getTecnicaDeNado() {
        return TecnicaDeNado;
    }

    public void setTecnicaDeNado(Integer tecnicaDeNado) {
        this.TecnicaDeNado = tecnicaDeNado;
    }
}

