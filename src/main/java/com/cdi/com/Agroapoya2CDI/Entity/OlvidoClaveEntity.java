package com.cdi.com.Agroapoya2CDI.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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

@NamedStoredProcedureQueries({
    @NamedStoredProcedureQuery(
            name = "paC_OlvidoClave",
            procedureName = "paC_OlvidoClave",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class),
                @StoredProcedureParameter(name = "FechaModificacion",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Data
public class OlvidoClaveEntity implements Serializable {

    @Id
    @JsonProperty("Respuesta")
    public String Respuesta;

    @JsonProperty("FechaMod")
    public String FechaMod;
}
