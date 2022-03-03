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
            name = "paCAdminSalasMod",
            procedureName = "paCAdminSalasMod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class CAdminSalasModEntity {

    @Id
    @JsonProperty("IdRuedaNegocio")
    private Integer IdRuedaNegocio;

    @JsonProperty("TipoSala")
    public Integer TipoSala;

    @JsonProperty("camara")
    public Integer camara;

    @JsonProperty("mic")
    public Integer mic;

    @JsonProperty("fullscreen")
    public Integer fullscreen;

    @JsonProperty("parlante")
    public Integer parlante;

    @JsonProperty("displayCapture")
    public Integer displayCapture;
}
