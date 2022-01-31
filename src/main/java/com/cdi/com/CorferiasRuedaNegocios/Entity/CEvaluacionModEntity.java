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
            name = "paCEvaluacionMod",
            procedureName = "paCEvaluacionMod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class CEvaluacionModEntity {

    @Id
    @JsonProperty("IdEvaluacion")
    private Integer IdEvaluacion;

    @JsonProperty("IdUsuarioC")
    private Integer IdUsuarioC;

    @JsonProperty("IdRuedaNegocio")
    private Integer IdRuedaNegocio;

    @JsonProperty("IdPerfilRueda")
    private Integer IdPerfilRueda;

    @JsonProperty("NombreEvaluacion")
    private String NombreEvaluacion;

    @JsonProperty("Estado")
    private Integer Estado;

    @JsonProperty("RequiereFirma")
    private Integer RequiereFirma;

    @JsonProperty("Imagen")
    private String Imagen;

    @JsonProperty("FechaInactiva")
    private String FechaInactiva;

    @JsonProperty("FechaActivacion")
    private String FechaActivacion;

    @JsonProperty("Publicar")
    private Integer Publicar;

    @JsonProperty("FechaPublicacion")
    private String FechaPublicacion;

    @JsonProperty("IdTipoEvaEnc")
    private Integer IdTipoEvaEnc;

    @JsonProperty("Codigo")
    private String Codigo;

    @JsonProperty("ImagenBit")
    private String ImagenBit;

}
