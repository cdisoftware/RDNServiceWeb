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
            name = "paCUsuarioConsulta",
            procedureName = "paCUsuarioConsulta",
            resultClasses = CUsuarioConsModEntity.class),
    @NamedStoredProcedureQuery(
            name = "paCUsuarioConsMod",
            procedureName = "paCUsuarioConsMod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class CUsuarioConsModEntity implements Serializable {

    @Id
    @JsonProperty("Cons")
    private Integer Cons;

    @JsonProperty("IdUsuarioC")
    private Integer IdUsuarioC;

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

    @JsonProperty("Identificacion")
    private String Identificacion;

    @JsonProperty("IdIdentificacion")
    private Integer IdIdentificacion;

    @JsonProperty("Estado")
    private Integer Estado;

    @JsonProperty("IdRol")
    private Integer IdRol;

    @JsonProperty("NombreRol")
    private String NombreRol;

    @JsonProperty("IdEstadoRol")
    private Integer IdEstadoRol;

    @JsonProperty("Clave")
    private String Clave;

    @JsonProperty("DirectorioActivo")
    private Integer DirectorioActivo;
}
