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
            name = "paCRecinto",
            procedureName = "paCRecinto",
            resultClasses = CRecintoEntity.class)
})
public class CRecintoEntity implements Serializable {

    @Id
    @JsonProperty("IdRecinto")
    private Integer IdRecinto;

    @JsonProperty("NombreRecinto")
    private String NombreRecinto;

    @JsonProperty("Descripcion")
    private String Descripcion;

    @JsonProperty("IdDepartamento")
    private Integer IdDepartamento;

    @JsonProperty("IdCiudad")
    private Integer IdCiudad;

    @JsonProperty("NombreCiudad")
    private String NombreCiudad;

    @JsonProperty("Principal")
    private Integer Principal;

    @JsonProperty("Estado")
    private Integer Estado;

    @JsonProperty("Publicar")
    private Integer Publicar;

    @JsonProperty("Imagen")
    private String Imagen;

    @JsonProperty("Direccion")
    private String Direccion;

    @JsonProperty("IdPais")
    private Integer IdPais;

    @JsonProperty("longitud")
    private String longitud;

    @JsonProperty("latitud")
    private String latitud;
}
