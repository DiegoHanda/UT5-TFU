package com.example.ut5tfu.repository;

import com.example.ut5tfu.model.Admin;
import com.example.ut5tfu.model.interfaces.IUsuario;

public class AdminRepository extends Repository<IUsuario, Integer> {

	private static AdminRepository instance;

	private AdminRepository() {
	}

	public static synchronized AdminRepository getInstance() {
		if (instance == null) {
			instance = new AdminRepository();
		}
		return instance;
	}

}
