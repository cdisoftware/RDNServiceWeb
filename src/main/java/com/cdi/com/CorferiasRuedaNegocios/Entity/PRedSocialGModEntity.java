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
            name = "paPRedSocialGMod",
            procedureName = "paPRedSocialGMod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class PRedSocialGModEntity implements Serializable {

    @Id
    @JsonProperty("Id")
    private Integer Id;

    @JsonProperty("IdParticipante")
    public Integer IdParticipante;

    @JsonProperty("IdRecinto")
    public Integer IdRecinto;

    @JsonProperty("IdRed")
    public Integer IdRed;

    @JsonProperty("Url")
    public String Url;

    @JsonProperty("Estado")
    public Integer Estado;

    @JsonProperty("FechaActiva")
    public String FechaActiva;

    @JsonProperty("FechaInactiva")
    public String FechaInactiva;

    @JsonProperty("IdUsuarioC")
    public Integer IdUsuarioC;
}
