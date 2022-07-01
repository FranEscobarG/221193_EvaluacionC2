package com.upchiapas.hveterinaria.models;

import java.util.ArrayList;

public class Expediente {
    ArrayList<Mascota> expediente = new ArrayList<Mascota>();
    public void agregarMascota(Mascota mascota){
        expediente.add(mascota);
    }

    public void buscarMascota(String id){
        for (int i=0; i<expediente.size(); i++){
            if(id==expediente.get(i).getId()){

            }
        }

    }

    public void mostrarExpediente(){

    }
}
