package com.br.ufjf.pharmaspy.repository;

import com.br.ufjf.pharmaspy.model.Chamado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChamadoRepository extends JpaRepository<Chamado, Long> {
}
