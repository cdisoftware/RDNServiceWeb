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
            name = "paPProductosServiciosMod",
            procedureName = "paPProductosServiciosMod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class PProductosServiciosModEntity {

    @Id
    @JsonProperty("IdProducto")
    private Integer IdProducto;

    @JsonProperty("IdParticipante")
    private Integer IdParticipante;

    @JsonProperty("FechaRegistro")
    private String FechaRegistro;

    @JsonProperty("DescripcionProducto")
    private String DescripcionProducto;

    @JsonProperty("FichaTecnica")
    private String FichaTecnica;

    @JsonProperty("Imagen")
    private String Imagen;

    @JsonProperty("Estado")
    private Integer Estado;

    @JsonProperty("IdUsuarioC")
    private Integer IdUsuarioC;

    @JsonProperty("NombreProducto")
    private String NombreProducto;
}
