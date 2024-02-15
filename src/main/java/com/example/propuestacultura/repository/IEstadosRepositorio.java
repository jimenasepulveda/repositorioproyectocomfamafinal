package com.example.propuestacultura.repository;

import com.example.propuestacultura.models.Estados;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEstadosRepositorio extends JpaRepository<Estados, Integer> {

}
