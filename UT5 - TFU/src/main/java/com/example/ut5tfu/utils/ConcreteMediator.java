package com.example.ut5tfu.utils;

import com.example.ut5tfu.model.Deportista;
import com.example.ut5tfu.model.Encuentro;

import java.util.HashMap;

public class ConcreteMediator implements IMediator {

	private PuntajeFactory puntajeFactory;
	private static ConcreteMediator cM;
	private HashMap<Integer, Integer> encuentros; 
	private HashMap<Integer, Integer> caracteristicas;

	private ConcreteMediator() {
		this.puntajeFactory = PuntajeFactory.getInstance();
		this.encuentros = new HashMap<>();
		this.caracteristicas = new HashMap<>();
	}

	@Override
	public void agregarPuntuacion(HashMap<String, Integer> caracteristicas, Encuentro encuentro, Deportista deportista) {
		if (encuentros.containsKey(encuentro.getId())){
			encuentros.put(encuentro.getId(), 1);
			if (encuentro.getJueces().size() == this.encuentros.get(encuentro.getId())) {
				System.out.println("Todos los jueces ya han clasificado.");
				this.puntajeFactory.createPuntaje(encuentro.getTipo(), caracteristicas, deportista);
			}
		}else if(encuentros.containsKey(encuentro.getId())) {

			if (encuentro.getJueces().size() == this.encuentros.get(encuentro.getId())) {
				System.out.println("Todos los jueces ya han clasificado.");
				this.puntajeFactory.createPuntaje(encuentro.getTipo(), caracteristicas, deportista);
			}else{
				encuentros.put(encuentro.getId(), encuentros.get(encuentro.getId()) + 1);
				if (encuentro.getJueces().size() == this.encuentros.get(encuentro.getId())) {
					this.puntajeFactory.createPuntaje(encuentro.getTipo(), caracteristicas, deportista);
				}
			}
		} 
	}

	public static synchronized ConcreteMediator getInstance() {
		if (cM == null) {
			cM = new ConcreteMediator(PuntajeFactory.getInstance());
		}
		return cM;
	}

	@Override
	public void ingresarPuntuacion(JuezRepository juezRepository, Encuentro encuentro, Deportista deportista, int puntuacion) {
		List<Integer> puntajes = encuentro.getPuntajes();
		puntajes.add(puntuacion);
		juezRepository.save(encuentro);
	}



    private ConcreteMediator(PuntajeFactory puntajeFactory) {
        this.puntajeFactory = puntajeFactory;
    }


    @Override
    public void notifyAll(String event) {
        System.out.println("All judges have submitted their scores for event: " + event);
    }
}