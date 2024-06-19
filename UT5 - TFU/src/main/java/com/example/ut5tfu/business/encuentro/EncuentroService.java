package com.example.ut5tfu.business.encuentro;

import com.example.ut5tfu.model.Encuentro;

import java.util.List;

public interface EncuentroService {

    List<Encuentro> obtenerTodos();

    Encuentro ObtenerPorId(Integer id);

    void crearEncuentro(Encuentro encuentro);

    void actualizarEncuentro(int id, Encuentro encuentro);

    void eliminarEncuentro(int id);

}
