package com.example.ut5tfu.service.implementation;

import com.example.ut5tfu.model.Juez;
import com.example.ut5tfu.repository.JuezRepository;
import com.example.ut5tfu.service.JuezService;
import com.example.ut5tfu.web.exception.NotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JuezServiceImpl implements JuezService {

	private final JuezRepository juezRepository = JuezRepository.getInstance();

	@Override
	public Juez obtenerJuez(int idJuez) {
		return juezRepository.getById(idJuez)
				.orElseThrow(() -> new NotFoundException("JUEZ_NO_ENCONTRADO"));
	}
}
