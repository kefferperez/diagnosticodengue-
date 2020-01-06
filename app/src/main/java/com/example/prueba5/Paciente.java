package com.example.prueba5;

public class Paciente {
    private String Codigo;
    private String Nombre;
    private String ApellidoPaterno;
    private String ApellidoMaterno;
    public Paciente(String Codigo, String Nombre, String ApellidoPaterno, String ApellidoMaterno) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.ApellidoPaterno= ApellidoPaterno;
        this.ApellidoMaterno= ApellidoMaterno;
    }
    public String getCodigo() {
        return Codigo;
    }
    public String getNombre() {
        return Nombre;
    }
    public String getApellidoPaterno() {
        return ApellidoPaterno;
    }
    public String getApellidoMaterno() {
        return ApellidoMaterno;
    }
}
