package com.example.propuestacultura.repository;

import com.example.propuestacultura.models.TipoDocumento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITipoDocumentoRepositorio extends JpaRepository<TipoDocumento, Integer> {
}
