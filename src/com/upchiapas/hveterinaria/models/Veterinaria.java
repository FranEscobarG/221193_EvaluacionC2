package com.upchiapas.hveterinaria.models;

import java.util.ArrayList;
import java.util.Scanner;

public class Veterinaria {
    ArrayList <Cliente> listaClientes = new ArrayList<Cliente>();
    //Orden orden;


    public Veterinaria(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public void agregarCliente(Cliente cliente){
        listaClientes.add(cliente);
    }

    public void ventaProductos(){

    }
}
