package com.example.propuestacultura.services;

import com.example.propuestacultura.models.Estados;
import com.example.propuestacultura.repository.IEstadosRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstadosServicio {
    @Autowired
    IEstadosRepositorio iEstadosRepositorio;

    //Listan los metodos para accionar la logica de negocio
    //Almacenar en la Bd Estado
    public Estados agregarEstado(Estados agregarEstado) throws Exception{
        try {
            //Aplico las validaciones necesarias
            //LLama al repositorio o intenta realizar la op en BD

            return this.iEstadosRepositorio.save(agregarEstado);

        }catch(Exception error){
            throw new Exception(error.getMessage());
        }
    }

    //Buscar todos los estados que hay en la BD
    /*public List<Estados> buscarEstados(){}

    //Buscar un estado por Id
    public Estados buscarEstadoPorId(Integer idEstado){}

    //Modificar el nombre de un estado
    public Estados modificarEstado(Integer idEstado, Estados modificarEstado){}

    //Eliminar un estado
    public Boolean eliminarEstado(Integer IdEstado){}*/
}
