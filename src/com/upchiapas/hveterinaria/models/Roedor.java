package com.upchiapas.hveterinaria.models;

public class Roedor extends Mascota{
    String tipo;

    public Roedor(String nombre, String id, int edad, String servicios, String tipo) {
        super(nombre, id, edad, servicios);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
