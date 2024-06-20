package com.example.ut5tfu.service.implementation;

import com.example.ut5tfu.model.Admin;
import com.example.ut5tfu.model.interfaces.IUsuario;
import com.example.ut5tfu.repository.AdminRepository;
import com.example.ut5tfu.service.AdminService;
import com.example.ut5tfu.web.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

	private final AdminRepository adminRepository = AdminRepository.getInstance();

	@Override
	public List<IUsuario> obtenerTodosLosUsuarios() {
		return this.adminRepository.getAll();
	}

	@Override
	public IUsuario obtenerUsuarioPorId(Integer id) {
		return this.adminRepository.getById(id)
				.orElseThrow(() -> new NotFoundException("ENCUENTRO_NO_ENCONTRADO"));
	}

	@Override
	public void crearUsuario(IUsuario usuario) {
		this.adminRepository.save(usuario);
	}

	@Override
	public void eliminarUsuario(int id) {
		this.adminRepository.getById(id)
				.orElseThrow(() -> new NotFoundException("ENCUENTRO_NO_ENCONTRADO"));
		this.adminRepository.delete(id);
	}
}
