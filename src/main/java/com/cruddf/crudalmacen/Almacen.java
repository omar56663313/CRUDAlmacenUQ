package com.cruddf.crudalmacen;

import java.util.ArrayList;


public class Almacen {

    public ArrayList<personaNatural> getClientNaturalList() {
        return clientNaturalList;
    }

    public ArrayList<personaJuridica> getClientJuridicoList() {
        return clientJuridicoList;
    }

    public  ArrayList <personaNatural> clientNaturalList = new ArrayList<>();
    public  ArrayList <personaJuridica> clientJuridicoList = new ArrayList<>();
    public  ArrayList <productoRefrigerado> RefrigeradoList = new ArrayList<>();

    public ArrayList <productoEnvasado> EnvasadosList = new ArrayList<>();
    public ArrayList <productoPerecedero> PerecederoList = new ArrayList<>();


    public ArrayList<productoRefrigerado> getRefrigeradoList() {
        return RefrigeradoList;
    }

    public ArrayList<productoEnvasado> getEnvasadosList() {
        return EnvasadosList;
    }

    public ArrayList<productoPerecedero> getPerecederoList() {
        return PerecederoList;
    }




    public void registrarPersonaNatural(String nombre, String apellido, String direccion, String telefono, String id,String email, String nacimiento) {
        personaNatural personaCurrentN = new personaNatural(nombre, apellido, id, direccion, telefono, email, nacimiento);
        clientNaturalList.add(personaCurrentN);

    }

    public void registrarPersonaJuridica(String nombre, String apellido, String direccion, String telefono, String id,String nit) {
        personaJuridica personaCurrentJ = new personaJuridica(nombre, apellido, id, direccion, telefono, nit);
        clientJuridicoList.add(personaCurrentJ);


    }


    public void registrarProductoRefrigerado(String nombre, String descripcion, String valorUnitario, String cantidadExistencia, String id, String temperature, String codigo) {

        productoRefrigerado currentFridge = new productoRefrigerado(nombre, descripcion, valorUnitario, cantidadExistencia, id, codigo, temperature);
        RefrigeradoList.add(currentFridge);

    }


    public void registrarProductoPerecedero(String nombre, String descripcion, String valorUnitario, String cantidadExistencia, String id, String fecha) {

        productoPerecedero currentPerecedero = new productoPerecedero(nombre, descripcion, valorUnitario, cantidadExistencia, id, fecha);
        PerecederoList.add(currentPerecedero);

    }

    public void registrarProductoEnvasado(String nombre, String descripcion, String valorUnitario, String cantidadExistencia, String id, String peso, String origen) {

        productoEnvasado currentEnvasado= new productoEnvasado(nombre, descripcion, valorUnitario, cantidadExistencia, id, peso, origen);
        EnvasadosList.add(currentEnvasado);

    }


}
