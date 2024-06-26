package com.example.ut5tfu.utils;

import com.example.ut5tfu.model.Deportista;
import com.example.ut5tfu.model.interfaces.IPuntaje;

import java.util.HashMap;

public interface PuntajeFactory {
    IPuntaje createPuntaje(String eventType, HashMap<String, Integer> caracteristicas, Deportista deportista);
}