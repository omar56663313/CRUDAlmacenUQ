package com.cruddf.crudalmacen;

public class productoEnvasado extends Producto implements DisplayableItem {

    String peso;

    String origen;

    String tipo = "Envasado";


    public productoEnvasado(String nombre, String descripcion, String valorUnitario, String cantidadExistencias,String id, String peso, String origen) {
        super(nombre, descripcion, valorUnitario, cantidadExistencias, id);

        this.peso = peso;
        this.origen = origen;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }


    @Override
    String getTipo() {
        return "productoEnvasado";
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public String getDescripcion() {
        return this.descripcion;
    }

    @Override
    public String getValor() {
        return this.valorUnitario;
    }

    @Override
    public String getTemperatura() {
        return "No registra";
    }

    @Override
    public String getCode() {
        return "No registra";
    }

    @Override
    public String getPeso() {
        return this.peso;
    }

    @Override
    public String getOrigen() {
        return this.origen;
    }

    @Override
    public String getVencimiento() {
        return "No registra";
    }

    @Override
    public String getCantidadExistencias() {
        return this.cantidadExistencias;
    }

    @Override
    public String getType() {
        return this.tipo;
    }


}