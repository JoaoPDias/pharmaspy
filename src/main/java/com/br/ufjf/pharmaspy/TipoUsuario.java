package com.br.ufjf.pharmaspy;

public enum TipoUsuario {
    CONSUMIDOR("Consumidor"),FARMACEUTICO("Farmacêutico"),SERVIDOR("Servidor");
    private String tipo;

    TipoUsuario(String tipo) {
        this.tipo = tipo;
    }
}
