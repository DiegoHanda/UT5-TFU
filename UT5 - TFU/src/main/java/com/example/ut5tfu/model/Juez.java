package com.example.ut5tfu.model;

import com.example.ut5tfu.utils.IMediator;
import com.example.ut5tfu.utils.IUsuario;

public class Juez implements IUsuario {
	private String id;
	private String nombre;
	private String apellido;
	private String correo;
	private String contrasena;
	private String rol;
	private IMediator mediator;

	public Juez(IMediator mediator) {
		this.mediator = mediator;
	}

	public Juez(String id, String nombre, String apellido, String correo, String contrasena, String rol, IMediator mediator) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.contrasena = contrasena;
		this.rol = rol;
		this.mediator = mediator;
	}

	@Override
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@Override
	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@Override
	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	@Override
	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

}
