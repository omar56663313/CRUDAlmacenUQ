package com.cruddf.crudalmacen;

public class productoRefrigerado extends Producto implements DisplayableItem{

    String codigo;

    String temperatura;

    String tipo = "Refrigerado";

    public productoRefrigerado(String nombre, String descripcion, String valorUnitario, String cantidadExistencias,String id, String codigo, String temperatura) {
        super(nombre, descripcion, valorUnitario, cantidadExistencias, id);

        this.codigo = codigo;
        this.temperatura = temperatura;

    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    @Override
    public String getTemperatura() {
        return this.temperatura;
    }

    @Override
    public String getCode() {
        return this.codigo;
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
    public String getVencimiento() {
        return "No registra";
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }


    @Override
    String getTipo() {
        return "productoRefrigerado";
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
    public String getCantidadExistencias() {
        return this.cantidadExistencias;
    }

    @Override
    public String getType() {
        return this.tipo;
    }
}