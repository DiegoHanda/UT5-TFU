package com.example.ut5tfu.utils;

import com.example.ut5tfu.model.Deportista;

import java.util.HashMap;

public interface IPuntajeFactory {
    public void createPuntaje(String eventType, HashMap<String, Integer> caracteristicas, Deportista deportista);
}