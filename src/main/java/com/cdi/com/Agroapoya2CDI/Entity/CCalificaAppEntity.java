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
            name = "paC_CalificaApp",
            procedureName = "paC_CalificaApp",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class CCalificaAppEntity {

    @Id
    @JsonProperty("usucodig")
    public Integer usucodig;

    @JsonProperty("tipoUsuario")
    public Integer tipoUsuario;

    @JsonProperty("subTipoUsuario")
    public Integer subTipoUsuario;

    @JsonProperty("Calificacion")
    public String Calificacion;

    @JsonProperty("Observacion")
    public String Observacion;
}
