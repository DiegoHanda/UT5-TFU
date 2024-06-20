package com.example.ut5tfu.utils;

import com.example.ut5tfu.model.Deportista;
import com.example.ut5tfu.model.Encuentro;

import java.util.HashMap;

public interface IMediator {

    public void agregarPuntuacion(HashMap<String, Integer> caracteristicas, Encuentro encuentro, Deportista deportista);
    void notifyAll(String event);
}
