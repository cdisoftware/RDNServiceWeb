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
            name = "paCContenido",
            procedureName = "paCContenido",
            resultClasses = CContenidoEntity.class),
    @NamedStoredProcedureQuery(
            name = "paCContenidoModifica",
            procedureName = "paCContenidoModifica",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class CContenidoEntity {

    @Id
    @JsonProperty("IdRuedaNegocio")
    private Integer IdRuedaNegocio;

    @JsonProperty("NombreRueda")
    private String NombreRueda;

    @JsonProperty("IdUsuarioC")
    private Integer IdUsuarioC;

    @JsonProperty("NombreContenido")
    private String NombreContenido;

    @JsonProperty("Imagen")
    private String Imagen;

    @JsonProperty("Titulo")
    private String Titulo;

    @JsonProperty("TipoLetraTitulo")
    private String TipoLetraTitulo;

    @JsonProperty("TamanoTitulo")
    private Integer TamanoTitulo;

    @JsonProperty("ColorTitulo")
    private String ColorTitulo;

    @JsonProperty("Estado")
    private Integer Estado;

    @JsonProperty("Publicado")
    private Integer Publicado;

    @JsonProperty("LetraTitulos")
    private String LetraTitulos;

    @JsonProperty("TamanoTitulos")
    private Integer TamanoTitulos;

    @JsonProperty("ColorTitulos")
    private String ColorTitulos;

}
