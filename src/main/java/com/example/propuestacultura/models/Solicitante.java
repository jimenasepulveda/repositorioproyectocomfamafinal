package com.example.propuestacultura.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Solicitantes")
public class Solicitante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_solicitante")
    private Integer idSolicitante;
    @Column(name = "nombre_proponente")
    private String nombreProponente;
    @ManyToOne
    @JoinColumn(name = "id_tipo_documento", referencedColumnName = "id_tipo_documento")
    private TipoDocumento tipoDocumeto;
    @Column(name = "nombres")
    private Integer nombres;
    @Column(name = "apellidos")
    private String apellidos;
    @Column(name = "numero_documento")
    private String numeroDocumento;
    @Column(name = "telefono_fijo")
    private String telefonoFijo;
    @Column(name = "telefono_celular")
    private String telefonoCelular;
    @Column(name = "correo")
    private String correo;




    public Integer getIdSolicitante() {
        return idSolicitante;
    }

    public void setIdSolicitante(Integer idSolicitante) {
        this.idSolicitante = idSolicitante;
    }

    public String getNombreProponente() {
        return nombreProponente;
    }

    public void setNombreProponente(String nombreProponente) {
        this.nombreProponente = nombreProponente;
    }

    public TipoDocumento getTipoDocumeto() {
        return tipoDocumeto;
    }

    public void setTipoDocumeto(TipoDocumento tipoDocumeto) {
        this.tipoDocumeto = tipoDocumeto;
    }

    public Integer getNombres() {
        return nombres;
    }

    public void setNombres(Integer nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getTelefonoFijo() {
        return telefonoFijo;
    }

    public void setTelefonoFijo(String telefonoFijo) {
        this.telefonoFijo = telefonoFijo;
    }

    public String getTelefonoCelular() {
        return telefonoCelular;
    }

    public void setTelefonoCelular(String telefonoCelular) {
        this.telefonoCelular = telefonoCelular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
