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
    public Integer IdProducto;

    @JsonProperty("IdParticipante")
    public Integer IdParticipante;

    @JsonProperty("DescripcionProducto")
    public String DescripcionProducto;

    @JsonProperty("FichaTecnica")
    public String FichaTecnica;

    @JsonProperty("Imagen")
    public String Imagen;

    @JsonProperty("Estado")
    public Integer Estado;

    @JsonProperty("IdUsuarioC")
    public Integer IdUsuarioC;

    @JsonProperty("NombreProducto")
    public String NombreProducto;

    @JsonProperty("ValidaBuscOfre")
    public Integer ValidaBuscOfre;
}
