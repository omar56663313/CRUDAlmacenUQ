package com.cruddf.crudalmacen;

public abstract class Producto {
    String nombre;

     String descripcion;

     String valorUnitario;

    String cantidadExistencias;

    public void setId(String id) {
        this.id = id;
    }

    String id;

    public Producto(String nombre, String descripcion, String valorUnitario, String cantidadExistencias, String id) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.valorUnitario = valorUnitario;
        this.cantidadExistencias = cantidadExistencias;
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    public void setValorUnitario(String valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public void setCantidadExistencias(String cantidadExistencias) {
        this.cantidadExistencias = cantidadExistencias;
    }

     abstract String getTipo();

}
