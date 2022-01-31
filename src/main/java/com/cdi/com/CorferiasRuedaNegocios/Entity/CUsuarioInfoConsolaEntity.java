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
            name = "paCUsuarioInfoConsola",
            procedureName = "paCUsuarioInfoConsola",
            resultClasses = CUsuarioInfoConsolaEntity.class),
     @NamedStoredProcedureQuery(
            name = "paCUsuarioRolModifica",
            procedureName = "paCUsuarioRolModifica",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class CUsuarioInfoConsolaEntity implements Serializable {

    @Id
    @JsonProperty("ID")
    private Integer ID;

    @JsonProperty("IdUsuarioC")
    private Integer IdUsuarioC;

    @JsonProperty("Identificacion")
    private String Identificacion;

    @JsonProperty("IdIdentificacion")
    private Integer IdIdentificacion;

    @JsonProperty("Usuario")
    private String Usuario;

    @JsonProperty("Nombre")
    private String Nombre;

    @JsonProperty("Apellido")
    private String Apellido;

    @JsonProperty("Email")
    private String Email;

    @JsonProperty("Area")
    private String Area;

    @JsonProperty("IdRol")
    private Integer IdRol;

    @JsonProperty("Estado")
    private Integer Estado;

    @JsonProperty("Clave")
    private String Clave;

    @JsonProperty("FechaCreacion")
    private String FechaCreacion;

    @JsonProperty("FechaMod")
    private String FechaMod;

}
