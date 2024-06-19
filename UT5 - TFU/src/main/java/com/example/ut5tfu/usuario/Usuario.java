package com.example.ut5tfu.usuario;

public interface Usuario {
	String getId();
	void setId(String id);

	String getNombre();
	void setNombre(String nombre);

	String getApellido();
	void setApellido(String apellido);

	String getCorreo();
	void setCorreo(String correo);

	String getContraseña();
	void setContraseña(String contraseña);

	String getRol();
	void setRol(String rol);


}
