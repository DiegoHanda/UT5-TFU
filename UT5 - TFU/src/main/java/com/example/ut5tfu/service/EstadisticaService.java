package com.example.ut5tfu.service;

import com.example.ut5tfu.model.Estadistica;
import java.util.List;
import java.util.Optional;

public interface EstadisticaService {

        public void crearEstadistica(Estadistica estadistica);

        public void actualizarEstadistica(Integer id, Estadistica estadistica);

        public void eliminarEstadistica(Integer id);

        public List<Estadistica> obtenerTodos();

        public Optional<Estadistica> obtenerPorId(Integer id);
}
