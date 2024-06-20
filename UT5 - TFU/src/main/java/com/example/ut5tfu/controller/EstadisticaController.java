package com.example.ut5tfu.controller;

import com.example.ut5tfu.service.implementation.EstadisticaServiceImpl;
import com.example.ut5tfu.model.Estadistica;
import org.springframework.web.bind.annotation.*;
import java.util.List;

public class EstadisticaController {

    private final EstadisticaServiceImpl estadisticaService;

    public EstadisticaController(EstadisticaServiceImpl estadisticaService) {
        this.estadisticaService = estadisticaService;
    }

    @GetMapping
    public List<Estadistica> obtenerTodos() {
        return this.estadisticaService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Estadistica obtenerPorId(@PathVariable Integer id) {
        return this.estadisticaService.obtenerPorId(id).orElse(null);
    }

    @PostMapping
    public void crear(@RequestBody Estadistica estadistica) {
        this.estadisticaService.crearEstadistica(estadistica);
    }

    @PutMapping("/{id}")
    public void actualizar(@PathVariable Integer id,
                           @RequestBody Estadistica estadistica) {
        this.estadisticaService.actualizarEstadistica(id, estadistica);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        this.estadisticaService.eliminarEstadistica(id);
    }
}
