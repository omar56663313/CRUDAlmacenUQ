package com.cruddf.crudalmacen;

public class personaJuridica extends Cliente implements DisplayableClient{

    public void setNit(String nit) {
        this.nit = nit;
    }

    String nit;

    String tipo = "Juridica";

    public personaJuridica(String nombre, String apellidos, String identificacion, String direccion, String telefono, String nit) {
        super(nombre, apellidos, identificacion, direccion, telefono);
        this.nit = nit;
    }


    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public String getApellido() {
        return this.apellidos;
    }

    @Override
    public String getDireccion() {
        return this.direccion;
    }

    @Override
    public String getId() {
        return this.identificacion;
    }

    @Override
    public String getTelefono() {
        return this.telefono;
    }

    @Override
    public String getNit() {
        return this.nit;
    }

    @Override
    public String getFecha() {
        return "No registra";
    }

    @Override
    public String getEmail() {
        return "No registra";
    }

    @Override
    public String getTipo() {
        return tipo;
    }
}
