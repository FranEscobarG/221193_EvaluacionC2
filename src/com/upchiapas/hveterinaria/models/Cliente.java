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

    public void registarMascota(){
        Scanner entrada=new Scanner(System.in);
        byte tipoMascota;
        System.out.println("- - - REGISTRO DE MASCOTAS - - -");
        System.out.println("  [1]- Perro");
        System.out.println("  [2]- Gato");
        System.out.println("  [3]- Roedor");
        System.out.println(" Tipo de mascota: ");
        tipoMascota=entrada.nextByte();
        switch (tipoMascota){
            case 1:
                //Roedor roedor = new Roedor();
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                System.out.println("Opcion invalida.");
        }
    }
    public void registrarRoedor(){
        String nomMascota,idMascota;
        int edad;
        System.out.println("Nombre de la mascota");
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
