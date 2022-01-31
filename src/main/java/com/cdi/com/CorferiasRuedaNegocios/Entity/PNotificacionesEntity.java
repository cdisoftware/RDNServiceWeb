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
            name = "paPNotificaciones",
            procedureName = "paPNotificaciones",
            resultClasses = PNotificacionesEntity.class)
})
public class PNotificacionesEntity {

    @Id
    @JsonProperty("IdNotificacion")
    private Integer IdNotificacion;

    @JsonProperty("FechaProgramada")
    private String FechaProgramada;

    @JsonProperty("Titulo")
    private String Titulo;

    @JsonProperty("Texto")
    private String Texto;

    @JsonProperty("Estado")
    private Integer Estado;

    @JsonProperty("Idevaluacion")
    private Integer Idevaluacion;

    @JsonProperty("DiaIn")
    private Integer DiaIn;

    @JsonProperty("MesIn")
    private String MesIn;

    @JsonProperty("Vigencia")
    private String Vigencia;

    @JsonProperty("IdRuedaNegocio")
    private Integer IdRuedaNegocio;

    @JsonProperty("NombreRDN")
    private String NombreRDN;

    @JsonProperty("Imagen")
    private String Imagen;

}
