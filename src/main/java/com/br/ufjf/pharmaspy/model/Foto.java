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
}
