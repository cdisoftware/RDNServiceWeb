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
            name = "paCUsuarioRdnModifica",
            procedureName = "paCUsuarioRdnModifica",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class CUsuarioRdnModificaEntity implements Serializable {

    @Id
    @JsonProperty("IdUsuarioC")
    private Integer IdUsuarioC;

    @JsonProperty("IdRuedaNegocio")
    private Integer IdRuedaNegocio;

    @JsonProperty("Estado")
    private Integer Estado;

    @JsonProperty("FechaCreacion")
    private String FechaCreacion;

    @JsonProperty("FechaModifica")
    private String FechaModifica;

    @JsonProperty("IdUsuarioMod")
    private Integer IdUsuarioMod;

}
