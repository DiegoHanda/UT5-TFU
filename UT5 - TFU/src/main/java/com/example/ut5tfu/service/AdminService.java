package com.example.ut5tfu.service;

import com.example.ut5tfu.model.Admin;
import com.example.ut5tfu.model.interfaces.IUsuario;

import java.util.List;

public interface AdminService {

	List<IUsuario> obtenerTodosLosUsuarios();

	IUsuario obtenerUsuarioPorId(Integer id);

	void crearUsuario(IUsuario usuario);

	void eliminarUsuario(int id);

}
