package com.example.ut5tfu.web;

import com.example.ut5tfu.business.encuentro.EncuentroService;
import com.example.ut5tfu.model.Encuentro;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/encuentros")
public class EncuentroController {

    private final EncuentroService encuentroService;

    public EncuentroController(EncuentroService encuentroService) {
        this.encuentroService = encuentroService;
    }

    @GetMapping
    public List<Encuentro> obtenerTodos() {
        return this.encuentroService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Encuentro obtenerPorId(@PathVariable Integer id) {
        return this.encuentroService.ObtenerPorId(id);
    }

    @PostMapping
    public void crear(@RequestBody Encuentro encuentro) {
        this.encuentroService.crearEncuentro(encuentro);
    }

    @PutMapping("/{id}")
    public void actualizar(@PathVariable int id,
                           @RequestBody Encuentro encuentro) {
        this.encuentroService.actualizarEncuentro(id, encuentro);
    }

    @DeleteMapping("/{id}")
    public void crear(@PathVariable int id) {
        this.encuentroService.eliminarEncuentro(id);
}

}
