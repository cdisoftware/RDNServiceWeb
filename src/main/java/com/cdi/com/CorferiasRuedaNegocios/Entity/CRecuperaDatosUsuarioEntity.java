package com.cdi.com.CorferiasRuedaNegocios.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import lombok.Data;

@Entity
@Data
@NamedStoredProcedureQueries({
    @NamedStoredProcedureQuery(
            name = "paCRecuperaDatosUsuario",
            procedureName = "paCRecuperaDatosUsuario",
            resultClasses = CRecuperaDatosUsuarioEntity.class)
})
public class CRecuperaDatosUsuarioEntity {

    @Id
    @JsonProperty("IdUsuarioC")
    private Integer IdUsuarioC;

    @JsonProperty("Nombre")
    private String Nombre;

    @JsonProperty("Apellido")
    private String Apellido;

    @JsonProperty("Email")
    private String Email;

    @JsonProperty("IdIdentificacion")
    private Integer IdIdentificacion;

    @JsonProperty("Identificacion")
    private String Identificacion;

    @JsonProperty("Clave")
    private String Clave;

    @JsonProperty("DirectorioActivo")
    private Integer DirectorioActivo;

    @JsonProperty("Area")
    private String Area;
    
    @JsonProperty("Estado")
    private Integer Estado;
}
