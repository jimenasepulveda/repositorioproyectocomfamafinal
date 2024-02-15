package com.example.propuestacultura.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "respuesta_propuesta")
public class RespuestaPropuesta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_respuesta_propuesta")
    private Integer idRespuestaPropuesta;
    @OneToOne
    @JoinColumn(name = "id_propuesta", referencedColumnName = "id_propuesta")
    private Propuesta propuesta;
    @Column(name = "fecha_recepcion")
    private LocalDate fechaRecepcion;
    @Column(name = "consulta_listas_publicas")
    private Boolean consultaListasPublicas;
    @Column(name = "area_receptora")
    private String areaReceptora;
    @Column(name = "negocio")
    private String negocio;//ENUM
    @Column(name = "observaciones")
    private String observaciones;
    @Column(name = "se_apoya")
    private Boolean seApoya;
    @Column(name = "descripcion_apoyo")
    private String descripcionApoyo;
    @Column(name = "respuesta")
    private String respuesta;
    @Column(name = "encargado_respuesta")
    private String encargadoRespuesta;
    @Column(name = "medio_notificacion")
    private String medioNotificacion;

}
