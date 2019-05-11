package com.br.ufjf.pharmaspy.repository;

import com.br.ufjf.pharmaspy.model.Chamado;
import com.br.ufjf.pharmaspy.model.Foto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FotoRepository extends JpaRepository<Foto, Long> {
}
