package com.upchiapas.hveterinaria;

import com.upchiapas.hveterinaria.models.*;

import java.util.Scanner;

public class Main {
    static Scanner entrada = new Scanner(System.in);
    static Cliente cliente;
    static Expediente carnet;
    static Veterinaria veterinaria;

    public static void main(String[] args) {
        mostrarMenu();
    }

    public static void mostrarMenu(){
        byte opcion = 0;
        do {
            System.out.println("**     VETERINARIA LA UP     **");
            System.out.println("* [1]- Servicio Veterinario   *");
            System.out.println("* [2]- Comprar Productos      *");
            System.out.println("* [3]- Buscar Expedinte       *");
            System.out.println("**       [4]- SALIR          **");
            System.out.println("Elija una opcion: ");
            opcion=entrada.nextByte();

            registrarCliente();

            switch (opcion){
                case 1:
                    registrarCliente();
                    break;
                case 2:
                    veterinaria.ventaProductos();
                    break;
                case 3:
                    //System.out.println("Ah salido del programa.");
                    break;
                case 4:
                    System.out.println("Ah salido del programa.");
                    break;
                default:
                    System.out.println("Opcion invalida. Intentelo de nuevo...");
            }
        }while(opcion!=4);
    }
    public static void registrarCliente(){
        String nombre,id,nomMascota,idMascota;
        byte edad;
        System.out.println("Nombre del Cliente: ");
        nombre=entrada.nextLine();
        System.out.println("ID del Cliente: ");
        id=entrada.nextLine();

        System.out.println("---- Registro de mascota ----");
        System.out.println("Nombre la mascota: ");
        nomMascota=entrada.nextLine();
        System.out.println("ID de la mascota: ");
        idMascota=entrada.nextLine();
        System.out.println("Edad de la mascota: ");
        edad=entrada.nextByte();

        mostrarServicios(nomMascota,idMascota,edad,nombre,id);
    }
    public static void mostrarServicios(String nomMascota,String idMascota,byte edad,String nom,String id){
        String servicio = "";
        byte opc,tipoMascota;
        System.out.println("- - - ¿Que servicio desea? - - -");
        System.out.println("  [1]- Tratamiento Clinico");
        System.out.println("  [2]- Vacunación");
        System.out.println("  [3]- Analisis de Sangre");
        System.out.println("  [4]- Evaluación Quirúrgica");
        System.out.println("Elija una opcion: ");
        opc=entrada.nextByte();
        switch (opc){
            case 1:
                servicio="Tratamiento Clinico";
                break;
            case 2:
                servicio="Vacunación";
                break;
            case 3:
                servicio="Analisis de Sangre";
                break;
            case 4:
                servicio="Evaluación Quirúrgica";
                break;
        }

        System.out.println("* Tipo de mascota *");
        System.out.println("  [1]- Perro");
        System.out.println("  [2]- Gato");
        System.out.println("  [3]- Roedor");
        System.out.println("---: ");
        tipoMascota=entrada.nextByte();
        switch (tipoMascota){
            case 1:
                Perro perro = new Perro(nomMascota,idMascota,edad,servicio,mostrarRazasPerro());
                cliente = new Cliente(perro,nom,id);
                carnet.agregarMascota(perro);
                break;
            case 2:
                Gato gato = new Gato(nomMascota,idMascota,edad,servicio,mostrarTiposGato());
                cliente = new Cliente(gato,nom,id);
                carnet.agregarMascota(gato);
                break;
            case 3:
                Roedor roedor = new Roedor(nomMascota,idMascota,edad,servicio,mostrarTiposRoedor());
                cliente = new Cliente(roedor,nom,id);
                carnet.agregarMascota(roedor);
                break;
            default:
                System.out.println("Opcion invalida.");
        }
        veterinaria.agregarCliente(cliente);
    }
    public static String mostrarRazasPerro(){
        byte opcP;
        String razaPerro="";
        System.out.println("- Razas de Perros -");
        System.out.println("  [1]- Husky");
        System.out.println("  [2]- Bulldog");
        System.out.println("  [3]- Labrador");
        System.out.println("---: ");
        opcP=entrada.nextByte();
        switch (opcP){
            case 1:
                razaPerro="Husky";
                break;
            case 2:
                razaPerro="Bulldog";
                break;
            case 3:
                razaPerro="Labrador";
                break;
            default:
                System.out.println("Opcion invalida.");
        }
        return razaPerro;
    }
    public static String mostrarTiposGato(){
        byte opcG;
        String tipoGato="";
        System.out.println("- Tipo de Gato -");
        System.out.println("  [1]- Abisinio");
        System.out.println("  [2]- Siamés");
        System.out.println("  [3]- Ragdoll");
        System.out.println("---: ");
        opcG=entrada.nextByte();
        switch (opcG){
            case 1:
                tipoGato="Abisinio";
                break;
            case 2:
                tipoGato="Siamés";
                break;
            case 3:
                tipoGato="Ragdoll";
                break;
            default:
                System.out.println("Opcion invalida.");
        }
        return tipoGato;
    }
    public static String mostrarTiposRoedor(){
        byte opcR;
        String tipoRoedor="";
        System.out.println("Tipo de Roedore");
        System.out.println("  [1]- Ratón");
        System.out.println("  [2]- Hamster");
        System.out.println("  [3]- Ardilla");
        System.out.println("---: ");
        opcR=entrada.nextByte();
        switch (opcR){
            case 1:
                tipoRoedor="Ratón";
                break;
            case 2:
                tipoRoedor="Hamster";
                break;
            case 3:
                tipoRoedor="Ardilla";
                break;
            default:
                System.out.println("Opcion invalida.");
        }
        return tipoRoedor;
    }
    public static void buscarMascota(){
        String id;
        System.out.println("Ingrese id de la mascota");
        id=entrada.nextLine();
        carnet.buscarMascota(id);
    }

}
