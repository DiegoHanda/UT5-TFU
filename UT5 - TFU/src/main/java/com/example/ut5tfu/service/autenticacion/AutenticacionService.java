package com.example.ut5tfu.service.autenticacion;

import com.example.ut5tfu.service.autenticacion.dto.LoginDTO;
import com.example.ut5tfu.service.autenticacion.dto.RegisterDTO;

public interface AutenticacionService {

	void login(LoginDTO loginDTO);

	void register(RegisterDTO registerDTO);

}
