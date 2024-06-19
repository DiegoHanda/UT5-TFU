package com.example.ut5tfu.utils;

public class ConcreteMediator implements IMediator {
	private static ConcreteMediator cM;

	@Override
	public void agregarPuntuacion(Integer idEncuentro, Integer idDeportista, Integer puntuacion) {

	}

	public static synchronized ConcreteMediator getInstance() {
		if (cM == null) {
			cM = new ConcreteMediator();
		}
		return cM;
	}
}
