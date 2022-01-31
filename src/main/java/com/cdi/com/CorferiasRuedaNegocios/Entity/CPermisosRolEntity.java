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

@Entity
@Data
@NamedStoredProcedureQueries({
    @NamedStoredProcedureQuery(
            name = "paCPermisosRol",
            procedureName = "paCPermisosRol",
            resultClasses = CPermisosRolEntity.class),
     @NamedStoredProcedureQuery(
            name = "paCPermisosRolMod",
            procedureName = "paCPermisosRolMod",
            parameters = {
                @StoredProcedureParameter(name = "respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class CPermisosRolEntity implements Serializable {

    @Id
    @JsonProperty("Cons")
    private Integer Cons;

    @JsonProperty("Padre")
    private Integer Padre;

    @JsonProperty("ModuloPadre")
    private String ModuloPadre;

    @JsonProperty("IdModulo")
    private Integer IdModulo;

    @JsonProperty("NombreModulo")
    private String NombreModulo;

    @JsonProperty("IdRol")
    private Integer IdRol;

    @JsonProperty("NombreRol")
    private String NombreRol;

    @JsonProperty("Estado")
    private Integer Estado;

    @JsonProperty("EstadoPermiso")
    private Integer EstadoPermiso;

    @JsonProperty("PermisoRol")
    private Integer PermisoRol;

    @JsonProperty("Path")
    private String Path;

}
