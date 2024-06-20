package com.example.ut5tfu.persistence;

import com.example.ut5tfu.model.Estadistica;


public class EstadisticaRepository extends Repository<Estadistica, Integer>{

    private static EstadisticaRepository instance;

    private EstadisticaRepository(){
    }

    public static EstadisticaRepository getInstance() {
        if (instance == null) {
            instance = new EstadisticaRepository();
        }
        return instance;
    }

    public Estadistica save(Estadistica clase) {
        this.entities.put(clase.getId(), clase);
         return super.save(clase);
    }
}
