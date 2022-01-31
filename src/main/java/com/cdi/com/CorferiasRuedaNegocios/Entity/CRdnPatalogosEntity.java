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
            name = "paCRdnPatalogos",
            procedureName = "paCRdnPatalogos",
            resultClasses = CRdnPatalogosEntity.class),
    @NamedStoredProcedureQuery(
            name = "paCRdnPatalogosModifica",
            procedureName = "paCRdnPatalogosModifica",
            parameters = {
                @StoredProcedureParameter(name = "respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class CRdnPatalogosEntity implements Serializable {

    @Id
    @JsonProperty("IdPataLogo")
    private Integer IdPataLogo;

    @JsonProperty("IdCategoriaPata")
    private Integer IdCategoriaPata;

    @JsonProperty("Nombre")
    private String Nombre;

    @JsonProperty("Imagen")
    private String Imagen;

    @JsonProperty("OrdenImagen")
    private Integer OrdenImagen;

    @JsonProperty("Url")
    private String Url;

    @JsonProperty("Estado")
    private Integer Estado;

    @JsonProperty("OrdenCategoria")
    private Integer OrdenCategoria;
}
