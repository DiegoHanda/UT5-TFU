package com.example.ut5tfu.utils;

import com.example.ut5tfu.model.Admin;
import com.example.ut5tfu.model.Aficionado;
import com.example.ut5tfu.model.Deportista;
import com.example.ut5tfu.model.Juez;
import com.example.ut5tfu.model.interfaces.IUsuario;
import com.example.ut5tfu.web.exception.NotFoundException;

public class UsuarioFactoryImpl implements UsuarioFactory {

	private static UsuarioFactoryImpl instance;
	private int nextId = 1;

	public static synchronized UsuarioFactoryImpl getInstance() {
		if (instance == null) {
			instance = new UsuarioFactoryImpl();
		}
		return instance;
	}

	private UsuarioFactoryImpl(){}

	@Override
	public IUsuario createUsuario(String nombre, String apellido, String correo, String contrasena, String rol) {
		return switch (rol) {
			case "JUEZ" -> new Juez(this.nextId++, nombre, apellido, correo, contrasena, rol);
			case "ADMIN" -> new Admin(this.nextId++, nombre, apellido, correo, contrasena, rol);
			case "AFICIONADO" -> new Aficionado(this.nextId++, nombre, apellido, correo, contrasena, rol);
			case "DEPORTISTA" -> new Deportista(this.nextId++, nombre, apellido, correo, contrasena, rol);
			default -> throw new NotFoundException("ROL_NO_ENCONTRADO");
		};
	}
}
