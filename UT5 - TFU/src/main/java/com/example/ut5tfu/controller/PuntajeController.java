package com.example.ut5tfu.controller;

import com.example.ut5tfu.service.implementation.PuntajeServiceImpl;
import com.example.ut5tfu.model.Encuentro;
import com.example.ut5tfu.model.Deportista;
import com.example.ut5tfu.model.interfaces.IPuntaje;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.HashMap;




@RestController
@RequestMapping("/api/v1/puntajes")
public class PuntajeController {

    private final PuntajeServiceImpl puntajeService;

    public PuntajeController(PuntajeServiceImpl puntajeService) {
        this.puntajeService = puntajeService;
    }

    @GetMapping
    public List<IPuntaje> obtenerTodos() {
        return this.puntajeService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public IPuntaje obtenerPorId(@PathVariable Integer id) {
        return this.puntajeService.ObtenerPorId(id);
    }

    @PostMapping
    public void crear(@RequestBody HashMap<String, Integer> caracteristicas, Encuentro encuentro, Deportista deportista) {
        this.puntajeService.crearPuntaje(caracteristicas, encuentro, deportista);
    }

    @PutMapping("/{id}")
    public void actualizar(@PathVariable int id,
                           @RequestBody IPuntaje caracteristicas) {
        this.puntajeService.actualizarPuntaje(id, caracteristicas);
    }

    @DeleteMapping("/{id}")
    public void crear(@PathVariable int id) {
        this.puntajeService.eliminarPuntaje(id);
    }

}