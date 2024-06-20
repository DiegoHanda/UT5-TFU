package com.example.ut5tfu.service.implementation;

import com.example.ut5tfu.model.Deportista;
import com.example.ut5tfu.model.Encuentro;
import com.example.ut5tfu.repository.JuezRepository;
import com.example.ut5tfu.service.JuezService;
import com.example.ut5tfu.utils.ConcreteMediator;
import com.example.ut5tfu.web.exception.NotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JuezServiceImpl implements JuezService {

	private final JuezRepository juezRepository = JuezRepository.getInstance();
	private final ConcreteMediator mediator = ConcreteMediator.getInstance();

	@Override
	public void ingresarPuntuacion(Encuentro encuentro, Deportista deportista, int puntuacion) {

		mediator.ingresarPuntuacion(juezRepository, encuentro, deportista, puntuacion);
	}

	@Override
	public Encuentro obtenerEncuentro(int idEncuentro) {
		return juezRepository.getById(idEncuentro)
				.orElseThrow(() -> new NotFoundException("ENCUENTRO_NO_ENCONTRADO"));
	}
}
