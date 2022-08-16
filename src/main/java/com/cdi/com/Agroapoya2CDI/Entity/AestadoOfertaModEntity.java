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
            name = "paA_estadoOfertaMod",
            procedureName = "paA_estadoOfertaMod",
            parameters = {
                @StoredProcedureParameter(name = "respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class AestadoOfertaModEntity {

    @Id
    @JsonProperty("usucodig")
    public Integer usucodig;

    @JsonProperty("cnctivoOferta")
    public Integer cnctivoOferta;

    @JsonProperty("descripcion")
    public String descripcion;

    @JsonProperty("estado")
    public Integer estado;
}
