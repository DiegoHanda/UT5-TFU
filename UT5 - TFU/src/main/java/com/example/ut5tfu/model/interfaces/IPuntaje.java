package com.example.ut5tfu.model;

import com.example.ut5tfu.persistence.PuntajeRepository;

import java.lang.classfile.Interfaces;

public interface IPuntaje{

   public Integer getId();
    public void setId(Integer id);
    public Integer getPuntajeTotal();
    public void setPuntajeTotal(Integer puntajeTotal);
    public Deportista getDeportista();
    public void setDeportista(Deportista deportista);
    public final PuntajeRepository puntajeRepository = PuntajeRepository.getInstance();

}