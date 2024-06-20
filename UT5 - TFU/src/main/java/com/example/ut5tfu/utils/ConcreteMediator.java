package com.example.ut5tfu.utils;

import com.example.ut5tfu.model.Deportista;
import com.example.ut5tfu.model.Encuentro;
import com.example.ut5tfu.repository.JuezRepository;

import java.util.HashMap;
import java.util.List;

public class ConcreteMediator implements IMediator {

	private PuntajeFactoryImpl puntajeFactory;
	private static ConcreteMediator cM;
	private HashMap<Integer, Integer> encuentros;
	private HashMap<String, Integer> caracteristicas;

	private ConcreteMediator() {
		this.puntajeFactory = PuntajeFactoryImpl.getInstance();
		this.encuentros = new HashMap<>();
		this.caracteristicas = new HashMap<>();
	}

	@Override
	public void agregarPuntuacion(HashMap<String, Integer> caracteristicas, Encuentro encuentro, Deportista deportista) {
		if(encuentros.containsKey(encuentro.getId())) {
			if (encuentro.getJueces().size() == this.encuentros.get(encuentro.getId())) {
				System.out.println("Todos los jueces ya han clasificado.");
				this.puntajeFactory.createPuntaje(encuentro.getTipo(), caracteristicas, deportista);
			} else {
				encuentros.put(encuentro.getId(), encuentros.get(encuentro.getId()) + 1);
				if (encuentro.getJueces().size() == this.encuentros.get(encuentro.getId())) {
					this.puntajeFactory.createPuntaje(encuentro.getTipo(), caracteristicas, deportista);
				}
			}
		}
	}

	public static synchronized ConcreteMediator getInstance() {
		if (cM == null) {
			cM = new ConcreteMediator(PuntajeFactoryImpl.getInstance());
		}
		return cM;
	}



    private ConcreteMediator(PuntajeFactory puntajeFactory) {
        this.puntajeFactory = puntajeFactory;
    }


    @Override
    public void notifyAll(String event) {
        System.out.println("All judges have submitted their scores for event: " + event);
    }
}