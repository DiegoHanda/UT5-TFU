package com.example.ut5tfu.repository;

import com.example.ut5tfu.model.Encuentro;
import com.example.ut5tfu.model.Itinerario;

public class EncuentroRepository extends Repository<Encuentro, Integer> {

    private static EncuentroRepository instance;

    private EncuentroRepository(){
    }

    public static synchronized EncuentroRepository getInstance() {
        if (instance == null) {
            instance = new EncuentroRepository();
        }
        return instance;
    }

    @Override
    public Encuentro save(Encuentro clase) {
        this.entities.put(clase.getId(), clase);
        return super.save(clase);
    }
}
