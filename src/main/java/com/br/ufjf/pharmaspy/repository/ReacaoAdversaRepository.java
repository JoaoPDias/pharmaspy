package com.br.ufjf.pharmaspy.repository;

import com.br.ufjf.pharmaspy.model.Chamado;
import com.br.ufjf.pharmaspy.model.ReacaoAdversa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReacaoAdversaRepository extends JpaRepository<ReacaoAdversa, Long> {
}
