package com.example.ut5tfu.business.disciplina;

import com.example.ut5tfu.model.Disciplina;

import java.util.List;

public interface DisciplinaService {
    List<Disciplina> obtenerTodos();

    Disciplina ObtenerPorId(Integer id);

    void crearDisciplina(Disciplina disciplina);

    void actualizarDisciplina(int id, Disciplina disciplina);

    void eliminarDisciplina(int id);

}

