package com.cdi.com.CorferiasRuedaNegocios.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
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
            name = "paCNotificacion",
            procedureName = "paCNotificacion",
            resultClasses = CNotificacionEntity.class),
    @NamedStoredProcedureQuery(
            name = "paCNotificacionMod",
            procedureName = "paCNotificacionMod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class CNotificacionEntity {

    @Id
    @JsonProperty("IdNotificacion")
    public Integer IdNotificacion ;

    @JsonProperty("IdTipoProgramacion")
    public Integer IdTipoProgramacion;

    @JsonProperty("IdRuedaNegocio")
    public Integer IdRuedaNegocio ;

    @JsonProperty("IdPerfilRueda")
    public Integer IdPerfilRueda;

    @JsonProperty("IdSector")
    public Integer IdSector;

    @JsonProperty("Titulo")
    public String Titulo;

    @JsonProperty("Texto")
    public String Texto;

    @JsonProperty("Imagen")
    public String Imagen;

    @JsonProperty("FechaProgramada")
    public String FechaProgramada;

    @JsonProperty("Estado")
    public Integer Estado;

    @JsonProperty("Publicar")
    public Integer Publicar;

    @JsonProperty("Nombrenotificacion")
    public String Nombrenotificacion;

    @JsonProperty("HoraProgramada")
    public String HoraProgramada;

    @JsonProperty("IdEvaluacion")
    public Integer IdEvaluacion;

    @JsonProperty("NombreRueda")
    public String NombreRueda;

}

