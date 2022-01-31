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
            name = "paCCajaContenido",
            procedureName = "paCCajaContenido",
            resultClasses = CCajaContenidoEntity.class),
    @NamedStoredProcedureQuery(
            name = "paCCajaContenidoMod",
            procedureName = "paCCajaContenidoMod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class CCajaContenidoEntity {

    @Id
    @JsonProperty("IdCaja")
    public Integer IdCaja ;

    @JsonProperty("FechaRegistro")
    private String FechaRegistro;

    @JsonProperty("TituloCajaUno")
    private String TituloCajaUno ;

    @JsonProperty("LetraTtlCajaUno")
    private String LetraTtlCajaUno;

    @JsonProperty("TamanoTtlCajaUno")
    private Integer TamanoTtlCajaUno;

    @JsonProperty("ColorTtlCajaUno")
    private String ColorTtlCajaUno;

    @JsonProperty("ImagenCajaUno")
    private String ImagenCajaUno;

    @JsonProperty("TextoPopUpCajaUno")
    private String TextoPopUpCajaUno;

    @JsonProperty("UrlCajaUno")
    private String UrlCajaUno;

    @JsonProperty("TituloCajaDos")
    private String TituloCajaDos;

    @JsonProperty("LetraTituloCajaDos")
    private String LetraTituloCajaDos;

    @JsonProperty("TamanoTituloCajaDos")
    private Integer TamanoTituloCajaDos;

    @JsonProperty("ColorTituloCajaDos")
    private String ColorTituloCajaDos;

    @JsonProperty("ImagenCajaDos")
    private String ImagenCajaDos;

    @JsonProperty("TextoPopUpCajaDos")
    private String TextoPopUpCajaDos;

    @JsonProperty("UrlCajaDos")
    private String UrlCajaDos ;

    @JsonProperty("TituloCajaTres")
    private String TituloCajaTres ;

    @JsonProperty("LetraTituloCajaTres")
    private String LetraTituloCajaTres ;

    @JsonProperty("TamanoTituloCajaTres")
    private Integer TamanoTituloCajaTres ;

    @JsonProperty("ColorTituloCajaTres")
    private String ColorTituloCajaTres ;

    @JsonProperty("ImagenCajaTres")
    private String ImagenCajaTres;

    @JsonProperty("TextoPopUpCajaTres")
    private String TextoPopUpCajaTres ;

    @JsonProperty("UrlCajaTres")
    private String UrlCajaTres ;

    @JsonProperty("IdRuedaNegocio")
    private Integer IdRuedaNegocio ;

}
