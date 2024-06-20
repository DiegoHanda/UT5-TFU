package com.example.ut5tfu.repository;

import com.example.ut5tfu.model.Itinerario;

import java.util.*;

public abstract class Repository<T, I> {

    Map<I, T> entities = new HashMap<>();

    public T save(T clase) {
        return clase;
    }

    public List<T> getAll() {
        return new ArrayList<>(this.entities.values());
    }

    public Optional<T> getById(I id) {
        return Optional.of(this.entities.get(id));
    }

    public void delete(I id) {
        this.entities.remove(id);
    }

}
