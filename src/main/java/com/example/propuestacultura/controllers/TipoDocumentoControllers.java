package com.example.propuestacultura.controllers;

import com.example.propuestacultura.models.TipoDocumento;
import com.example.propuestacultura.services.TipoDocumentoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/tipoDocumento")
public class TipoDocumentoControllers {
    @Autowired
    TipoDocumentoServicio tipoDocumentoServicio;

    @PostMapping
    public ResponseEntity<TipoDocumento> agregarTipoDocumento(@RequestBody TipoDocumento datosTipoDoc){
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(tipoDocumentoServicio.agregarTipoDocumento(datosTipoDoc));
        }catch (Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(null);
        }
    }
}
