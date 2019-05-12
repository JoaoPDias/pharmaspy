package com.br.ufjf.pharmaspy.model;

import javax.persistence.*;

@Entity
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idEndereco;
    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;
    @OneToOne
    private Chamado chamado;

    public String getCep() {
        return cep;
    }

    public Endereco setCep(String cep) {
        this.cep = cep;
        return this;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public Endereco setLogradouro(String logradouro) {
        this.logradouro = logradouro;
        return this;
    }

    public String getComplemento() {
        return complemento;
    }

    public Endereco setComplemento(String complemento) {
        this.complemento = complemento;
        return this;
    }

    public String getBairro() {
        return bairro;
    }

    public Endereco setBairro(String bairro) {
        this.bairro = bairro;
        return this;
    }

    public String getLocalidade() {
        return localidade;
    }

    public Endereco setLocalidade(String localidade) {
        this.localidade = localidade;
        return this;
    }

    public String getUf() {
        return uf;
    }

    public Endereco setUf(String uf) {
        this.uf = uf;
        return this;
    }
}
