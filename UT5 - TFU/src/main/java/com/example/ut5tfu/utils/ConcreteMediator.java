package com.example.ut5tfu.utils;

import com.example.ut5tfu.model.Deportista;
import com.example.ut5tfu.model.Encuentro;
import com.example.ut5tfu.repository.JuezRepository;

import java.util.List;

public class ConcreteMediator implements IMediator {
	private static ConcreteMediator instance;

	public static synchronized ConcreteMediator getInstance() {
		if (instance == null) {
			instance = new ConcreteMediator();
		}
		return instance;
	}

	@Override
	public void ingresarPuntuacion(JuezRepository juezRepository, Encuentro encuentro, Deportista deportista, int puntuacion) {
		List<Integer> puntajes = encuentro.getPuntajes();
		puntajes.add(puntuacion);
		juezRepository.save(encuentro);
	}
}
