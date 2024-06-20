package com.example.ut5tfu.service;

import com.example.ut5tfu.model.Encuentro;
import com.example.ut5tfu.model.Deportista;
import com.example.ut5tfu.model.interfaces.IPuntaje;
import java.util.HashMap;
import java.util.List;

public interface PuntajeService {
    IPuntaje ObtenerPorId(Integer id);

    public void crearPuntaje(HashMap<String, Integer> caracteristicas, Encuentro encuentro, Deportista deportista);
    public void actualizarPuntaje(int id, IPuntaje caracteristicas);
    public void eliminarPuntaje(int id);
    public List<IPuntaje> obtenerTodos();
    public IPuntaje obtenerPorId(Integer id);
}