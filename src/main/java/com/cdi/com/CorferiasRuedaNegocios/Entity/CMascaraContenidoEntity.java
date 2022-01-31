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
            name = "paCMascaraContenido",
            procedureName = "paCMascaraContenido",
            resultClasses = CMascaraContenidoEntity.class),
    @NamedStoredProcedureQuery(
            name = "paCMascaraContenidoMod",
            procedureName = "paCMascaraContenidoMod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class CMascaraContenidoEntity {

    @Id
    @JsonProperty("IdRuedaNegocio")
    private Integer IdRuedaNegocio;

    @JsonProperty("MascaraNoticias")
    private String MascaraNoticias;

    @JsonProperty("MascaraVideos")
    private String MascaraVideos;

    @JsonProperty("MascaraPreguntas")
    private String MascaraPreguntas;

    @JsonProperty("MascaraContactenos")
    private String MascaraContactenos;

}
