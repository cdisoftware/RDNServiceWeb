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
            name = "paCRecintoModifica",
            procedureName = "paCRecintoModifica",
            parameters = {
                @StoredProcedureParameter(name = "respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class CRecintoModificaEntity implements Serializable {

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

    @JsonProperty("Principal")
    private Integer Principal;

    @JsonProperty("Imagen")
    private String Imagen;

    @JsonProperty("Direccion")
    private String Direccion;

    @JsonProperty("Estado")
    private Integer Estado;

    @JsonProperty("FechaActiva")
    private String FechaActiva;

    @JsonProperty("FechaInactiva")
    private String FechaInactiva;

    @JsonProperty("IdUsuarioC")
    private Integer IdUsuarioC;

    @JsonProperty("Publicar")
    private Integer Publicar;

    @JsonProperty("FechaPublicacion")
    private String FechaPublicacion;

    @JsonProperty("UltimaMod")
    private String UltimaMod;

    @JsonProperty("IdPais")
    private Integer IdPais;

    @JsonProperty("longitud")
    private String longitud;

    @JsonProperty("latitud")
    private String latitud;
}
