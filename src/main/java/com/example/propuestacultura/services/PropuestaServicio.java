package com.example.propuestacultura.services;

import com.example.propuestacultura.models.Propuesta;
import com.example.propuestacultura.repository.IPropuestaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PropuestaServicio {
    @Autowired
    IPropuestaRepositorio iPropuestaRepositorio;

    /*public Propuesta agregarPropuesta(Propuesta agregarPropuesta) throws Exception{
        try {
            //Aplico las validaciones necesarias
            //LLama al repositorio o intenta realizar la op en BD

            return this.iPropuestaRepositorio.save(agregarPropuesta);

        }catch(Exception error){
            throw new Exception(error.getMessage());
        }
    }*/

    /*public List<Propuesta> buscarPropuesta(){}

    public Propuesta buscarPropuestaPorId(Integer idPropuesta){}

    public Propuesta modificarPropuesta(Integer idPropuesta, Propuesta modificarPropuesta){}

    public Boolean eliminarPropuesta(Integer IdPropuesta){}*/
}
