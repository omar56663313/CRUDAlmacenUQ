package com.cruddf.crudalmacen;

public abstract class Cliente
{
    String nombre;
    String apellidos;
    String identificacion;

    String direccion;

    String telefono;


    public Cliente(String nombre, String apellidos, String identificacion, String direccion, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.identificacion = identificacion;
        this.direccion = direccion;
        this.telefono = telefono;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }


    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    public abstract String getTipo();



}
