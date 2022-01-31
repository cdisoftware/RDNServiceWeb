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
            name = "paCReporteJornada",
            procedureName = "paCReporteJornada",
            resultClasses = CConsultaJornadaEntity.class)
})
public class CConsultaJornadaEntity {

    @Id
    @JsonProperty("IdJornada")
    private Integer IdJornada ;

    @JsonProperty("IdRuedaNegocio")
    private Integer IdRuedaNegocio;

    @JsonProperty("IdTipoJornada")
    private Integer IdTipoJornada ;

    @JsonProperty("Descripcion")
    private String Descripcion;

    @JsonProperty("TipoEvento")
    private String TipoEvento;

    @JsonProperty("IdEstado")
    private Integer IdEstado;

    @JsonProperty("Estado")
    private String Estado;

    @JsonProperty("FechaJornada")
    private String FechaJornada;

    @JsonProperty("HoraDesdeFormato")
    private String HoraDesdeFormato;

    @JsonProperty("HoraHastaFormato")
    private String HoraHastaFormato;

    @JsonProperty("Duracion")
    private Integer Duracion;

    @JsonProperty("Espacios")
    private Integer Espacios;

    @JsonProperty("Observaciones")
    private String Observaciones;

    @JsonProperty("Contexto")
    private String Contexto;

    @JsonProperty("FechaActiva")
    private String FechaActiva ;

    @JsonProperty("TotalCitas")
    private Integer TotalCitas ;

    @JsonProperty("HorariosDisponiblesFormato")
    private String HorariosDisponiblesFormato ;

}
