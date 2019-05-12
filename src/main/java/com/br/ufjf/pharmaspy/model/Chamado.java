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
}
