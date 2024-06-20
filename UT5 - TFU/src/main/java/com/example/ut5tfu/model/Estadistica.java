package com.example.ut5tfu.model;

import java.util.ArrayList;
import java.util.List;
public class Estadistica {

    public Integer Id;
    public Integer Puntos;
    public Graphic Grafica;
    public List<IPuntaje> Puntajes;

    public Estadistica(Integer puntos, Graphic grafica){
        this.Puntos = puntos;
        this.Grafica = grafica;
        this.Puntajes = new ArrayList<IPuntaje>();
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        this.Id = id;
    }

    public Integer getPuntos() {
        return Puntos;
    }

    public void setPuntos(Integer puntos) {
        this.Puntos = puntos;
    }

    
}