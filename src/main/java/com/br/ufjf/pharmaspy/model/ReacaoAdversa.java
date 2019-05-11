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
}
