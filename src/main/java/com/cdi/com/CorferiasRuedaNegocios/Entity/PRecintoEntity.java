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
            name = "paPRecinto",
            procedureName = "paPRecinto",
            resultClasses = PRecintoEntity.class)
})
public class PRecintoEntity {

    @Id
    @JsonProperty("IdRecinto")
    private Integer IdRecinto;

    @JsonProperty("NombreRecinto")
    private String NombreRecinto;

    @JsonProperty("Descripcion")
    private String Descripcion;

    @JsonProperty("IdDepartamento")
    private String IdDepartamento;

    @JsonProperty("NombreDepartamento")
    private String NombreDepartamento;

    @JsonProperty("IdCiudad")
    private String IdCiudad;

    @JsonProperty("NombreCiudad")
    private String NombreCiudad;

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

    @JsonProperty("NombrePais")
    private String NombrePais;

    @JsonProperty("longitud")
    private String longitud;

    @JsonProperty("latitud")
    private String latitud;

}
