package com.cdi.com.CorferiasRuedaNegocios.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import lombok.Data;

@Entity
@Data
@NamedStoredProcedureQueries({
    @NamedStoredProcedureQuery(
            name = "paPRuedaNegocio",
            procedureName = "paPRuedaNegocio",
            resultClasses = PRuedaNegocioEntity.class)
})
public class PRuedaNegocioEntity {

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

    @JsonProperty("TipoRueda")
    private String TipoRueda;

    @JsonProperty("IdUbicacion")
    private Integer IdUbicacion;

    @JsonProperty("Ubicacion")
    private String Ubicacion;

    @JsonProperty("IdClaseRueda")
    private Integer IdClaseRueda;

    @JsonProperty("ClaseRueda")
    private String ClaseRueda;

    @JsonProperty("IdPais")
    private Integer IdPais;

    @JsonProperty("Pais")
    private String Pais;

    @JsonProperty("IdDepartamento")
    private String IdDepartamento;

    @JsonProperty("departamento")
    private String departamento;

    @JsonProperty("IdCiudad")
    private String IdCiudad;

    @JsonProperty("Ciudad")
    private String Ciudad;

    @JsonProperty("IdRecinto")
    private Integer IdRecinto;

    @JsonProperty("NombreRecinto")
    private String NombreRecinto;

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
    private Integer AprobacionParticipante;

    @JsonProperty("FechaInicioAgendamiento")
    private String FechaInicioAgendamiento;

    @JsonProperty("IdTipoCierre")
    private Integer IdTipoCierre ;

    @JsonProperty("TipoCierre")
    private String TipoCierre;

    @JsonProperty("CierreAgendamiento")
    private String CierreAgendamiento;

    @JsonProperty("HoraAgendamiento")
    private String HoraAgendamiento;

    @JsonProperty("CitaOferente")
    private Integer CitaOferente;

    @JsonProperty("CitaDemandante")
    private Integer CitaDemandante;

    @JsonProperty("FechaLimiteReg")
    private String FechaLimiteReg;

    @JsonProperty("Imagen")
    private String Imagen;

    @JsonProperty("Publicar")
    private Integer Publicar;

    @JsonProperty("Visible")
    private Integer Visible;

    @JsonProperty("DoblePerfil")
    private Integer DoblePerfil;

}
