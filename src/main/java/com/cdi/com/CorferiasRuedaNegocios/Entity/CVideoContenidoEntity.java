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
            name = "paCVideoContenido",
            procedureName = "paCVideoContenido",
            resultClasses = CVideoContenidoEntity.class),
    @NamedStoredProcedureQuery(
            name = "paCVideoContenidoMod",
            procedureName = "paCVideoContenidoMod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class CVideoContenidoEntity {

    @Id
    @JsonProperty("IdVideo")
    private Integer IdVideo;

    @JsonProperty("IdRuedaNegocio")
    private Integer IdRuedaNegocio;

    @JsonProperty("IdUsuarioC")
    private Integer IdUsuarioC;

    @JsonProperty("UrlVideoUno")
    private String UrlVideoUno;

    @JsonProperty("UrlVideoDos")
    private String UrlVideoDos;

    @JsonProperty("UrlVideoTres")
    private String UrlVideoTres;

    @JsonProperty("UrlVideoCuatro")
    private String UrlVideoCuatro;

}
