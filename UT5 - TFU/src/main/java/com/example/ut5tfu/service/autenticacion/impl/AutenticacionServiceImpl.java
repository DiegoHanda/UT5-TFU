package com.example.ut5tfu.service.autenticacion.impl;

import com.example.ut5tfu.model.interfaces.IUsuario;
import com.example.ut5tfu.repository.UsuarioRepository;
import com.example.ut5tfu.service.autenticacion.AutenticacionService;
import com.example.ut5tfu.service.autenticacion.dto.LoginDTO;
import com.example.ut5tfu.service.autenticacion.dto.RegisterDTO;
import com.example.ut5tfu.utils.UsuarioFactory;
import com.example.ut5tfu.utils.UsuarioFactoryImpl;
import com.example.ut5tfu.web.exception.NotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AutenticacionServiceImpl implements AutenticacionService {

	private final UsuarioRepository usuarioRepository = UsuarioRepository.getInstance();
	private final UsuarioFactory usuarioFactory = UsuarioFactoryImpl.getInstance();

	@Override
	public IUsuario login(LoginDTO loginDTO) {
		return this.usuarioRepository.getByCorreoAndContrasena(loginDTO.getCorreo(), loginDTO.getContrasena())
				.orElseThrow(() -> new NotFoundException("USUARIO_NO_ENCONTRADO"));
	}

	@Override
	public IUsuario register(RegisterDTO registerDTO) {
		IUsuario usuario = this.usuarioFactory.createUsuario(registerDTO.getNombre(),
				registerDTO.getApellido(),
				registerDTO.getCorreo(),
				registerDTO.getContrasena(),
				registerDTO.getRol());

		this.usuarioRepository.save(usuario);

		return usuario;
	}

}
