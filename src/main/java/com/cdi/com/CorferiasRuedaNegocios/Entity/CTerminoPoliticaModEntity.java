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
            name = "paCTerminoPoliticaMod",
            procedureName = "paCTerminoPoliticaMod",
            parameters = {
                @StoredProcedureParameter(name = "respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class CTerminoPoliticaModEntity {

    @Id
    @JsonProperty("IdTerminoPolitica")
    private Integer IdTerminoPolitica;

    @JsonProperty("IdRuedaNegocio")
    private Integer IdRuedaNegocio;

    @JsonProperty("Version")
    private Integer Version;

    @JsonProperty("Texto")
    private String Texto;

    @JsonProperty("Estado")
    private Integer Estado;

    @JsonProperty("Publicar")
    private Integer Publicar;

    @JsonProperty("FechaPublicacion")
    private String FechaPublicacion;

    @JsonProperty("TipoDocumento")
    private Integer TipoDocumento;

    @JsonProperty("FechaRegistro")
    private String FechaRegistro;

    @JsonProperty("IdUsuarioC")
    private Integer IdUsuarioC;

    @JsonProperty("Obliga")
    private Integer Obliga;

    @JsonProperty("IdPerfilRueda")
    private Integer IdPerfilRueda;

}
