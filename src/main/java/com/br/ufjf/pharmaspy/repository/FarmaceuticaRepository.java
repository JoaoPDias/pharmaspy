package com.br.ufjf.pharmaspy.repository;

import com.br.ufjf.pharmaspy.model.Chamado;
import com.br.ufjf.pharmaspy.model.Farmaceutica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FarmaceuticaRepository extends JpaRepository<Farmaceutica, Long> {
}
