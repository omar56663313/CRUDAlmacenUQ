package com.cruddf.crudalmacen;

public class productoPerecedero extends Producto implements DisplayableItem{

    String tipo = "Perecedero";
    public productoPerecedero(String nombre, String descripcion, String valorUnitario, String cantidadExistencias,String id, String vencimiento) {
        super(nombre, descripcion, valorUnitario, cantidadExistencias, id);

        this.vencimiento = vencimiento;
    }

    @Override
    public String getVencimiento() {
        return this.vencimiento;
    }

    public void setVencimiento(String vencimiento) {
        this.vencimiento = vencimiento;
    }

    String vencimiento;

    @Override
    String getTipo() {
        return "productoPerecedero";
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
        return "No registra";
    }

    @Override
    public String getOrigen() {
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