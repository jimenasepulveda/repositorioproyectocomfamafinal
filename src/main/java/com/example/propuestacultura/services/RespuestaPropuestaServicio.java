package com.example.propuestacultura.services;

import com.example.propuestacultura.models.RespuestaPropuesta;
import com.example.propuestacultura.repository.IPropuestaRepositorio;
import com.example.propuestacultura.repository.IRespuestaPropuestaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RespuestaPropuestaServicio {

    @Autowired
    IRespuestaPropuestaRepositorio iRespuestaPropuestaRepositorio;
    /*public RespuestaPropuesta agregarPropuesta(RespuestaPropuesta agregarRespuestaPropuesta){}

    public List<RespuestaPropuesta> buscarRespuestaPropuesta(){}

    public RespuestaPropuesta buscarRespuestaPropuestaPorId(Integer idPropuesta){}

    public RespuestaPropuesta modificarRespuestaPropuesta(Integer idRespuestaPropuesta, RespuestaPropuesta modificarRespuestaPropuesta){}

    public Boolean eliminarPropuesta(Integer IdPropuesta){}*/
}
