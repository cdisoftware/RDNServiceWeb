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
            name = "paPProductosServicios",
            procedureName = "paPProductosServicios",
            resultClasses = PProductosServiciosEntity.class)
})
public class PProductosServiciosEntity {

    @Id
    @JsonProperty("IdProducto")
    private Integer IdProducto;

    @JsonProperty("IdParticipante")
    private Integer IdParticipante;

    @JsonProperty("FichaTecnica")
    private String FichaTecnica;

    @JsonProperty("Imagen")
    private String Imagen;

    @JsonProperty("DescripcionProducto")
    private String DescripcionProducto;

    @JsonProperty("NombreProducto")
    private String NombreProducto;

    @JsonProperty("FichaTecnicaEng")
    private String FichaTecnicaEng;

    @JsonProperty("Estado")
    private Integer Estado;
}
