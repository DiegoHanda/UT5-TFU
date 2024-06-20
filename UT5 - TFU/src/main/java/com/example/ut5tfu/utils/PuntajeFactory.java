package com.example.ut5tfu.utils;

import com.example.ut5tfu.model.*;
import com.example.ut5tfu.persistence.PuntajeRepository;


import java.util.HashMap;

public class PuntajeFactory implements IPuntajeFactory {

    private static PuntajeFactory instance;
    private final PuntajeRepository puntajeRepository = PuntajeRepository.getInstance();
    private Integer nextId = 1;



    public static synchronized PuntajeFactory getInstance() {
		if (instance == null) {
			instance = new PuntajeFactory();
		}
		return instance;
	}

    @Override
    public void createPuntaje(String eventType, HashMap<String, Integer> caracteristicas, Deportista deportista) {
        switch (eventType) {
            case "Esgrima":
                PuntajeEsgrima puntaje2 = new PuntajeEsgrima();
                puntaje2.setDeportista(deportista);
                puntaje2.setPuntajeTotal(caracteristicas.get(caracteristicas.get("puntajeTotal")));
                this.puntajeRepository.save(puntaje2);
                break;
            case "Natacion":
                PuntajeNatacion puntaje3 = new PuntajeNatacion(this.nextId);
                this.nextId++;
                puntaje3.setDeportista(deportista);
                puntaje3.setPuntajeTotal(caracteristicas.get(caracteristicas.get("puntajeTotal")));
                puntaje3.setReaccionDeSalida(caracteristicas.get(caracteristicas.get("reaccionDeSalida")));
                puntaje3.setVelocidadMedia(caracteristicas.get(caracteristicas.get("velocidadMedia")));
                puntaje3.setTiempoVuelta(caracteristicas.get(caracteristicas.get("tiempoVuelta")));
                puntaje3.setTecnicaDeNado(caracteristicas.get(caracteristicas.get("tecnicaDeNado")));
                puntaje3.setTiempoTotal(caracteristicas.get(caracteristicas.get("tiempoTotal")));

                this.puntajeRepository.save(puntaje3);
                break;
            case "Atletismo":
                PuntajeAtletismo puntaje4 = new PuntajeAtletismo(this.nextId);
                this.nextId++;
                puntaje4.setDeportista(deportista);
                puntaje4.setPuntajeTotal(caracteristicas.get(caracteristicas.get("puntajeTotal")));
                puntaje4.setVelocidad(caracteristicas.get(caracteristicas.get("velocidad")));
                puntaje4.setDistanciaTotal(caracteristicas.get(caracteristicas.get("distanciaTotal")));
                puntaje4.setReaccionDeSalida(caracteristicas.get(caracteristicas.get("reaccionDeSalida")));
                puntaje4.setTiempoTotal(caracteristicas.get(caracteristicas.get("tiempoTotal")));

                this.puntajeRepository.save(puntaje4);
                break;
            case "Surf":
                PuntajeSurf puntaje = new PuntajeSurf(this.nextId);
                this.nextId++;
                puntaje.setDeportista(deportista);
                puntaje.setOla(caracteristicas.get(caracteristicas.get("ola")));
                puntaje.setManiobras(caracteristicas.get(caracteristicas.get("maniobras")));
                puntaje.setVariedad(caracteristicas.get(caracteristicas.get("variedad")));
                puntaje.setPotenciaRadicalidad(caracteristicas.get(caracteristicas.get("potenciaRadicalidad")));
                puntaje.setProgresión(caracteristicas.get(caracteristicas.get("progresión")));
                puntaje.setPuntajeTotal(caracteristicas.get(caracteristicas.get("puntajeTotal")));

                this.puntajeRepository.save(puntaje);
                break;
            case "Kitesurf":
                PuntajeKitesurf puntaje1 = new PuntajeKitesurf(this.nextId);
                this.nextId++;
                puntaje1.setDeportista(deportista);
                puntaje1.setTecnica(caracteristicas.get(caracteristicas.get("tecnica")));
                puntaje1.setDificultad(caracteristicas.get(caracteristicas.get("dificultad")));
                puntaje1.setVariedad(caracteristicas.get(caracteristicas.get("variedad")));
                puntaje1.setImpresionGeneral(caracteristicas.get(caracteristicas.get("impresionGeneral")));
                puntaje1.setPuntajeTotal(caracteristicas.get(caracteristicas.get("puntajeTotal")));
                puntaje1.setAlturaAmplitud(caracteristicas.get(caracteristicas.get("alturaAmplitud")));

                this.puntajeRepository.save(puntaje1);

                break;
            default:
                throw new IllegalArgumentException("Evento no soportado");
        }
    }
}