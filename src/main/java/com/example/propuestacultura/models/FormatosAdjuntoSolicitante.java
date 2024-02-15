package com.example.propuestacultura.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "formatos_adjuntos_solicitante")
public class FormatosAdjuntoSolicitante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_adjunto_solicitante")
    private Integer idAdjuntoSolicitante;
    @OneToOne
    @JoinColumn(name = "id_propuesta", referencedColumnName = "id_propuesta")
    private Propuesta propuesta;
    @Column(name = "nombre_formato_inhabilidades")
    private String nombreFormatoInhabilidades;
    @Column(name = "extra_data")
    private String extraDatas;





    public Integer getIdAdjuntoSolicitante() {
        return idAdjuntoSolicitante;
    }

    public void setIdAdjuntoSolicitante(Integer idAdjuntoSolicitante) {
        this.idAdjuntoSolicitante = idAdjuntoSolicitante;
    }

    public Propuesta getPropuesta() {
        return propuesta;
    }

    public void setPropuesta(Propuesta propuesta) {
        this.propuesta = propuesta;
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
