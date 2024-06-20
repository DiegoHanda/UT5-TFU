package com.example.ut5tfu.model;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    public List<Deportista> deportistas;
    public String nombre;
    //Constructor sabiendo de antemano la lista de participantes
    public Disciplina(List<Deportista> deportistas, DeportesPermitidos nombre) {
        this.deportistas = deportistas;
        this.nombre = nombre.toString();
    }
    //Este caso es por si no se sabe los participantes de antemano que inicialice la lista
    public Disciplina(DeportesPermitidos nombre) {
        this.nombre = nombre.toString();
        this.deportistas = new ArrayList<Deportista>();
    }


}
