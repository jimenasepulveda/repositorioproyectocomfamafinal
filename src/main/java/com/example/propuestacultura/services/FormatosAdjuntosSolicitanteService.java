package com.example.propuestacultura.services;

import com.example.propuestacultura.models.FormatosAdjuntoSolicitante;
import com.example.propuestacultura.repository.IFormatosAdjuntosRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormatosAdjuntosSolicitanteService {
    @Autowired
    IFormatosAdjuntosRepositorio iFormatosAdjuntosRepositorio;

    /*public FormatosAdjuntoSolicitante agregarFormatosAdjunto(FormatosAdjuntoSolicitante registrarFormaFormatosAdjunto){}

    public List<FormatosAdjuntoSolicitante> buscarFormatosAdjunto(){}

    public FormatosAdjuntoSolicitante buscarFormatosAdjuntoPorId(Integer idAdjuntoSolicitante){}

    public FormatosAdjuntoSolicitante modificarFormatosAdjuntoPorId(Integer idAdjuntoSolicitante, FormatosAdjuntoSolicitante modificarFormatosAdjuntoPorId){}

    public Boolean eliminarFormatosAdjunto(Integer idAdjuntoSolicitante){}*/
}

