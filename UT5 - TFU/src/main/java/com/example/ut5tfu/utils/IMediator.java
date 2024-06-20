package com.example.ut5tfu.utils;

import com.example.ut5tfu.model.Deportista;
import com.example.ut5tfu.model.Encuentro;
import com.example.ut5tfu.repository.JuezRepository;

public interface IMediator {

	void ingresarPuntuacion(JuezRepository juezRepository, Encuentro encuentro, Deportista deportista, int puntuacion);
}
