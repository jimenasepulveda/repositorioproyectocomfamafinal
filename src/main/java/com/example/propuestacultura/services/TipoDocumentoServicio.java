package com.example.propuestacultura.services;

import com.example.propuestacultura.models.TipoDocumento;
import com.example.propuestacultura.repository.ITipoDocumentoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoDocumentoServicio {
    @Autowired
    ITipoDocumentoRepositorio iTipoDocumentoRepositorio;

    public TipoDocumento agregarTipoDocumento(TipoDocumento agregarTipoDocumento) throws Exception {
        try {
            return this.iTipoDocumentoRepositorio.save(agregarTipoDocumento);
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }


    /*public List<TipoDocumento> buscarTipoDocumento(){}

    public TipoDocumento buscarTipoDocumentoPorId(Integer idTipoDocumento){}

    public TipoDocumento modificarTipoDocumento(Integer idTipoDocumento, TipoDocumento modificarTipoDocumento){}

    public Boolean eliminarTipoDocumento(Integer IdTipoDocumento){}*/
}
