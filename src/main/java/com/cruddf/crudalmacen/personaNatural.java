package com.cruddf.crudalmacen;

public class personaNatural extends Cliente implements DisplayableClient{

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    String email;
    String nacimiento;

    public personaNatural(String nombre, String apellidos, String identificacion, String direccion, String telefono, String email, String nacimiento) {
        super(nombre, apellidos, identificacion, direccion, telefono);
        this.email = email;
        this.nacimiento = nacimiento;
    }

    @Override
    public String getTipo() {
        return "Natural";
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
        return "No registra";
    }

    @Override
    public String getFecha() {
        return this.nacimiento;
    }

    @Override
    public String getEmail() {
        return this.email;
    }
}