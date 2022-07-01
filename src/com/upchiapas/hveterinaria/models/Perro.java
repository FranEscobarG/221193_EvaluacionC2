package com.upchiapas.hveterinaria.models;

public class Perro extends Mascota{
    String raza;

    public Perro(String nombre, String id, int edad, String servicios, String raza) {
        super(nombre, id, edad, servicios);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}
