package com.upchiapas.hveterinaria.models;

public class Mascota {
    String nombre, id,servicio;
    int edad;

    public Mascota(String nombre, String id, int edad, String servicios) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
        this.servicio = servicios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }
}
