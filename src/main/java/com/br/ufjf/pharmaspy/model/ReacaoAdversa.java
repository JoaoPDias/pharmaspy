package com.br.ufjf.pharmaspy.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ReacaoAdversa {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idReacao;
    private String titulo;
    private String descricao;

    public ReacaoAdversa() {
    }

    public ReacaoAdversa(String titulo) {
        this.titulo = titulo;
    }

    public Long getIdReacao() {
        return idReacao;
    }

    public ReacaoAdversa setIdReacao(Long idReacao) {
        this.idReacao = idReacao;
        return this;
    }

    public String getTitulo() {
        return titulo;
    }

    public ReacaoAdversa setTitulo(String titulo) {
        this.titulo = titulo;
        return this;
    }

    public String getDescricao() {
        return descricao;
    }

    public ReacaoAdversa setDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }
}
