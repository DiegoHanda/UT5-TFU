package com.example.ut5tfu.repository;

import com.example.ut5tfu.model.interfaces.IUsuario;

import java.util.Optional;

public class UsuarioRepository extends Repository<IUsuario, Integer> {

    private static UsuarioRepository instance;

    private UsuarioRepository(){
    }

    public static synchronized UsuarioRepository getInstance() {
        if (instance == null) {
            instance = new UsuarioRepository();
        }
        return instance;
    }

    @Override
    public IUsuario save(IUsuario clase) {
        this.entities.put(clase.getId(), clase);
        return super.save(clase);
    }

    public Optional<IUsuario> getByCorreoAndContrasena(String correo, String contrasena) {
        for (IUsuario value : this.entities.values()) {
            if (value.getCorreo().equals(correo) && value.getContrasena().equals(contrasena)) {
                return Optional.of(value);
            }
        }
        return Optional.empty();
    }
}
