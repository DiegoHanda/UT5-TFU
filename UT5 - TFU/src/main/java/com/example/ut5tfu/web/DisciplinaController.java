package com.example.ut5tfu.web;

import com.example.ut5tfu.business.disciplina.DisciplinaService;
import com.example.ut5tfu.model.Disciplina;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/disciplina")
public class DisciplinaController {
    private final DisciplinaService disciplinaService;

    public DisciplinaController(DisciplinaService disciplinaService) {
        this.disciplinaService = disciplinaService;
    }

    @GetMapping
    public List<Disciplina> obtenerTodos() {
        return this.disciplinaService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Disciplina obtenerPorId(@PathVariable Integer id) {
        return this.disciplinaService.ObtenerPorId(id);
    }

    @PostMapping
    public void crear(@RequestBody Disciplina disciplina) {
        this.disciplinaService.crearDisciplina(disciplina);
    }

    @PutMapping("/{id}")
    public void actualizar(@PathVariable int id,
                           @RequestBody Disciplina disciplina) {
        this.disciplinaService.actualizarDisciplina(id, disciplina);
    }

    @DeleteMapping("/{id}")
    public void crear(@PathVariable int id) {
        this.disciplinaService.eliminarDisciplina(id);
    }
}

