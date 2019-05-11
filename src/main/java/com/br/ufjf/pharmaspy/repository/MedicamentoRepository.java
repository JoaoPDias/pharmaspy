package com.br.ufjf.pharmaspy.repository;

import com.br.ufjf.pharmaspy.model.Chamado;
import com.br.ufjf.pharmaspy.model.Medicamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicamentoRepository extends JpaRepository<Medicamento, Long> {
}
