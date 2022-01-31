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
            name = "paPopcionesRtaPregunta",
            procedureName = "paPopcionesRtaPregunta",
            parameters = {
                @StoredProcedureParameter(name = "return",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class PopcionesRtaPregunta {

    @Id
    @JsonProperty("respuesta")
    private String respuesta;
}
