package com.example.propuestacultura.DTO;

public class FormatosAdjuntosSolicitanteDTO {
    private String nombreFormatoInhabilidades;
    private String extraDatas;


    public FormatosAdjuntosSolicitanteDTO() {
    }

    public FormatosAdjuntosSolicitanteDTO(String nombreFormatoInhabilidades, String extraDatas) {
        this.nombreFormatoInhabilidades = nombreFormatoInhabilidades;
        this.extraDatas = extraDatas;
    }


    public String getNombreFormatoInhabilidades() {
        return nombreFormatoInhabilidades;
    }

    public void setNombreFormatoInhabilidades(String nombreFormatoInhabilidades) {
        this.nombreFormatoInhabilidades = nombreFormatoInhabilidades;
    }

    public String getExtraDatas() {
        return extraDatas;
    }

    public void setExtraDatas(String extraDatas) {
        this.extraDatas = extraDatas;
    }
}
