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
}
