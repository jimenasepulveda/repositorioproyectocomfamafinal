package com.example.propuestacultura.services;

import com.example.propuestacultura.models.Notificaciones;
import com.example.propuestacultura.repository.INotificacionesRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificacionesService {
    @Autowired
    INotificacionesRepositorio iNotificacionesRepositorio;

    /*public Notificaciones agregarNotificacion(Notificaciones registrarNotificacion){}

    public List<Notificaciones> buscarNotificacion(){}

    public Notificaciones buscarNotificacionPorId(Integer idNotificacion){}

    public Notificaciones modificarNotificacion(Integer idNotificacion, Notificaciones modificarNotificacion){}

    public Boolean eliminarNotificacion (Integer idNotificacion){}*/
}