package com.example.ut5tfu.controller;

import com.example.ut5tfu.model.interfaces.IUsuario;
import com.example.ut5tfu.service.autenticacion.AutenticacionService;
import com.example.ut5tfu.service.autenticacion.dto.LoginDTO;
import com.example.ut5tfu.service.autenticacion.dto.RegisterDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/autenticacion")
public class AutenticacionController {

    private final AutenticacionService autenticacionService;

    public AutenticacionController(AutenticacionService autenticacionService) {
        this.autenticacionService = autenticacionService;
    }

    @PostMapping("/login")
    public IUsuario login(@RequestBody LoginDTO loginDTO) {
        return this.autenticacionService.login(loginDTO);
    }

    @PostMapping("/register")
    public IUsuario register(@RequestBody RegisterDTO registerDTO) {
        return this.autenticacionService.register(registerDTO);
    }

}
