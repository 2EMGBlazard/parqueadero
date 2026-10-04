package com.parqueadero.parqueadero.model;


public class Espacio {
    private int id;
    private String tipo;      // "CARRO" o "MOTO"
    private String estado;    // "VACIO", "OCUPADO", "RESERVADO"
    private String usuario;   // Nombre del cliente o Placa

    // Constructor completo
    public Espacio(int id, String tipo, String estado, String usuario) {
        this.id = id;
        this.tipo = tipo;
        this.estado = estado;
        this.usuario = usuario;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}