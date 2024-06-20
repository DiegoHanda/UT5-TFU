package com.example.ut5tfu.web;

import org.springframework.web.bind.annotation.*;
import com.example.ut5tfu.business.itinerario.ItinerarioService;
import com.example.ut5tfu.model.Itinerario;
import java.util.List;
@RestController
@RequestMapping("/api/v1/itinerarios")
public class ItinerarioController {

    private final ItinerarioService itinerarioService;

    public ItinerarioController(ItinerarioService itinerarioService) {
        this.itinerarioService = itinerarioService;
    }

    @GetMapping
    public List<Itinerario> obtenerTodos() {
        return this.itinerarioService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Itinerario obtenerPorId(@PathVariable String id) {
        return this.itinerarioService.obtenerPorId(id).orElse(null);
    }

    @PostMapping
    public void crear(@RequestBody Itinerario itinerario) {
        this.itinerarioService.crearItinerario(itinerario);
    }

    @PutMapping("/{id}")
    public void actualizar(@PathVariable String id,
                           @RequestBody Itinerario itinerario) {
        this.itinerarioService.actualizarItinerario(id, itinerario);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable String id) {
        this.itinerarioService.eliminarItinerario(id);
    }

}
