package com.example.ut5tfu.controller;

import com.example.ut5tfu.model.Juez;
import com.example.ut5tfu.service.JuezService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/juez")
public class JuezController {
	private final JuezService juezService;

	public JuezController(JuezService juezService) {
		this.juezService = juezService;
	}

	@GetMapping("/{id}")
	public Juez obtenerPorId(@PathVariable Integer id) {
		return this.juezService.obtenerJuez(id);
	}

}
