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
            name = "paCAsignaPaisesMod",
            procedureName = "paCAsignaPaisesMod",
            parameters = {
                @StoredProcedureParameter(name = "respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class CAsignaPaisesModEntity {

    @Id
    @JsonProperty("IdAsignaPais")
    private Integer IdAsignaPais;

    @JsonProperty("IdRuedaNegocio")
    private Integer IdRuedaNegocio;

    @JsonProperty("IdTipoSeleccionPais")
    private Integer IdTipoSeleccionPais;

    @JsonProperty("IdPerfilRueda")
    private Integer IdPerfilRueda;

    @JsonProperty("Estado")
    private Integer Estado;

    @JsonProperty("Fechaactiva")
    private String Fechaactiva;

    @JsonProperty("IdUsuarioC")
    private Integer IdUsuarioC;

}
