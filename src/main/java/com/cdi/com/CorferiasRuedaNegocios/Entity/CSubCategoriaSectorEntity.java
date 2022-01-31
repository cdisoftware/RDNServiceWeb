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
            name = "paCSubCategoriaSector",
            procedureName = "paCSubCategoriaSector",
            resultClasses = CSubCategoriaSectorEntity.class),
    @NamedStoredProcedureQuery(
            name = "paCSubCategoriaSectorMod",
            procedureName = "paCSubCategoriaSectorMod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class CSubCategoriaSectorEntity {

    @Id
    @JsonProperty("ID")
    public Integer ID;

    @JsonProperty("IdCategoria")
    public Integer IdCategoria;

    @JsonProperty("IdSubcategoria")
    public Integer IdSubcategoria;

    @JsonProperty("NombreSubcategoria")
    public String NombreSubcategoria;

    @JsonProperty("Estado")
    public Integer Estado;

    @JsonProperty("Ididioma")
    public Integer Ididioma;

    @JsonProperty("Imagen")
    public String Imagen;

    @JsonProperty("Codigoidioma")
    public String Codigoidioma;

    @JsonProperty("IdUsuarioC")
    public Integer IdUsuarioC;
}
