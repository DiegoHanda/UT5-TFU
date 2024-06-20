package com.example.ut5tfu.service.implementation;

import com.example.ut5tfu.service.PuntajeService;
import com.example.ut5tfu.model.interfaces.IPuntaje;
import com.example.ut5tfu.model.Encuentro;
import com.example.ut5tfu.model.Deportista;
import com.example.ut5tfu.repository.PuntajeRepository;
import com.example.ut5tfu.utils.ConcreteMediator;
import com.example.ut5tfu.web.exception.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.HashMap;

@Service
public class PuntajeServiceImpl implements PuntajeService {

    private final PuntajeRepository puntajeRepository = PuntajeRepository.getInstance();
    private final ConcreteMediator mediator = ConcreteMediator.getInstance();

    public PuntajeServiceImpl() {  
    }

    @Override
    public List<IPuntaje> obtenerTodos() {
        return this.puntajeRepository.getAll();
    }

    @Override
    public IPuntaje obtenerPorId(Integer id) {
        return null;
    }

    @Override
    public IPuntaje ObtenerPorId(Integer id) {
        return this.puntajeRepository.getById(id)
                .orElseThrow(() -> new NotFoundException("PUNTAJE_NO_ENCONTRADO"));
    }

    @Override
    public void crearPuntaje(HashMap<String, Integer> caracteristicas,Encuentro encuentro, Deportista deportista) {
        // se verifica si realmete es un juez
        this.mediator.agregarPuntuacion(caracteristicas, encuentro, deportista);
    }

    @Override
    public void actualizarPuntaje(int id, IPuntaje puntaje) {
        puntaje.setId(id);
        this.puntajeRepository.save(puntaje);
    }

    @Override
    public void eliminarPuntaje(int id) {
        this.puntajeRepository.getById(id)
                .orElseThrow(() -> new NotFoundException("PUNTAJE_NO_ENCONTRADO"));
        this.puntajeRepository.delete(id);
    }

}