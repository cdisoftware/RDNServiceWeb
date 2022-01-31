package com.cdi.com.CorferiasRuedaNegocios.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import lombok.Data;

/**
 *
 * @author Pedro p consulta de rueda de negocios
 *
 */
@Entity
@Data
@NamedStoredProcedureQueries({
    @NamedStoredProcedureQuery(
            name = "paCRuedaNegocio",
            procedureName = "paCRuedaNegocio",
            resultClasses = CRuedaNegocioEntity.class)
})
public class CRuedaNegocioEntity implements Serializable {

    @Id
    @JsonProperty("IdRuedaNegocio")
    private Integer IdRuedaNegocio;

    @JsonProperty("NombreRdn")
    private String NombreRdn;

    @JsonProperty("DescripcionRdn")
    private String DescripcionRdn;

    @JsonProperty("Estado")
    private Integer Estado;

    @JsonProperty("IdTipoRueda")
    private Integer IdTipoRueda;

    @JsonProperty("IdUbicacion")
    private Integer IdUbicacion;

    @JsonProperty("IdClaseRueda")
    private Integer IdClaseRueda;

    @JsonProperty("IdPais")
    private Integer IdPais;

    @JsonProperty("IdDepartamento")
    private String IdDepartamento;

    @JsonProperty("IdCiudad")
    private Integer IdCiudad;

    @JsonProperty("IdRecinto")
    private Integer IdRecinto;

    @JsonProperty("Direccion")
    private String Direccion;

    @JsonProperty("FechaInicio")
    private String FechaInicio;

    @JsonProperty("FechaFin")
    private String FechaFin;

    @JsonProperty("NoCitasMin")
    private Integer NoCitasMin;

    @JsonProperty("NoCitasMax")
    private Integer NoCitasMax;

    @JsonProperty("AprobacionCitas")
    private Integer AprobacionCitas;

    @JsonProperty("AprobacionParticipante")
    private String AprobacionParticipante;

    @JsonProperty("FechaInicioAgendamiento")
    private String FechaInicioAgendamiento;

    @JsonProperty("IdTipoCierre")
    private Integer IdTipoCierre;

    @JsonProperty("CierreAgendamiento")
    private String CierreAgendamiento;

    @JsonProperty("HoraAgendamiento")
    private String HoraAgendamiento;

    @JsonProperty("CitaOferente")
    private String CitaOferente;

    @JsonProperty("CitaDemandante")
    private String CitaDemandante;

    @JsonProperty("FechaLimiteReg")
    private String FechaLimiteReg;

    @JsonProperty("Imagen")
    private String Imagen;

    @JsonProperty("Publicar")
    private Integer Publicar;

    @JsonProperty("Visible")
    private String Visible;

    @JsonProperty("DoblePerfil")
    private String DoblePerfil;

    @JsonProperty("IdFeria")
    private Integer IdFeria;

    @JsonProperty("NombreFeria")
    private String NombreFeria;

    @JsonProperty("ImagenPdf")
    private String ImagenPdf;
}
