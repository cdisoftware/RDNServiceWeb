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
    public Integer IdNotificacion;

    @JsonProperty("FechaProgramada")
    public String FechaProgramada;

    @JsonProperty("Titulo")
    public String Titulo;

    @JsonProperty("Texto")
    public String Texto;

    @JsonProperty("Estado")
    public Integer Estado;

    @JsonProperty("Idevaluacion")
    public Integer Idevaluacion;

    @JsonProperty("DiaIn")
    public Integer DiaIn;

    @JsonProperty("MesIn")
    public String MesIn;

    @JsonProperty("Vigencia")
    public String Vigencia;

    @JsonProperty("IdRuedaNegocio")
    public Integer IdRuedaNegocio;

    @JsonProperty("NombreRDN")
    public String NombreRDN;

    @JsonProperty("Imagen")
    public String Imagen;
    
    @JsonProperty("Link")
    public String Link; 

}
