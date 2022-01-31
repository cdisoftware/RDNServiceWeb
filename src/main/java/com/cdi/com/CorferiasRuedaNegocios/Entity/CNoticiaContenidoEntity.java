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
            name = "paCNoticiaContenido",
            procedureName = "paCNoticiaContenido",
            resultClasses = CNoticiaContenidoEntity.class),
    @NamedStoredProcedureQuery(
            name = "paCNoticiaContenidoMod",
            procedureName = "paCNoticiaContenidoMod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class CNoticiaContenidoEntity {

    @Id
    @JsonProperty("IdNoticia")
    private Integer IdNoticia ;

    @JsonProperty("IdRuedaNegocio")
    private Integer IdRuedaNegocio;

    @JsonProperty("TituloNoticiaUno")
    private String TituloNoticiaUno ;

    @JsonProperty("LetraTtlNoticiaUno")
    private String LetraTtlNoticiaUno;

    @JsonProperty("TamanoTtlNoticiaUno")
    private Integer TamanoTtlNoticiaUno;

    @JsonProperty("ColorTtlNoticiaUno")
    private String ColorTtlNoticiaUno;

    @JsonProperty("TituloNoticiaDos")
    private String TituloNoticiaDos;

    @JsonProperty("LetraTtlNoticiaDos")
    private String LetraTtlNoticiaDos;

    @JsonProperty("TamanoTtlNoticiaDos")
    private Integer TamanoTtlNoticiaDos;

    @JsonProperty("ColorTtlNoticiaDos")
    private String ColorTtlNoticiaDos;

    @JsonProperty("TituloNoticiaTres")
    private String TituloNoticiaTres;

    @JsonProperty("LetraTtlNoticiaTres")
    private String LetraTtlNoticiaTres;

    @JsonProperty("TamanoTtlNoticiaTres")
    private Integer TamanoTtlNoticiaTres;

    @JsonProperty("ColorTtlNoticiaTres")
    private String ColorTtlNoticiaTres;

    @JsonProperty("TextoNoticiaUno")
    private String TextoNoticiaUno;

    @JsonProperty("LetraTextoNoticiaUno")
    private String LetraTextoNoticiaUno ;

    @JsonProperty("TamanoTextoNoticiaUno")
    private Integer TamanoTextoNoticiaUno ;

    @JsonProperty("ColorTextoNoticiaUno")
    private String ColorTextoNoticiaUno ;

    @JsonProperty("TextoNoticiaDos")
    private String TextoNoticiaDos ;

    @JsonProperty("LetraTextoNoticiaDos")
    private String LetraTextoNoticiaDos ;

    @JsonProperty("TamanoTextoNoticiaDos")
    private Integer TamanoTextoNoticiaDos;

    @JsonProperty("ColorTextoNoticiaDos")
    private String ColorTextoNoticiaDos ;

    @JsonProperty("TextoNoticiaTres")
    private String TextoNoticiaTres ;

    @JsonProperty("LetraTextoNoticiaTres")
    private String LetraTextoNoticiaTres ;

    @JsonProperty("TamanoTextoNoticiaTres")
    private Integer TamanoTextoNoticiaTres ;

    @JsonProperty("ColorTextoNoticiaTres")
    private String ColorTextoNoticiaTres;
}
