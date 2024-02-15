package com.example.propuestacultura.repository;

import com.example.propuestacultura.models.FormatosAdjuntoSolicitante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFormatosAdjuntosRepositorio extends JpaRepository<FormatosAdjuntoSolicitante, Integer> {
}
