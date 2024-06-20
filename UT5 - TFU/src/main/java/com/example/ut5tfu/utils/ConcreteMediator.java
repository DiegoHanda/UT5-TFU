package com.example.ut5tfu.utils;

public class ConcreteMediator implements IMediator {
	private static ConcreteMediator instance;

	@Override
	public void agregarPuntuacion(Integer idEncuentro, Integer idDeportista, Integer puntuacion) {

	}

	public static synchronized ConcreteMediator getInstance() {
		if (instance == null) {
			instance = new ConcreteMediator();
		}
		return instance;
	}
}
