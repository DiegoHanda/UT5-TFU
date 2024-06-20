package com.example.ut5tfu.controller;

import com.example.ut5tfu.model.interfaces.IUsuario;
import org.springframework.web.bind.annotation.*;
import com.example.ut5tfu.service.AdminService;

import java.util.List;


@RestController
@RequestMapping("/api/v1/admin")
public class AdminController {

	private final AdminService adminService;

	public AdminController(AdminService adminService) {
		this.adminService = adminService;
	}

	@GetMapping
	public List<IUsuario> obtenerTodosLosUsuarios() {
		return this.adminService.obtenerTodosLosUsuarios();
	}

	@GetMapping("/{id}")
	public IUsuario obtenerUsuarioPorId(@PathVariable Integer id) {
		return this.adminService.obtenerUsuarioPorId(id);
	}

	@PostMapping
	public void crearUsuario(@RequestBody IUsuario usuario) {
		this.adminService.crearUsuario(usuario);
	}

	@DeleteMapping("/{id}")
	public void eliminarUsuario(@PathVariable int id) {
		this.adminService.eliminarUsuario(id);
	}

}
