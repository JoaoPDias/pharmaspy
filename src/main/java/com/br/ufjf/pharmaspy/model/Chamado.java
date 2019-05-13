package com.br.ufjf.pharmaspy.model;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Chamado {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idChamado;
    @OneToOne
    private Usuario usuarioCriador;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dataAquisicao;
    @OneToOne
    private Endereco localAquisicao;
    private String farmacia;
    private String relato;
    @CreationTimestamp
    private LocalDateTime dataCadastro;
    @OneToOne
    private Medicamento medicamento;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dataValidade;
    private String lote;
    @ManyToMany
    private List<ReacaoMedicamento> reacaoMedicamento;
    @OneToMany
    private List<Foto> fotos;

    public Long getIdChamado() {
        return idChamado;
    }

    public Chamado setIdChamado(Long idChamado) {
        this.idChamado = idChamado;
        return this;
    }

    public Usuario getUsuarioCriador() {
        return usuarioCriador;
    }

    public Chamado setUsuarioCriador(Usuario usuarioCriador) {
        this.usuarioCriador = usuarioCriador;
        return this;
    }

    public LocalDate getDataAquisicao() {
        return dataAquisicao;
    }

    public Chamado setDataAquisicao(LocalDate dataAquisicao) {
        this.dataAquisicao = dataAquisicao;
        return this;
    }

    public Endereco getLocalAquisicao() {
        return localAquisicao;
    }

    public Chamado setLocalAquisicao(Endereco localAquisicao) {
        this.localAquisicao = localAquisicao;
        return this;
    }

    public String getRelato() {
        return relato;
    }

    public Chamado setRelato(String relato) {
        this.relato = relato;
        return this;
    }

    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    public Chamado setDataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
        return this;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public Chamado setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
        return this;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public Chamado setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
        return this;
    }

    public String getLote() {
        return lote;
    }

    public Chamado setLote(String lote) {
        this.lote = lote;
        return this;
    }

    public List<ReacaoMedicamento> getReacaoMedicamento() {
        return reacaoMedicamento;
    }

    public Chamado setReacaoMedicamento(List<ReacaoMedicamento> reacaoMedicamento) {
        this.reacaoMedicamento = reacaoMedicamento;
        return this;
    }

    public List<Foto> getFotos() {
        return fotos;
    }

    public Chamado setFotos(List<Foto> fotos) {
        this.fotos = fotos;
        return this;
    }

    public String getFarmacia() {
        return farmacia;
    }

    public Chamado setFarmacia(String farmacia) {
        this.farmacia = farmacia;
        return this;
    }
}
