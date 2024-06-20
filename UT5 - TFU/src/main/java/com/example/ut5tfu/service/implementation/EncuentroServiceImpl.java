package com.example.ut5tfu.service.implementation;

import com.example.ut5tfu.service.EncuentroService;
import com.example.ut5tfu.model.Encuentro;
import com.example.ut5tfu.repository.EncuentroRepository;
import com.example.ut5tfu.web.exception.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EncuentroServiceImpl implements EncuentroService {

    private final EncuentroRepository encuentroRepository = EncuentroRepository.getInstance();

    @Override
    public List<Encuentro> obtenerTodos() {
        return this.encuentroRepository.getAll();
    }

    @Override
    public Encuentro ObtenerPorId(Integer id) {
        return this.encuentroRepository.getById(id)
                .orElseThrow(() -> new NotFoundException("ENCUENTRO_NO_ENCONTRADO"));
    }

    @Override
    public void crearEncuentro(Encuentro encuentro) {
        this.encuentroRepository.save(encuentro);
    }

    @Override
    public void actualizarEncuentro(int id, Encuentro encuentro) {
        encuentro.setId(id);
        this.encuentroRepository.save(encuentro);
    }

    @Override
    public void eliminarEncuentro(int id) {
        this.encuentroRepository.getById(id)
                .orElseThrow(() -> new NotFoundException("ENCUENTRO_NO_ENCONTRADO"));
        this.encuentroRepository.delete(id);
    }

}
