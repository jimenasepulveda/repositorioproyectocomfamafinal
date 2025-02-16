package com.example.propuestacultura.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "propuestas")
public class Propuesta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_propuesta")
    private Integer idPropuesta;
    @ManyToOne
    @JoinColumn(name = "id_solicitante", referencedColumnName = "id_solicitante")
    private Solicitante solicitante;
    @ManyToOne
    @JoinColumn(name = "id_estado", referencedColumnName = "id_estado")
    private Estados estado;
    @Column(name = "municipio")
    private String municipio;
    @Column(name = "nombre_propuesta")
    private String nombrePropuesta;
    @Column(name = "presentacion_general")
    private String presentacionGeneral;
    @Column(name = "fecha_presentacion_propuesta")
    private LocalDate fechaPresentacionPropuesta;
    @Column(name = "descripcion_actividades")
    private String descripcionActividades;
    @Column(name = "publico_beneficiado")
    private String publicoBeneficiado;
    @Column(name = "entidades_aliadas")
    private String entidadesAliadas;
    @Column(name = "contraprestaciones")
    private String contraprestaciones;
    @Column(name = "monto_total")
    private Float montoTotal;
    @Column(name = "aporte_comfama_monetario")
    private Double aporteComfamaMonetario;
    @Column(name = "aporte_comfama_especie")
    private String aporteComfamaEspecie;
    @Column(name = "porcentaje_aporte_confama")
    private Double porcentajeAporteComfama;
    @Column(name = "trayectoria")
    private String trayectoria;





    public Integer getIdPropuesta() {
        return idPropuesta;
    }

    public void setIdPropuesta(Integer idPropuesta) {
        this.idPropuesta = idPropuesta;
    }

    public Solicitante getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(Solicitante solicitante) {
        this.solicitante = solicitante;
    }

    public Estados getEstado() {
        return estado;
    }

    public void setEstado(Estados estado) {
        this.estado = estado;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getNombrePropuesta() {
        return nombrePropuesta;
    }

    public void setNombrePropuesta(String nombrePropuesta) {
        this.nombrePropuesta = nombrePropuesta;
    }

    public String getPresentacionGeneral() {
        return presentacionGeneral;
    }

    public void setPresentacionGeneral(String presentacionGeneral) {
        this.presentacionGeneral = presentacionGeneral;
    }

    public LocalDate getFechaPresentacionPropuesta() {
        return fechaPresentacionPropuesta;
    }

    public void setFechaPresentacionPropuesta(LocalDate fechaPresentacionPropuesta) {
        this.fechaPresentacionPropuesta = fechaPresentacionPropuesta;
    }

    public String getDescripcionActividades() {
        return descripcionActividades;
    }

    public void setDescripcionActividades(String descripcionActividades) {
        this.descripcionActividades = descripcionActividades;
    }

    public String getPublicoBeneficiado() {
        return publicoBeneficiado;
    }

    public void setPublicoBeneficiado(String publicoBeneficiado) {
        this.publicoBeneficiado = publicoBeneficiado;
    }

    public String getEntidadesAliadas() {
        return entidadesAliadas;
    }

    public void setEntidadesAliadas(String entidadesAliadas) {
        this.entidadesAliadas = entidadesAliadas;
    }

    public String getContraprestaciones() {
        return contraprestaciones;
    }

    public void setContraprestaciones(String contraprestaciones) {
        this.contraprestaciones = contraprestaciones;
    }

    public Float getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(Float montoTotal) {
        this.montoTotal = montoTotal;
    }

    public Double getAporteComfamaMonetario() {
        return aporteComfamaMonetario;
    }

    public void setAporteComfamaMonetario(Double aporteComfamaMonetario) {
        this.aporteComfamaMonetario = aporteComfamaMonetario;
    }

    public String getAporteComfamaEspecie() {
        return aporteComfamaEspecie;
    }

    public void setAporteComfamaEspecie(String aporteComfamaEspecie) {
        this.aporteComfamaEspecie = aporteComfamaEspecie;
    }

    public Double getPorcentajeAporteComfama() {
        return porcentajeAporteComfama;
    }

    public void setPorcentajeAporteComfama(Double porcentajeAporteComfama) {
        this.porcentajeAporteComfama = porcentajeAporteComfama;
    }

    public String getTrayectoria() {
        return trayectoria;
    }

    public void setTrayectoria(String trayectoria) {
        this.trayectoria = trayectoria;
    }
}
