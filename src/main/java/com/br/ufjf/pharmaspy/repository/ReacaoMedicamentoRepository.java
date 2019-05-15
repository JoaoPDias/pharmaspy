package com.br.ufjf.pharmaspy.repository;

import com.br.ufjf.pharmaspy.model.Chamado;
import com.br.ufjf.pharmaspy.model.Medicamento;
import com.br.ufjf.pharmaspy.model.ReacaoMedicamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReacaoMedicamentoRepository extends JpaRepository<ReacaoMedicamento, Long> {

    List<ReacaoMedicamento> findAllByMedicamento(Medicamento medicamento);
}
