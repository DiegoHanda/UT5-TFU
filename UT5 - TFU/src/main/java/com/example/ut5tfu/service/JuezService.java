package com.example.ut5tfu.service;

import com.example.ut5tfu.model.Encuentro;
import com.example.ut5tfu.model.Deportista;

public interface JuezService {

	void ingresarPuntuacion(Encuentro encuentro,  Deportista deportista, int puntuacion);

	Encuentro obtenerEncuentro(int idEncuentro);
}
