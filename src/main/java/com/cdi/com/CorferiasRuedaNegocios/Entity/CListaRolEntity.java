package com.cdi.com.CorferiasRuedaNegocios.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import lombok.Data;

/**
 *
 * @author Pedro p lista de roles
 */
@Entity
@Data
@NamedStoredProcedureQueries({
    @NamedStoredProcedureQuery(
            name = "paCListaRol",
            procedureName = "paCListaRol",
            resultClasses = CListaRolEntity.class),
     @NamedStoredProcedureQuery(
            name = "paCRolMod",
            procedureName = "paCRolMod",
            parameters = {
                @StoredProcedureParameter(name = "respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class CListaRolEntity implements Serializable {

    @Id
    @JsonProperty("IdRol")
    private Integer IdRol;

    @JsonProperty("NombreRol")
    private String NombreRol;

    @JsonProperty("Estado")
    private Integer Estado;
}
