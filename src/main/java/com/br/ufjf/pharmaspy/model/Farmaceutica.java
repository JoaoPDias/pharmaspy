package com.br.ufjf.pharmaspy.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Farmaceutica {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idFarmaceutica;
    private String nome;
    private String cnpj;

    public Long getIdFarmaceutica() {
        return idFarmaceutica;
    }

    public Farmaceutica setIdFarmaceutica(Long idFarmaceutica) {
        this.idFarmaceutica = idFarmaceutica;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Farmaceutica setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getCnpj() {
        return cnpj;
    }

    public Farmaceutica setCnpj(String cnpj) {
        this.cnpj = cnpj;
        return this;
    }
}
