package com.example.ut5tfu.repository;

import com.example.ut5tfu.model.Juez;

public class JuezRepository extends Repository<Juez, Integer> {

	private static JuezRepository instance;

	private JuezRepository() {
	}

	public static synchronized JuezRepository getInstance() {
		if (instance == null) {
			instance = new JuezRepository();
		}
		return instance;
	}
}
