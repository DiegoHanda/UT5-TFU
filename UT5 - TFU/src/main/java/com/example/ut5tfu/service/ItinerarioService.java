package com.example.ut5tfu.service;

import com.example.ut5tfu.model.Itinerario;
import java.util.List;
import java.util.Optional;

public interface ItinerarioService {

    public void crearItinerario(Itinerario itinerario);
    public void actualizarItinerario(Integer id, Itinerario itinerario);
    public void eliminarItinerario(Integer id);

    public List<Itinerario> obtenerTodos();
    public Optional<Itinerario> obtenerPorId(Integer id);
}


