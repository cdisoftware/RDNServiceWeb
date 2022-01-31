package com.cdi.com.CorferiasRuedaNegocios.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import lombok.Data;

@Entity
@Data
@NamedStoredProcedureQueries({
    @NamedStoredProcedureQuery(
            name = "paCUsuarioConsultaRoles",
            procedureName = "paCUsuarioConsultaRoles",
            resultClasses = CUsuarioConsultaRolesEntity.class)
})
public class CUsuarioConsultaRolesEntity implements Serializable {

    @Id
    @JsonProperty("IdModulo")
    private Integer IdModulo;

    @JsonProperty("Nombre")
    private String Nombre;

    @JsonProperty("Apellido")
    private String Apellido;

    @JsonProperty("Email")
    private String Email;

    @JsonProperty("Area")
    private String Area;

    @JsonProperty("Usuario")
    private String Usuario;

    @JsonProperty("IdUsuarioC")
    private Integer IdUsuarioC;

    @JsonProperty("NombreModulo")
    private String NombreModulo;

    @JsonProperty("Path")
    private String Path;

    @JsonProperty("Padre")
    private Integer Padre;

    @JsonProperty("NombrePadre")
    private String NombrePadre;

}
