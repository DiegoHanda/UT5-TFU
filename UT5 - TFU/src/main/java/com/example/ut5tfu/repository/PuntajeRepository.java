package com.example.ut5tfu.repository;

import com.example.ut5tfu.model.interfaces.IPuntaje;

public class PuntajeRepository extends Repository<IPuntaje, Integer> {

    private static PuntajeRepository instance;

    private PuntajeRepository(){
    }

    public static PuntajeRepository getInstance() {
        if (instance == null) {
            instance = new PuntajeRepository();
        }
        return instance;
    }

    @Override
    public IPuntaje save(IPuntaje clase) {
        this.entities.put(clase.getId(), clase);
        return super.save(clase);
    }
}