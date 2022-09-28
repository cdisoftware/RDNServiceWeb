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
            name = "paCCambiaEstadoOfertaMod",
            procedureName = "paCCambiaEstadoOfertaMod",
            parameters = {
                @StoredProcedureParameter(name = "respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class CCambiaEstadoOfertaModEntity {

    @Id
    @JsonProperty("usucodig")
    public Integer usucodig;

    @JsonProperty("cnctivoOferta")
    public Integer cnctivoOferta;

    @JsonProperty("ObsEstado")
    public String ObsEstado;

    @JsonProperty("estado")
    public Integer estado;

    @JsonProperty("parametro1")
    public String parametro1;

    @JsonProperty("parametro2")
    public String parametro2;

    @JsonProperty("parametro3")
    public String parametro3;

}
