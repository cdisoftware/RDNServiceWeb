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
    @JsonProperty("IdRuedaNegocio")
    public Integer IdRuedaNegocio;

    @JsonProperty("NombreEvaluacion")
    public String NombreEvaluacion;

    @JsonProperty("FechaActivacion")
    public String FechaActivacion;

    @JsonProperty("FechaInactiva")
    public String FechaInactiva;

    @JsonProperty("IdPerfilRueda")
    public Integer IdPerfilRueda;

    @JsonProperty("RequiereFirma")
    public Integer RequiereFirma;

    @JsonProperty("Estado")
    public Integer Estado;

    @JsonProperty("Publicar")
    public Integer Publicar;

    @JsonProperty("Imagen")
    public String Imagen;

    @JsonProperty("IdTipoEvaEnc")
    public Integer IdTipoEvaEnc;

    @JsonProperty("ImagenBit")
    public String ImagenBit;

}
