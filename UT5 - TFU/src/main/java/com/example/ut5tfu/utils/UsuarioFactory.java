package com.example.ut5tfu.utils;

import com.example.ut5tfu.model.interfaces.IUsuario;

public interface UsuarioFactory {

	IUsuario createUsuario(String nombre, String apellido, String correo, String contrasena, String rol);

}
