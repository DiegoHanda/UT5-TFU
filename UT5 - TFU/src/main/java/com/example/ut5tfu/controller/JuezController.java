package com.example.ut5tfu.controller;

import com.example.ut5tfu.model.Deportista;
import com.example.ut5tfu.model.Encuentro;
import com.example.ut5tfu.service.JuezService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/juez")
public class JuezController {
	private final JuezService juezService;

	public JuezController(JuezService juezService) {
		this.juezService = juezService;
	}

	@PutMapping("/ingresarPuntuacion")
	public void ingresarPuntuacion(@RequestBody Encuentro encuentro, @RequestBody Deportista deportista, int puntuacion) {
		juezService.ingresarPuntuacion(encuentro, deportista, puntuacion);
	}

	@GetMapping("/{id}")
	public Encuentro obtenerPorId(@PathVariable Integer id) {
		return this.juezService.obtenerEncuentro(id);
	}

}
