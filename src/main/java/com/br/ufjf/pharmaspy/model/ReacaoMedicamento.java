package com.br.ufjf.pharmaspy.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class ReacaoMedicamento {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idReacaoMedicamento;
    @ManyToOne
    private Medicamento medicamento;
    @ManyToOne
    private ReacaoAdversa reacaoAdversa;
    private String grauPossibilidade;
    @ManyToMany
    private List<Chamado> chamados;

    public Long getIdReacaoMedicamento() {
        return idReacaoMedicamento;
    }

    public ReacaoMedicamento setIdReacaoMedicamento(Long idReacaoMedicamento) {
        this.idReacaoMedicamento = idReacaoMedicamento;
        return this;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public ReacaoMedicamento setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
        return this;
    }

    public ReacaoAdversa getReacaoAdversa() {
        return reacaoAdversa;
    }

    public ReacaoMedicamento setReacaoAdversa(ReacaoAdversa reacaoAdversa) {
        this.reacaoAdversa = reacaoAdversa;
        return this;
    }

    public String getGrauPossibilidade() {
        return grauPossibilidade;
    }

    public ReacaoMedicamento setGrauPossibilidade(String grauPossibilidade) {
        this.grauPossibilidade = grauPossibilidade;
        return this;
    }

    public List<Chamado> getChamados() {
        return chamados;
    }

    public ReacaoMedicamento setChamados(List<Chamado> chamados) {
        this.chamados = chamados;
        return this;
    }
}
