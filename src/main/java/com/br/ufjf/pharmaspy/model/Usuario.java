package com.br.ufjf.pharmaspy.model;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idUsuario;
    @Column(unique = true)
    private String nome;
    private String dataNascimento;
    private String CPF;
    @Enumerated
    private TipoUsuario tipoUsuario;
    @Column(unique = true)
    private String email;
    private String senha;
    @Column(updatable=false)
    @CreationTimestamp
    private LocalDateTime dataCriacao;

    public Long getIdUsuario() {
        return idUsuario;
    }

    public Usuario setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Usuario setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public Usuario setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
        return this;
    }

    public String getCPF() {
        return CPF;
    }

    public Usuario setCPF(String CPF) {
        this.CPF = CPF;
        return this;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public Usuario setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Usuario setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getSenha() {
        return senha;
    }

    public Usuario setSenha(String senha) {
        this.senha = senha;
        return this;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public Usuario setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
        return this;
    }
}
