package com.example.ut5tfu.service.autenticacion;

import com.example.ut5tfu.model.interfaces.IUsuario;
import com.example.ut5tfu.service.autenticacion.dto.LoginDTO;
import com.example.ut5tfu.service.autenticacion.dto.RegisterDTO;

public interface AutenticacionService {

	IUsuario login(LoginDTO loginDTO);

	IUsuario register(RegisterDTO registerDTO);

}
