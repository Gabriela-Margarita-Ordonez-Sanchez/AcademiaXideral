package com.curso;

import java.util.ArrayList;
import java.util.List;

public final class UsuarioInmutable {

    private final String nombre;
    private final int edad;
    private final List<String> intereses;

    public UsuarioInmutable(String nombre, int edad, List<String> intereses) {
        this.nombre = nombre;
        this.edad = edad;
        this.intereses = new ArrayList<>(intereses);
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public List<String> getIntereses() {
        return new ArrayList<>(intereses);
    }

    public void saludar() {
        System.out.println(nombre + " saluda");
    }
}
