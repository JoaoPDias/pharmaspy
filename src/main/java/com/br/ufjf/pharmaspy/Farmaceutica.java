package com.br.ufjf.pharmaspy;

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
    private String CNPJ;
}
