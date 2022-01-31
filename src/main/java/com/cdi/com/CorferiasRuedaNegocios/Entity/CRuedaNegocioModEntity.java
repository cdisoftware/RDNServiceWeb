package com.cdi.com.CorferiasRuedaNegocios.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import lombok.Data;

@Entity
@Data
@NamedStoredProcedureQueries({
    @NamedStoredProcedureQuery(
            name = "paCRuedaNegocioMod",
            procedureName = "paCRuedaNegocioMod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            }),
    @NamedStoredProcedureQuery(
            name = "paCReubicaRN",
            procedureName = "paCReubicaRN",
            parameters = {
                @StoredProcedureParameter(name = "respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class CRuedaNegocioModEntity implements Serializable {

    @Id
    @JsonProperty("IdReubicacion")
    private Integer IdReubicacion;

    @JsonProperty("IdRuedaNegocio")
    private Integer IdRuedaNegocio;

    @JsonProperty("NombreRDN")
    private String NombreRDN;

    @JsonProperty("DescripcionRDN")
    private String DescripcionRDN;

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
    private String IdCiudad;

    @JsonProperty("IdRecinto")
    private Integer IdRecinto;

    @JsonProperty("Direccion")
    private String Direccion;

    @JsonProperty("FechaInicioRdn")
    private String FechaInicioRdn;

    @JsonProperty("FechaFinRdn")
    private String FechaFinRdn;

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
    private Integer IdTipoCierre;

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

    @JsonProperty("FechaActiva")
    private String FechaActiva;

    @JsonProperty("FechaInactiva")
    private String FechaInactiva;

    @JsonProperty("IdUsuarioC")
    private Integer IdUsuarioC;

    @JsonProperty("Publicar")
    private Integer Publicar;

    @JsonProperty("Visible")
    private Integer Visible;

    @JsonProperty("UltimaMod")
    private String UltimaMod;

    @JsonProperty("IUsuarioCMod")
    private Integer IUsuarioCMod;

    @JsonProperty("DoblePerfil")
    private Integer DoblePerfil;

    @JsonProperty("IdFeria")
    private Integer IdFeria;

    @JsonProperty("NombreFeria")
    private String NombreFeria;

    @JsonProperty("Motivo")
    private String Motivo;

    @JsonProperty("ImagenPdf")
    private String ImagenPdf;
}
