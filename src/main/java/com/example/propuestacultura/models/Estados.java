package com.example.propuestacultura.models;

import com.example.propuestacultura.helpers.EstadosPropuesta;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "estados")
public class Estados {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estado")
    private Integer idEstado;
    @Column(name = "estado")
    @Enumerated(EnumType.STRING)
    private EstadosPropuesta estado=EstadosPropuesta.INICIO;



    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstados) {
        this.idEstado = idEstados;
    }

    public EstadosPropuesta getEstado() {
        return estado;
    }

    public void setEstado(EstadosPropuesta estado) {
        this.estado = estado;
    }
}
