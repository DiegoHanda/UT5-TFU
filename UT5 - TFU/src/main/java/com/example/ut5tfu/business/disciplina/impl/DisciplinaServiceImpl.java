package com.example.ut5tfu.business.disciplina.impl;

import com.example.ut5tfu.business.disciplina.DisciplinaService;
import com.example.ut5tfu.model.Disciplina;
import com.example.ut5tfu.persistence.DisciplinaRepository;
import com.example.ut5tfu.web.exception.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisciplinaServiceImpl implements DisciplinaService {
    private final DisciplinaRepository disciplinaRepository = DisciplinaRepository.getInstance();

    @Override
    public List<Disciplina> obtenerTodos() {
        return this.disciplinaRepository.getAll();
    }

    @Override
    public Disciplina ObtenerPorId(Integer id) {
        return this.disciplinaRepository.getById(id)
                .orElseThrow(() -> new NotFoundException("DISCIPLINA_NO_ENCONTRADA"));
    }

    @Override
    public void crearDisciplina(Disciplina disciplina) {
        this.disciplinaRepository.save(disciplina);
    }

    @Override
    public void actualizarDisciplina(int id, Disciplina disciplina) {
        disciplina.setId(id);
        this.disciplinaRepository.save(disciplina);
    }

    @Override
    public void eliminarDisciplina(int id) {
        this.disciplinaRepository.getById(id)
                .orElseThrow(() -> new NotFoundException("DISCIPLINA_NO_ENCONTRADA"));
        this.disciplinaRepository.delete(id);
    }
}
