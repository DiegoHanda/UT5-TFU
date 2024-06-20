package com.example.ut5tfu.model.interfaces;

import com.example.ut5tfu.model.Deportista;
import com.example.ut5tfu.repository.PuntajeRepository;

public interface IPuntaje{

   public Integer getId();
    public void setId(Integer id);
    public Integer getPuntajeTotal();
    public void setPuntajeTotal(Integer puntajeTotal);
    public Deportista getDeportista();
    public void setDeportista(Deportista deportista);
    public final PuntajeRepository puntajeRepository = PuntajeRepository.getInstance();

}