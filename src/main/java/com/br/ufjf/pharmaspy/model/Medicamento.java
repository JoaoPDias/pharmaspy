package com.br.ufjf.pharmaspy.model;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Medicamento {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idMedicamento;
    private String nomeMedicamento;
    private String principioAtivo;
    @OneToOne
    private Usuario usuarioServidor;
    @OneToOne
    private Farmaceutica farmaceutica;
    private String registro;
    @CreationTimestamp
    private LocalDateTime dataCadastro;
    @OneToMany
    private List<ReacaoMedicamento> reacaoMedicamentos;

    public Medicamento() {
    }

    public Medicamento(String nomeMedicamento, String principioAtivo, Usuario usuarioServidor, Farmaceutica farmaceutica, String registro, LocalDateTime dataCadastro, List<ReacaoMedicamento> reacaoMedicamentos) {
        this.nomeMedicamento = nomeMedicamento;
        this.principioAtivo = principioAtivo;
        this.usuarioServidor = usuarioServidor;
        this.farmaceutica = farmaceutica;
        this.registro = registro;
        this.dataCadastro = dataCadastro;
        this.reacaoMedicamentos = reacaoMedicamentos;
    }

    public Long getIdMedicamento() {
        return idMedicamento;
    }

    public Medicamento setIdMedicamento(Long idMedicamento) {
        this.idMedicamento = idMedicamento;
        return this;
    }

    public String getNomeMedicamento() {
        return nomeMedicamento;
    }

    public Medicamento setNomeMedicamento(String nomeMedicamento) {
        this.nomeMedicamento = nomeMedicamento;
        return this;
    }

    public String getPrincipioAtivo() {
        return principioAtivo;
    }

    public Medicamento setPrincipioAtivo(String principioAtivo) {
        this.principioAtivo = principioAtivo;
        return this;
    }

    public Usuario getUsuarioServidor() {
        return usuarioServidor;
    }

    public Medicamento setUsuarioServidor(Usuario usuarioServidor) {
        this.usuarioServidor = usuarioServidor;
        return this;
    }

    public Farmaceutica getFarmaceutica() {
        return farmaceutica;
    }

    public Medicamento setFarmaceutica(Farmaceutica farmaceutica) {
        this.farmaceutica = farmaceutica;
        return this;
    }

    public String getRegistro() {
        return registro;
    }

    public Medicamento setRegistro(String registro) {
        this.registro = registro;
        return this;
    }

    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    public Medicamento setDataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
        return this;
    }

    public List<ReacaoMedicamento> getReacaoMedicamentos() {
        return reacaoMedicamentos;
    }

    public Medicamento setReacaoMedicamentos(List<ReacaoMedicamento> reacaoMedicamentos) {
        this.reacaoMedicamentos = reacaoMedicamentos;
        return this;
    }
}

