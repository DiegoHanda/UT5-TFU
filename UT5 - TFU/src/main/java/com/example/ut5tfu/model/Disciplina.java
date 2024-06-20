package com.example.ut5tfu.model;

import com.example.ut5tfu.business.disciplina.impl.DeportesPermitidos;

public class Disciplina {
    private String nombre;
    private String[] categorias;
    private String[] modalidades;
    private  Integer id;

    public Disciplina(Integer id, DeportesPermitidos nombre) {
        this.id = id;
        this.nombre = nombre.toString();
    }

    public Disciplina(Integer id, DeportesPermitidos nombre, String[] categorias, String[] modalidades) {
        this.id = id;
        this.nombre = nombre.toString();
        this.categorias = categorias;
        this.modalidades = modalidades;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String[] getCategorias() {
        return categorias;
    }

    public void setCategorias(String[] categorias) {
        this.categorias = categorias;
    }

    public String[] getModalidades() {
        return modalidades;
    }

    public void setModalidades(String[] modalidades) {
        this.modalidades = modalidades;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
