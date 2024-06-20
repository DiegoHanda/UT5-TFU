package com.example.ut5tfu.business.itinerario.impl;

import com.example.ut5tfu.business.itinerario.ItinerarioService;
import com.example.ut5tfu.model.Itinerario;
import com.example.ut5tfu.persistence.ItinerarioRpository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ItinerarioServiceImpl implements ItinerarioService {

    private ItinerarioRpository itinerarioRepository;

    @Override
    public void crearItinerario(Itinerario itinerario) {
        itinerarioRepository.save(itinerario);
    }

    @Override
    public void actualizarItinerario(String id, Itinerario itinerario) {
        itinerarioRepository.save(itinerario);
    }

    @Override
    public void eliminarItinerario(String id) {
        itinerarioRepository.delete(id);
    }

    @Override
    public List<Itinerario> obtenerTodos() {
        return itinerarioRepository.getAll();
    }

    public Optional<Itinerario> obtenerPorId(String id) {
        return itinerarioRepository.getById(id);
    }
}
