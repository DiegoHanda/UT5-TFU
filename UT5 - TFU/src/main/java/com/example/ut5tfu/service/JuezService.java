package com.example.ut5tfu.service;

import com.example.ut5tfu.model.Encuentro;

public interface JuezService {

	void ingresarPuntuacion(int idEncuentro, int idDeportista, int puntuacion);

	Encuentro obtenerEncuentro(int idEncuentro);
}
