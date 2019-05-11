package com.br.ufjf.pharmaspy;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idUsuario;
    @Column(unique = true)
    private String CPF;
    @Enumerated
    private TipoUsuario tipoUsuario;
    @Column(unique = true)
    private String email;
    private String senha;
    @Column(updatable=false)
    @CreationTimestamp
    private LocalDateTime dataCriacao;

}
