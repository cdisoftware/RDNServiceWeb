package com.cdi.com.Agroapoya2CDI.Entity;

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
            name = "paC_RespuestaSmsMod",
            procedureName = "paC_RespuestaSmsMod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class RespuestaSmsModEntity {

   @Id
    @JsonProperty("Id")
    public Integer Id;

    @JsonProperty("NumeroCelular")
    public String NumeroCelular;

    @JsonProperty("Respuesta")
    public String Respuesta;

    @JsonProperty("FechaRegistro")
    public String FechaRegistro;
}
