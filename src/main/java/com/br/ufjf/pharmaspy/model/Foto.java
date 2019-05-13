package com.br.ufjf.pharmaspy.model;

import javax.persistence.*;

@Entity
public class Foto {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idFoto;
    private String caminhoArquivo;
    private String nomeArquivo;
    @OneToOne
    private Chamado chamado;

    public Foto() {
    }

    public Foto(String caminhoArquivo, String nomeArquivo, Chamado chamado) {
        this.caminhoArquivo = caminhoArquivo;
        this.nomeArquivo = nomeArquivo;
        this.chamado = chamado;
    }

    public Long getIdFoto() {
        return idFoto;
    }

    public Foto setIdFoto(Long idFoto) {
        this.idFoto = idFoto;
        return this;
    }

    public String getCaminhoArquivo() {
        return caminhoArquivo;
    }

    public Foto setCaminhoArquivo(String caminhoArquivo) {
        this.caminhoArquivo = caminhoArquivo;
        return this;
    }

    public String getNomeArquivo() {
        return nomeArquivo;
    }

    public Foto setNomeArquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
        return this;
    }

    public Chamado getChamado() {
        return chamado;
    }

    public Foto setChamado(Chamado chamado) {
        this.chamado = chamado;
        return this;
    }
}
