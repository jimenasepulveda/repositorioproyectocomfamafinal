package com.example.propuestacultura.repository;

import com.example.propuestacultura.models.Notificaciones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface INotificacionesRepositorio extends JpaRepository<Notificaciones, Integer> {
}
