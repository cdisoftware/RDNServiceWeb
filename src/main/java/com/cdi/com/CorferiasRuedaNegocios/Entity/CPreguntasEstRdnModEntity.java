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
            name = "paCPreguntasEstRdnMod",
            procedureName = "paCPreguntasEstRdnMod",
            parameters = {
                @StoredProcedureParameter(name = "respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class CPreguntasEstRdnModEntity implements Serializable {

    @JsonProperty("IdRuedaNegocio")
    private Integer IdRuedaNegocio;

    @Id
    @JsonProperty("IdPreguntaEstandar")
    private Integer IdPreguntaEstandar;

    @JsonProperty("IdPerfilRueda")
    private Integer IdPerfilRueda;

    @JsonProperty("Estado")
    private Integer Estado;

    @JsonProperty("FechaActualiza")
    private String FechaActualiza;

    @JsonProperty("IdUsuarioC")
    private Integer IdUsuarioC;

    @JsonProperty("Visible")
    private Integer Visible;

    @JsonProperty("Obliga")
    private Integer Obliga;

    @JsonProperty("VisibleBusqueda")
    private Integer VisibleBusqueda;

    @JsonProperty("Internacional")
    private Integer Internacional;

    @JsonProperty("Nacional")
    private Integer Nacional;

}
