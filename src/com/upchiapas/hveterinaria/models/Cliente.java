package com.upchiapas.hveterinaria.models;

import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {
    Mascota objMascota;
    //ArrayList<Mascota> listaMascotas = new ArrayList<Mascota>();
    String nombre,idCliente;

    public Cliente(Mascota objMascota, String nombre, String idCliente) {
        this.objMascota = objMascota;
        this.nombre = nombre;
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public Mascota getObjMascota() {
        return objMascota;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setObjMascota(Mascota objMascota) {
        this.objMascota = objMascota;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }
}
