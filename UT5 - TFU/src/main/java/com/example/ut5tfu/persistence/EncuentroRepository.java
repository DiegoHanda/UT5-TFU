package com.example.ut5tfu.persistence;

import com.example.ut5tfu.model.Encuentro;

public class EncuentroRepository extends Repository<Encuentro, Integer> {

    private static EncuentroRepository instance;

    private EncuentroRepository(){
    }

    public static EncuentroRepository getInstance() {
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
