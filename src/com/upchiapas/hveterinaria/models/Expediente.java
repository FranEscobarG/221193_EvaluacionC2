package com.upchiapas.hveterinaria.models;

import java.util.ArrayList;

public class Expediente {
    ArrayList<Mascota> expediente = new ArrayList<Mascota>();
    public void agregarMascota(Mascota mascota){
        expediente.add(mascota);
    }

    public void buscarMascota(){

    }

    public void mostrarExpediente(){

    }
}
