package com.example.ut5tfu.persistence;

import com.example.ut5tfu.model.Disciplina;

public class DisciplinaRepository extends Repository<Disciplina, Integer> {
    private static DisciplinaRepository instance;

    private DisciplinaRepository(){
    }

    public static DisciplinaRepository getInstance() {
        if (instance == null) {
            instance = new DisciplinaRepository();
        }
        return instance;
    }

    @Override
    public Disciplina save(Disciplina clase) {
        this.entities.put(clase.getId(), clase);
        return super.save(clase);
    }

}
