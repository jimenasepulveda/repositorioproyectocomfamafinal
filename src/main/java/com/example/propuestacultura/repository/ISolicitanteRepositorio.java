package com.example.propuestacultura.repository;

import com.example.propuestacultura.models.Solicitante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISolicitanteRepositorio extends JpaRepository<Solicitante, Integer> {
}
