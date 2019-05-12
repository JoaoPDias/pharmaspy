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

}
