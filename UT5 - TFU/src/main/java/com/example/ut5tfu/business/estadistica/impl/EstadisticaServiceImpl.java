package com.example.ut5tfu.business.estadistica.impl;

import com.example.ut5tfu.business.estadistica.EstadisticaService;
import com.example.ut5tfu.model.Itinerario;
import com.example.ut5tfu.persistence.EstadisticaRepository;
import com.example.ut5tfu.model.Estadistica;
import com.example.ut5tfu.web.exception.NotFoundException;

import java.util.List;
import java.util.Optional;

public class EstadisticaServiceImpl implements EstadisticaService {

    private final EstadisticaRepository estadisticaRepository = EstadisticaRepository.getInstance();

    public void crearEstadistica(Estadistica estadistica) {
        estadisticaRepository.save(estadistica);
    }

    public void actualizarEstadistica(Integer id, Estadistica estadistica) {
        estadistica.setId(id);
        estadisticaRepository.save(estadistica);
    }

    public void eliminarEstadistica(Integer id) {
        estadisticaRepository.getById(id)
                .orElseThrow(() -> new NotFoundException("ESTADISTICA_NO_ENCONTRADA"));
        estadisticaRepository.delete(id);
    }

    public List<Estadistica> obtenerTodos() {
        return estadisticaRepository.getAll();
    }

    public Optional<Estadistica> obtenerPorId(Integer id) {
        return estadisticaRepository.getById(id);
    }
}
